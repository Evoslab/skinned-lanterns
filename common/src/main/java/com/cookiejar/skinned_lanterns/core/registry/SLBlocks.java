package com.cookiejar.skinned_lanterns.core.registry;

import com.cookiejar.skinned_lanterns.common.block.FaceableSLBlock;
import com.cookiejar.skinned_lanterns.common.block.SLBlock;
import com.cookiejar.skinned_lanterns.core.SkinnedLanterns;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.Properties;
import java.util.function.Supplier;

/**
 * @author StevenPlayzz
 */
public class SLBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(SkinnedLanterns.MOD_ID, Registry.BLOCK_REGISTRY);

    public static final Supplier<Block> PUFFERFISH_LANTERN_BLOCK = createFaceableLantern("pufferfish_lantern_block", false);
    public static final Supplier<Block> PUFFERFISH_SOUL_LANTERN_BLOCK = createFaceableLantern("pufferfish_soul_lantern_block", true);
    public static final Supplier<Block> ZOMBIE_LANTERN_BLOCK = createFaceableLantern("zombie_lantern_block", false);
    public static final Supplier<Block> ZOMBIE_SOUL_LANTERN_BLOCK = createFaceableLantern("zombie_soul_lantern_block", true);
    public static final Supplier<Block> CREEPER_LANTERN_BLOCK = createFaceableLantern("creeper_lantern_block", false);
    public static final Supplier<Block> CREEPER_SOUL_LANTERN_BLOCK = createFaceableLantern("creeper_soul_lantern_block", true);
    public static final Supplier<Block> SKELETON_LANTERN_BLOCK = createFaceableLantern("skeleton_lantern_block", false);
    public static final Supplier<Block> SKELETON_SOUL_LANTERN_BLOCK = createFaceableLantern("skeleton_soul_lantern_block", true);
    public static final Supplier<Block> WITHER_SKELETON_LANTERN_BLOCK = createFaceableLantern("wither_skeleton_lantern_block", false);
    public static final Supplier<Block> WITHER_SKELETON_SOUL_LANTERN_BLOCK = createFaceableLantern("wither_skeleton_soul_lantern_block", true);
    public static final Supplier<Block> BEE_LANTERN_BLOCK = createFaceableLantern("bee_lantern_block", false);
    public static final Supplier<Block> BEE_SOUL_LANTERN_BLOCK = createFaceableLantern("bee_soul_lantern_block", true);
    public static final Supplier<Block> JACK_O_LANTERN_LANTERN_BLOCK = createFaceableLantern("jack_o_lantern_lantern_block", false);
    public static final Supplier<Block> JACK_O_LANTERN_SOUL_LANTERN_BLOCK = createFaceableLantern("jack_o_lantern_soul_lantern_block", true);
    public static final Supplier<Block> PAPER_WHITE_LANTERN_BLOCK = createFaceableLantern("paper_white_lantern_block", false);
    public static final Supplier<Block> PAPER_WHITE_SOUL_LANTERN_BLOCK = createFaceableLantern("paper_white_soul_lantern_block", true);
    public static final Supplier<Block> GHOST_LANTERN_BLOCK = createFaceableLantern("ghost_lantern_block", false);
    public static final Supplier<Block> GHOST_SOUL_LANTERN_BLOCK = createFaceableLantern("ghost_soul_lantern_block", true);
    public static final Supplier<Block> BLINKY_LANTERN_BLOCK = createFaceableLantern("blinky_lantern_block", false);
    public static final Supplier<Block> BLINKY_SOUL_LANTERN_BLOCK = createFaceableLantern("blinky_soul_lantern_block", true);
    public static final Supplier<Block> PINKY_LANTERN_BLOCK = createFaceableLantern("pinky_lantern_block", false);
    public static final Supplier<Block> PINKY_SOUL_LANTERN_BLOCK = createFaceableLantern("pinky_soul_lantern_block", true);
    public static final Supplier<Block> INKY_LANTERN_BLOCK = createFaceableLantern("inky_lantern_block", false);
    public static final Supplier<Block> INKY_SOUL_LANTERN_BLOCK = createFaceableLantern("inky_soul_lantern_block", true);
    public static final Supplier<Block> CLYDE_LANTERN_BLOCK = createFaceableLantern("clyde_lantern_block", false);
    public static final Supplier<Block> CLYDE_SOUL_LANTERN_BLOCK = createFaceableLantern("clyde_soul_lantern_block", true);
    public static final Supplier<Block> PACMAN_LANTERN_BLOCK = createFaceableLantern("pacman_lantern_block", false);
    public static final Supplier<Block> PACMAN_SOUL_LANTERN_BLOCK = createFaceableLantern("pacman_soul_lantern_block", true);
    public static final Supplier<Block> GUARDIAN_LANTERN_BLOCK = createFaceableLantern("guardian_lantern_block", false);
    public static final Supplier<Block> GUARDIAN_SOUL_LANTERN_BLOCK = createFaceableLantern("guardian_soul_lantern_block", true);
    public static final Supplier<Block> PAPER_YELLOW_LANTERN_BLOCK = createLantern("paper_yellow_lantern_block", false);
    public static final Supplier<Block> PAPER_YELLOW_SOUL_LANTERN_BLOCK = createLantern("paper_yellow_soul_lantern_block", true);
    public static final Supplier<Block> PAPER_ORANGE_LANTERN_BLOCK = createLantern("paper_orange_lantern_block", false);
    public static final Supplier<Block> PAPER_ORANGE_SOUL_LANTERN_BLOCK = createLantern("paper_orange_soul_lantern_block", true);
    public static final Supplier<Block> PAPER_BLUE_LANTERN_BLOCK = createLantern("paper_blue_lantern_block", false);
    public static final Supplier<Block> PAPER_BLUE_SOUL_LANTERN_BLOCK = createLantern("paper_blue_soul_lantern_block", true);
    public static final Supplier<Block> PAPER_LIGHT_BLUE_LANTERN_BLOCK = createLantern("paper_light_blue_lantern_block", false);
    public static final Supplier<Block> PAPER_LIGHT_BLUE_SOUL_LANTERN_BLOCK = createLantern("paper_light_blue_soul_lantern_block", true);
    public static final Supplier<Block> PAPER_CYAN_LANTERN_BLOCK = createLantern("paper_cyan_lantern_block", false);
    public static final Supplier<Block> PAPER_CYAN_SOUL_LANTERN_BLOCK = createLantern("paper_cyan_soul_lantern_block", true);
    public static final Supplier<Block> PAPER_LIME_LANTERN_BLOCK = createLantern("paper_lime_lantern_block", false);
    public static final Supplier<Block> PAPER_LIME_SOUL_LANTERN_BLOCK = createLantern("paper_lime_soul_lantern_block", true);
    public static final Supplier<Block> PAPER_GREEN_LANTERN_BLOCK = createLantern("paper_green_lantern_block", false);
    public static final Supplier<Block> PAPER_GREEN_SOUL_LANTERN_BLOCK = createLantern("paper_green_soul_lantern_block", true);
    public static final Supplier<Block> PAPER_LANTERN_BLOCK = createLantern("paper_lantern_block", false);
    public static final Supplier<Block> PAPER_SOUL_LANTERN_BLOCK = createLantern("paper_soul_lantern_block", true);
    public static final Supplier<Block> PAPER_PINK_LANTERN_BLOCK = createLantern("paper_pink_lantern_block", false);
    public static final Supplier<Block> PAPER_PINK_SOUL_LANTERN_BLOCK = createLantern("paper_pink_soul_lantern_block", true);
    public static final Supplier<Block> PAPER_BROWN_LANTERN_BLOCK = createLantern("paper_brown_lantern_block", false);
    public static final Supplier<Block> PAPER_BROWN_SOUL_LANTERN_BLOCK = createLantern("paper_brown_soul_lantern_block", true);
    public static final Supplier<Block> PAPER_BLACK_LANTERN_BLOCK = createLantern("paper_black_lantern_block", false);
    public static final Supplier<Block> PAPER_BLACK_SOUL_LANTERN_BLOCK = createLantern("paper_black_soul_lantern_block", true);
    public static final Supplier<Block> PAPER_GRAY_LANTERN_BLOCK = createLantern("paper_gray_lantern_block", false);
    public static final Supplier<Block> PAPER_GRAY_SOUL_LANTERN_BLOCK = createLantern("paper_gray_soul_lantern_block", true);
    public static final Supplier<Block> PAPER_LIGHT_GRAY_LANTERN_BLOCK = createLantern("paper_light_gray_lantern_block", true);
    public static final Supplier<Block> PAPER_LIGHT_GRAY_SOUL_LANTERN_BLOCK = createLantern("paper_light_gray_soul_lantern_block", true);
    public static final Supplier<Block> PAPER_MAGENTA_LANTERN_BLOCK = createLantern("paper_magenta_lantern_block", false);
    public static final Supplier<Block> PAPER_MAGENTA_SOUL_LANTERN_BLOCK = createLantern("paper_magenta_soul_lantern_block", true);
    public static final Supplier<Block> PAPER_PURPLE_LANTERN_BLOCK = createLantern("paper_purple_lantern_block", false);
    public static final Supplier<Block> PAPER_PURPLE_SOUL_LANTERN_BLOCK = createLantern("paper_purple_soul_lantern_block", true);

    public static final Supplier<Block> ORNAMENT_RED_LANTERN_BLOCK = createLantern("ornament_red_lantern_block", false);
    public static final Supplier<Block> ORNAMENT_RED_SOUL_LANTERN_BLOCK = createLantern("ornament_red_soul_lantern_block", true);
    public static final Supplier<Block> ORNAMENT_BLUE_LANTERN_BLOCK = createLantern("ornament_blue_lantern_block", false);
    public static final Supplier<Block> ORNAMENT_BLUE_SOUL_LANTERN_BLOCK = createLantern("ornament_blue_soul_lantern_block", true);
    public static final Supplier<Block> ORNAMENT_PURPLE_LANTERN_BLOCK = createLantern("ornament_purple_lantern_block", false);
    public static final Supplier<Block> ORNAMENT_PURPLE_SOUL_LANTERN_BLOCK = createLantern("ornament_purple_soul_lantern_block", true);
    public static final Supplier<Block> ORNAMENT_LIME_LANTERN_BLOCK = createLantern("ornament_lime_lantern_block", false);
    public static final Supplier<Block> ORNAMENT_LIME_SOUL_LANTERN_BLOCK = createLantern("ornament_lime_soul_lantern_block", true);
    public static final Supplier<Block> ORNAMENT_MAGENTA_LANTERN_BLOCK = createLantern("ornament_magenta_lantern_block", false);
    public static final Supplier<Block> ORNAMENT_MAGENTA_SOUL_LANTERN_BLOCK = createLantern("ornament_magenta_soul_lantern_block", true);
    public static final Supplier<Block> ORNAMENT_YELLOW_LANTERN_BLOCK = createLantern("ornament_yellow_lantern_block", false);
    public static final Supplier<Block> ORNAMENT_YELLOW_SOUL_LANTERN_BLOCK = createLantern("ornament_yellow_soul_lantern_block", true);
    public static final Supplier<Block> ORNAMENT_GREEN_LANTERN_BLOCK = createLantern("ornament_green_lantern_block", false);
    public static final Supplier<Block> ORNAMENT_GREEN_SOUL_LANTERN_BLOCK = createLantern("ornament_green_soul_lantern_block", true);
    public static final Supplier<Block> ORNAMENT_LIGHT_BLUE_LANTERN_BLOCK = createLantern("ornament_light_blue_lantern_block", false);
    public static final Supplier<Block> ORNAMENT_LIGHT_BLUE_SOUL_LANTERN_BLOCK = createLantern("ornament_light_blue_soul_lantern_block", true);
    public static final Supplier<Block> ORNAMENT_CYAN_LANTERN_BLOCK = createLantern("ornament_cyan_lantern_block", false);
    public static final Supplier<Block> ORNAMENT_CYAN_SOUL_LANTERN_BLOCK = createLantern("ornament_cyan_soul_lantern_block", true);
    public static final Supplier<Block> ORNAMENT_PINK_LANTERN_BLOCK = createLantern("ornament_pink_lantern_block", false);
    public static final Supplier<Block> ORNAMENT_PINK_SOUL_LANTERN_BLOCK = createLantern("ornament_pink_soul_lantern_block", true);
    public static final Supplier<Block> ORNAMENT_ORANGE_LANTERN_BLOCK = createLantern("ornament_orange_lantern_block", false);
    public static final Supplier<Block> ORNAMENT_ORANGE_SOUL_LANTERN_BLOCK = createLantern("ornament_orange_soul_lantern_block", true);
    public static final Supplier<Block> ORNAMENT_BROWN_LANTERN_BLOCK = createLantern("ornament_brown_lantern_block", false);
    public static final Supplier<Block> ORNAMENT_BROWN_SOUL_LANTERN_BLOCK = createLantern("ornament_brown_soul_lantern_block", true);
    public static final Supplier<Block> ORNAMENT_BLACK_LANTERN_BLOCK = createLantern("ornament_black_lantern_block", false);
    public static final Supplier<Block> ORNAMENT_BLACK_SOUL_LANTERN_BLOCK = createLantern("ornament_black_soul_lantern_block", true);
    public static final Supplier<Block> ORNAMENT_WHITE_LANTERN_BLOCK = createLantern("ornament_white_lantern_block", false);
    public static final Supplier<Block> ORNAMENT_WHITE_SOUL_LANTERN_BLOCK = createLantern("ornament_white_soul_lantern_block", true);
    public static final Supplier<Block> ORNAMENT_GRAY_LANTERN_BLOCK = createLantern("ornament_gray_lantern_block", false);
    public static final Supplier<Block> ORNAMENT_GRAY_SOUL_LANTERN_BLOCK = createLantern("ornament_gray_soul_lantern_block", true);
    public static final Supplier<Block> ORNAMENT_LIGHT_GRAY_LANTERN_BLOCK = createLantern("ornament_light_gray_lantern_block", false);
    public static final Supplier<Block> ORNAMENT_LIGHT_GRAY_SOUL_LANTERN_BLOCK = createLantern("ornament_light_gray_soul_lantern_block", true);
    public static final Supplier<Block> PRESENT_GREEN_LANTERN_BLOCK = createLantern("present_green_lantern_block", false);
    public static final Supplier<Block> PRESENT_GREEN_SOUL_LANTERN_BLOCK = createLantern("present_green_soul_lantern_block", true);
    public static final Supplier<Block> PRESENT_RED_LANTERN_BLOCK = createLantern("present_red_lantern_block", false);
    public static final Supplier<Block> PRESENT_RED_SOUL_LANTERN_BLOCK = createLantern("present_red_soul_lantern_block", true);
    public static final Supplier<Block> SNOWMAN_LANTERN_BLOCK = createFaceableLantern("snowman_lantern_block", false);
    public static final Supplier<Block> SNOWMAN_SOUL_LANTERN_BLOCK = createFaceableLantern("snowman_soul_lantern_block", true);
    
    public static final Supplier<Block> HONEY_LANTERN_BLOCK = createLantern("honey_lantern_block", false);
    public static final Supplier<Block> HONEY_SOUL_LANTERN_BLOCK = createLantern("honey_soul_lantern_block", true);
    public static final Supplier<Block> SLIME_LANTERN_BLOCK = createFaceableLantern("slime_lantern_block", false);
    public static final Supplier<Block> SLIME_SOUL_LANTERN_BLOCK = createFaceableLantern("slime_soul_lantern_block", true);
    
    private static Supplier<Block> createFaceableLantern(String id, Boolean isSoul) {
        Block block;
        BlockBehaviour.Properties prop = BlockBehaviour.Properties.copy(Blocks.LANTERN);
        BlockBehaviour.Properties propSoul = BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN);
        if (isSoul) {
            block = new FaceableSLBlock(propSoul);
        } else {
            block = new FaceableSLBlock(prop);
        }
        Supplier<Block> register = BLOCKS.register(id, ()-> block);
        SLItems.ITEMS.register(id, () -> new BlockItem(block, new Item.Properties().tab(SkinnedLanterns.SKINNED_TAB)));
        return register;
    }

    private static Supplier<Block> createLantern(String id, Boolean isSoul) {
        Block block;
        BlockBehaviour.Properties prop = BlockBehaviour.Properties.copy(Blocks.LANTERN);
        BlockBehaviour.Properties propSoul = BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN);
        if (isSoul) {
            block = new SLBlock(propSoul);
        } else {
            block = new SLBlock(prop);
        }
        Supplier<Block> register = BLOCKS.register(id, ()-> block);
        SLItems.ITEMS.register(id, () -> new BlockItem(block, new Item.Properties().tab(SkinnedLanterns.SKINNED_TAB)));
        return register;
    }
}