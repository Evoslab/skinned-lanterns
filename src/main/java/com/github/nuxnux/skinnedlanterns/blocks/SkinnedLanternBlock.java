package com.github.nuxnux.skinnedlanterns.blocks;

import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

public class SkinnedLanternBlock extends LanternBlock implements Waterloggable {

    public static final DirectionProperty FACING;
    public static final BooleanProperty HANGING;
    public static final BooleanProperty field_26441;
    protected static final VoxelShape STANDING_SHAPE;
    protected static final VoxelShape HANGING_SHAPE;

    public SkinnedLanternBlock(Settings settings) {
        super(settings.nonOpaque());
        this.setDefaultState((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(HANGING, false)).with(field_26441, false).with(Properties.FACING, Direction.NORTH).with(Properties.FACING, Direction.SOUTH).with(Properties.FACING, Direction.WEST).with(Properties.FACING, Direction.EAST));
    }

    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        Direction[] var3 = ctx.getPlacementDirections();
        int var4 = var3.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            Direction direction = var3[var5];
            if (direction.getAxis() == Direction.Axis.Y) {
                BlockState blockState = (BlockState)this.getDefaultState().with(HANGING, direction == Direction.UP).with(FACING, direction);
                if (blockState.canPlaceAt(ctx.getWorld(), ctx.getBlockPos())) {
                    return (BlockState)blockState.with(field_26441, fluidState.getFluid() == Fluids.WATER).with(FACING, ctx.getPlayerFacing());
                }
            }
        }
        return null;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return (Boolean)state.get(HANGING) ? HANGING_SHAPE : STANDING_SHAPE;
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{FACING, HANGING, field_26441});
    }

    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        Direction direction = attachedDirection(state).getOpposite();
        return Block.sideCoversSmallSquare(world, pos.offset(direction), direction.getOpposite());
    }



    protected static Direction attachedDirection(BlockState state) {
        return (Boolean)state.get(HANGING) ? Direction.DOWN : Direction.UP;
    }

    public PistonBehavior getPistonBehavior(BlockState state) {
        return PistonBehavior.DESTROY;
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState newState, WorldAccess world, BlockPos pos, BlockPos posFrom) {
        if ((Boolean)state.get(field_26441)) {
            world.getFluidTickScheduler().schedule(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        return attachedDirection(state).getOpposite() == direction && !state.canPlaceAt(world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, direction, newState, world, pos, posFrom);
    }

    public FluidState getFluidState(BlockState state) {
        return (Boolean)state.get(field_26441) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

    static {
        FACING = Properties.FACING;
        HANGING = Properties.HANGING;
        field_26441 = Properties.WATERLOGGED;
        STANDING_SHAPE = VoxelShapes.union(Block.createCuboidShape(4.0D, 0.0D, 4.0D, 12.0D, 8.0D, 12.0D), Block.createCuboidShape(6.0D, 8.0D, 6.0D, 10.0D, 9.0D, 10.0D));
        HANGING_SHAPE = VoxelShapes.union(Block.createCuboidShape(4.0D, 1.0D, 4.0D, 12.0D, 9.0D, 12.0D), Block.createCuboidShape(6.0D, 9.0D, 6.0D, 10.0D, 10.0D, 10.0D));
    }

}
