//Generated Code 26-10-2020 14:23:17

package at.nuxnux.skinnedlanterns.util;

import at.nuxnux.skinnedlanterns.SkinnedLanterns;
import at.nuxnux.skinnedlanterns.blocks.BlockItemBase;
import at.nuxnux.skinnedlanterns.blocks.SkinnedLanternBlock;
import at.nuxnux.skinnedlanterns.blocks.SkinnedLanternNoFacingBlock;
import at.nuxnux.skinnedlanterns.config.LanternConfig;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SkinnedLanterns.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SkinnedLanterns.MOD_ID);

    public static void init() {
        register();
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static void setRenderLayer() {
        if (LanternConfig.pufferfish_lantern.get()) {
            RenderTypeLookup.setRenderLayer(pufferfish_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.pufferfish_soul_lantern.get()) {
            RenderTypeLookup.setRenderLayer(pufferfish_soul_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.zombie_lantern.get()) {
            RenderTypeLookup.setRenderLayer(zombie_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.zombie_soul_lantern.get()) {
            RenderTypeLookup.setRenderLayer(zombie_soul_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.creeper_lantern.get()) {
            RenderTypeLookup.setRenderLayer(creeper_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.creeper_soul_lantern.get()) {
            RenderTypeLookup.setRenderLayer(creeper_soul_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.skeleton_lantern.get()) {
            RenderTypeLookup.setRenderLayer(skeleton_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.skeleton_soul_lantern.get()) {
            RenderTypeLookup.setRenderLayer(skeleton_soul_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.wither_skeleton_lantern.get()) {
            RenderTypeLookup.setRenderLayer(wither_skeleton_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.wither_skeleton_soul_lantern.get()) {
            RenderTypeLookup.setRenderLayer(wither_skeleton_soul_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.bee_lantern.get()) {
            RenderTypeLookup.setRenderLayer(bee_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.bee_soul_lantern.get()) {
            RenderTypeLookup.setRenderLayer(bee_soul_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.jack_o_lantern_lantern.get()) {
            RenderTypeLookup.setRenderLayer(jack_o_lantern_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.jack_o_lantern_soul_lantern.get()) {
            RenderTypeLookup.setRenderLayer(jack_o_lantern_soul_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.paper_white_lantern.get()) {
            RenderTypeLookup.setRenderLayer(paper_white_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.paper_white_soul_lantern.get()) {
            RenderTypeLookup.setRenderLayer(paper_white_soul_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.ghost_lantern.get()) {
            RenderTypeLookup.setRenderLayer(ghost_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.ghost_soul_lantern.get()) {
            RenderTypeLookup.setRenderLayer(ghost_soul_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.blinky_lantern.get()) {
            RenderTypeLookup.setRenderLayer(blinky_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.blinky_soul_lantern.get()) {
            RenderTypeLookup.setRenderLayer(blinky_soul_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.pinky_lantern.get()) {
            RenderTypeLookup.setRenderLayer(pinky_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.pinky_soul_lantern.get()) {
            RenderTypeLookup.setRenderLayer(pinky_soul_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.inky_lantern.get()) {
            RenderTypeLookup.setRenderLayer(inky_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.inky_soul_lantern.get()) {
            RenderTypeLookup.setRenderLayer(inky_soul_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.clyde_lantern.get()) {
            RenderTypeLookup.setRenderLayer(clyde_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.clyde_soul_lantern.get()) {
            RenderTypeLookup.setRenderLayer(clyde_soul_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.pacman_lantern.get()) {
            RenderTypeLookup.setRenderLayer(pacman_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.pacman_soul_lantern.get()) {
            RenderTypeLookup.setRenderLayer(pacman_soul_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.guardian_lantern.get()) {
            RenderTypeLookup.setRenderLayer(guardian_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.guardian_soul_lantern.get()) {
            RenderTypeLookup.setRenderLayer(guardian_soul_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.paper_yellow_lantern.get()) {
            RenderTypeLookup.setRenderLayer(paper_yellow_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.paper_yellow_soul_lantern.get()) {
            RenderTypeLookup.setRenderLayer(paper_yellow_soul_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.paper_orange_lantern.get()) {
            RenderTypeLookup.setRenderLayer(paper_orange_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.paper_orange_soul_lantern.get()) {
            RenderTypeLookup.setRenderLayer(paper_orange_soul_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.paper_blue_lantern.get()) {
            RenderTypeLookup.setRenderLayer(paper_blue_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.paper_blue_soul_lantern.get()) {
            RenderTypeLookup.setRenderLayer(paper_blue_soul_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.paper_light_blue_lantern.get()) {
            RenderTypeLookup.setRenderLayer(paper_light_blue_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.paper_light_blue_soul_lantern.get()) {
            RenderTypeLookup.setRenderLayer(paper_light_blue_soul_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.paper_cyan_lantern.get()) {
            RenderTypeLookup.setRenderLayer(paper_cyan_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.paper_cyan_soul_lantern.get()) {
            RenderTypeLookup.setRenderLayer(paper_cyan_soul_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.paper_lime_lantern.get()) {
            RenderTypeLookup.setRenderLayer(paper_lime_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.paper_lime_soul_lantern.get()) {
            RenderTypeLookup.setRenderLayer(paper_lime_soul_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.paper_green_lantern.get()) {
            RenderTypeLookup.setRenderLayer(paper_green_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.paper_green_soul_lantern.get()) {
            RenderTypeLookup.setRenderLayer(paper_green_soul_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.paper_lantern.get()) {
            RenderTypeLookup.setRenderLayer(paper_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.paper_soul_lantern.get()) {
            RenderTypeLookup.setRenderLayer(paper_soul_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.paper_pink_lantern.get()) {
            RenderTypeLookup.setRenderLayer(paper_pink_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.paper_pink_soul_lantern.get()) {
            RenderTypeLookup.setRenderLayer(paper_pink_soul_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.paper_brown_lantern.get()) {
            RenderTypeLookup.setRenderLayer(paper_brown_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.paper_brown_soul_lantern.get()) {
            RenderTypeLookup.setRenderLayer(paper_brown_soul_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.paper_black_lantern.get()) {
            RenderTypeLookup.setRenderLayer(paper_black_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.paper_black_soul_lantern.get()) {
            RenderTypeLookup.setRenderLayer(paper_black_soul_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.paper_gray_lantern.get()) {
            RenderTypeLookup.setRenderLayer(paper_gray_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.paper_gray_soul_lantern.get()) {
            RenderTypeLookup.setRenderLayer(paper_gray_soul_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.paper_light_gray_lantern.get()) {
            RenderTypeLookup.setRenderLayer(paper_light_gray_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.paper_light_gray_soul_lantern.get()) {
            RenderTypeLookup.setRenderLayer(paper_light_gray_soul_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.paper_magenta_lantern.get()) {
            RenderTypeLookup.setRenderLayer(paper_magenta_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.paper_magenta_soul_lantern.get()) {
            RenderTypeLookup.setRenderLayer(paper_magenta_soul_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.paper_purple_lantern.get()) {
            RenderTypeLookup.setRenderLayer(paper_purple_lantern_block.get(), RenderType.getCutout());
        }
        if (LanternConfig.paper_purple_soul_lantern.get()) {
            RenderTypeLookup.setRenderLayer(paper_purple_soul_lantern_block.get(), RenderType.getCutout());
        }
    }

    private static void register() {
        if (LanternConfig.pufferfish_lantern.get()) {
            pufferfish_lantern_block = BLOCKS.register("pufferfish_lantern_block", () -> new SkinnedLanternBlock(false));
            pufferfish_lantern_block_item = ITEMS.register("pufferfish_lantern_block", () -> new BlockItemBase(pufferfish_lantern_block.get()));
        }
        if (LanternConfig.pufferfish_soul_lantern.get()) {
            pufferfish_soul_lantern_block = BLOCKS.register("pufferfish_soul_lantern_block", () -> new SkinnedLanternBlock(true));
            pufferfish_soul_lantern_block_item = ITEMS.register("pufferfish_soul_lantern_block", () -> new BlockItemBase(pufferfish_soul_lantern_block.get()));
        }
        if (LanternConfig.zombie_lantern.get()) {
            zombie_lantern_block = BLOCKS.register("zombie_lantern_block", () -> new SkinnedLanternBlock(false));
            zombie_lantern_block_item = ITEMS.register("zombie_lantern_block", () -> new BlockItemBase(zombie_lantern_block.get()));
        }
        if (LanternConfig.zombie_soul_lantern.get()) {
            zombie_soul_lantern_block = BLOCKS.register("zombie_soul_lantern_block", () -> new SkinnedLanternBlock(true));
            zombie_soul_lantern_block_item = ITEMS.register("zombie_soul_lantern_block", () -> new BlockItemBase(zombie_soul_lantern_block.get()));
        }
        if (LanternConfig.creeper_lantern.get()) {
            creeper_lantern_block = BLOCKS.register("creeper_lantern_block", () -> new SkinnedLanternBlock(false));
            creeper_lantern_block_item = ITEMS.register("creeper_lantern_block", () -> new BlockItemBase(creeper_lantern_block.get()));
        }
        if (LanternConfig.creeper_soul_lantern.get()) {
            creeper_soul_lantern_block = BLOCKS.register("creeper_soul_lantern_block", () -> new SkinnedLanternBlock(true));
            creeper_soul_lantern_block_item = ITEMS.register("creeper_soul_lantern_block", () -> new BlockItemBase(creeper_soul_lantern_block.get()));
        }
        if (LanternConfig.skeleton_lantern.get()) {
            skeleton_lantern_block = BLOCKS.register("skeleton_lantern_block", () -> new SkinnedLanternBlock(false));
            skeleton_lantern_block_item = ITEMS.register("skeleton_lantern_block", () -> new BlockItemBase(skeleton_lantern_block.get()));
        }
        if (LanternConfig.skeleton_soul_lantern.get()) {
            skeleton_soul_lantern_block = BLOCKS.register("skeleton_soul_lantern_block", () -> new SkinnedLanternBlock(true));
            skeleton_soul_lantern_block_item = ITEMS.register("skeleton_soul_lantern_block", () -> new BlockItemBase(skeleton_soul_lantern_block.get()));
        }
        if (LanternConfig.wither_skeleton_lantern.get()) {
            wither_skeleton_lantern_block = BLOCKS.register("wither_skeleton_lantern_block", () -> new SkinnedLanternBlock(false));
            wither_skeleton_lantern_block_item = ITEMS.register("wither_skeleton_lantern_block", () -> new BlockItemBase(wither_skeleton_lantern_block.get()));
        }
        if (LanternConfig.wither_skeleton_soul_lantern.get()) {
            wither_skeleton_soul_lantern_block = BLOCKS.register("wither_skeleton_soul_lantern_block", () -> new SkinnedLanternBlock(true));
            wither_skeleton_soul_lantern_block_item = ITEMS.register("wither_skeleton_soul_lantern_block", () -> new BlockItemBase(wither_skeleton_soul_lantern_block.get()));
        }
        if (LanternConfig.bee_lantern.get()) {
            bee_lantern_block = BLOCKS.register("bee_lantern_block", () -> new SkinnedLanternBlock(false));
            bee_lantern_block_item = ITEMS.register("bee_lantern_block", () -> new BlockItemBase(bee_lantern_block.get()));
        }
        if (LanternConfig.bee_soul_lantern.get()) {
            bee_soul_lantern_block = BLOCKS.register("bee_soul_lantern_block", () -> new SkinnedLanternBlock(true));
            bee_soul_lantern_block_item = ITEMS.register("bee_soul_lantern_block", () -> new BlockItemBase(bee_soul_lantern_block.get()));
        }
        if (LanternConfig.jack_o_lantern_lantern.get()) {
            jack_o_lantern_lantern_block = BLOCKS.register("jack_o_lantern_lantern_block", () -> new SkinnedLanternBlock(false));
            jack_o_lantern_lantern_block_item = ITEMS.register("jack_o_lantern_lantern_block", () -> new BlockItemBase(jack_o_lantern_lantern_block.get()));
        }
        if (LanternConfig.jack_o_lantern_soul_lantern.get()) {
            jack_o_lantern_soul_lantern_block = BLOCKS.register("jack_o_lantern_soul_lantern_block", () -> new SkinnedLanternBlock(true));
            jack_o_lantern_soul_lantern_block_item = ITEMS.register("jack_o_lantern_soul_lantern_block", () -> new BlockItemBase(jack_o_lantern_soul_lantern_block.get()));
        }
        if (LanternConfig.paper_white_lantern.get()) {
            paper_white_lantern_block = BLOCKS.register("paper_white_lantern_block", () -> new SkinnedLanternNoFacingBlock(false));
            paper_white_lantern_block_item = ITEMS.register("paper_white_lantern_block", () -> new BlockItemBase(paper_white_lantern_block.get()));
        }
        if (LanternConfig.paper_white_soul_lantern.get()) {
            paper_white_soul_lantern_block = BLOCKS.register("paper_white_soul_lantern_block", () -> new SkinnedLanternNoFacingBlock(true));
            paper_white_soul_lantern_block_item = ITEMS.register("paper_white_soul_lantern_block", () -> new BlockItemBase(paper_white_soul_lantern_block.get()));
        }
        if (LanternConfig.ghost_lantern.get()) {
            ghost_lantern_block = BLOCKS.register("ghost_lantern_block", () -> new SkinnedLanternBlock(false));
            ghost_lantern_block_item = ITEMS.register("ghost_lantern_block", () -> new BlockItemBase(ghost_lantern_block.get()));
        }
        if (LanternConfig.ghost_soul_lantern.get()) {
            ghost_soul_lantern_block = BLOCKS.register("ghost_soul_lantern_block", () -> new SkinnedLanternBlock(true));
            ghost_soul_lantern_block_item = ITEMS.register("ghost_soul_lantern_block", () -> new BlockItemBase(ghost_soul_lantern_block.get()));
        }
        if (LanternConfig.blinky_lantern.get()) {
            blinky_lantern_block = BLOCKS.register("blinky_lantern_block", () -> new SkinnedLanternBlock(false));
            blinky_lantern_block_item = ITEMS.register("blinky_lantern_block", () -> new BlockItemBase(blinky_lantern_block.get()));
        }
        if (LanternConfig.blinky_soul_lantern.get()) {
            blinky_soul_lantern_block = BLOCKS.register("blinky_soul_lantern_block", () -> new SkinnedLanternBlock(true));
            blinky_soul_lantern_block_item = ITEMS.register("blinky_soul_lantern_block", () -> new BlockItemBase(blinky_soul_lantern_block.get()));
        }
        if (LanternConfig.pinky_lantern.get()) {
            pinky_lantern_block = BLOCKS.register("pinky_lantern_block", () -> new SkinnedLanternBlock(false));
            pinky_lantern_block_item = ITEMS.register("pinky_lantern_block", () -> new BlockItemBase(pinky_lantern_block.get()));
        }
        if (LanternConfig.pinky_soul_lantern.get()) {
            pinky_soul_lantern_block = BLOCKS.register("pinky_soul_lantern_block", () -> new SkinnedLanternBlock(true));
            pinky_soul_lantern_block_item = ITEMS.register("pinky_soul_lantern_block", () -> new BlockItemBase(pinky_soul_lantern_block.get()));
        }
        if (LanternConfig.inky_lantern.get()) {
            inky_lantern_block = BLOCKS.register("inky_lantern_block", () -> new SkinnedLanternBlock(false));
            inky_lantern_block_item = ITEMS.register("inky_lantern_block", () -> new BlockItemBase(inky_lantern_block.get()));
        }
        if (LanternConfig.inky_soul_lantern.get()) {
            inky_soul_lantern_block = BLOCKS.register("inky_soul_lantern_block", () -> new SkinnedLanternBlock(true));
            inky_soul_lantern_block_item = ITEMS.register("inky_soul_lantern_block", () -> new BlockItemBase(inky_soul_lantern_block.get()));
        }
        if (LanternConfig.clyde_lantern.get()) {
            clyde_lantern_block = BLOCKS.register("clyde_lantern_block", () -> new SkinnedLanternBlock(false));
            clyde_lantern_block_item = ITEMS.register("clyde_lantern_block", () -> new BlockItemBase(clyde_lantern_block.get()));
        }
        if (LanternConfig.clyde_soul_lantern.get()) {
            clyde_soul_lantern_block = BLOCKS.register("clyde_soul_lantern_block", () -> new SkinnedLanternBlock(true));
            clyde_soul_lantern_block_item = ITEMS.register("clyde_soul_lantern_block", () -> new BlockItemBase(clyde_soul_lantern_block.get()));
        }
        if (LanternConfig.pacman_lantern.get()) {
            pacman_lantern_block = BLOCKS.register("pacman_lantern_block", () -> new SkinnedLanternBlock(false));
            pacman_lantern_block_item = ITEMS.register("pacman_lantern_block", () -> new BlockItemBase(pacman_lantern_block.get()));
        }
        if (LanternConfig.pacman_soul_lantern.get()) {
            pacman_soul_lantern_block = BLOCKS.register("pacman_soul_lantern_block", () -> new SkinnedLanternBlock(true));
            pacman_soul_lantern_block_item = ITEMS.register("pacman_soul_lantern_block", () -> new BlockItemBase(pacman_soul_lantern_block.get()));
        }
        if (LanternConfig.guardian_lantern.get()) {
            guardian_lantern_block = BLOCKS.register("guardian_lantern_block", () -> new SkinnedLanternBlock(false));
            guardian_lantern_block_item = ITEMS.register("guardian_lantern_block", () -> new BlockItemBase(guardian_lantern_block.get()));
        }
        if (LanternConfig.guardian_soul_lantern.get()) {
            guardian_soul_lantern_block = BLOCKS.register("guardian_soul_lantern_block", () -> new SkinnedLanternBlock(true));
            guardian_soul_lantern_block_item = ITEMS.register("guardian_soul_lantern_block", () -> new BlockItemBase(guardian_soul_lantern_block.get()));
        }
        if (LanternConfig.paper_yellow_lantern.get()) {
            paper_yellow_lantern_block = BLOCKS.register("paper_yellow_lantern_block", () -> new SkinnedLanternNoFacingBlock(false));
            paper_yellow_lantern_block_item = ITEMS.register("paper_yellow_lantern_block", () -> new BlockItemBase(paper_yellow_lantern_block.get()));
        }
        if (LanternConfig.paper_yellow_soul_lantern.get()) {
            paper_yellow_soul_lantern_block = BLOCKS.register("paper_yellow_soul_lantern_block", () -> new SkinnedLanternNoFacingBlock(true));
            paper_yellow_soul_lantern_block_item = ITEMS.register("paper_yellow_soul_lantern_block", () -> new BlockItemBase(paper_yellow_soul_lantern_block.get()));
        }
        if (LanternConfig.paper_orange_lantern.get()) {
            paper_orange_lantern_block = BLOCKS.register("paper_orange_lantern_block", () -> new SkinnedLanternNoFacingBlock(false));
            paper_orange_lantern_block_item = ITEMS.register("paper_orange_lantern_block", () -> new BlockItemBase(paper_orange_lantern_block.get()));
        }
        if (LanternConfig.paper_orange_soul_lantern.get()) {
            paper_orange_soul_lantern_block = BLOCKS.register("paper_orange_soul_lantern_block", () -> new SkinnedLanternNoFacingBlock(true));
            paper_orange_soul_lantern_block_item = ITEMS.register("paper_orange_soul_lantern_block", () -> new BlockItemBase(paper_orange_soul_lantern_block.get()));
        }
        if (LanternConfig.paper_blue_lantern.get()) {
            paper_blue_lantern_block = BLOCKS.register("paper_blue_lantern_block", () -> new SkinnedLanternNoFacingBlock(false));
            paper_blue_lantern_block_item = ITEMS.register("paper_blue_lantern_block", () -> new BlockItemBase(paper_blue_lantern_block.get()));
        }
        if (LanternConfig.paper_blue_soul_lantern.get()) {
            paper_blue_soul_lantern_block = BLOCKS.register("paper_blue_soul_lantern_block", () -> new SkinnedLanternNoFacingBlock(true));
            paper_blue_soul_lantern_block_item = ITEMS.register("paper_blue_soul_lantern_block", () -> new BlockItemBase(paper_blue_soul_lantern_block.get()));
        }
        if (LanternConfig.paper_light_blue_lantern.get()) {
            paper_light_blue_lantern_block = BLOCKS.register("paper_light_blue_lantern_block", () -> new SkinnedLanternNoFacingBlock(false));
            paper_light_blue_lantern_block_item = ITEMS.register("paper_light_blue_lantern_block", () -> new BlockItemBase(paper_light_blue_lantern_block.get()));
        }
        if (LanternConfig.paper_light_blue_soul_lantern.get()) {
            paper_light_blue_soul_lantern_block = BLOCKS.register("paper_light_blue_soul_lantern_block", () -> new SkinnedLanternNoFacingBlock(true));
            paper_light_blue_soul_lantern_block_item = ITEMS.register("paper_light_blue_soul_lantern_block", () -> new BlockItemBase(paper_light_blue_soul_lantern_block.get()));
        }
        if (LanternConfig.paper_cyan_lantern.get()) {
            paper_cyan_lantern_block = BLOCKS.register("paper_cyan_lantern_block", () -> new SkinnedLanternNoFacingBlock(false));
            paper_cyan_lantern_block_item = ITEMS.register("paper_cyan_lantern_block", () -> new BlockItemBase(paper_cyan_lantern_block.get()));
        }
        if (LanternConfig.paper_cyan_soul_lantern.get()) {
            paper_cyan_soul_lantern_block = BLOCKS.register("paper_cyan_soul_lantern_block", () -> new SkinnedLanternNoFacingBlock(true));
            paper_cyan_soul_lantern_block_item = ITEMS.register("paper_cyan_soul_lantern_block", () -> new BlockItemBase(paper_cyan_soul_lantern_block.get()));
        }
        if (LanternConfig.paper_lime_lantern.get()) {
            paper_lime_lantern_block = BLOCKS.register("paper_lime_lantern_block", () -> new SkinnedLanternNoFacingBlock(false));
            paper_lime_lantern_block_item = ITEMS.register("paper_lime_lantern_block", () -> new BlockItemBase(paper_lime_lantern_block.get()));
        }
        if (LanternConfig.paper_lime_soul_lantern.get()) {
            paper_lime_soul_lantern_block = BLOCKS.register("paper_lime_soul_lantern_block", () -> new SkinnedLanternNoFacingBlock(true));
            paper_lime_soul_lantern_block_item = ITEMS.register("paper_lime_soul_lantern_block", () -> new BlockItemBase(paper_lime_soul_lantern_block.get()));
        }
        if (LanternConfig.paper_green_lantern.get()) {
            paper_green_lantern_block = BLOCKS.register("paper_green_lantern_block", () -> new SkinnedLanternNoFacingBlock(false));
            paper_green_lantern_block_item = ITEMS.register("paper_green_lantern_block", () -> new BlockItemBase(paper_green_lantern_block.get()));
        }
        if (LanternConfig.paper_green_soul_lantern.get()) {
            paper_green_soul_lantern_block = BLOCKS.register("paper_green_soul_lantern_block", () -> new SkinnedLanternNoFacingBlock(true));
            paper_green_soul_lantern_block_item = ITEMS.register("paper_green_soul_lantern_block", () -> new BlockItemBase(paper_green_soul_lantern_block.get()));
        }
        if (LanternConfig.paper_lantern.get()) {
            paper_lantern_block = BLOCKS.register("paper_lantern_block", () -> new SkinnedLanternNoFacingBlock(false));
            paper_lantern_block_item = ITEMS.register("paper_lantern_block", () -> new BlockItemBase(paper_lantern_block.get()));
        }
        if (LanternConfig.paper_soul_lantern.get()) {
            paper_soul_lantern_block = BLOCKS.register("paper_soul_lantern_block", () -> new SkinnedLanternNoFacingBlock(true));
            paper_soul_lantern_block_item = ITEMS.register("paper_soul_lantern_block", () -> new BlockItemBase(paper_soul_lantern_block.get()));
        }
        if (LanternConfig.paper_pink_lantern.get()) {
            paper_pink_lantern_block = BLOCKS.register("paper_pink_lantern_block", () -> new SkinnedLanternNoFacingBlock(false));
            paper_pink_lantern_block_item = ITEMS.register("paper_pink_lantern_block", () -> new BlockItemBase(paper_pink_lantern_block.get()));
        }
        if (LanternConfig.paper_pink_soul_lantern.get()) {
            paper_pink_soul_lantern_block = BLOCKS.register("paper_pink_soul_lantern_block", () -> new SkinnedLanternNoFacingBlock(true));
            paper_pink_soul_lantern_block_item = ITEMS.register("paper_pink_soul_lantern_block", () -> new BlockItemBase(paper_pink_soul_lantern_block.get()));
        }
        if (LanternConfig.paper_brown_lantern.get()) {
            paper_brown_lantern_block = BLOCKS.register("paper_brown_lantern_block", () -> new SkinnedLanternNoFacingBlock(false));
            paper_brown_lantern_block_item = ITEMS.register("paper_brown_lantern_block", () -> new BlockItemBase(paper_brown_lantern_block.get()));
        }
        if (LanternConfig.paper_brown_soul_lantern.get()) {
            paper_brown_soul_lantern_block = BLOCKS.register("paper_brown_soul_lantern_block", () -> new SkinnedLanternNoFacingBlock(true));
            paper_brown_soul_lantern_block_item = ITEMS.register("paper_brown_soul_lantern_block", () -> new BlockItemBase(paper_brown_soul_lantern_block.get()));
        }
        if (LanternConfig.paper_black_lantern.get()) {
            paper_black_lantern_block = BLOCKS.register("paper_black_lantern_block", () -> new SkinnedLanternNoFacingBlock(false));
            paper_black_lantern_block_item = ITEMS.register("paper_black_lantern_block", () -> new BlockItemBase(paper_black_lantern_block.get()));
        }
        if (LanternConfig.paper_black_soul_lantern.get()) {
            paper_black_soul_lantern_block = BLOCKS.register("paper_black_soul_lantern_block", () -> new SkinnedLanternNoFacingBlock(true));
            paper_black_soul_lantern_block_item = ITEMS.register("paper_black_soul_lantern_block", () -> new BlockItemBase(paper_black_soul_lantern_block.get()));
        }
        if (LanternConfig.paper_gray_lantern.get()) {
            paper_gray_lantern_block = BLOCKS.register("paper_gray_lantern_block", () -> new SkinnedLanternNoFacingBlock(false));
            paper_gray_lantern_block_item = ITEMS.register("paper_gray_lantern_block", () -> new BlockItemBase(paper_gray_lantern_block.get()));
        }
        if (LanternConfig.paper_gray_soul_lantern.get()) {
            paper_gray_soul_lantern_block = BLOCKS.register("paper_gray_soul_lantern_block", () -> new SkinnedLanternNoFacingBlock(true));
            paper_gray_soul_lantern_block_item = ITEMS.register("paper_gray_soul_lantern_block", () -> new BlockItemBase(paper_gray_soul_lantern_block.get()));
        }
        if (LanternConfig.paper_light_gray_lantern.get()) {
            paper_light_gray_lantern_block = BLOCKS.register("paper_light_gray_lantern_block", () -> new SkinnedLanternNoFacingBlock(false));
            paper_light_gray_lantern_block_item = ITEMS.register("paper_light_gray_lantern_block", () -> new BlockItemBase(paper_light_gray_lantern_block.get()));
        }
        if (LanternConfig.paper_light_gray_soul_lantern.get()) {
            paper_light_gray_soul_lantern_block = BLOCKS.register("paper_light_gray_soul_lantern_block", () -> new SkinnedLanternNoFacingBlock(true));
            paper_light_gray_soul_lantern_block_item = ITEMS.register("paper_light_gray_soul_lantern_block", () -> new BlockItemBase(paper_light_gray_soul_lantern_block.get()));
        }
        if (LanternConfig.paper_magenta_lantern.get()) {
            paper_magenta_lantern_block = BLOCKS.register("paper_magenta_lantern_block", () -> new SkinnedLanternNoFacingBlock(false));
            paper_magenta_lantern_block_item = ITEMS.register("paper_magenta_lantern_block", () -> new BlockItemBase(paper_magenta_lantern_block.get()));
        }
        if (LanternConfig.paper_magenta_soul_lantern.get()) {
            paper_magenta_soul_lantern_block = BLOCKS.register("paper_magenta_soul_lantern_block", () -> new SkinnedLanternNoFacingBlock(true));
            paper_magenta_soul_lantern_block_item = ITEMS.register("paper_magenta_soul_lantern_block", () -> new BlockItemBase(paper_magenta_soul_lantern_block.get()));
        }
        if (LanternConfig.paper_purple_lantern.get()) {
            paper_purple_lantern_block = BLOCKS.register("paper_purple_lantern_block", () -> new SkinnedLanternNoFacingBlock(false));
            paper_purple_lantern_block_item = ITEMS.register("paper_purple_lantern_block", () -> new BlockItemBase(paper_purple_lantern_block.get()));
        }
        if (LanternConfig.paper_purple_soul_lantern.get()) {
            paper_purple_soul_lantern_block = BLOCKS.register("paper_purple_soul_lantern_block", () -> new SkinnedLanternNoFacingBlock(true));
            paper_purple_soul_lantern_block_item = ITEMS.register("paper_purple_soul_lantern_block", () -> new BlockItemBase(paper_purple_soul_lantern_block.get()));
        }
    }

    //Blocks
    public static RegistryObject<Block> pufferfish_lantern_block;
    public static RegistryObject<Block> pufferfish_soul_lantern_block;
    public static RegistryObject<Block> zombie_lantern_block;
    public static RegistryObject<Block> zombie_soul_lantern_block;
    public static RegistryObject<Block> creeper_lantern_block;
    public static RegistryObject<Block> creeper_soul_lantern_block;
    public static RegistryObject<Block> skeleton_lantern_block;
    public static RegistryObject<Block> skeleton_soul_lantern_block;
    public static RegistryObject<Block> wither_skeleton_lantern_block;
    public static RegistryObject<Block> wither_skeleton_soul_lantern_block;
    public static RegistryObject<Block> bee_lantern_block;
    public static RegistryObject<Block> bee_soul_lantern_block;
    public static RegistryObject<Block> jack_o_lantern_lantern_block;
    public static RegistryObject<Block> jack_o_lantern_soul_lantern_block;
    public static RegistryObject<Block> paper_white_lantern_block;
    public static RegistryObject<Block> paper_white_soul_lantern_block;
    public static RegistryObject<Block> ghost_lantern_block;
    public static RegistryObject<Block> ghost_soul_lantern_block;
    public static RegistryObject<Block> blinky_lantern_block;
    public static RegistryObject<Block> blinky_soul_lantern_block;
    public static RegistryObject<Block> pinky_lantern_block;
    public static RegistryObject<Block> pinky_soul_lantern_block;
    public static RegistryObject<Block> inky_lantern_block;
    public static RegistryObject<Block> inky_soul_lantern_block;
    public static RegistryObject<Block> clyde_lantern_block;
    public static RegistryObject<Block> clyde_soul_lantern_block;
    public static RegistryObject<Block> pacman_lantern_block;
    public static RegistryObject<Block> pacman_soul_lantern_block;
    public static RegistryObject<Block> guardian_lantern_block;
    public static RegistryObject<Block> guardian_soul_lantern_block;
    public static RegistryObject<Block> paper_yellow_lantern_block;
    public static RegistryObject<Block> paper_yellow_soul_lantern_block;
    public static RegistryObject<Block> paper_orange_lantern_block;
    public static RegistryObject<Block> paper_orange_soul_lantern_block;
    public static RegistryObject<Block> paper_blue_lantern_block;
    public static RegistryObject<Block> paper_blue_soul_lantern_block;
    public static RegistryObject<Block> paper_light_blue_lantern_block;
    public static RegistryObject<Block> paper_light_blue_soul_lantern_block;
    public static RegistryObject<Block> paper_cyan_lantern_block;
    public static RegistryObject<Block> paper_cyan_soul_lantern_block;
    public static RegistryObject<Block> paper_lime_lantern_block;
    public static RegistryObject<Block> paper_lime_soul_lantern_block;
    public static RegistryObject<Block> paper_green_lantern_block;
    public static RegistryObject<Block> paper_green_soul_lantern_block;
    public static RegistryObject<Block> paper_lantern_block;
    public static RegistryObject<Block> paper_soul_lantern_block;
    public static RegistryObject<Block> paper_pink_lantern_block;
    public static RegistryObject<Block> paper_pink_soul_lantern_block;
    public static RegistryObject<Block> paper_brown_lantern_block;
    public static RegistryObject<Block> paper_brown_soul_lantern_block;
    public static RegistryObject<Block> paper_black_lantern_block;
    public static RegistryObject<Block> paper_black_soul_lantern_block;
    public static RegistryObject<Block> paper_gray_lantern_block;
    public static RegistryObject<Block> paper_gray_soul_lantern_block;
    public static RegistryObject<Block> paper_light_gray_lantern_block;
    public static RegistryObject<Block> paper_light_gray_soul_lantern_block;
    public static RegistryObject<Block> paper_magenta_lantern_block;
    public static RegistryObject<Block> paper_magenta_soul_lantern_block;
    public static RegistryObject<Block> paper_purple_lantern_block;
    public static RegistryObject<Block> paper_purple_soul_lantern_block;

    //Block Items
    public static RegistryObject<Item> pufferfish_lantern_block_item;
    public static RegistryObject<Item> pufferfish_soul_lantern_block_item;
    public static RegistryObject<Item> zombie_lantern_block_item;
    public static RegistryObject<Item> zombie_soul_lantern_block_item;
    public static RegistryObject<Item> creeper_lantern_block_item;
    public static RegistryObject<Item> creeper_soul_lantern_block_item;
    public static RegistryObject<Item> skeleton_lantern_block_item;
    public static RegistryObject<Item> skeleton_soul_lantern_block_item;
    public static RegistryObject<Item> wither_skeleton_lantern_block_item;
    public static RegistryObject<Item> wither_skeleton_soul_lantern_block_item;
    public static RegistryObject<Item> bee_lantern_block_item;
    public static RegistryObject<Item> bee_soul_lantern_block_item;
    public static RegistryObject<Item> jack_o_lantern_lantern_block_item;
    public static RegistryObject<Item> jack_o_lantern_soul_lantern_block_item;
    public static RegistryObject<Item> paper_white_lantern_block_item;
    public static RegistryObject<Item> paper_white_soul_lantern_block_item;
    public static RegistryObject<Item> ghost_lantern_block_item;
    public static RegistryObject<Item> ghost_soul_lantern_block_item;
    public static RegistryObject<Item> blinky_lantern_block_item;
    public static RegistryObject<Item> blinky_soul_lantern_block_item;
    public static RegistryObject<Item> pinky_lantern_block_item;
    public static RegistryObject<Item> pinky_soul_lantern_block_item;
    public static RegistryObject<Item> inky_lantern_block_item;
    public static RegistryObject<Item> inky_soul_lantern_block_item;
    public static RegistryObject<Item> clyde_lantern_block_item;
    public static RegistryObject<Item> clyde_soul_lantern_block_item;
    public static RegistryObject<Item> pacman_lantern_block_item;
    public static RegistryObject<Item> pacman_soul_lantern_block_item;
    public static RegistryObject<Item> guardian_lantern_block_item;
    public static RegistryObject<Item> guardian_soul_lantern_block_item;
    public static RegistryObject<Item> paper_yellow_lantern_block_item;
    public static RegistryObject<Item> paper_yellow_soul_lantern_block_item;
    public static RegistryObject<Item> paper_orange_lantern_block_item;
    public static RegistryObject<Item> paper_orange_soul_lantern_block_item;
    public static RegistryObject<Item> paper_blue_lantern_block_item;
    public static RegistryObject<Item> paper_blue_soul_lantern_block_item;
    public static RegistryObject<Item> paper_light_blue_lantern_block_item;
    public static RegistryObject<Item> paper_light_blue_soul_lantern_block_item;
    public static RegistryObject<Item> paper_cyan_lantern_block_item;
    public static RegistryObject<Item> paper_cyan_soul_lantern_block_item;
    public static RegistryObject<Item> paper_lime_lantern_block_item;
    public static RegistryObject<Item> paper_lime_soul_lantern_block_item;
    public static RegistryObject<Item> paper_green_lantern_block_item;
    public static RegistryObject<Item> paper_green_soul_lantern_block_item;
    public static RegistryObject<Item> paper_lantern_block_item;
    public static RegistryObject<Item> paper_soul_lantern_block_item;
    public static RegistryObject<Item> paper_pink_lantern_block_item;
    public static RegistryObject<Item> paper_pink_soul_lantern_block_item;
    public static RegistryObject<Item> paper_brown_lantern_block_item;
    public static RegistryObject<Item> paper_brown_soul_lantern_block_item;
    public static RegistryObject<Item> paper_black_lantern_block_item;
    public static RegistryObject<Item> paper_black_soul_lantern_block_item;
    public static RegistryObject<Item> paper_gray_lantern_block_item;
    public static RegistryObject<Item> paper_gray_soul_lantern_block_item;
    public static RegistryObject<Item> paper_light_gray_lantern_block_item;
    public static RegistryObject<Item> paper_light_gray_soul_lantern_block_item;
    public static RegistryObject<Item> paper_magenta_lantern_block_item;
    public static RegistryObject<Item> paper_magenta_soul_lantern_block_item;
    public static RegistryObject<Item> paper_purple_lantern_block_item;
    public static RegistryObject<Item> paper_purple_soul_lantern_block_item;
}
