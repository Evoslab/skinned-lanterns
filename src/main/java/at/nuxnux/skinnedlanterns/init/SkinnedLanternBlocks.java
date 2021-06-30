package at.nuxnux.skinnedlanterns.init;

import at.nuxnux.skinnedlanterns.SkinnedLanterns;
import at.nuxnux.skinnedlanterns.block.SkinnedLanternBlock;
import at.nuxnux.skinnedlanterns.config.SkinnedLanternsConfig;
import at.nuxnux.skinnedlanterns.block.SkinnedLanternNoFacingBlock;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.Level;

import java.util.LinkedHashMap;
import java.util.Map;

public class SkinnedLanternBlocks {
    public static final Map<Identifier, Block> BLOCKS = new LinkedHashMap<>();
    public static final Map<Identifier, BlockItem> ITEMS = new LinkedHashMap<>();

    public static final SkinnedLanternsConfig CONFIG = SkinnedLanternsConfig.get();

    public static Block PUFFERFISH_LANTERN_BLOCK = registerBlock("pufferfish", SkinnedBlock(), CONFIG.pufferfish_lantern);
    public static Block PUFFERFISH_SOUL_LANTERN_BLOCK = registerBlock("pufferfish_soul", SoulSkinnedBlock(), CONFIG.pufferfish_soul_lantern);
    public static Block ZOMBIE_LANTERN_BLOCK = registerBlock("zombie", SkinnedBlock(), CONFIG.zombie_lantern);
    public static Block ZOMBIE_SOUL_LANTERN_BLOCK = registerBlock("zombie_soul", SoulSkinnedBlock(), CONFIG.zombie_soul_lantern);
    public static Block CREEPER_LANTERN_BLOCK = registerBlock("creeper", SkinnedBlock(), CONFIG.creeper_lantern);
    public static Block CREEPER_SOUL_LANTERN_BLOCK = registerBlock("creeper_soul", SoulSkinnedBlock(), CONFIG.creeper_soul_lantern);
    public static Block SKELETON_LANTERN_BLOCK = registerBlock("skeleton", SkinnedBlock(), CONFIG.skeleton_lantern);
    public static Block SKELETON_SOUL_LANTERN_BLOCK = registerBlock("skeleton_soul", SoulSkinnedBlock(), CONFIG.skeleton_soul_lantern);
    public static Block WITHER_SKELETON_LANTERN_BLOCK = registerBlock("wither_skeleton", SkinnedBlock(), CONFIG.wither_skeleton_lantern);
    public static Block WITHER_SKELETON_SOUL_LANTERN_BLOCK = registerBlock("wither_skeleton_soul", SoulSkinnedBlock(), CONFIG.wither_skeleton_soul_lantern);
    public static Block BEE_LANTERN_BLOCK = registerBlock("bee", SkinnedBlock(), CONFIG.bee_lantern);
    public static Block BEE_SOUL_LANTERN_BLOCK = registerBlock("bee_soul", SoulSkinnedBlock(), CONFIG.bee_soul_lantern);
    public static Block JACK_O_LANTERN_LANTERN_BLOCK = registerBlock("jack_o_lantern", SkinnedBlock(), CONFIG.jack_o_lantern_lantern);
    public static Block JACK_O_LANTERN_SOUL_LANTERN_BLOCK = registerBlock("jack_o_lantern_soul", SoulSkinnedBlock(), CONFIG.jack_o_lantern_soul_lantern);
    public static Block PAPER_WHITE_LANTERN_BLOCK = registerBlock("paper_white", SkinnedNoFacingBlock(), CONFIG.paper_white_lantern);
    public static Block PAPER_WHITE_SOUL_LANTERN_BLOCK = registerBlock("paper_white_soul", SoulSkinnedNoFacingBlock(), CONFIG.paper_white_soul_lantern);
    public static Block GHOST_LANTERN_BLOCK = registerBlock("ghost", SkinnedBlock(), CONFIG.ghost_lantern);
    public static Block GHOST_SOUL_LANTERN_BLOCK = registerBlock("ghost_soul", SoulSkinnedBlock(), CONFIG.ghost_soul_lantern);
    public static Block BLINKY_LANTERN_BLOCK = registerBlock("blinky", SkinnedBlock(), CONFIG.blinky_lantern);
    public static Block BLINKY_SOUL_LANTERN_BLOCK = registerBlock("blinky_soul", SoulSkinnedBlock(), CONFIG.blinky_soul_lantern);
    public static Block PINKY_LANTERN_BLOCK = registerBlock("pinky", SkinnedBlock(), CONFIG.pinky_lantern);
    public static Block PINKY_SOUL_LANTERN_BLOCK = registerBlock("pinky_soul", SoulSkinnedBlock(), CONFIG.pinky_soul_lantern);
    public static Block INKY_LANTERN_BLOCK = registerBlock("inky", SkinnedBlock(), CONFIG.inky_lantern);
    public static Block INKY_SOUL_LANTERN_BLOCK = registerBlock("inky_soul", SoulSkinnedBlock(), CONFIG.inky_soul_lantern);
    public static Block CLYDE_LANTERN_BLOCK = registerBlock("clyde", SkinnedBlock(), CONFIG.clyde_lantern);
    public static Block CLYDE_SOUL_LANTERN_BLOCK = registerBlock("clyde_soul", SoulSkinnedBlock(), CONFIG.clyde_soul_lantern);
    public static Block PACMAN_LANTERN_BLOCK = registerBlock("pacman", SkinnedBlock(), CONFIG.pacman_lantern);
    public static Block PACMAN_SOUL_LANTERN_BLOCK = registerBlock("pacman_soul", SoulSkinnedBlock(), CONFIG.pacman_soul_lantern);
    public static Block GUARDIAN_LANTERN_BLOCK = registerBlock("guardian", SkinnedBlock(), CONFIG.guardian_lantern);
    public static Block GUARDIAN_SOUL_LANTERN_BLOCK = registerBlock("guardian_soul", SoulSkinnedBlock(), CONFIG.guardian_soul_lantern);
    public static Block PAPER_YELLOW_LANTERN_BLOCK = registerBlock("paper_yellow", SkinnedNoFacingBlock(), CONFIG.paper_yellow_lantern);
    public static Block PAPER_YELLOW_SOUL_LANTERN_BLOCK = registerBlock("paper_yellow_soul", SoulSkinnedNoFacingBlock(), CONFIG.paper_yellow_soul_lantern);
    public static Block PAPER_ORANGE_LANTERN_BLOCK = registerBlock("paper_orange", SkinnedNoFacingBlock(), CONFIG.paper_orange_lantern);
    public static Block PAPER_ORANGE_SOUL_LANTERN_BLOCK = registerBlock("paper_orange_soul", SoulSkinnedNoFacingBlock(), CONFIG.paper_orange_soul_lantern);
    public static Block PAPER_BLUE_LANTERN_BLOCK = registerBlock("paper_blue", SkinnedNoFacingBlock(), CONFIG.paper_blue_lantern);
    public static Block PAPER_BLUE_SOUL_LANTERN_BLOCK = registerBlock("paper_blue_soul", SoulSkinnedNoFacingBlock(), CONFIG.paper_blue_soul_lantern);
    public static Block PAPER_LIGHT_BLUE_LANTERN_BLOCK = registerBlock("paper_light_blue", SkinnedNoFacingBlock(), CONFIG.paper_light_blue_lantern);
    public static Block PAPER_LIGHT_BLUE_SOUL_LANTERN_BLOCK = registerBlock("paper_light_blue_soul", SoulSkinnedNoFacingBlock(), CONFIG.paper_light_blue_soul_lantern);
    public static Block PAPER_CYAN_LANTERN_BLOCK = registerBlock("paper_cyan", SkinnedNoFacingBlock(), CONFIG.paper_cyan_lantern);
    public static Block PAPER_CYAN_SOUL_LANTERN_BLOCK = registerBlock("paper_cyan_soul", SoulSkinnedNoFacingBlock(), CONFIG.paper_cyan_soul_lantern);
    public static Block PAPER_LIME_LANTERN_BLOCK = registerBlock("paper_lime", SkinnedNoFacingBlock(), CONFIG.paper_lime_lantern);
    public static Block PAPER_LIME_SOUL_LANTERN_BLOCK = registerBlock("paper_lime_soul", SoulSkinnedNoFacingBlock(), CONFIG.paper_lime_soul_lantern);
    public static Block PAPER_GREEN_LANTERN_BLOCK = registerBlock("paper_green", SkinnedNoFacingBlock(), CONFIG.paper_green_lantern);
    public static Block PAPER_GREEN_SOUL_LANTERN_BLOCK = registerBlock("paper_green_soul", SoulSkinnedNoFacingBlock(), CONFIG.paper_green_soul_lantern);
    public static Block PAPER_LANTERN_BLOCK = registerBlock("paper", SkinnedNoFacingBlock(), CONFIG.paper_lantern);
    public static Block PAPER_SOUL_LANTERN_BLOCK = registerBlock("paper_soul", SoulSkinnedNoFacingBlock(), CONFIG.paper_soul_lantern);
    public static Block PAPER_PINK_LANTERN_BLOCK = registerBlock("paper_pink", SkinnedNoFacingBlock(), CONFIG.paper_pink_lantern);
    public static Block PAPER_PINK_SOUL_LANTERN_BLOCK = registerBlock("paper_pink_soul", SoulSkinnedNoFacingBlock(), CONFIG.paper_pink_soul_lantern);
    public static Block PAPER_BROWN_LANTERN_BLOCK = registerBlock("paper_brown", SkinnedNoFacingBlock(), CONFIG.paper_brown_lantern);
    public static Block PAPER_BROWN_SOUL_LANTERN_BLOCK = registerBlock("paper_brown_soul", SoulSkinnedNoFacingBlock(), CONFIG.paper_brown_soul_lantern);
    public static Block PAPER_BLACK_LANTERN_BLOCK = registerBlock("paper_black", SkinnedNoFacingBlock(), CONFIG.paper_black_lantern);
    public static Block PAPER_BLACK_SOUL_LANTERN_BLOCK = registerBlock("paper_black_soul", SoulSkinnedNoFacingBlock(), CONFIG.paper_black_soul_lantern);
    public static Block PAPER_GRAY_LANTERN_BLOCK = registerBlock("paper_gray", SkinnedNoFacingBlock(), CONFIG.paper_gray_lantern);
    public static Block PAPER_GRAY_SOUL_LANTERN_BLOCK = registerBlock("paper_gray_soul", SoulSkinnedNoFacingBlock(), CONFIG.paper_gray_soul_lantern);
    public static Block PAPER_LIGHT_GRAY_LANTERN_BLOCK = registerBlock("paper_light_gray", SkinnedNoFacingBlock(), CONFIG.paper_light_gray_lantern);
    public static Block PAPER_LIGHT_GRAY_SOUL_LANTERN_BLOCK = registerBlock("paper_light_gray_soul", SoulSkinnedNoFacingBlock(), CONFIG.paper_light_gray_soul_lantern);
    public static Block PAPER_MAGENTA_LANTERN_BLOCK = registerBlock("paper_magenta", SkinnedNoFacingBlock(), CONFIG.paper_magenta_lantern);
    public static Block PAPER_MAGENTA_SOUL_LANTERN_BLOCK = registerBlock("paper_magenta_soul", SoulSkinnedNoFacingBlock(), CONFIG.paper_magenta_soul_lantern);
    public static Block PAPER_PURPLE_LANTERN_BLOCK = registerBlock("paper_purple", SkinnedNoFacingBlock(), CONFIG.paper_purple_lantern);
    public static Block PAPER_PURPLE_SOUL_LANTERN_BLOCK = registerBlock("paper_purple_soul", SoulSkinnedNoFacingBlock(), CONFIG.paper_purple_soul_lantern);

