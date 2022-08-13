package cookiejar.skinned_lanterns.platform;

import cookiejar.skinned_lanterns.common.block.ModBlocks;
import cookiejar.skinned_lanterns.common.lib.LocationLibrary;
import cookiejar.skinned_lanterns.core.platform.services.IPlatformHelper;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class FabricPlatformHelper implements IPlatformHelper {
    @Override
    public String getPlatformName() {
        return "Fabric";
    }

    @Override
    public boolean isModLoaded(String modId) {
        return FabricLoader.getInstance().isModLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {
        return FabricLoader.getInstance().isDevelopmentEnvironment();
    }

    @Override
    public CreativeModeTab getSkinnedTab() {
        return FabricItemGroupBuilder.create(LocationLibrary.location("skinned_tab")).icon(()-> new ItemStack(ModBlocks.PUFFERFISH_LANTERN_BLOCK)).build();
    }
}