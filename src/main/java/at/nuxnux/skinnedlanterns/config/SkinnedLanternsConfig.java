package at.nuxnux.skinnedlanterns.config;

import at.nuxnux.skinnedlanterns.SkinnedLanterns;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.Config.Gui.Background;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;

@Config(name = SkinnedLanterns.MOD_ID)
@Background(value = SkinnedLanterns.MOD_ID + ":textures/config/background.png")
public class SkinnedLanternsConfig implements ConfigData {
    public boolean pufferfish_lantern = true;
    public boolean pufferfish_soul_lantern = true;
    public boolean zombie_lantern = true;
    public boolean zombie_soul_lantern = true;
    public boolean creeper_lantern = true;
    public boolean creeper_soul_lantern = true;
    public boolean skeleton_lantern = true;
    public boolean skeleton_soul_lantern = true;
    public boolean wither_skeleton_lantern = true;
    public boolean wither_skeleton_soul_lantern = true;
    public boolean bee_lantern = true;
    public boolean bee_soul_lantern = true;
    public boolean jack_o_lantern_lantern = true;
    public boolean jack_o_lantern_soul_lantern = true;
    public boolean paper_white_lantern = true;
    public boolean paper_white_soul_lantern = true;
    public boolean ghost_lantern = true;
    public boolean ghost_soul_lantern = true;
    public boolean blinky_lantern = true;
    public boolean blinky_soul_lantern = true;
    public boolean pinky_lantern = true;
    public boolean pinky_soul_lantern = true;
    public boolean inky_lantern = true;
    public boolean inky_soul_lantern = true;
    public boolean clyde_lantern = true;
    public boolean clyde_soul_lantern = true;
    public boolean pacman_lantern = true;
    public boolean pacman_soul_lantern = true;
    public boolean guardian_lantern = true;
    public boolean guardian_soul_lantern = true;
    public boolean paper_yellow_lantern = true;
    public boolean paper_yellow_soul_lantern = true;
    public boolean paper_orange_lantern = true;
    public boolean paper_orange_soul_lantern = true;
    public boolean paper_blue_lantern = true;
    public boolean paper_blue_soul_lantern = true;
    public boolean paper_light_blue_lantern = true;
    public boolean paper_light_blue_soul_lantern = true;
    public boolean paper_cyan_lantern = true;
    public boolean paper_cyan_soul_lantern = true;
    public boolean paper_lime_lantern = true;
    public boolean paper_lime_soul_lantern = true;
    public boolean paper_green_lantern = true;
    public boolean paper_green_soul_lantern = true;
    public boolean paper_lantern = true;
    public boolean paper_soul_lantern = true;
    public boolean paper_pink_lantern = true;
    public boolean paper_pink_soul_lantern = true;
    public boolean paper_brown_lantern = true;
    public boolean paper_brown_soul_lantern = true;
    public boolean paper_black_lantern = true;
    public boolean paper_black_soul_lantern = true;
    public boolean paper_gray_lantern = true;
    public boolean paper_gray_soul_lantern = true;
    public boolean paper_light_gray_lantern = true;
    public boolean paper_light_gray_soul_lantern = true;
    public boolean paper_magenta_lantern = true;
    public boolean paper_magenta_soul_lantern = true;
    public boolean paper_purple_lantern = true;
    public boolean paper_purple_soul_lantern = true;

    public boolean ornament_red_lantern = true;
    public boolean ornament_red_soul_lantern = true;
    public boolean ornament_blue_lantern = true;
    public boolean ornament_blue_soul_lantern = true;
    public boolean ornament_purple_lantern = true;
    public boolean ornament_purple_soul_lantern = true;
    public boolean ornament_lime_lantern = true;
    public boolean ornament_lime_soul_lantern = true;
    public boolean ornament_magenta_lantern = true;
    public boolean ornament_magenta_soul_lantern = true;
    public boolean ornament_yellow_lantern = true;
    public boolean ornament_yellow_soul_lantern = true;
    public boolean ornament_green_lantern = true;
    public boolean ornament_green_soul_lantern = true;
    public boolean ornament_light_blue_lantern = true;
    public boolean ornament_light_blue_soul_lantern = true;
    public boolean ornament_cyan_lantern = true;
    public boolean ornament_cyan_soul_lantern = true;
    public boolean ornament_pink_lantern = true;
    public boolean ornament_pink_soul_lantern = true;
    public boolean ornament_orange_lantern = true;
    public boolean ornament_orange_soul_lantern = true;
    public boolean ornament_brown_lantern = true;
    public boolean ornament_brown_soul_lantern = true;
    public boolean ornament_black_lantern = true;
    public boolean ornament_black_soul_lantern = true;
    public boolean ornament_white_lantern = true;
    public boolean ornament_white_soul_lantern = true;
    public boolean ornament_gray_lantern = true;
    public boolean ornament_gray_soul_lantern = true;
    public boolean ornament_light_gray_lantern = true;
    public boolean ornament_light_gray_soul_lantern = true;
    public boolean present_green_lantern = true;
    public boolean present_green_soul_lantern = true;
    public boolean present_red_lantern = true;
    public boolean present_red_soul_lantern = true;
    public boolean snowman_lantern = true;
    public boolean snowman_soul_lantern = true;

    public boolean jellyfish_lantern = true;
    public boolean jellyfish_soul_lantern = true;
    public boolean blue_jellyfish_lantern = true;
    public boolean blue_jellyfish_soul_lantern = true;

    public boolean honey_lantern = true;
    public boolean honey_soul_lantern = true;
    public boolean slime_lantern = true;
    public boolean slime_soul_lantern = true;

    public boolean lil_tater_lantern = true;
    public boolean lil_tater_soul_lantern = true;

    public static void init() {
        AutoConfig.register(SkinnedLanternsConfig.class, GsonConfigSerializer::new);
    }

    public static SkinnedLanternsConfig get() {
        return AutoConfig.getConfigHolder(SkinnedLanternsConfig.class).getConfig();
    }
}