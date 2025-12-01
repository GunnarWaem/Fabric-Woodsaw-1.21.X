package net.gsaurus.woodsawmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.gsaurus.woodsawmod.block.ModBlocks;
import net.minecraft.client.render.BlockRenderLayer;

public class WoodsawModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.putBlock(ModBlocks.WOODSAW, BlockRenderLayer.CUTOUT);
    }
}
