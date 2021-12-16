package me.stevenplayzz.skinnedlanterns.block;

import me.stevenplayzz.skinnedlanterns.SkinnedLanterns;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.util.registry.Registry;

public class SkinnedLanternBlocks {
    public static Block PUFFERFISH_LANTERN_BLOCK = registerDSLB("pufferfish_lantern_block", false);
    public static Block PUFFERFISH_SOUL_LANTERN_BLOCK = registerDSLB("pufferfish_soul_lantern_block", true);
    public static Block ZOMBIE_LANTERN_BLOCK = registerDSLB("zombie_lantern_block", false);
    public static Block ZOMBIE_SOUL_LANTERN_BLOCK = registerDSLB("zombie_soul_lantern_block", true);
    public static Block CREEPER_LANTERN_BLOCK = registerDSLB("creeper_lantern_block", false);
    public static Block CREEPER_SOUL_LANTERN_BLOCK = registerDSLB("creeper_soul_lantern_block", true);
    public static Block SKELETON_LANTERN_BLOCK = registerDSLB("skeleton_lantern_block", false);
    public static Block SKELETON_SOUL_LANTERN_BLOCK = registerDSLB("skeleton_soul_lantern_block", true);
    public static Block WITHER_SKELETON_LANTERN_BLOCK = registerDSLB("wither_skeleton_lantern_block", false);
    public static Block WITHER_SKELETON_SOUL_LANTERN_BLOCK = registerDSLB("wither_skeleton_soul_lantern_block", true);
    public static Block BEE_LANTERN_BLOCK = registerDSLB("bee_lantern_block", false);
    public static Block BEE_SOUL_LANTERN_BLOCK = registerDSLB("bee_soul_lantern_block", true);
    public static Block JACK_O_LANTERN_LANTERN_BLOCK = registerDSLB("jack_o_lantern_lantern_block", false);
    public static Block JACK_O_LANTERN_SOUL_LANTERN_BLOCK = registerDSLB("jack_o_lantern_soul_lantern_block", true);
    public static Block PAPER_WHITE_LANTERN_BLOCK = registerNDSLB("paper_white_lantern_block", false);
    public static Block PAPER_WHITE_SOUL_LANTERN_BLOCK = registerNDSLB("paper_white_soul_lantern_block", true);
    public static Block GHOST_LANTERN_BLOCK = registerDSLB("ghost_lantern_block", false);
    public static Block GHOST_SOUL_LANTERN_BLOCK = registerDSLB("ghost_soul_lantern_block", true);
    public static Block BLINKY_LANTERN_BLOCK = registerDSLB("blinky_lantern_block", false);
    public static Block BLINKY_SOUL_LANTERN_BLOCK = registerDSLB("blinky_soul_lantern_block", true);
    public static Block PINKY_LANTERN_BLOCK = registerDSLB("pinky_lantern_block", false);
    public static Block PINKY_SOUL_LANTERN_BLOCK = registerDSLB("pinky_soul_lantern_block", true);
    public static Block INKY_LANTERN_BLOCK = registerDSLB("inky_lantern_block", false);
    public static Block INKY_SOUL_LANTERN_BLOCK = registerDSLB("inky_soul_lantern_block", true);
    public static Block CLYDE_LANTERN_BLOCK = registerDSLB("clyde_lantern_block", false);
    public static Block CLYDE_SOUL_LANTERN_BLOCK = registerDSLB("clyde_soul_lantern_block", true);
    public static Block PACMAN_LANTERN_BLOCK = registerDSLB("pacman_lantern_block", false);
    public static Block PACMAN_SOUL_LANTERN_BLOCK = registerDSLB("pacman_soul_lantern_block", true);
    public static Block GUARDIAN_LANTERN_BLOCK = registerDSLB("guardian_lantern_block", false);
    public static Block GUARDIAN_SOUL_LANTERN_BLOCK = registerDSLB("guardian_soul_lantern_block", true);
    public static Block PAPER_YELLOW_LANTERN_BLOCK = registerNDSLB("paper_yellow_lantern_block", false);
    public static Block PAPER_YELLOW_SOUL_LANTERN_BLOCK = registerNDSLB("paper_yellow_soul_lantern_block", true);
    public static Block PAPER_ORANGE_LANTERN_BLOCK = registerNDSLB("paper_orange_lantern_block", false);
    public static Block PAPER_ORANGE_SOUL_LANTERN_BLOCK = registerNDSLB("paper_orange_soul_lantern_block", true);
    public static Block PAPER_BLUE_LANTERN_BLOCK = registerNDSLB("paper_blue_lantern_block", false);
    public static Block PAPER_BLUE_SOUL_LANTERN_BLOCK = registerNDSLB("paper_blue_soul_lantern_block", true);
    public static Block PAPER_LIGHT_BLUE_LANTERN_BLOCK = registerNDSLB("paper_light_blue_lantern_block", false);
    public static Block PAPER_LIGHT_BLUE_SOUL_LANTERN_BLOCK = registerNDSLB("paper_light_blue_soul_lantern_block", true);
    public static Block PAPER_CYAN_LANTERN_BLOCK = registerNDSLB("paper_cyan_lantern_block", false);
    public static Block PAPER_CYAN_SOUL_LANTERN_BLOCK = registerNDSLB("paper_cyan_soul_lantern_block", true);
    public static Block PAPER_LIME_LANTERN_BLOCK = registerNDSLB("paper_lime_lantern_block", false);
    public static Block PAPER_LIME_SOUL_LANTERN_BLOCK = registerNDSLB("paper_lime_soul_lantern_block", true);
    public static Block PAPER_GREEN_LANTERN_BLOCK = registerNDSLB("paper_green_lantern_block", false);
    public static Block PAPER_GREEN_SOUL_LANTERN_BLOCK = registerNDSLB("paper_green_soul_lantern_block", true);
    public static Block PAPER_LANTERN_BLOCK = registerNDSLB("paper_lantern_block", false);
    public static Block PAPER_SOUL_LANTERN_BLOCK = registerNDSLB("paper_soul_lantern_block", true);
    public static Block PAPER_PINK_LANTERN_BLOCK = registerNDSLB("paper_pink_lantern_block", false);
    public static Block PAPER_PINK_SOUL_LANTERN_BLOCK = registerNDSLB("paper_pink_soul_lantern_block", true);
    public static Block PAPER_BROWN_LANTERN_BLOCK = registerNDSLB("paper_brown_lantern_block", false);
    public static Block PAPER_BROWN_SOUL_LANTERN_BLOCK = registerNDSLB("paper_brown_soul_lantern_block", true);
    public static Block PAPER_BLACK_LANTERN_BLOCK = registerNDSLB("paper_black_lantern_block", false);
    public static Block PAPER_BLACK_SOUL_LANTERN_BLOCK = registerNDSLB("paper_black_soul_lantern_block", true);
    public static Block PAPER_GRAY_LANTERN_BLOCK = registerNDSLB("paper_gray_lantern_block", false);
    public static Block PAPER_GRAY_SOUL_LANTERN_BLOCK = registerNDSLB("paper_gray_soul_lantern_block", true);
    public static Block PAPER_LIGHT_GRAY_LANTERN_BLOCK = registerNDSLB("paper_light_gray_lantern_block", false);
    public static Block PAPER_LIGHT_GRAY_SOUL_LANTERN_BLOCK = registerNDSLB("paper_light_gray_soul_lantern_block", true);
    public static Block PAPER_MAGENTA_LANTERN_BLOCK = registerNDSLB("paper_magenta_lantern_block", false);
    public static Block PAPER_MAGENTA_SOUL_LANTERN_BLOCK = registerNDSLB("paper_magenta_soul_lantern_block", true);
    public static Block PAPER_PURPLE_LANTERN_BLOCK = registerNDSLB("paper_purple_lantern_block", false);
    public static Block PAPER_PURPLE_SOUL_LANTERN_BLOCK = registerNDSLB("paper_purple_soul_lantern_block", true);

