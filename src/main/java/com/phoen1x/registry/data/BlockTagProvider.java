package com.phoen1x.registry.data;

import com.phoen1x.registry.BlockRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class BlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public BlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(BlockTags.AXE_MINEABLE)
                .add(BlockRegistry.STACKED_MELONS)
                .add(BlockRegistry.STACKED_PUMPKINS)
                .add(BlockRegistry.STACKED_OAK_LOGS)
                .add(BlockRegistry.STACKED_STRIPPED_OAK_LOGS)
                .add(BlockRegistry.STACKED_SPRUCE_LOGS)
                .add(BlockRegistry.STACKED_STRIPPED_SPRUCE_LOGS)
                .add(BlockRegistry.STACKED_BIRCH_LOGS)
                .add(BlockRegistry.STACKED_STRIPPED_BIRCH_LOGS)
                .add(BlockRegistry.STACKED_JUNGLE_LOGS)
                .add(BlockRegistry.STACKED_STRIPPED_JUNGLE_LOGS)
                .add(BlockRegistry.STACKED_ACACIA_LOGS)
                .add(BlockRegistry.STACKED_STRIPPED_ACACIA_LOGS)
                .add(BlockRegistry.STACKED_DARK_OAK_LOGS)
                .add(BlockRegistry.STACKED_STRIPPED_DARK_OAK_LOGS)
                .add(BlockRegistry.STACKED_MANGROVE_LOGS)
                .add(BlockRegistry.STACKED_STRIPPED_MANGROVE_LOGS)
                .add(BlockRegistry.STACKED_CHERRY_LOGS)
                .add(BlockRegistry.STACKED_STRIPPED_CHERRY_LOGS)
                .add(BlockRegistry.STACKED_PALE_OAK_LOGS)
                .add(BlockRegistry.STACKED_STRIPPED_PALE_OAK_LOGS)
                .add(BlockRegistry.STACKED_BAMBOO_BLOCKS)
                .add(BlockRegistry.STACKED_STRIPPED_BAMBOO_BLOCKS)
                .add(BlockRegistry.STACKED_CRIMSON_STEMS)
                .add(BlockRegistry.STACKED_STRIPPED_CRIMSON_STEMS)
                .add(BlockRegistry.STACKED_WARPED_STEMS)
                .add(BlockRegistry.STACKED_STRIPPED_WARPED_STEMS)
                .add(BlockRegistry.STACKED_DARK_OAK_LOGS)
                .add(BlockRegistry.STACKED_OAK_PLANKS)
                .add(BlockRegistry.STACKED_SPRUCE_PLANKS)
                .add(BlockRegistry.STACKED_BIRCH_PLANKS)
                .add(BlockRegistry.STACKED_JUNGLE_PLANKS)
                .add(BlockRegistry.STACKED_ACACIA_PLANKS)
                .add(BlockRegistry.STACKED_DARK_OAK_PLANKS)
                .add(BlockRegistry.STACKED_MANGROVE_PLANKS)
                .add(BlockRegistry.STACKED_CHERRY_PLANKS)
                .add(BlockRegistry.STACKED_BAMBOO_PLANKS)
                .add(BlockRegistry.STACKED_CRIMSON_PLANKS)
                .add(BlockRegistry.STACKED_PALE_OAK_PLANKS)
                .add(BlockRegistry.STACKED_WARPED_PLANKS);

        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(BlockRegistry.STACKED_STONE_BLOCKS)
                .add(BlockRegistry.STACKED_COBBLESTONE_BLOCKS)
                .add(BlockRegistry.STACKED_NETHERRACK_BLOCKS)
                .add(BlockRegistry.STACKED_BRICKS)
                .add(BlockRegistry.STACKED_RAW_IRON_BLOCKS)
                .add(BlockRegistry.STACKED_RAW_GOLD_BLOCKS)
                .add(BlockRegistry.STACKED_RAW_COPPER_BLOCKS)
                .add(BlockRegistry.STACKED_LAPIS_BLOCKS)
                .add(BlockRegistry.STACKED_REDSTONE_BLOCKS)
                .add(BlockRegistry.STACKED_COAL_BLOCKS)
                .add(BlockRegistry.STACKED_IRON_BLOCKS)
                .add(BlockRegistry.STACKED_GOLD_BLOCKS)
                .add(BlockRegistry.STACKED_EMERALD_BLOCKS)
                .add(BlockRegistry.STACKED_DIAMOND_BLOCKS)
                .add(BlockRegistry.STACKED_NETHERITE_BLOCKS)
                .add(BlockRegistry.STACKED_QUARTZ_BLOCKS);

        valueLookupBuilder(BlockTags.HOE_MINEABLE)
                .add(BlockRegistry.STACKED_RICH_SOIL);
    }
}