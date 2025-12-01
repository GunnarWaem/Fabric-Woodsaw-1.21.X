package net.gsaurus.woodsawmod;

import net.fabricmc.api.ModInitializer;

import net.gsaurus.woodsawmod.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WoodsawMod implements ModInitializer {
	public static final String MOD_ID = "woodsawmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
	}
}