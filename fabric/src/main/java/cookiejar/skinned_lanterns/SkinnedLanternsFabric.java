package cookiejar.skinned_lanterns;

import cookiejar.skinned_lanterns.common.lib.MiscLibrary;
import cookiejar.skinned_lanterns.common.block.ModBlocks;
import cookiejar.skinned_lanterns.core.SkinnedLanternsCommon;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;

import java.util.function.BiConsumer;

public class SkinnedLanternsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        MiscLibrary.LOG.info("Hello, Let's skin those lantern's!");
        SkinnedLanternsCommon.init();

        ModBlocks.registerBlocks(bind(Registry.BLOCK));
        ModBlocks.registerBlockItems(bind(Registry.ITEM));
    }

    private static <T> BiConsumer<T, ResourceLocation> bind(Registry<? super T> registry) {
        return (t, id) -> Registry.register(registry, id, t);
    }
}