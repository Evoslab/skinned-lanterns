package me.stevenplayzz.skinnedlanterns;

import com.google.common.reflect.Reflection;
import me.stevenplayzz.skinnedlanterns.block.SkinnedLanternBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SkinnedLanterns implements ModInitializer {
	public static final String MOD_ID   = "skinnedlanterns";
	public static final String MOD_NAME = "Skinned Lanterns";

	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "item_group"), () -> new ItemStack(SkinnedLanternBlocks.PUFFERFISH_LANTERN_BLOCK));

	@SuppressWarnings("UnstableApiUsage")
	@Override
	public void onInitialize() {
		LOGGER.info("Initializing {}", MOD_NAME);
		Reflection.initialize(SkinnedLanternBlocks.class);
		LOGGER.info("Initialized {}", MOD_NAME);
	}

	public static Identifier id(String name) {
		return new Identifier(MOD_ID, name);
	}
}