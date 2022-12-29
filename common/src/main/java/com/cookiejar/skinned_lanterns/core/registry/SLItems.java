package com.cookiejar.skinned_lanterns.core.registry;

import com.cookiejar.skinned_lanterns.core.SkinnedLanterns;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.Registry;
import net.minecraft.world.item.Item;

public class SLItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(SkinnedLanterns.MOD_ID, Registry.ITEM_REGISTRY);
}