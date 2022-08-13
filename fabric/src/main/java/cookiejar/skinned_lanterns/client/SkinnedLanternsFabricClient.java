package cookiejar.skinned_lanterns.client;

import cookiejar.skinned_lanterns.client.render.SkinnedRenderLayers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;

public class SkinnedLanternsFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        SkinnedRenderLayers.init(BlockRenderLayerMap.INSTANCE::putBlock);
    }
}