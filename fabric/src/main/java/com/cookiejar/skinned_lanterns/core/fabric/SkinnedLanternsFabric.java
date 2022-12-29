package com.cookiejar.skinned_lanterns.core.fabric;

import com.cookiejar.skinned_lanterns.core.SkinnedLanterns;
import net.fabricmc.api.ModInitializer;

public class SkinnedLanternsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        SkinnedLanterns.init();
    }
}