    public static Block ORNAMENT_RED_LANTERN_BLOCK = registerBlock("ornament_red", SkinnedNoFacingBlock(), CONFIG.ornament_red_lantern);
    public static Block ORNAMENT_RED_SOUL_LANTERN_BLOCK = registerBlock("ornament_red_soul", SoulSkinnedNoFacingBlock(), CONFIG.ornament_red_soul_lantern);
    public static Block ORNAMENT_BLUE_LANTERN_BLOCK = registerBlock("ornament_blue", SkinnedNoFacingBlock(), CONFIG.ornament_blue_lantern);
    public static Block ORNAMENT_BLUE_SOUL_LANTERN_BLOCK = registerBlock("ornament_blue_soul", SoulSkinnedNoFacingBlock(), CONFIG.ornament_blue_soul_lantern);
    public static Block ORNAMENT_PURPLE_LANTERN_BLOCK = registerBlock("ornament_purple", SkinnedNoFacingBlock(), CONFIG.ornament_purple_lantern);
    public static Block ORNAMENT_PURPLE_SOUL_LANTERN_BLOCK = registerBlock("ornament_purple_soul", SoulSkinnedNoFacingBlock(), CONFIG.ornament_purple_soul_lantern);
    public static Block ORNAMENT_LIME_LANTERN_BLOCK = registerBlock("ornament_lime", SkinnedNoFacingBlock(), CONFIG.ornament_lime_lantern);
    public static Block ORNAMENT_LIME_SOUL_LANTERN_BLOCK = registerBlock("ornament_lime_soul", SoulSkinnedNoFacingBlock(), CONFIG.ornament_lime_soul_lantern);
    public static Block ORNAMENT_MAGENTA_LANTERN_BLOCK = registerBlock("ornament_magenta", SkinnedNoFacingBlock(), CONFIG.ornament_magenta_lantern);
    public static Block ORNAMENT_MAGENTA_SOUL_LANTERN_BLOCK = registerBlock("ornament_magenta_soul", SoulSkinnedNoFacingBlock(), CONFIG.ornament_magenta_soul_lantern);
    public static Block ORNAMENT_YELLOW_LANTERN_BLOCK = registerBlock("ornament_yellow", SkinnedNoFacingBlock(), CONFIG.ornament_yellow_lantern);
    public static Block ORNAMENT_YELLOW_SOUL_LANTERN_BLOCK = registerBlock("ornament_yellow_soul", SoulSkinnedNoFacingBlock(), CONFIG.ornament_yellow_soul_lantern);
    public static Block ORNAMENT_GREEN_LANTERN_BLOCK = registerBlock("ornament_green", SkinnedNoFacingBlock(), CONFIG.ornament_green_lantern);
    public static Block ORNAMENT_GREEN_SOUL_LANTERN_BLOCK = registerBlock("ornament_green_soul", SoulSkinnedNoFacingBlock(), CONFIG.ornament_green_soul_lantern);
    public static Block ORNAMENT_LIGHT_BLUE_LANTERN_BLOCK = registerBlock("ornament_light_blue", SkinnedNoFacingBlock(), CONFIG.ornament_light_blue_lantern);
    public static Block ORNAMENT_LIGHT_BLUE_SOUL_LANTERN_BLOCK = registerBlock("ornament_light_blue_soul", SoulSkinnedNoFacingBlock(), CONFIG.ornament_light_blue_soul_lantern);
    public static Block ORNAMENT_CYAN_LANTERN_BLOCK = registerBlock("ornament_cyan", SkinnedNoFacingBlock(), CONFIG.ornament_cyan_lantern);
    public static Block ORNAMENT_CYAN_SOUL_LANTERN_BLOCK = registerBlock("ornament_cyan_soul", SoulSkinnedNoFacingBlock(), CONFIG.ornament_cyan_soul_lantern);
    public static Block ORNAMENT_PINK_LANTERN_BLOCK = registerBlock("ornament_pink", SkinnedNoFacingBlock(), CONFIG.ornament_pink_lantern);
    public static Block ORNAMENT_PINK_SOUL_LANTERN_BLOCK = registerBlock("ornament_pink_soul", SoulSkinnedNoFacingBlock(), CONFIG.ornament_pink_soul_lantern);
    public static Block ORNAMENT_ORANGE_LANTERN_BLOCK = registerBlock("ornament_orange", SkinnedNoFacingBlock(), CONFIG.ornament_orange_lantern);
    public static Block ORNAMENT_ORANGE_SOUL_LANTERN_BLOCK = registerBlock("ornament_orange_soul", SoulSkinnedNoFacingBlock(), CONFIG.ornament_orange_soul_lantern);
    public static Block ORNAMENT_BROWN_LANTERN_BLOCK = registerBlock("ornament_brown", SkinnedNoFacingBlock(), CONFIG.ornament_brown_lantern);
    public static Block ORNAMENT_BROWN_SOUL_LANTERN_BLOCK = registerBlock("ornament_brown_soul", SoulSkinnedNoFacingBlock(), CONFIG.ornament_brown_soul_lantern);
    public static Block ORNAMENT_BLACK_LANTERN_BLOCK = registerBlock("ornament_black", SkinnedNoFacingBlock(), CONFIG.ornament_black_lantern);
    public static Block ORNAMENT_BLACK_SOUL_LANTERN_BLOCK = registerBlock("ornament_black_soul", SoulSkinnedNoFacingBlock(), CONFIG.ornament_black_soul_lantern);
    public static Block ORNAMENT_WHITE_LANTERN_BLOCK = registerBlock("ornament_white", SkinnedNoFacingBlock(), CONFIG.ornament_white_lantern);
    public static Block ORNAMENT_WHITE_SOUL_LANTERN_BLOCK = registerBlock("ornament_white_soul", SoulSkinnedNoFacingBlock(), CONFIG.ornament_white_soul_lantern);
    public static Block ORNAMENT_GRAY_LANTERN_BLOCK = registerBlock("ornament_gray", SkinnedNoFacingBlock(), CONFIG.ornament_gray_lantern);
    public static Block ORNAMENT_GRAY_SOUL_LANTERN_BLOCK = registerBlock("ornament_gray_soul", SoulSkinnedNoFacingBlock(), CONFIG.ornament_gray_soul_lantern);
    public static Block ORNAMENT_LIGHT_GRAY_LANTERN_BLOCK = registerBlock("ornament_light_gray", SkinnedNoFacingBlock(), CONFIG.ornament_light_gray_lantern);
    public static Block ORNAMENT_LIGHT_GRAY_SOUL_LANTERN_BLOCK = registerBlock("ornament_light_gray_soul", SoulSkinnedNoFacingBlock(), CONFIG.ornament_light_gray_soul_lantern);
    public static Block PRESENT_GREEN_LANTERN_BLOCK = registerBlock("present_green", SkinnedNoFacingBlock(), CONFIG.present_green_lantern);
    public static Block PRESENT_GREEN_SOUL_LANTERN_BLOCK = registerBlock("present_green_soul", SoulSkinnedNoFacingBlock(), CONFIG.present_green_soul_lantern);
    public static Block PRESENT_RED_LANTERN_BLOCK = registerBlock("present_red", SkinnedNoFacingBlock(), CONFIG.present_red_lantern);
    public static Block PRESENT_RED_SOUL_LANTERN_BLOCK = registerBlock("present_red_soul", SoulSkinnedNoFacingBlock(), CONFIG.present_red_soul_lantern);
    public static Block SNOWMAN_LANTERN_BLOCK = registerBlock("snowman", SkinnedBlock(), CONFIG.snowman_lantern);
    public static Block SNOWMAN_SOUL_LANTERN_BLOCK = registerBlock("snowman_soul", SoulSkinnedBlock(), CONFIG.snowman_soul_lantern);

