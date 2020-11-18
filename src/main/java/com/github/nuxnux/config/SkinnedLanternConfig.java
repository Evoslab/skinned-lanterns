package com.github.nuxnux.config;

import com.github.nuxnux.SkinnedLanterns;
import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.annotation.ConfigEntry;
import me.sargunvohra.mcmods.autoconfig1u.shadowed.blue.endless.jankson.Comment;

@Config(name = "skinnedlanterns")
public class SkinnedLanternConfig implements ConfigData {

    @ConfigEntry.Gui.Tooltip

    @Comment(value = "Toggles lanterns to be loaded or not (requires restart!)")
    public static boolean togglePufferfishLantern = true;

    public static boolean toggleSoulPufferfishLantern = true;
    public static boolean toggleZombieLantern = true;
    public static boolean toggleSoulZombieLantern = true;
    public static boolean toggleCreeperLantern = true;
    public static boolean toggleSoulCreeperLantern = true;
    public static boolean toggleSkeletonLantern = true;
    public static boolean toggleSoulSkeletonLantern = true;
    public static boolean toggleWitherSkeletonLantern = true;
    public static boolean toggleSoulWitherSkeletonLantern = true;
    public static boolean toggleBeeLantern = true;
    public static boolean toggleSoulBeeLantern = true;
    
}
