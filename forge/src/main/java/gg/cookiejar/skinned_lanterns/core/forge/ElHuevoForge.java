package gg.cookiejar.skinned_lanterns.core.forge;

import gg.cookiejar.skinned_lanterns.core.SkinnedLanterns;
import net.minecraftforge.fml.common.Mod;

@Mod(SkinnedLanterns.MOD_ID)
public class ElHuevoForge {
    public ElHuevoForge() {
        SkinnedLanterns.PLATFORM.setup();
    }
}
