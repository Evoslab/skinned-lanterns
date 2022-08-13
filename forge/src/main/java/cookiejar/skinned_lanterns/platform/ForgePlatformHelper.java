package cookiejar.skinned_lanterns.platform;

import cookiejar.skinned_lanterns.common.block.ModBlocks;
import cookiejar.skinned_lanterns.core.platform.services.IPlatformHelper;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.loading.FMLLoader;
import org.jetbrains.annotations.NotNull;

public class ForgePlatformHelper implements IPlatformHelper {
    @Override
    public String getPlatformName() {
        return "Forge";
    }

    @Override
    public boolean isModLoaded(String modId) {
        return ModList.get().isLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {
        return !FMLLoader.isProduction();
    }

    @Override
    public CreativeModeTab getSkinnedTab() {
        return new CreativeModeTab("skinned_tab") {
            @Override
            public @NotNull ItemStack makeIcon() {
                return new ItemStack(ModBlocks.PUFFERFISH_LANTERN_BLOCK);
            }
        };
    }
}