package com.cookiejar.skinned_lanterns.core;

import com.cookiejar.skinned_lanterns.client.SkinnedLanternsClient;
import com.cookiejar.skinned_lanterns.core.registry.SLBlocks;
import com.cookiejar.skinned_lanterns.core.registry.SLItems;
import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class SkinnedLanterns {
    public static final String MOD_ID = "skinned_lanterns";
    public static final CreativeModeTab SKINNED_TAB = CreativeTabRegistry.create(new ResourceLocation(MOD_ID, "skinned_tab"), () -> new ItemStack(SLBlocks.PUFFERFISH_LANTERN_BLOCK.get()));
    
    public static void init() {
        SLItems.ITEMS.register();
        SLBlocks.BLOCKS.register();

        SkinnedLanternsClient.init();
    }
}