package com.phoen1x;

import com.phoen1x.registry.data.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class StackedblocksfarmersdelightportDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModelProvider::new);
		pack.addProvider(LootTableProvider::new);
		pack.addProvider(BlockTagProvider::new);
		pack.addProvider(ItemTagProvider::new);
		pack.addProvider(RecipeProvider::new);
	}
}
