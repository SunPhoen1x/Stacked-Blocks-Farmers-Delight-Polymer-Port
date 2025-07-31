package com.phoen1x.registry.data;

import com.phoen1x.Stackedblocksfarmersdelightport;
import com.phoen1x.registry.BlockRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import vectorwing.farmersdelight.common.registry.ModItems;

public class RecipeGenerator extends net.minecraft.data.recipe.RecipeGenerator {
    private final RegistryEntryLookup<Item> itemLookup;

    protected RecipeGenerator(RegistryWrapper.WrapperLookup registries, RecipeExporter exporter) {
        super(registries, exporter);
        itemLookup = registries.getOrThrow(RegistryKeys.ITEM);
    }

    @Override
    public void generate() {
        compressBlockRecipe(BlockRegistry.STACKED_RICH_SOIL_ITEM, ModItems.RICH_SOIL.get(), ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_STONE_BLOCKS_ITEM, Items.STONE, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_COBBLESTONE_BLOCKS_ITEM, Items.COBBLESTONE, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_NETHERRACK_BLOCKS_ITEM, Items.NETHERRACK, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_BRICKS_ITEM, Items.BRICKS, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_RAW_IRON_BLOCKS_ITEM, Items.RAW_IRON_BLOCK, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_RAW_GOLD_BLOCKS_ITEM, Items.RAW_GOLD_BLOCK, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_RAW_COPPER_BLOCKS_ITEM, Items.RAW_COPPER_BLOCK, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_LAPIS_BLOCKS_ITEM, Blocks.LAPIS_BLOCK.asItem(), ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_REDSTONE_BLOCKS_ITEM, Items.REDSTONE_BLOCK, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_COAL_BLOCKS_ITEM, Items.COAL_BLOCK, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_IRON_BLOCKS_ITEM, Items.IRON_BLOCK, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_GOLD_BLOCKS_ITEM, Items.GOLD_BLOCK, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_EMERALD_BLOCKS_ITEM, Items.EMERALD_BLOCK, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_DIAMOND_BLOCKS_ITEM, Items.DIAMOND_BLOCK, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_NETHERITE_BLOCKS_ITEM, Items.NETHERITE_BLOCK, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_QUARTZ_BLOCKS_ITEM, Items.QUARTZ_BLOCK, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_MELONS_ITEM, Items.MELON, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_PUMPKINS_ITEM, Items.PUMPKIN, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_OAK_LOGS_ITEM, Items.OAK_LOG, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_STRIPPED_OAK_LOGS_ITEM, Items.STRIPPED_OAK_LOG, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_OAK_PLANKS_ITEM, Items.OAK_PLANKS, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_SPRUCE_LOGS_ITEM, Items.SPRUCE_LOG, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_STRIPPED_SPRUCE_LOGS_ITEM, Items.STRIPPED_SPRUCE_LOG, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_SPRUCE_PLANKS_ITEM, Items.SPRUCE_PLANKS, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_BIRCH_LOGS_ITEM, Items.BIRCH_LOG, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_STRIPPED_BIRCH_LOGS_ITEM, Items.STRIPPED_BIRCH_LOG, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_BIRCH_PLANKS_ITEM, Items.BIRCH_PLANKS, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_JUNGLE_LOGS_ITEM, Items.JUNGLE_LOG, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_STRIPPED_JUNGLE_LOGS_ITEM, Items.STRIPPED_JUNGLE_LOG, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_JUNGLE_PLANKS_ITEM, Items.JUNGLE_PLANKS, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_ACACIA_LOGS_ITEM, Items.ACACIA_LOG, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_STRIPPED_ACACIA_LOGS_ITEM, Items.STRIPPED_ACACIA_LOG, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_ACACIA_PLANKS_ITEM, Items.ACACIA_PLANKS, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_DARK_OAK_LOGS_ITEM, Items.DARK_OAK_LOG, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_STRIPPED_DARK_OAK_LOGS_ITEM, Items.STRIPPED_DARK_OAK_LOG, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_DARK_OAK_PLANKS_ITEM, Items.DARK_OAK_PLANKS, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_MANGROVE_LOGS_ITEM, Items.MANGROVE_LOG, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_STRIPPED_MANGROVE_LOGS_ITEM, Items.STRIPPED_MANGROVE_LOG, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_MANGROVE_PLANKS_ITEM, Items.MANGROVE_PLANKS, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_CHERRY_LOGS_ITEM, Items.CHERRY_LOG, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_STRIPPED_CHERRY_LOGS_ITEM, Items.STRIPPED_CHERRY_LOG, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_CHERRY_PLANKS_ITEM, Items.CHERRY_PLANKS, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_PALE_OAK_LOGS_ITEM, Items.PALE_OAK_LOG, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_STRIPPED_PALE_OAK_LOGS_ITEM, Items.STRIPPED_PALE_OAK_LOG, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_PALE_OAK_PLANKS_ITEM, Items.PALE_OAK_PLANKS, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_BAMBOO_BLOCKS_ITEM, Items.BAMBOO_BLOCK, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_STRIPPED_BAMBOO_BLOCKS_ITEM, Items.STRIPPED_BAMBOO_BLOCK, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_BAMBOO_PLANKS_ITEM, Items.BAMBOO_PLANKS, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_CRIMSON_STEMS_ITEM, Items.CRIMSON_STEM, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_STRIPPED_CRIMSON_STEMS_ITEM, Items.STRIPPED_CRIMSON_STEM, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_CRIMSON_PLANKS_ITEM, Items.CRIMSON_PLANKS, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_WARPED_STEMS_ITEM, Items.WARPED_STEM, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_STRIPPED_WARPED_STEMS_ITEM, Items.STRIPPED_WARPED_STEM, ModItems.ROPE.get(), exporter);
        compressBlockRecipe(BlockRegistry.STACKED_WARPED_PLANKS_ITEM, Items.WARPED_PLANKS, ModItems.ROPE.get(), exporter);
    }

    private void compressBlockRecipe(Item blockItem, Item item, Item ropeItem, RecipeExporter exporter) {
        createShaped(RecipeCategory.MISC, blockItem, 1)
                .group(getRecipeName(blockItem))
                .pattern("###")
                .pattern("#R#")
                .pattern("###")
                .input('#', item)
                .input('R', ropeItem)
                .criterion(hasItem(item), conditionsFromItem(item))
                .offerTo(exporter);
        createShapeless(RecipeCategory.MISC, item, 8)
                .input(blockItem, 1)
                .criterion(hasItem(blockItem), conditionsFromItem(blockItem))
                .offerTo(exporter, Identifier.of(Stackedblocksfarmersdelightport.MOD_ID, getRecipeName(blockItem) + "_to_" + getRecipeName(item)).toString());
    }
}