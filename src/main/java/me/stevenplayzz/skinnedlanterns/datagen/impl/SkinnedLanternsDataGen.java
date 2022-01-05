package me.stevenplayzz.skinnedlanterns.datagen.impl;

import me.stevenplayzz.skinnedlanterns.datagen.impl.provider.BlockLootTablesProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class SkinnedLanternsDataGen implements DataGeneratorEntrypoint {
    //TODO: Add more Datagen Stuffs
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        fabricDataGenerator.addProvider(BlockLootTablesProvider::new);
//        fabricDataGenerator.addProvider(BlockStateDefinitionProvider::new);
//        fabricDataGenerator.addProvider(RecipesProvider::new);
    }
}
