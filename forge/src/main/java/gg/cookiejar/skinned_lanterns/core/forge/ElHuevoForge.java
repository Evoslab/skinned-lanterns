package gg.cookiejar.skinned_lanterns.core.forge;

import gg.cookiejar.skinned_lanterns.core.SkinnedLanterns;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.GeckoLib;

@Mod(SkinnedLanterns.MOD_ID)
public class ElHuevoForge {
    public ElHuevoForge() {
        GeckoLib.initialize();
        SkinnedLanterns.PLATFORM.setup();
    }
}
