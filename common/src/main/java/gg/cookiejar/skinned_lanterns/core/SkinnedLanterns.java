package gg.cookiejar.skinned_lanterns.core;

import gg.cookiejar.skinned_lanterns.core.registry.SkinnedLanternsBlocks;
import gg.cookiejar.skinned_lanterns.core.registry.SkinnedLanternsItems;
import gg.moonflower.pollen.api.platform.Platform;
import gg.moonflower.pollen.api.registry.client.RenderTypeRegistry;
import net.minecraft.client.renderer.RenderType;

public class SkinnedLanterns {
    public static final String MOD_ID = "skinned_lanterns";
    public static final Platform PLATFORM = Platform.builder(MOD_ID)
            .clientInit(SkinnedLanterns::onClientInit)
            .clientPostInit(SkinnedLanterns::onClientPostInit)
            .commonInit(SkinnedLanterns::onCommonInit)
            .commonPostInit(SkinnedLanterns::onCommonPostInit)
            .dataInit(SkinnedLanterns::onDataInit)
            .build();

    public static void onClientInit() {
    }

    public static void onClientPostInit(Platform.ModSetupContext ctx) {
        ctx.enqueueWork(() -> {
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PUFFERFISH_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PUFFERFISH_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.HONEY_LANTERN_BLOCK.get(), RenderType.translucent());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.HONEY_SOUL_LANTERN_BLOCK.get(), RenderType.translucent());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.SLIME_LANTERN_BLOCK.get(), RenderType.translucent());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.SLIME_SOUL_LANTERN_BLOCK.get(), RenderType.translucent());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.BEE_LANTERN_BLOCK.get(), RenderType.translucent());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.BEE_SOUL_LANTERN_BLOCK.get(), RenderType.translucent());
            if (Platform.isModLoaded("jellyfishing")) {
                RenderTypeRegistry.register(SkinnedLanternsBlocks.JELLYFISH_LANTERN_BLOCK.get(), RenderType.cutout());
                RenderTypeRegistry.register(SkinnedLanternsBlocks.JELLYFISH_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
                RenderTypeRegistry.register(SkinnedLanternsBlocks.BLUE_JELLYFISH_LANTERN_BLOCK.get(), RenderType.cutout());
                RenderTypeRegistry.register(SkinnedLanternsBlocks.BLUE_JELLYFISH_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            }
            RenderTypeRegistry.register(SkinnedLanternsBlocks.ZOMBIE_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.ZOMBIE_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.CREEPER_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.CREEPER_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.SKELETON_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.SKELETON_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.WITHER_SKELETON_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.WITHER_SKELETON_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.JACK_O_LANTERN_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.JACK_O_LANTERN_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_WHITE_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_WHITE_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.GHOST_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.GHOST_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.BLINKY_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.BLINKY_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PINKY_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PINKY_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.INKY_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.INKY_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.CLYDE_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.CLYDE_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PACMAN_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PACMAN_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.GUARDIAN_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.GUARDIAN_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_YELLOW_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_YELLOW_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_ORANGE_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_ORANGE_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_BLUE_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_BLUE_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_LIGHT_BLUE_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_LIGHT_BLUE_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_CYAN_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_CYAN_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_LIME_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_LIME_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_GREEN_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_GREEN_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_PINK_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_PINK_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_BROWN_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_BROWN_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_BLACK_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_BLACK_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_GRAY_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_GRAY_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_LIGHT_GRAY_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_LIGHT_GRAY_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_MAGENTA_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_MAGENTA_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_PURPLE_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_PURPLE_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_BLUE_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_BLUE_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_LIGHT_BLUE_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_LIGHT_BLUE_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_CYAN_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_CYAN_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_LIME_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_LIME_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_GREEN_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_GREEN_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_PINK_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_PINK_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_BROWN_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_BROWN_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_BLACK_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_BLACK_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_GRAY_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_GRAY_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_LIGHT_GRAY_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_LIGHT_GRAY_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_MAGENTA_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_MAGENTA_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_PURPLE_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PAPER_PURPLE_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.ORNAMENT_RED_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.ORNAMENT_RED_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.ORNAMENT_BLUE_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.ORNAMENT_BLUE_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.ORNAMENT_PURPLE_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.ORNAMENT_PURPLE_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.ORNAMENT_LIME_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.ORNAMENT_LIME_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.ORNAMENT_MAGENTA_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.ORNAMENT_MAGENTA_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.ORNAMENT_YELLOW_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.ORNAMENT_YELLOW_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.ORNAMENT_GREEN_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.ORNAMENT_GREEN_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.ORNAMENT_LIGHT_BLUE_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.ORNAMENT_LIGHT_BLUE_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.ORNAMENT_CYAN_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.ORNAMENT_CYAN_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.ORNAMENT_PINK_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.ORNAMENT_PINK_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.ORNAMENT_ORANGE_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.ORNAMENT_ORANGE_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.ORNAMENT_BROWN_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.ORNAMENT_BROWN_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.ORNAMENT_BLACK_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.ORNAMENT_BLACK_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.ORNAMENT_WHITE_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.ORNAMENT_WHITE_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.ORNAMENT_GRAY_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.ORNAMENT_GRAY_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.ORNAMENT_LIGHT_GRAY_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.ORNAMENT_LIGHT_GRAY_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PRESENT_GREEN_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PRESENT_GREEN_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PRESENT_RED_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.PRESENT_RED_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.SNOWMAN_LANTERN_BLOCK.get(), RenderType.cutout());
            RenderTypeRegistry.register(SkinnedLanternsBlocks.SNOWMAN_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            if (Platform.isModLoaded("botania")) {
                RenderTypeRegistry.register(SkinnedLanternsBlocks.TINY_POTATO_LANTERN_BLOCK.get(), RenderType.cutout());
                RenderTypeRegistry.register(SkinnedLanternsBlocks.TINY_POTATO_SOUL_LANTERN_BLOCK.get(), RenderType.cutout());
            }
        });
    }

    public static void onCommonInit() {
        SkinnedLanternsBlocks.BLOCKS.register(PLATFORM);
        SkinnedLanternsItems.ITEMS.register(PLATFORM);
    }

    public static void onCommonPostInit(Platform.ModSetupContext ctx) {
    }

    public static void onDataInit(Platform.DataSetupContext ctx) {
    }
}