    public static Block JELLYFISH_LANTERN_BLOCK = registerBlock("jellyfish", SkinnedNoFacingBlock(), CONFIG.jellyfish_lantern);
    public static Block JELLYFISH_SOUL_LANTERN_BLOCK = registerBlock("jellyfish_soul", SoulSkinnedNoFacingBlock(), CONFIG.jellyfish_soul_lantern);
    public static Block BLUE_JELLYFISH_LANTERN_BLOCK = registerBlock("blue_jellyfish", SkinnedNoFacingBlock(), CONFIG.blue_jellyfish_lantern);
    public static Block BLUE_JELLYFISH_SOUL_LANTERN_BLOCK = registerBlock("blue_jellyfish_soul", SoulSkinnedNoFacingBlock(), CONFIG.blue_jellyfish_soul_lantern);

    public static Block HONEY_LANTERN_BLOCK = registerBlock("honey", SkinnedNoFacingBlock(), CONFIG.honey_lantern);
    public static Block HONEY_SOUL_LANTERN_BLOCK = registerBlock("honey_soul", SoulSkinnedNoFacingBlock(), CONFIG.honey_soul_lantern);
    public static Block SLIME_LANTERN_BLOCK = registerBlock("slime", SkinnedBlock(), CONFIG.slime_lantern);
    public static Block SLIME_SOUL_LANTERN_BLOCK = registerBlock("slime_soul", SoulSkinnedBlock(), CONFIG.slime_soul_lantern);

