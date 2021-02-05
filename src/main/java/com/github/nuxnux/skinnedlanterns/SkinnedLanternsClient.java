package com.github.nuxnux.skinnedlanterns;

import com.github.nuxnux.skinnedlanterns.registry.SkinnedLanternBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class SkinnedLanternsClient implements ClientModInitializer {

    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PUFFERFISH_LANTERN_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PUFFERFISH_SOUL_LANTERN_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.ZOMBIE_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.ZOMBIE_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.CREEPER_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.CREEPER_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.SKELETON_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.SKELETON_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.WITHER_SKELETON_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.WITHER_SKELETON_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.BEE_LANTERN_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.BEE_SOUL_LANTERN_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.JACK_O_LANTERN_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.JACK_O_LANTERN_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PAPER_WHITE_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PAPER_WHITE_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.GHOST_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.GHOST_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.BLINKY_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.BLINKY_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PINKY_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PINKY_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.INKY_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.INKY_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.CLYDE_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.CLYDE_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PACMAN_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PACMAN_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.GUARDIAN_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.GUARDIAN_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PAPER_YELLOW_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PAPER_YELLOW_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PAPER_ORANGE_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PAPER_ORANGE_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PAPER_BLUE_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PAPER_BLUE_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PAPER_LIGHT_BLUE_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PAPER_LIGHT_BLUE_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PAPER_CYAN_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PAPER_CYAN_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PAPER_LIME_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PAPER_LIME_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PAPER_GREEN_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PAPER_GREEN_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PAPER_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PAPER_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PAPER_PINK_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PAPER_PINK_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PAPER_BROWN_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PAPER_BROWN_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PAPER_BLACK_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PAPER_BLACK_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PAPER_GRAY_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PAPER_GRAY_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PAPER_LIGHT_GRAY_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PAPER_LIGHT_GRAY_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PAPER_MAGENTA_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PAPER_MAGENTA_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PAPER_PURPLE_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PAPER_PURPLE_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.ORNAMENT_RED_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.ORNAMENT_RED_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.ORNAMENT_BLUE_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.ORNAMENT_BLUE_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.ORNAMENT_PURPLE_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.ORNAMENT_PURPLE_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.ORNAMENT_LIME_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.ORNAMENT_LIME_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.ORNAMENT_MAGENTA_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.ORNAMENT_MAGENTA_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.ORNAMENT_YELLOW_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.ORNAMENT_YELLOW_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.ORNAMENT_GREEN_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.ORNAMENT_GREEN_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.ORNAMENT_LIGHT_BLUE_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.ORNAMENT_LIGHT_BLUE_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.ORNAMENT_CYAN_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.ORNAMENT_CYAN_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.ORNAMENT_PINK_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.ORNAMENT_PINK_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.ORNAMENT_ORANGE_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.ORNAMENT_ORANGE_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.ORNAMENT_BROWN_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.ORNAMENT_BROWN_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.ORNAMENT_BLACK_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.ORNAMENT_BLACK_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.ORNAMENT_WHITE_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.ORNAMENT_WHITE_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.ORNAMENT_GRAY_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.ORNAMENT_GRAY_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.ORNAMENT_LIGHT_GRAY_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.ORNAMENT_LIGHT_GRAY_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PRESENT_GREEN_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PRESENT_GREEN_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PRESENT_RED_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.PRESENT_RED_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.SNOWMAN_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.SNOWMAN_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.JELLYFISH_LANTERN_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.JELLYFISH_SOUL_LANTERN_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.BLUE_JELLYFISH_LANTERN_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.BLUE_JELLYFISH_SOUL_LANTERN_BLOCK, RenderLayer.getTranslucent());

        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.LIL_TATER_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.LIL_TATER_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.LIL_TATER_LANTERN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.LIL_TATER_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.HONEY_LANTERN_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.HONEY_SOUL_LANTERN_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.SLIME_LANTERN_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.SLIME_SOUL_LANTERN_BLOCK, RenderLayer.getTranslucent());
        //BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.AXOLOTL_LANTERN_BLOCK, RenderLayer.getCutout());
        //BlockRenderLayerMap.INSTANCE.putBlock(SkinnedLanternBlocks.AXOLOTL_SOUL_LANTERN_BLOCK, RenderLayer.getCutout());

    }
}
