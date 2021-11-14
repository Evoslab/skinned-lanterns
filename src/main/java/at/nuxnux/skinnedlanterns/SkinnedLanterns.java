package at.nuxnux.skinnedlanterns;

import at.nuxnux.skinnedlanterns.config.SkinnedLanternsConfig;
import at.nuxnux.skinnedlanterns.data.SkinnedDataGen;
import at.nuxnux.skinnedlanterns.init.SkinnedLanternBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SkinnedLanterns implements ModInitializer {
	public static Logger LOGGER = LogManager.getLogger();

	public static final String MOD_ID = "skinnedlanterns";
	public static final String MOD_NAME = "Skinned Lanterns";

	public static final ItemGroup GROUP = FabricItemGroupBuilder.build(new Identifier(SkinnedLanterns.MOD_ID, "morelanternsgroup"), () -> new ItemStack(SkinnedLanternBlocks.PUFFERFISH_LANTERN_BLOCK));

	@Override
	public void onInitialize() {
		SkinnedLanternsConfig.init();
		SkinnedLanternBlocks.init();
		SkinnedDataGen.init();

		log(Level.INFO, "Skinning the Lanterns!");
	}

	public static Identifier id(String name) {
		return new Identifier(MOD_ID, name);
	}

	public static void log(Level level, String message){
		LOGGER.log(level, "["+MOD_NAME+"] " + message);
	}
}