package at.nuxnux.skinnedlanterns.data.basic;

import at.nuxnux.skinnedlanterns.SkinnedLanterns;
import at.nuxnux.skinnedlanterns.data.SkinnedDataGen;
import at.nuxnux.skinnedlanterns.init.SkinnedLanternBlocks;
import me.shedaniel.cloth.api.datagen.v1.ModelStateData;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.data.client.model.ModelIds;
import org.apache.logging.log4j.Level;

public class SkinnedStates {
    public static void init(ModelStateData modelStates) {
        try {
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.PUFFERFISH_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.PUFFERFISH_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.PUFFERFISH_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.ZOMBIE_LANTERN_BLOCK);
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.ZOMBIE_SOUL_LANTERN_BLOCK);
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.CREEPER_LANTERN_BLOCK);
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.CREEPER_SOUL_LANTERN_BLOCK);
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.SKELETON_LANTERN_BLOCK);
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.SKELETON_SOUL_LANTERN_BLOCK);
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.WITHER_SKELETON_LANTERN_BLOCK);
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.WITHER_SKELETON_SOUL_LANTERN_BLOCK);
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.BEE_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.BEE_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.BEE_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.JACK_O_LANTERN_LANTERN_BLOCK);
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.JACK_O_LANTERN_SOUL_LANTERN_BLOCK);
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.PAPER_WHITE_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.PAPER_WHITE_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.PAPER_WHITE_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.GHOST_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.GHOST_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.GHOST_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.BLINKY_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.BLINKY_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.BLINKY_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.PINKY_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.PINKY_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.PINKY_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.INKY_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.INKY_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.INKY_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.CLYDE_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.CLYDE_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.CLYDE_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.PACMAN_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.PACMAN_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.PACMAN_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.GUARDIAN_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.GUARDIAN_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.GUARDIAN_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.PAPER_YELLOW_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.PAPER_YELLOW_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.PAPER_YELLOW_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.PAPER_ORANGE_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.PAPER_ORANGE_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.PAPER_ORANGE_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.PAPER_BLUE_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.PAPER_BLUE_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.PAPER_BLUE_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.PAPER_LIGHT_BLUE_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.PAPER_LIGHT_BLUE_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.PAPER_LIGHT_BLUE_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.PAPER_CYAN_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.PAPER_CYAN_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.PAPER_CYAN_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.PAPER_LIME_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.PAPER_LIME_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.PAPER_LIME_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.PAPER_GREEN_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.PAPER_GREEN_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.PAPER_GREEN_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.PAPER_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.PAPER_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.PAPER_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.PAPER_PINK_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.PAPER_PINK_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.PAPER_PINK_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.PAPER_BROWN_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.PAPER_BROWN_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.PAPER_BROWN_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.PAPER_BLACK_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.PAPER_BLACK_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.PAPER_BLACK_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.PAPER_GRAY_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.PAPER_GRAY_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.PAPER_GRAY_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.PAPER_LIGHT_GRAY_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.PAPER_LIGHT_GRAY_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.PAPER_LIGHT_GRAY_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.PAPER_MAGENTA_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.PAPER_MAGENTA_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.PAPER_MAGENTA_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.PAPER_PURPLE_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.PAPER_PURPLE_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.PAPER_PURPLE_LANTERN_BLOCK));

            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.ORNAMENT_RED_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.ORNAMENT_RED_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.ORNAMENT_RED_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.ORNAMENT_BLUE_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.ORNAMENT_BLUE_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.ORNAMENT_BLUE_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.ORNAMENT_PURPLE_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.ORNAMENT_PURPLE_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.ORNAMENT_PURPLE_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.ORNAMENT_LIME_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.ORNAMENT_LIME_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.ORNAMENT_LIME_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.ORNAMENT_MAGENTA_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.ORNAMENT_MAGENTA_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.ORNAMENT_MAGENTA_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.ORNAMENT_YELLOW_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.ORNAMENT_YELLOW_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.ORNAMENT_YELLOW_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.ORNAMENT_GREEN_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.ORNAMENT_GREEN_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.ORNAMENT_GREEN_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.ORNAMENT_LIGHT_BLUE_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.ORNAMENT_LIGHT_BLUE_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.ORNAMENT_LIGHT_BLUE_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.ORNAMENT_CYAN_LANTERN_BLOCK);
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.ORNAMENT_CYAN_SOUL_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.ORNAMENT_CYAN_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.ORNAMENT_CYAN_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.ORNAMENT_PINK_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.ORNAMENT_PINK_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.ORNAMENT_PINK_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.ORNAMENT_ORANGE_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.ORNAMENT_ORANGE_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.ORNAMENT_ORANGE_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.ORNAMENT_BROWN_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.ORNAMENT_BROWN_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.ORNAMENT_BROWN_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.ORNAMENT_BLACK_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.ORNAMENT_BLACK_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.ORNAMENT_BLACK_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.ORNAMENT_WHITE_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.ORNAMENT_WHITE_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.ORNAMENT_WHITE_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.ORNAMENT_GRAY_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.ORNAMENT_GRAY_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.ORNAMENT_GRAY_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.ORNAMENT_LIGHT_GRAY_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.ORNAMENT_LIGHT_GRAY_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.ORNAMENT_LIGHT_GRAY_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.PRESENT_GREEN_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.PRESENT_GREEN_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.PRESENT_GREEN_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.PRESENT_RED_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.PRESENT_RED_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.PRESENT_RED_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.SNOWMAN_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.SNOWMAN_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.SNOWMAN_LANTERN_BLOCK));

            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.JELLYFISH_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.JELLYFISH_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.JELLYFISH_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.BLUE_JELLYFISH_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.BLUE_JELLYFISH_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.BLUE_JELLYFISH_LANTERN_BLOCK));

            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.HONEY_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.HONEY_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.HONEY_LANTERN_BLOCK));
            modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.SLIME_LANTERN_BLOCK);
            modelStates.addSimpleItemModel(SkinnedLanternBlocks.SLIME_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.SLIME_LANTERN_BLOCK));

            if (FabricLoader.getInstance().isModLoaded("ltr")) {
                modelStates.addSimpleBlockItemModel(SkinnedLanternBlocks.LIL_TATER_LANTERN_BLOCK);
                modelStates.addSimpleItemModel(SkinnedLanternBlocks.LIL_TATER_SOUL_LANTERN_BLOCK.asItem(), ModelIds.getBlockModelId(SkinnedLanternBlocks.LIL_TATER_LANTERN_BLOCK));
            }

            SkinnedDataGen.handler.run();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            SkinnedLanterns.log(Level.INFO, "SkinnedStates Failed!");
            System.exit(1);
        }
        SkinnedLanterns.log(Level.INFO, "SkinnedStates Loaded!");
    }
}