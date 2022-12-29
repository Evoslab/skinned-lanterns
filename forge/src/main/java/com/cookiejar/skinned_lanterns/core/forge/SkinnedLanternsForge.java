package com.cookiejar.skinned_lanterns.core.forge;

import com.cookiejar.skinned_lanterns.core.SkinnedLanterns;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SkinnedLanterns.MOD_ID)
public class SkinnedLanternsForge {
    public SkinnedLanternsForge() {
        EventBuses.registerModEventBus(SkinnedLanterns.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        SkinnedLanterns.init();
    }
}