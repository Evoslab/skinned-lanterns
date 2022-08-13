package cookiejar.skinned_lanterns.core;

import cookiejar.skinned_lanterns.common.lib.MiscLibrary;
import cookiejar.skinned_lanterns.core.platform.Services;

public class SkinnedLanternsCommon {
    public static void init() {
        MiscLibrary.LOG.info("Hello from Common init on {}! we are currently in a {} environment!", Services.PLATFORM.getPlatformName(), Services.PLATFORM.isDevelopmentEnvironment() ? "development" : "production");
    }
}