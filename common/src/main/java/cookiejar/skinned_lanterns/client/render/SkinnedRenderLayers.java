package cookiejar.skinned_lanterns.client.render;

import cookiejar.skinned_lanterns.common.block.FaceableSkinnedLanternBlock;
import cookiejar.skinned_lanterns.common.block.SkinnedLanternBlock;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.Block;

import java.util.function.BiConsumer;

/**
 * @author StevenPlayzz
 */
public class SkinnedRenderLayers {
    public static void init(BiConsumer<Block, RenderType> consumer) {
        Registry.BLOCK.stream().forEach(block -> {
                    if (block instanceof SkinnedLanternBlock || block instanceof FaceableSkinnedLanternBlock) {
                        consumer.accept(block, RenderType.cutout());
                    }
                });
    }
}