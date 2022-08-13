package cookiejar.skinned_lanterns.common.lib;

import net.minecraft.resources.ResourceLocation;

public class LocationLibrary {
    public static ResourceLocation location(String path) {
        return new ResourceLocation(MiscLibrary.MOD_ID, path);
    }
}