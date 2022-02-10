package gg.cookiejar.skinned_lanterns.core.fabric;

import gg.cookiejar.skinned_lanterns.core.SkinnedLanterns;
import net.fabricmc.api.ModInitializer;

public class SkinnedLanternsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
//        GeckoLib.initialize();
        SkinnedLanterns.PLATFORM.setup();
    }
}