    public static Block ORNAMENT_RED_LANTERN_BLOCK = registerNDSLB("ornament_red_lantern_block", false);
    public static Block ORNAMENT_RED_SOUL_LANTERN_BLOCK = registerNDSLB("ornament_red_soul_lantern_block", true);
    public static Block ORNAMENT_BLUE_LANTERN_BLOCK = registerNDSLB("ornament_blue_lantern_block", false);
    public static Block ORNAMENT_BLUE_SOUL_LANTERN_BLOCK = registerNDSLB("ornament_blue_soul_lantern_block", true);
    public static Block ORNAMENT_PURPLE_LANTERN_BLOCK = registerNDSLB("ornament_purple_lantern_block", false);
    public static Block ORNAMENT_PURPLE_SOUL_LANTERN_BLOCK = registerNDSLB("ornament_purple_soul_lantern_block", true);
    public static Block ORNAMENT_LIME_LANTERN_BLOCK = registerNDSLB("ornament_lime_lantern_block", false);
    public static Block ORNAMENT_LIME_SOUL_LANTERN_BLOCK = registerNDSLB("ornament_lime_soul_lantern_block", true);
    public static Block ORNAMENT_MAGENTA_LANTERN_BLOCK = registerNDSLB("ornament_magenta_lantern_block", false);
    public static Block ORNAMENT_MAGENTA_SOUL_LANTERN_BLOCK = registerNDSLB("ornament_magenta_soul_lantern_block", true);
    public static Block ORNAMENT_YELLOW_LANTERN_BLOCK = registerNDSLB("ornament_yellow_lantern_block", false);
    public static Block ORNAMENT_YELLOW_SOUL_LANTERN_BLOCK = registerNDSLB("ornament_yellow_soul_lantern_block", true);
    public static Block ORNAMENT_GREEN_LANTERN_BLOCK = registerNDSLB("ornament_green_lantern_block", false);
    public static Block ORNAMENT_GREEN_SOUL_LANTERN_BLOCK = registerNDSLB("ornament_green_soul_lantern_block", true);
    public static Block ORNAMENT_LIGHT_BLUE_LANTERN_BLOCK = registerNDSLB("ornament_light_blue_lantern_block", false);
    public static Block ORNAMENT_LIGHT_BLUE_SOUL_LANTERN_BLOCK = registerNDSLB("ornament_light_blue_soul_lantern_block", true);
    public static Block ORNAMENT_CYAN_LANTERN_BLOCK = registerNDSLB("ornament_cyan_lantern_block", false);
    public static Block ORNAMENT_CYAN_SOUL_LANTERN_BLOCK = registerNDSLB("ornament_cyan_soul_lantern_block", true);
    public static Block ORNAMENT_PINK_LANTERN_BLOCK = registerNDSLB("ornament_pink_lantern_block", false);
    public static Block ORNAMENT_PINK_SOUL_LANTERN_BLOCK = registerNDSLB("ornament_pink_soul_lantern_block", true);
    public static Block ORNAMENT_ORANGE_LANTERN_BLOCK = registerNDSLB("ornament_orange_lantern_block", false);
    public static Block ORNAMENT_ORANGE_SOUL_LANTERN_BLOCK = registerNDSLB("ornament_orange_soul_lantern_block", true);
    public static Block ORNAMENT_BROWN_LANTERN_BLOCK = registerNDSLB("ornament_brown_lantern_block", false);
    public static Block ORNAMENT_BROWN_SOUL_LANTERN_BLOCK = registerNDSLB("ornament_brown_soul_lantern_block", true);
    public static Block ORNAMENT_BLACK_LANTERN_BLOCK = registerNDSLB("ornament_black_lantern_block", false);
    public static Block ORNAMENT_BLACK_SOUL_LANTERN_BLOCK = registerNDSLB("ornament_black_soul_lantern_block", true);
    public static Block ORNAMENT_WHITE_LANTERN_BLOCK = registerNDSLB("ornament_white_lantern_block", false);
    public static Block ORNAMENT_WHITE_SOUL_LANTERN_BLOCK = registerNDSLB("ornament_white_soul_lantern_block", true);
    public static Block ORNAMENT_GRAY_LANTERN_BLOCK = registerNDSLB("ornament_gray_lantern_block", false);
    public static Block ORNAMENT_GRAY_SOUL_LANTERN_BLOCK = registerNDSLB("ornament_gray_soul_lantern_block", true);
    public static Block ORNAMENT_LIGHT_GRAY_LANTERN_BLOCK = registerNDSLB("ornament_light_gray_lantern_block", false);
    public static Block ORNAMENT_LIGHT_GRAY_SOUL_LANTERN_BLOCK = registerNDSLB("ornament_light_gray_soul_lantern_block", true);
    public static Block PRESENT_GREEN_LANTERN_BLOCK = registerNDSLB("present_green_lantern_block", false);
    public static Block PRESENT_GREEN_SOUL_LANTERN_BLOCK = registerNDSLB("present_green_soul_lantern_block", true);
    public static Block PRESENT_RED_LANTERN_BLOCK = registerNDSLB("present_red_lantern_block", false);
    public static Block PRESENT_RED_SOUL_LANTERN_BLOCK = registerNDSLB("present_red_soul_lantern_block", true);
    public static Block SNOWMAN_LANTERN_BLOCK = registerDSLB("snowman_lantern_block", false);
    public static Block SNOWMAN_SOUL_LANTERN_BLOCK = registerDSLB("snowman_soul_lantern_block", true);

//    public static Block JELLYFISH_LANTERN_BLOCK = registerCompactBlock("jellyfish_lantern_block", "jellyfishing", false);
//    public static Block JELLYFISH_SOUL_LANTERN_BLOCK = registerCompactBlock("jellyfish_soul_lantern_block", "jellyfishing", true);
//    public static Block BLUE_JELLYFISH_LANTERN_BLOCK = registerCompactBlock("blue_jellyfish_lantern_block", "jellyfishing", false);
//    public static Block BLUE_JELLYFISH_SOUL_LANTERN_BLOCK = registerCompactBlock("blue_jellyfish_soul_lantern_block", "jellyfishing", true);