    public static Block LIL_TATER_LANTERN_BLOCK = registerCompactBlock("lil_tater", SkinnedBlock(), "ltr", CONFIG.lil_tater_lantern);
    public static Block LIL_TATER_SOUL_LANTERN_BLOCK = registerCompactBlock("lil_tater_soul",  SoulSkinnedBlock(), "ltr", CONFIG.lil_tater_soul_lantern);

    public static void init(){
        for (Identifier id : BLOCKS.keySet()) {
            Registry.register(Registry.BLOCK, id, BLOCKS.get(id));
        }
        for (Identifier id : ITEMS.keySet()) {
            Registry.register(Registry.ITEM, id, ITEMS.get(id));
        }

        if (SkinnedLanternBlocks.ITEMS.values().size() <= 0) {
            SkinnedLanterns.log(Level.ERROR, "No lanterns loaded. Did you disable them all in the config?");
        } else {
            SkinnedLanterns.log(Level.INFO, "Lanterns Loaded!");
        }
    }

    private static Block registerBlock(String id, Block block, boolean shouldLanternBe) {
        if (shouldLanternBe) {
            BLOCKS.put(SkinnedLanterns.id(id + "_lantern_block"), block);
            ITEMS.put(SkinnedLanterns.id(id + "_lantern_block"), new BlockItem(block, new Item.Settings().group(SkinnedLanterns.GROUP)));
            return block;
        }

        return block;
    }

    private static Block registerCompactBlock(String id, Block block, String modid, boolean shouldLanternBe) {
        if (shouldLanternBe && FabricLoader.getInstance().isModLoaded(modid)) {
            BLOCKS.put(SkinnedLanterns.id(id + "_lantern_block"), block);
            ITEMS.put(SkinnedLanterns.id(id + "_lantern_block"), new BlockItem(block, new Item.Settings().group(SkinnedLanterns.GROUP)));

            return block;
        }

        return block;
    }

    public static SkinnedLanternNoFacingBlock SkinnedNoFacingBlock() {
        return new SkinnedLanternNoFacingBlock(SkinnedLanterns.Settings.LANTERN);
    }

    public static SkinnedLanternBlock SkinnedBlock() {
        return new SkinnedLanternBlock(SkinnedLanterns.Settings.LANTERN);
    }

    public static SkinnedLanternNoFacingBlock SoulSkinnedNoFacingBlock() {
        return new SkinnedLanternNoFacingBlock(SkinnedLanterns.Settings.SOUL_LANTERN);
    }

    public static SkinnedLanternBlock SoulSkinnedBlock() {
        return new SkinnedLanternBlock(SkinnedLanterns.Settings.SOUL_LANTERN);
    }
}