package at.nuxnux.skinnedlanterns;

import at.nuxnux.skinnedlanterns.config.Config;
import at.nuxnux.skinnedlanterns.util.RegistryHandler;
import com.google.common.collect.Iterables;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("skinnedlanterns")
public class SkinnedLanterns {
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "skinnedlanterns";

    public SkinnedLanterns() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.CONFIG);
        Config.loadConfig(Config.CONFIG, FMLPaths.CONFIGDIR.get().resolve(MOD_ID + ".toml").toString());

        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        RegistryHandler.init();

        if (RegistryHandler.ITEMS.getEntries().size() <= 0) {
            LOGGER.error("No lanterns loaded. Did you disable them all in the config?");
        }
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        RegistryHandler.setRenderLayer();
    }

    public static final ItemGroup TAB = new ItemGroup("moreLanternsTab") {
        @Override
        public ItemStack createIcon() {
            if (RegistryHandler.ITEMS.getEntries().size() <= 0) {
                return new ItemStack(Blocks.DIRT);
            }
            return new ItemStack(Iterables.get(RegistryHandler.ITEMS.getEntries(), 0).get());
        }
    };
}