    public static Block HONEY_LANTERN_BLOCK = registerNDSLB("honey_lantern_block", false);
    public static Block HONEY_SOUL_LANTERN_BLOCK = registerNDSLB("honey_soul_lantern_block", true);
    public static Block SLIME_LANTERN_BLOCK = registerDSLB("slime_lantern_block", false);
    public static Block SLIME_SOUL_LANTERN_BLOCK = registerDSLB("slime_soul_lantern_block", true);

//    public static Block LIL_TATER_LANTERN_BLOCK = registerCompactBlock("lil_tater", "ltr", false);
//    public static Block LIL_TATER_SOUL_LANTERN_BLOCK = registerCompactBlock("lil_tater_soul", "ltr", false);

    private static Block register(String id, Block block, boolean registerItem) {
        Block registered = Registry.register(Registry.BLOCK, SkinnedLanterns.id(id), block);
        if (registerItem) {
            Registry.register(Registry.ITEM, SkinnedLanterns.id(id), new BlockItem(registered, new FabricItemSettings().group(SkinnedLanterns.ITEM_GROUP)));
        }
        return registered;
    }

    private static Block registerDSLB(String id, boolean isSoul) {
        var lanternBlockType = Blocks.LANTERN;
        if (isSoul)
            lanternBlockType = Blocks.SOUL_LANTERN;
        return register(id, new DirectableSkinnedLanternBlock(FabricBlockSettings.copyOf(lanternBlockType)), true);
    }

    private static Block registerNDSLB(String id, boolean isSoul) {
        var lanternBlockType = Blocks.LANTERN;
        if (isSoul)
            lanternBlockType = Blocks.SOUL_LANTERN;
        return register(id, new NonDirectableSkinnedLanternBlock(FabricBlockSettings.copyOf(lanternBlockType)), true);
    }
}