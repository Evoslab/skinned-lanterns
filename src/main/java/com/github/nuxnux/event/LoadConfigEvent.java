package com.github.nuxnux.event;

import com.github.nuxnux.config.SkinnedLanternConfig;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;

public class LoadConfigEvent {

    public static void registerEvent() {
        ClientLifecycleEvents.CLIENT_STARTED.register(client -> {
            //tells if the lantern is on or off
            if (!SkinnedLanternConfig.togglePufferfishLantern == true) {
            }
        });
    }
}
