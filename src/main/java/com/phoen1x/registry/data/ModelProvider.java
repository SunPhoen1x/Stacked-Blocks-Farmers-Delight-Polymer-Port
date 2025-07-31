package com.phoen1x.registry.data;

import com.phoen1x.Stackedblocksfarmersdelightport;
import com.phoen1x.registry.BlockRegistry;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Block;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.TextureKey;
import net.minecraft.client.data.TextureMap;
import net.minecraft.util.Identifier;

public class ModelProvider extends FabricModelProvider {
    public ModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_RICH_SOIL, "stacked_rich_soil");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_STONE_BLOCKS, "stacked_stone_blocks");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_COBBLESTONE_BLOCKS, "stacked_cobblestone_blocks");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_NETHERRACK_BLOCKS, "stacked_netherrack_blocks");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_BRICKS, "stacked_bricks");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_RAW_IRON_BLOCKS, "stacked_raw_iron_blocks");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_RAW_GOLD_BLOCKS, "stacked_raw_gold_blocks");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_RAW_COPPER_BLOCKS, "stacked_raw_copper_blocks");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_LAPIS_BLOCKS, "stacked_lapis_blocks");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_REDSTONE_BLOCKS, "stacked_redstone_blocks");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_COAL_BLOCKS, "stacked_coal_blocks");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_IRON_BLOCKS, "stacked_iron_blocks");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_GOLD_BLOCKS, "stacked_gold_blocks");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_EMERALD_BLOCKS, "stacked_emerald_blocks");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_DIAMOND_BLOCKS, "stacked_diamond_blocks");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_NETHERITE_BLOCKS, "stacked_netherite_blocks");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_QUARTZ_BLOCKS, "stacked_quartz_blocks");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_MELONS, "stacked_melons");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_PUMPKINS, "stacked_pumpkins");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_OAK_LOGS, "stacked_oak_logs");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_STRIPPED_OAK_LOGS, "stacked_stripped_oak_logs");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_OAK_PLANKS, "stacked_oak_planks");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_SPRUCE_LOGS, "stacked_spruce_logs");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_STRIPPED_SPRUCE_LOGS, "stacked_stripped_spruce_logs");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_SPRUCE_PLANKS, "stacked_spruce_planks");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_BIRCH_LOGS, "stacked_birch_logs");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_STRIPPED_BIRCH_LOGS, "stacked_stripped_birch_logs");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_BIRCH_PLANKS, "stacked_birch_planks");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_JUNGLE_LOGS, "stacked_jungle_logs");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_STRIPPED_JUNGLE_LOGS, "stacked_stripped_jungle_logs");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_JUNGLE_PLANKS, "stacked_jungle_planks");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_ACACIA_LOGS, "stacked_acacia_logs");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_STRIPPED_ACACIA_LOGS, "stacked_stripped_acacia_logs");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_ACACIA_PLANKS, "stacked_acacia_planks");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_DARK_OAK_LOGS, "stacked_dark_oak_logs");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_STRIPPED_DARK_OAK_LOGS, "stacked_stripped_dark_oak_logs");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_DARK_OAK_PLANKS, "stacked_dark_oak_planks");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_MANGROVE_LOGS, "stacked_mangrove_logs");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_STRIPPED_MANGROVE_LOGS, "stacked_stripped_mangrove_logs");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_MANGROVE_PLANKS, "stacked_mangrove_planks");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_CHERRY_LOGS, "stacked_cherry_logs");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_STRIPPED_CHERRY_LOGS, "stacked_stripped_cherry_logs");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_CHERRY_PLANKS, "stacked_cherry_planks");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_PALE_OAK_LOGS, "stacked_pale_oak_logs");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_STRIPPED_PALE_OAK_LOGS, "stacked_stripped_pale_oak_logs");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_PALE_OAK_PLANKS, "stacked_pale_oak_planks");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_BAMBOO_BLOCKS, "stacked_bamboo_blocks");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_STRIPPED_BAMBOO_BLOCKS, "stacked_stripped_bamboo_blocks");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_BAMBOO_PLANKS, "stacked_bamboo_planks");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_CRIMSON_STEMS, "stacked_crimson_stems");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_STRIPPED_CRIMSON_STEMS, "stacked_stripped_crimson_stems");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_CRIMSON_PLANKS, "stacked_crimson_planks");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_WARPED_STEMS, "stacked_warped_stems");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_STRIPPED_WARPED_STEMS, "stacked_stripped_warped_stems");
        generateBlock(blockStateModelGenerator, BlockRegistry.STACKED_WARPED_PLANKS, "stacked_warped_planks");
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }

    public void generateBlock(BlockStateModelGenerator generator, Block generatedBlock, String path) {
        generator.registerCubeWithCustomTextures(
                generatedBlock,
                generatedBlock,
                (block, otherTextureSource) -> new TextureMap()
                        .put(TextureKey.UP, Identifier.of(Stackedblocksfarmersdelightport.MOD_ID, "block/" + path + "_top"))
                        .put(TextureKey.DOWN, Identifier.of(Stackedblocksfarmersdelightport.MOD_ID, "block/" + path + "_bottom"))
                        .put(TextureKey.SIDE, Identifier.of(Stackedblocksfarmersdelightport.MOD_ID, "block/" + path + "_side"))
                        .put(TextureKey.PARTICLE, Identifier.of(Stackedblocksfarmersdelightport.MOD_ID, "block/" + path + "_side"))
        );
    }
}