package com.github.nuxnux.skinnedlanterns.blocks;

import net.minecraft.block.*;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class AxolotlSkinnedLanternBlock extends SkinnedLanternBlock implements Waterloggable {

    public static final DirectionProperty FACING;
    public static final BooleanProperty HANGING;
    public static final BooleanProperty field_26441;
    protected static final VoxelShape STANDING_SHAPE;
    protected static final VoxelShape HANGING_SHAPE;

    public AxolotlSkinnedLanternBlock(Settings settings) {
        super(settings.nonOpaque());
        this.setDefaultState((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(HANGING, false)).with(field_26441, false).with(Properties.FACING, Direction.NORTH).with(Properties.FACING, Direction.SOUTH).with(Properties.FACING, Direction.WEST).with(Properties.FACING, Direction.EAST));
    }

    static {
        FACING = Properties.FACING;
        HANGING = Properties.HANGING;
        field_26441 = Properties.WATERLOGGED;
        STANDING_SHAPE = VoxelShapes.union(Block.createCuboidShape(4.0D, 0.0D, 3.0D, 12.0D, 4.0D, 13.0D), Block.createCuboidShape(4.0D, 0.0D, -2.0D, 12.0D, 5.0D, 3.0D), Block.createCuboidShape(6.0D, 4.0D, 6.0D, 10.0D, 5.0D, 10.0D));
        HANGING_SHAPE = VoxelShapes.union(Block.createCuboidShape(4.0D, 5.0D, 3.0D, 12.0D, 9.0D, 13.0D), Block.createCuboidShape(4.0D, 5.0D, -2.0D, 12.0D, 10.0D, 3.0D), Block.createCuboidShape(6.0D, 9.0D, 6.0D, 10.0D, 10.0D, 10.0D));
    }

}
