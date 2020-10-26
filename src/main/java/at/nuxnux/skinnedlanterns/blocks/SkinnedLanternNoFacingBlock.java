package at.nuxnux.skinnedlanterns.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.PushReaction;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;

public class SkinnedLanternNoFacingBlock extends Block implements IWaterLoggable {
    public static final BooleanProperty HANGING = BlockStateProperties.HANGING;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    private static final VoxelShape SHAPE = VoxelShapes.combineAndSimplify(Block.makeCuboidShape(4, 0, 4, 12, 8, 12), Block.makeCuboidShape(6, 8, 6, 10, 9, 10), IBooleanFunction.OR);
    private static final VoxelShape SHAPE_HANGING = VoxelShapes.combineAndSimplify(Block.makeCuboidShape(4, 1, 4, 12, 9, 12), Block.makeCuboidShape(6, 9, 6, 10, 10, 10), IBooleanFunction.OR);

    public SkinnedLanternNoFacingBlock(boolean soul) {
        super(Properties.create(Material.IRON)
                .func_235861_h_()
                .hardnessAndResistance(3.5F)
                .sound(SoundType.LANTERN)
                .func_235838_a_((p_235447_0_) -> {
                    if (soul) {
                        return 10;
                    }
                    else {
                        return 15;
                    }
                })
                .notSolid()
        );
        this.setDefaultState(this.stateContainer.getBaseState().with(HANGING, Boolean.FALSE).with(WATERLOGGED, Boolean.FALSE));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return state.get(HANGING) ? SHAPE_HANGING : SHAPE;
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        FluidState fluidstate = context.getWorld().getFluidState(context.getPos());

        for (Direction direction : context.getNearestLookingDirections()) {
            if (direction.getAxis() == Direction.Axis.Y) {
                BlockState blockstate = this.getDefaultState().with(HANGING, direction == Direction.UP);
                if (blockstate.isValidPosition(context.getWorld(), context.getPos())) {
                    return blockstate.with(WATERLOGGED, fluidstate.getFluid() == Fluids.WATER);
                }
            }
        }

        return null;
    }

    @Override
    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
        Direction direction = func_220277_j(state).getOpposite();
        return Block.hasEnoughSolidSide(worldIn, pos.offset(direction), direction.getOpposite());
    }

    protected static Direction func_220277_j(BlockState p_220277_0_) {
        return p_220277_0_.get(HANGING) ? Direction.DOWN : Direction.UP;
    }

    @Override
    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        if (stateIn.get(WATERLOGGED)) {
            worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
        }

        return func_220277_j(stateIn).getOpposite() == facing && !stateIn.isValidPosition(worldIn, currentPos) ? Blocks.AIR.getDefaultState() : super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(HANGING, WATERLOGGED);
    }

    @Override
    public float getAmbientOcclusionLightValue(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return 1;
    }

    @Override
    public boolean allowsMovement(BlockState state, IBlockReader worldIn, BlockPos pos, PathType type) {
        return false;
    }

    @Override
    public PushReaction getPushReaction(BlockState state) {
        return PushReaction.DESTROY;
    }
}
