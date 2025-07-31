package com.phoen1x.registry.data;

import com.phoen1x.registry.BlockRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(ItemTags.LOGS)
                .add(BlockRegistry.STACKED_OAK_LOGS_ITEM)
                .add(BlockRegistry.STACKED_STRIPPED_OAK_LOGS_ITEM)
                .add(BlockRegistry.STACKED_SPRUCE_LOGS_ITEM)
                .add(BlockRegistry.STACKED_STRIPPED_SPRUCE_LOGS_ITEM)
                .add(BlockRegistry.STACKED_BIRCH_LOGS_ITEM)
                .add(BlockRegistry.STACKED_STRIPPED_BIRCH_LOGS_ITEM)
                .add(BlockRegistry.STACKED_JUNGLE_LOGS_ITEM)
                .add(BlockRegistry.STACKED_STRIPPED_JUNGLE_LOGS_ITEM)
                .add(BlockRegistry.STACKED_ACACIA_LOGS_ITEM)
                .add(BlockRegistry.STACKED_STRIPPED_ACACIA_LOGS_ITEM)
                .add(BlockRegistry.STACKED_DARK_OAK_LOGS_ITEM)
                .add(BlockRegistry.STACKED_STRIPPED_DARK_OAK_LOGS_ITEM)
                .add(BlockRegistry.STACKED_MANGROVE_LOGS_ITEM)
                .add(BlockRegistry.STACKED_STRIPPED_MANGROVE_LOGS_ITEM)
                .add(BlockRegistry.STACKED_CHERRY_LOGS_ITEM)
                .add(BlockRegistry.STACKED_STRIPPED_CHERRY_LOGS_ITEM)
                .add(BlockRegistry.STACKED_PALE_OAK_LOGS_ITEM)
                .add(BlockRegistry.STACKED_STRIPPED_PALE_OAK_LOGS_ITEM)
                .add(BlockRegistry.STACKED_BAMBOO_BLOCKS_ITEM)
                .add(BlockRegistry.STACKED_STRIPPED_BAMBOO_BLOCKS_ITEM);

        valueLookupBuilder(ItemTags.PLANKS)
                .add(BlockRegistry.STACKED_OAK_PLANKS_ITEM)
                .add(BlockRegistry.STACKED_SPRUCE_PLANKS_ITEM)
                .add(BlockRegistry.STACKED_BIRCH_PLANKS_ITEM)
                .add(BlockRegistry.STACKED_JUNGLE_PLANKS_ITEM)
                .add(BlockRegistry.STACKED_ACACIA_PLANKS_ITEM)
                .add(BlockRegistry.STACKED_DARK_OAK_PLANKS_ITEM)
                .add(BlockRegistry.STACKED_MANGROVE_PLANKS_ITEM)
                .add(BlockRegistry.STACKED_CHERRY_PLANKS_ITEM)
                .add(BlockRegistry.STACKED_PALE_OAK_PLANKS_ITEM)
                .add(BlockRegistry.STACKED_BAMBOO_PLANKS_ITEM);
    }
}