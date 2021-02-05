package com.github.nuxnux.skinnedlanterns;

import com.github.nuxnux.skinnedlanterns.registry.SkinnedLanternBlocks;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SkinnedLanterns implements ModInitializer {

	public static final String MODID = "skinnedlanterns";
	public static final Logger LOGGER = LogManager.getLogger(MODID);

	@Override
	public void onInitialize() {

		new SkinnedLanternBlocks();
		SkinnedLanternBlocks.RegisterSkinnedLanternBlocks();

	}

	public static Identifier id(String name) {
		return new Identifier(MODID, name);
	}

}
