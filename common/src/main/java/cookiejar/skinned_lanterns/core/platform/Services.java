package cookiejar.skinned_lanterns.core.platform;

import cookiejar.skinned_lanterns.common.lib.MiscLibrary;
import cookiejar.skinned_lanterns.core.platform.services.IPlatformHelper;

import java.util.ServiceLoader;

public class Services {
    public static final IPlatformHelper PLATFORM = load(IPlatformHelper.class);

    public static <T> T load(Class<T> clazz) {
        final T loadedService = ServiceLoader.load(clazz)
                .findFirst()
                .orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
        MiscLibrary.LOG.debug("Loaded {} for service {}", loadedService, clazz);
        return loadedService;
    }
}