package com.phoen1x;

import com.phoen1x.registry.BlockRegistry;
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import eu.pb4.polymer.resourcepack.extras.api.ResourcePackExtras;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Stackedblocksfarmersdelightport implements ModInitializer {
	public static final String MOD_ID = "stackedblocksfarmersdelight-port";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		BlockRegistry.registerModBlocks();
		BlockRegistry.registerFlammableBlocks();
		if (PolymerResourcePackUtils.addModAssets(MOD_ID)) {
			ResourcePackExtras.forDefault().addBridgedModelsFolder(id("block"));
		} else {
			LOGGER.error("Failed to add mod assets for " + MOD_ID);
		}
		PolymerResourcePackUtils.markAsRequired();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}