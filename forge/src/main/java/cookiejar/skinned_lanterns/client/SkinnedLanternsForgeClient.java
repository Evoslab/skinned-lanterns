package cookiejar.skinned_lanterns.client;

import cookiejar.skinned_lanterns.client.render.SkinnedRenderLayers;
import cookiejar.skinned_lanterns.common.lib.MiscLibrary;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = MiscLibrary.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SkinnedLanternsForgeClient {
    @SubscribeEvent
    public static void clientInit(FMLClientSetupEvent event) {
        SkinnedRenderLayers.init(ItemBlockRenderTypes::setRenderLayer);
    }
}