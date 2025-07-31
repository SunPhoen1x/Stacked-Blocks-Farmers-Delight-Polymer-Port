package com.phoen1x.registry.data;

import com.phoen1x.registry.BlockRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class LootTableProvider extends FabricBlockLootTableProvider {
    public LootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(BlockRegistry.STACKED_RICH_SOIL);
        addDrop(BlockRegistry.STACKED_STONE_BLOCKS);
        addDrop(BlockRegistry.STACKED_COBBLESTONE_BLOCKS);
        addDrop(BlockRegistry.STACKED_NETHERRACK_BLOCKS);
        addDrop(BlockRegistry.STACKED_BRICKS);
        addDrop(BlockRegistry.STACKED_RAW_IRON_BLOCKS);
        addDrop(BlockRegistry.STACKED_RAW_GOLD_BLOCKS);
        addDrop(BlockRegistry.STACKED_RAW_COPPER_BLOCKS);
        addDrop(BlockRegistry.STACKED_LAPIS_BLOCKS);
        addDrop(BlockRegistry.STACKED_REDSTONE_BLOCKS);
        addDrop(BlockRegistry.STACKED_COAL_BLOCKS);
        addDrop(BlockRegistry.STACKED_IRON_BLOCKS);
        addDrop(BlockRegistry.STACKED_GOLD_BLOCKS);
        addDrop(BlockRegistry.STACKED_EMERALD_BLOCKS);
        addDrop(BlockRegistry.STACKED_DIAMOND_BLOCKS);
        addDrop(BlockRegistry.STACKED_NETHERITE_BLOCKS);
        addDrop(BlockRegistry.STACKED_QUARTZ_BLOCKS);
        addDrop(BlockRegistry.STACKED_MELONS);
        addDrop(BlockRegistry.STACKED_PUMPKINS);
        addDrop(BlockRegistry.STACKED_OAK_LOGS);
        addDrop(BlockRegistry.STACKED_STRIPPED_OAK_LOGS);
        addDrop(BlockRegistry.STACKED_OAK_PLANKS);
        addDrop(BlockRegistry.STACKED_SPRUCE_LOGS);
        addDrop(BlockRegistry.STACKED_STRIPPED_SPRUCE_LOGS);
        addDrop(BlockRegistry.STACKED_SPRUCE_PLANKS);
        addDrop(BlockRegistry.STACKED_BIRCH_LOGS);
        addDrop(BlockRegistry.STACKED_STRIPPED_BIRCH_LOGS);
        addDrop(BlockRegistry.STACKED_BIRCH_PLANKS);
        addDrop(BlockRegistry.STACKED_JUNGLE_LOGS);
        addDrop(BlockRegistry.STACKED_STRIPPED_JUNGLE_LOGS);
        addDrop(BlockRegistry.STACKED_JUNGLE_PLANKS);
        addDrop(BlockRegistry.STACKED_ACACIA_LOGS);
        addDrop(BlockRegistry.STACKED_STRIPPED_ACACIA_LOGS);
        addDrop(BlockRegistry.STACKED_ACACIA_PLANKS);
        addDrop(BlockRegistry.STACKED_DARK_OAK_LOGS);
        addDrop(BlockRegistry.STACKED_STRIPPED_DARK_OAK_LOGS);
        addDrop(BlockRegistry.STACKED_DARK_OAK_PLANKS);
        addDrop(BlockRegistry.STACKED_MANGROVE_LOGS);
        addDrop(BlockRegistry.STACKED_STRIPPED_MANGROVE_LOGS);
        addDrop(BlockRegistry.STACKED_MANGROVE_PLANKS);
        addDrop(BlockRegistry.STACKED_CHERRY_LOGS);
        addDrop(BlockRegistry.STACKED_STRIPPED_CHERRY_LOGS);
        addDrop(BlockRegistry.STACKED_CHERRY_PLANKS);
        addDrop(BlockRegistry.STACKED_PALE_OAK_LOGS);
        addDrop(BlockRegistry.STACKED_STRIPPED_PALE_OAK_LOGS);
        addDrop(BlockRegistry.STACKED_PALE_OAK_PLANKS);
        addDrop(BlockRegistry.STACKED_BAMBOO_BLOCKS);
        addDrop(BlockRegistry.STACKED_STRIPPED_BAMBOO_BLOCKS);
        addDrop(BlockRegistry.STACKED_BAMBOO_PLANKS);
        addDrop(BlockRegistry.STACKED_CRIMSON_STEMS);
        addDrop(BlockRegistry.STACKED_STRIPPED_CRIMSON_STEMS);
        addDrop(BlockRegistry.STACKED_CRIMSON_PLANKS);
        addDrop(BlockRegistry.STACKED_WARPED_STEMS);
        addDrop(BlockRegistry.STACKED_STRIPPED_WARPED_STEMS);
        addDrop(BlockRegistry.STACKED_WARPED_PLANKS);
    }
}