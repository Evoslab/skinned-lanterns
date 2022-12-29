package com.cookiejar.skinned_lanterns.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LanternBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class SLBlock extends LanternBlock implements SimpleWaterloggedBlock {
    public static final VoxelShape AABB = Shapes.or(Block.box(4.0D, 0.0D, 4.0D, 12.0D, 8.0D, 12.0D), Block.box(6.0D, 8.0D, 6.0D, 10.0D, 9.0D, 10.0D));
    public static final VoxelShape HANGING_AABB = Shapes.or(Block.box(4.0D, 1.0D, 4.0D, 12.0D, 9.0D, 12.0D), Block.box(6.0D, 9.0D, 6.0D, 10.0D, 10.0D, 10.0D));

    public SLBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return blockState.getValue(HANGING) ? HANGING_AABB : AABB;
    }
}