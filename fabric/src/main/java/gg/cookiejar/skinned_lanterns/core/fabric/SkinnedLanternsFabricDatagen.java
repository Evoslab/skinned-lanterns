package gg.cookiejar.skinned_lanterns.core.fabric;

import gg.cookiejar.skinned_lanterns.core.SkinnedLanterns;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class SkinnedLanternsFabricDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator dataGenerator) {
        SkinnedLanterns.PLATFORM.dataSetup(dataGenerator);
    }
}
