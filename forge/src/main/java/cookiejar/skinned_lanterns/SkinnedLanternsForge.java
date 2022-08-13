package cookiejar.skinned_lanterns;

import cookiejar.skinned_lanterns.common.block.ModBlocks;
import cookiejar.skinned_lanterns.common.lib.MiscLibrary;
import cookiejar.skinned_lanterns.core.SkinnedLanternsCommon;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegisterEvent;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

@Mod(MiscLibrary.MOD_ID)
public class SkinnedLanternsForge {
    public SkinnedLanternsForge() {
        MiscLibrary.LOG.info("Hello, Let's skin those lantern's!");
        SkinnedLanternsCommon.init();

        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        bind(Registry.BLOCK_REGISTRY, ModBlocks::registerBlocks);
        bind(Registry.ITEM_REGISTRY, ModBlocks::registerBlockItems);
    }

    private static <T> void bind(ResourceKey<Registry<T>> registry, Consumer<BiConsumer<T, ResourceLocation>> source) {
        FMLJavaModLoadingContext.get().getModEventBus().addListener((RegisterEvent event) -> {
            if (registry.equals(event.getRegistryKey())) {
                source.accept((t, rl) -> event.register(registry, rl, () -> t));
            }
        });
    }
}