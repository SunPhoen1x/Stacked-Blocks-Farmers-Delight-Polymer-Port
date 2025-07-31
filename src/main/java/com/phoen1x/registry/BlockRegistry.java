package com.phoen1x.registry;

import com.phoen1x.Stackedblocksfarmersdelightport;
import com.phoen1x.registry.block.SimplePolyBlock;
import com.phoen1x.registry.block.TexturedPolyBlockItem;
import eu.pb4.polymer.core.api.item.PolymerItemGroupUtils;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import java.util.function.Function;

public class BlockRegistry {
    public static final Block STACKED_RICH_SOIL = registerBlock("stacked_rich_soil",
            settings -> new SimplePolyBlock(settings, "stacked_rich_soil"),
            Block.Settings.copy(Blocks.DIRT));
    public static final BlockItem STACKED_RICH_SOIL_ITEM = registerBlockItem("stacked_rich_soil",
            settings -> new TexturedPolyBlockItem(STACKED_RICH_SOIL, settings),
            new Item.Settings());

    public static final Block STACKED_STONE_BLOCKS = registerBlock("stacked_stone_blocks",
            settings -> new SimplePolyBlock(settings, "stacked_stone_blocks"),
            Block.Settings.copy(Blocks.STONE));
    public static final BlockItem STACKED_STONE_BLOCKS_ITEM = registerBlockItem("stacked_stone_blocks",
            settings -> new TexturedPolyBlockItem(STACKED_STONE_BLOCKS, settings),
            new Item.Settings());

    public static final Block STACKED_COBBLESTONE_BLOCKS = registerBlock("stacked_cobblestone_blocks",
            settings -> new SimplePolyBlock(settings, "stacked_cobblestone_blocks"),
            Block.Settings.copy(Blocks.COBBLESTONE));
    public static final BlockItem STACKED_COBBLESTONE_BLOCKS_ITEM = registerBlockItem("stacked_cobblestone_blocks",
            settings -> new TexturedPolyBlockItem(STACKED_COBBLESTONE_BLOCKS, settings),
            new Item.Settings());

    public static final Block STACKED_NETHERRACK_BLOCKS = registerBlock("stacked_netherrack_blocks",
            settings -> new SimplePolyBlock(settings, "stacked_netherrack_blocks"),
            Block.Settings.copy(Blocks.NETHERRACK));
    public static final BlockItem STACKED_NETHERRACK_BLOCKS_ITEM = registerBlockItem("stacked_netherrack_blocks",
            settings -> new TexturedPolyBlockItem(STACKED_NETHERRACK_BLOCKS, settings),
            new Item.Settings());

    public static final Block STACKED_BRICKS = registerBlock("stacked_bricks",
            settings -> new SimplePolyBlock(settings, "stacked_bricks"),
            Block.Settings.copy(Blocks.BRICKS));
    public static final BlockItem STACKED_BRICKS_ITEM = registerBlockItem("stacked_bricks",
            settings -> new TexturedPolyBlockItem(STACKED_BRICKS, settings),
            new Item.Settings());

    public static final Block STACKED_RAW_IRON_BLOCKS = registerBlock("stacked_raw_iron_blocks",
            settings -> new SimplePolyBlock(settings, "stacked_raw_iron_blocks"),
            Block.Settings.copy(Blocks.RAW_IRON_BLOCK));
    public static final BlockItem STACKED_RAW_IRON_BLOCKS_ITEM = registerBlockItem("stacked_raw_iron_blocks",
            settings -> new TexturedPolyBlockItem(STACKED_RAW_IRON_BLOCKS, settings),
            new Item.Settings());

    public static final Block STACKED_RAW_GOLD_BLOCKS = registerBlock("stacked_raw_gold_blocks",
            settings -> new SimplePolyBlock(settings, "stacked_raw_gold_blocks"),
            Block.Settings.copy(Blocks.RAW_GOLD_BLOCK));
    public static final BlockItem STACKED_RAW_GOLD_BLOCKS_ITEM = registerBlockItem("stacked_raw_gold_blocks",
            settings -> new TexturedPolyBlockItem(STACKED_RAW_GOLD_BLOCKS, settings),
            new Item.Settings());

    public static final Block STACKED_RAW_COPPER_BLOCKS = registerBlock("stacked_raw_copper_blocks",
            settings -> new SimplePolyBlock(settings, "stacked_raw_copper_blocks"),
            Block.Settings.copy(Blocks.RAW_COPPER_BLOCK));
    public static final BlockItem STACKED_RAW_COPPER_BLOCKS_ITEM = registerBlockItem("stacked_raw_copper_blocks",
            settings -> new TexturedPolyBlockItem(STACKED_RAW_COPPER_BLOCKS, settings),
            new Item.Settings());

    public static final Block STACKED_LAPIS_BLOCKS = registerBlock("stacked_lapis_blocks",
            settings -> new SimplePolyBlock(settings, "stacked_lapis_blocks"),
            Block.Settings.copy(Blocks.LAPIS_BLOCK));
    public static final BlockItem STACKED_LAPIS_BLOCKS_ITEM = registerBlockItem("stacked_lapis_blocks",
            settings -> new TexturedPolyBlockItem(STACKED_LAPIS_BLOCKS, settings),
            new Item.Settings());

    public static final Block STACKED_REDSTONE_BLOCKS = registerBlock("stacked_redstone_blocks",
            settings -> new SimplePolyBlock(settings, "stacked_redstone_blocks"),
            Block.Settings.copy(Blocks.REDSTONE_BLOCK));
    public static final BlockItem STACKED_REDSTONE_BLOCKS_ITEM = registerBlockItem("stacked_redstone_blocks",
            settings -> new TexturedPolyBlockItem(STACKED_REDSTONE_BLOCKS, settings),
            new Item.Settings());

    public static final Block STACKED_COAL_BLOCKS = registerBlock("stacked_coal_blocks",
            settings -> new SimplePolyBlock(settings, "stacked_coal_blocks"),
            Block.Settings.copy(Blocks.COAL_BLOCK));
    public static final BlockItem STACKED_COAL_BLOCKS_ITEM = registerBlockItem("stacked_coal_blocks",
            settings -> new TexturedPolyBlockItem(STACKED_COAL_BLOCKS, settings),
            new Item.Settings());

    public static final Block STACKED_IRON_BLOCKS = registerBlock("stacked_iron_blocks",
            settings -> new SimplePolyBlock(settings, "stacked_iron_blocks"),
            Block.Settings.copy(Blocks.IRON_BLOCK));
    public static final BlockItem STACKED_IRON_BLOCKS_ITEM = registerBlockItem("stacked_iron_blocks",
            settings -> new TexturedPolyBlockItem(STACKED_IRON_BLOCKS, settings),
            new Item.Settings());

    public static final Block STACKED_GOLD_BLOCKS = registerBlock("stacked_gold_blocks",
            settings -> new SimplePolyBlock(settings, "stacked_gold_blocks"),
            Block.Settings.copy(Blocks.GOLD_BLOCK));
    public static final BlockItem STACKED_GOLD_BLOCKS_ITEM = registerBlockItem("stacked_gold_blocks",
            settings -> new TexturedPolyBlockItem(STACKED_GOLD_BLOCKS, settings),
            new Item.Settings());

    public static final Block STACKED_EMERALD_BLOCKS = registerBlock("stacked_emerald_blocks",
            settings -> new SimplePolyBlock(settings, "stacked_emerald_blocks"),
            Block.Settings.copy(Blocks.EMERALD_BLOCK));
    public static final BlockItem STACKED_EMERALD_BLOCKS_ITEM = registerBlockItem("stacked_emerald_blocks",
            settings -> new TexturedPolyBlockItem(STACKED_EMERALD_BLOCKS, settings),
            new Item.Settings());

    public static final Block STACKED_DIAMOND_BLOCKS = registerBlock("stacked_diamond_blocks",
            settings -> new SimplePolyBlock(settings, "stacked_diamond_blocks"),
            Block.Settings.copy(Blocks.DIAMOND_BLOCK));
    public static final BlockItem STACKED_DIAMOND_BLOCKS_ITEM = registerBlockItem("stacked_diamond_blocks",
            settings -> new TexturedPolyBlockItem(STACKED_DIAMOND_BLOCKS, settings),
            new Item.Settings());

    public static final Block STACKED_NETHERITE_BLOCKS = registerBlock("stacked_netherite_blocks",
            settings -> new SimplePolyBlock(settings, "stacked_netherite_blocks"),
            Block.Settings.copy(Blocks.NETHERITE_BLOCK));
    public static final BlockItem STACKED_NETHERITE_BLOCKS_ITEM = registerBlockItem("stacked_netherite_blocks",
            settings -> new TexturedPolyBlockItem(STACKED_NETHERITE_BLOCKS, settings),
            new Item.Settings());

    public static final Block STACKED_QUARTZ_BLOCKS = registerBlock("stacked_quartz_blocks",
            settings -> new SimplePolyBlock(settings, "stacked_quartz_blocks"),
            Block.Settings.copy(Blocks.QUARTZ_BLOCK));
    public static final BlockItem STACKED_QUARTZ_BLOCKS_ITEM = registerBlockItem("stacked_quartz_blocks",
            settings -> new TexturedPolyBlockItem(STACKED_QUARTZ_BLOCKS, settings),
            new Item.Settings());

    public static final Block STACKED_MELONS = registerBlock("stacked_melons",
            settings -> new SimplePolyBlock(settings, "stacked_melons"),
            Block.Settings.copy(Blocks.MELON));
    public static final BlockItem STACKED_MELONS_ITEM = registerBlockItem("stacked_melons",
            settings -> new TexturedPolyBlockItem(STACKED_MELONS, settings),
            new Item.Settings());

    public static final Block STACKED_PUMPKINS = registerBlock("stacked_pumpkins",
            settings -> new SimplePolyBlock(settings, "stacked_pumpkins"),
            Block.Settings.copy(Blocks.PUMPKIN));
    public static final BlockItem STACKED_PUMPKINS_ITEM = registerBlockItem("stacked_pumpkins",
            settings -> new TexturedPolyBlockItem(STACKED_PUMPKINS, settings),
            new Item.Settings());

    public static final Block STACKED_OAK_LOGS = registerBlock("stacked_oak_logs",
            settings -> new SimplePolyBlock(settings, "stacked_oak_logs"),
            Block.Settings.copy(Blocks.OAK_PLANKS));
    public static final BlockItem STACKED_OAK_LOGS_ITEM = registerBlockItem("stacked_oak_logs",
            settings -> new TexturedPolyBlockItem(STACKED_OAK_LOGS, settings),
            new Item.Settings());

    public static final Block STACKED_STRIPPED_OAK_LOGS = registerBlock("stacked_stripped_oak_logs",
            settings -> new SimplePolyBlock(settings, "stacked_stripped_oak_logs"),
            Block.Settings.copy(Blocks.OAK_PLANKS));
    public static final BlockItem STACKED_STRIPPED_OAK_LOGS_ITEM = registerBlockItem("stacked_stripped_oak_logs",
            settings -> new TexturedPolyBlockItem(STACKED_STRIPPED_OAK_LOGS, settings),
            new Item.Settings());

    public static final Block STACKED_OAK_PLANKS = registerBlock("stacked_oak_planks",
            settings -> new SimplePolyBlock(settings, "stacked_oak_planks"),
            Block.Settings.copy(Blocks.OAK_PLANKS));
    public static final BlockItem STACKED_OAK_PLANKS_ITEM = registerBlockItem("stacked_oak_planks",
            settings -> new TexturedPolyBlockItem(STACKED_OAK_PLANKS, settings),
            new Item.Settings());

    public static final Block STACKED_SPRUCE_LOGS = registerBlock("stacked_spruce_logs",
            settings -> new SimplePolyBlock(settings, "stacked_spruce_logs"),
            Block.Settings.copy(Blocks.SPRUCE_PLANKS));
    public static final BlockItem STACKED_SPRUCE_LOGS_ITEM = registerBlockItem("stacked_spruce_logs",
            settings -> new TexturedPolyBlockItem(STACKED_SPRUCE_LOGS, settings),
            new Item.Settings());

    public static final Block STACKED_STRIPPED_SPRUCE_LOGS = registerBlock("stacked_stripped_spruce_logs",
            settings -> new SimplePolyBlock(settings, "stacked_stripped_spruce_logs"),
            Block.Settings.copy(Blocks.SPRUCE_PLANKS));
    public static final BlockItem STACKED_STRIPPED_SPRUCE_LOGS_ITEM = registerBlockItem("stacked_stripped_spruce_logs",
            settings -> new TexturedPolyBlockItem(STACKED_STRIPPED_SPRUCE_LOGS, settings),
            new Item.Settings());

    public static final Block STACKED_SPRUCE_PLANKS = registerBlock("stacked_spruce_planks",
            settings -> new SimplePolyBlock(settings, "stacked_spruce_planks"),
            Block.Settings.copy(Blocks.SPRUCE_PLANKS));
    public static final BlockItem STACKED_SPRUCE_PLANKS_ITEM = registerBlockItem("stacked_spruce_planks",
            settings -> new TexturedPolyBlockItem(STACKED_SPRUCE_PLANKS, settings),
            new Item.Settings());

    public static final Block STACKED_BIRCH_LOGS = registerBlock("stacked_birch_logs",
            settings -> new SimplePolyBlock(settings, "stacked_birch_logs"),
            Block.Settings.copy(Blocks.BIRCH_PLANKS));
    public static final BlockItem STACKED_BIRCH_LOGS_ITEM = registerBlockItem("stacked_birch_logs",
            settings -> new TexturedPolyBlockItem(STACKED_BIRCH_LOGS, settings),
            new Item.Settings());

    public static final Block STACKED_STRIPPED_BIRCH_LOGS = registerBlock("stacked_stripped_birch_logs",
            settings -> new SimplePolyBlock(settings, "stacked_stripped_birch_logs"),
            Block.Settings.copy(Blocks.BIRCH_PLANKS));
    public static final BlockItem STACKED_STRIPPED_BIRCH_LOGS_ITEM = registerBlockItem("stacked_stripped_birch_logs",
            settings -> new TexturedPolyBlockItem(STACKED_STRIPPED_BIRCH_LOGS, settings),
            new Item.Settings());

    public static final Block STACKED_BIRCH_PLANKS = registerBlock("stacked_birch_planks",
            settings -> new SimplePolyBlock(settings, "stacked_birch_planks"),
            Block.Settings.copy(Blocks.BIRCH_PLANKS));
    public static final BlockItem STACKED_BIRCH_PLANKS_ITEM = registerBlockItem("stacked_birch_planks",
            settings -> new TexturedPolyBlockItem(STACKED_BIRCH_PLANKS, settings),
            new Item.Settings());

    public static final Block STACKED_JUNGLE_LOGS = registerBlock("stacked_jungle_logs",
            settings -> new SimplePolyBlock(settings, "stacked_jungle_logs"),
            Block.Settings.copy(Blocks.JUNGLE_PLANKS));
    public static final BlockItem STACKED_JUNGLE_LOGS_ITEM = registerBlockItem("stacked_jungle_logs",
            settings -> new TexturedPolyBlockItem(STACKED_JUNGLE_LOGS, settings),
            new Item.Settings());

    public static final Block STACKED_STRIPPED_JUNGLE_LOGS = registerBlock("stacked_stripped_jungle_logs",
            settings -> new SimplePolyBlock(settings, "stacked_stripped_jungle_logs"),
            Block.Settings.copy(Blocks.JUNGLE_PLANKS));
    public static final BlockItem STACKED_STRIPPED_JUNGLE_LOGS_ITEM = registerBlockItem("stacked_stripped_jungle_logs",
            settings -> new TexturedPolyBlockItem(STACKED_STRIPPED_JUNGLE_LOGS, settings),
            new Item.Settings());

    public static final Block STACKED_JUNGLE_PLANKS = registerBlock("stacked_jungle_planks",
            settings -> new SimplePolyBlock(settings, "stacked_jungle_planks"),
            Block.Settings.copy(Blocks.JUNGLE_PLANKS));
    public static final BlockItem STACKED_JUNGLE_PLANKS_ITEM = registerBlockItem("stacked_jungle_planks",
            settings -> new TexturedPolyBlockItem(STACKED_JUNGLE_PLANKS, settings),
            new Item.Settings());

    public static final Block STACKED_ACACIA_LOGS = registerBlock("stacked_acacia_logs",
            settings -> new SimplePolyBlock(settings, "stacked_acacia_logs"),
            Block.Settings.copy(Blocks.ACACIA_PLANKS));
    public static final BlockItem STACKED_ACACIA_LOGS_ITEM = registerBlockItem("stacked_acacia_logs",
            settings -> new TexturedPolyBlockItem(STACKED_ACACIA_LOGS, settings),
            new Item.Settings());

    public static final Block STACKED_STRIPPED_ACACIA_LOGS = registerBlock("stacked_stripped_acacia_logs",
            settings -> new SimplePolyBlock(settings, "stacked_stripped_acacia_logs"),
            Block.Settings.copy(Blocks.ACACIA_PLANKS));
    public static final BlockItem STACKED_STRIPPED_ACACIA_LOGS_ITEM = registerBlockItem("stacked_stripped_acacia_logs",
            settings -> new TexturedPolyBlockItem(STACKED_STRIPPED_ACACIA_LOGS, settings),
            new Item.Settings());

    public static final Block STACKED_ACACIA_PLANKS = registerBlock("stacked_acacia_planks",
            settings -> new SimplePolyBlock(settings, "stacked_acacia_planks"),
            Block.Settings.copy(Blocks.ACACIA_PLANKS));
    public static final BlockItem STACKED_ACACIA_PLANKS_ITEM = registerBlockItem("stacked_acacia_planks",
            settings -> new TexturedPolyBlockItem(STACKED_ACACIA_PLANKS, settings),
            new Item.Settings());

    public static final Block STACKED_DARK_OAK_LOGS = registerBlock("stacked_dark_oak_logs",
            settings -> new SimplePolyBlock(settings, "stacked_dark_oak_logs"),
            Block.Settings.copy(Blocks.DARK_OAK_PLANKS));
    public static final BlockItem STACKED_DARK_OAK_LOGS_ITEM = registerBlockItem("stacked_dark_oak_logs",
            settings -> new TexturedPolyBlockItem(STACKED_DARK_OAK_LOGS, settings),
            new Item.Settings());

    public static final Block STACKED_STRIPPED_DARK_OAK_LOGS = registerBlock("stacked_stripped_dark_oak_logs",
            settings -> new SimplePolyBlock(settings, "stacked_stripped_dark_oak_logs"),
            Block.Settings.copy(Blocks.DARK_OAK_PLANKS));
    public static final BlockItem STACKED_STRIPPED_DARK_OAK_LOGS_ITEM = registerBlockItem("stacked_stripped_dark_oak_logs",
            settings -> new TexturedPolyBlockItem(STACKED_STRIPPED_DARK_OAK_LOGS, settings),
            new Item.Settings());

    public static final Block STACKED_DARK_OAK_PLANKS = registerBlock("stacked_dark_oak_planks",
            settings -> new SimplePolyBlock(settings, "stacked_dark_oak_planks"),
            Block.Settings.copy(Blocks.DARK_OAK_PLANKS));
    public static final BlockItem STACKED_DARK_OAK_PLANKS_ITEM = registerBlockItem("stacked_dark_oak_planks",
            settings -> new TexturedPolyBlockItem(STACKED_DARK_OAK_PLANKS, settings),
            new Item.Settings());

    public static final Block STACKED_MANGROVE_LOGS = registerBlock("stacked_mangrove_logs",
            settings -> new SimplePolyBlock(settings, "stacked_mangrove_logs"),
            Block.Settings.copy(Blocks.MANGROVE_PLANKS));
    public static final BlockItem STACKED_MANGROVE_LOGS_ITEM = registerBlockItem("stacked_mangrove_logs",
            settings -> new TexturedPolyBlockItem(STACKED_MANGROVE_LOGS, settings),
            new Item.Settings());

    public static final Block STACKED_STRIPPED_MANGROVE_LOGS = registerBlock("stacked_stripped_mangrove_logs",
            settings -> new SimplePolyBlock(settings, "stacked_stripped_mangrove_logs"),
            Block.Settings.copy(Blocks.MANGROVE_PLANKS));
    public static final BlockItem STACKED_STRIPPED_MANGROVE_LOGS_ITEM = registerBlockItem("stacked_stripped_mangrove_logs",
            settings -> new TexturedPolyBlockItem(STACKED_STRIPPED_MANGROVE_LOGS, settings),
            new Item.Settings());

    public static final Block STACKED_MANGROVE_PLANKS = registerBlock("stacked_mangrove_planks",
            settings -> new SimplePolyBlock(settings, "stacked_mangrove_planks"),
            Block.Settings.copy(Blocks.MANGROVE_PLANKS));
    public static final BlockItem STACKED_MANGROVE_PLANKS_ITEM = registerBlockItem("stacked_mangrove_planks",
            settings -> new TexturedPolyBlockItem(STACKED_MANGROVE_PLANKS, settings),
            new Item.Settings());

    public static final Block STACKED_CHERRY_LOGS = registerBlock("stacked_cherry_logs",
            settings -> new SimplePolyBlock(settings, "stacked_cherry_logs"),
            Block.Settings.copy(Blocks.CHERRY_PLANKS));
    public static final BlockItem STACKED_CHERRY_LOGS_ITEM = registerBlockItem("stacked_cherry_logs",
            settings -> new TexturedPolyBlockItem(STACKED_CHERRY_LOGS, settings),
            new Item.Settings());

    public static final Block STACKED_STRIPPED_CHERRY_LOGS = registerBlock("stacked_stripped_cherry_logs",
            settings -> new SimplePolyBlock(settings, "stacked_stripped_cherry_logs"),
            Block.Settings.copy(Blocks.CHERRY_PLANKS));
    public static final BlockItem STACKED_STRIPPED_CHERRY_LOGS_ITEM = registerBlockItem("stacked_stripped_cherry_logs",
            settings -> new TexturedPolyBlockItem(STACKED_STRIPPED_CHERRY_LOGS, settings),
            new Item.Settings());

    public static final Block STACKED_CHERRY_PLANKS = registerBlock("stacked_cherry_planks",
            settings -> new SimplePolyBlock(settings, "stacked_cherry_planks"),
            Block.Settings.copy(Blocks.CHERRY_PLANKS));
    public static final BlockItem STACKED_CHERRY_PLANKS_ITEM = registerBlockItem("stacked_cherry_planks",
            settings -> new TexturedPolyBlockItem(STACKED_CHERRY_PLANKS, settings),
            new Item.Settings());

    public static final Block STACKED_PALE_OAK_LOGS = registerBlock("stacked_pale_oak_logs",
            settings -> new SimplePolyBlock(settings, "stacked_pale_oak_logs"),
            Block.Settings.copy(Blocks.PALE_OAK_PLANKS));
    public static final BlockItem STACKED_PALE_OAK_LOGS_ITEM = registerBlockItem("stacked_pale_oak_logs",
            settings -> new TexturedPolyBlockItem(STACKED_PALE_OAK_LOGS, settings),
            new Item.Settings());

    public static final Block STACKED_STRIPPED_PALE_OAK_LOGS = registerBlock("stacked_stripped_pale_oak_logs",
            settings -> new SimplePolyBlock(settings, "stacked_stripped_pale_oak_logs"),
            Block.Settings.copy(Blocks.PALE_OAK_PLANKS));
    public static final BlockItem STACKED_STRIPPED_PALE_OAK_LOGS_ITEM = registerBlockItem("stacked_stripped_pale_oak_logs",
            settings -> new TexturedPolyBlockItem(STACKED_STRIPPED_PALE_OAK_LOGS, settings),
            new Item.Settings());

    public static final Block STACKED_PALE_OAK_PLANKS = registerBlock("stacked_pale_oak_planks",
            settings -> new SimplePolyBlock(settings, "stacked_pale_oak_planks"),
            Block.Settings.copy(Blocks.PALE_OAK_PLANKS));
    public static final BlockItem STACKED_PALE_OAK_PLANKS_ITEM = registerBlockItem("stacked_pale_oak_planks",
            settings -> new TexturedPolyBlockItem(STACKED_PALE_OAK_PLANKS, settings),
            new Item.Settings());

    public static final Block STACKED_BAMBOO_BLOCKS = registerBlock("stacked_bamboo_blocks",
            settings -> new SimplePolyBlock(settings, "stacked_bamboo_blocks"),
            Block.Settings.copy(Blocks.BAMBOO_PLANKS));
    public static final BlockItem STACKED_BAMBOO_BLOCKS_ITEM = registerBlockItem("stacked_bamboo_blocks",
            settings -> new TexturedPolyBlockItem(STACKED_BAMBOO_BLOCKS, settings),
            new Item.Settings());

    public static final Block STACKED_STRIPPED_BAMBOO_BLOCKS = registerBlock("stacked_stripped_bamboo_blocks",
            settings -> new SimplePolyBlock(settings, "stacked_stripped_bamboo_blocks"),
            Block.Settings.copy(Blocks.BAMBOO_PLANKS));
    public static final BlockItem STACKED_STRIPPED_BAMBOO_BLOCKS_ITEM = registerBlockItem("stacked_stripped_bamboo_blocks",
            settings -> new TexturedPolyBlockItem(STACKED_STRIPPED_BAMBOO_BLOCKS, settings),
            new Item.Settings());

    public static final Block STACKED_BAMBOO_PLANKS = registerBlock("stacked_bamboo_planks",
            settings -> new SimplePolyBlock(settings, "stacked_bamboo_planks"),
            Block.Settings.copy(Blocks.BAMBOO_PLANKS));
    public static final BlockItem STACKED_BAMBOO_PLANKS_ITEM = registerBlockItem("stacked_bamboo_planks",
            settings -> new TexturedPolyBlockItem(STACKED_BAMBOO_PLANKS, settings),
            new Item.Settings());

    public static final Block STACKED_CRIMSON_STEMS = registerBlock("stacked_crimson_stems",
            settings -> new SimplePolyBlock(settings, "stacked_crimson_stems"),
            Block.Settings.copy(Blocks.CRIMSON_PLANKS));
    public static final BlockItem STACKED_CRIMSON_STEMS_ITEM = registerBlockItem("stacked_crimson_stems",
            settings -> new TexturedPolyBlockItem(STACKED_CRIMSON_STEMS, settings),
            new Item.Settings());

    public static final Block STACKED_STRIPPED_CRIMSON_STEMS = registerBlock("stacked_stripped_crimson_stems",
            settings -> new SimplePolyBlock(settings, "stacked_stripped_crimson_stems"),
            Block.Settings.copy(Blocks.CRIMSON_PLANKS));
    public static final BlockItem STACKED_STRIPPED_CRIMSON_STEMS_ITEM = registerBlockItem("stacked_stripped_crimson_stems",
            settings -> new TexturedPolyBlockItem(STACKED_STRIPPED_CRIMSON_STEMS, settings),
            new Item.Settings());

    public static final Block STACKED_CRIMSON_PLANKS = registerBlock("stacked_crimson_planks",
            settings -> new SimplePolyBlock(settings, "stacked_crimson_planks"),
            Block.Settings.copy(Blocks.CRIMSON_PLANKS));
    public static final BlockItem STACKED_CRIMSON_PLANKS_ITEM = registerBlockItem("stacked_crimson_planks",
            settings -> new TexturedPolyBlockItem(STACKED_CRIMSON_PLANKS, settings),
            new Item.Settings());

    public static final Block STACKED_WARPED_STEMS = registerBlock("stacked_warped_stems",
            settings -> new SimplePolyBlock(settings, "stacked_warped_stems"),
            Block.Settings.copy(Blocks.WARPED_PLANKS));
    public static final BlockItem STACKED_WARPED_STEMS_ITEM = registerBlockItem("stacked_warped_stems",
            settings -> new TexturedPolyBlockItem(STACKED_WARPED_STEMS, settings),
            new Item.Settings());

    public static final Block STACKED_STRIPPED_WARPED_STEMS = registerBlock("stacked_stripped_warped_stems",
            settings -> new SimplePolyBlock(settings, "stacked_stripped_warped_stems"),
            Block.Settings.copy(Blocks.WARPED_PLANKS));
    public static final BlockItem STACKED_STRIPPED_WARPED_STEMS_ITEM = registerBlockItem("stacked_stripped_warped_stems",
            settings -> new TexturedPolyBlockItem(STACKED_STRIPPED_WARPED_STEMS, settings),
            new Item.Settings());

    public static final Block STACKED_WARPED_PLANKS = registerBlock("stacked_warped_planks",
            settings -> new SimplePolyBlock(settings, "stacked_warped_planks"),
            Block.Settings.copy(Blocks.WARPED_PLANKS));
    public static final BlockItem STACKED_WARPED_PLANKS_ITEM = registerBlockItem("stacked_warped_planks",
            settings -> new TexturedPolyBlockItem(STACKED_WARPED_PLANKS, settings),
            new Item.Settings());

    public static void registerModBlocks() {
        ItemGroup.Builder builder = PolymerItemGroupUtils.builder();
        builder.icon(() -> new ItemStack(BlockRegistry.STACKED_RICH_SOIL_ITEM, 1));
        builder.displayName(Text.translatable("itemGroup.stackedblocksfarmersdelight"));
        builder.entries((displayContext, entries) -> {
            entries.add(STACKED_RICH_SOIL_ITEM);
            entries.add(STACKED_STONE_BLOCKS_ITEM);
            entries.add(STACKED_COBBLESTONE_BLOCKS_ITEM);
            entries.add(STACKED_NETHERRACK_BLOCKS_ITEM);
            entries.add(STACKED_BRICKS_ITEM);
            entries.add(STACKED_RAW_IRON_BLOCKS_ITEM);
            entries.add(STACKED_RAW_GOLD_BLOCKS_ITEM);
            entries.add(STACKED_RAW_COPPER_BLOCKS_ITEM);
            entries.add(STACKED_LAPIS_BLOCKS_ITEM);
            entries.add(STACKED_REDSTONE_BLOCKS_ITEM);
            entries.add(STACKED_COAL_BLOCKS_ITEM);
            entries.add(STACKED_IRON_BLOCKS_ITEM);
            entries.add(STACKED_GOLD_BLOCKS_ITEM);
            entries.add(STACKED_EMERALD_BLOCKS_ITEM);
            entries.add(STACKED_DIAMOND_BLOCKS_ITEM);
            entries.add(STACKED_NETHERITE_BLOCKS_ITEM);
            entries.add(STACKED_QUARTZ_BLOCKS_ITEM);
            entries.add(STACKED_MELONS_ITEM);
            entries.add(STACKED_PUMPKINS_ITEM);
            entries.add(STACKED_OAK_LOGS_ITEM);
            entries.add(STACKED_STRIPPED_OAK_LOGS_ITEM);
            entries.add(STACKED_OAK_PLANKS_ITEM);
            entries.add(STACKED_SPRUCE_LOGS_ITEM);
            entries.add(STACKED_STRIPPED_SPRUCE_LOGS_ITEM);
            entries.add(STACKED_SPRUCE_PLANKS_ITEM);
            entries.add(STACKED_BIRCH_LOGS_ITEM);
            entries.add(STACKED_STRIPPED_BIRCH_LOGS_ITEM);
            entries.add(STACKED_BIRCH_PLANKS_ITEM);
            entries.add(STACKED_JUNGLE_LOGS_ITEM);
            entries.add(STACKED_STRIPPED_JUNGLE_LOGS_ITEM);
            entries.add(STACKED_JUNGLE_PLANKS_ITEM);
            entries.add(STACKED_ACACIA_LOGS_ITEM);
            entries.add(STACKED_STRIPPED_ACACIA_LOGS_ITEM);
            entries.add(STACKED_ACACIA_PLANKS_ITEM);
            entries.add(STACKED_DARK_OAK_LOGS_ITEM);
            entries.add(STACKED_STRIPPED_DARK_OAK_LOGS_ITEM);
            entries.add(STACKED_DARK_OAK_PLANKS_ITEM);
            entries.add(STACKED_MANGROVE_LOGS_ITEM);
            entries.add(STACKED_STRIPPED_MANGROVE_LOGS_ITEM);
            entries.add(STACKED_MANGROVE_PLANKS_ITEM);
            entries.add(STACKED_CHERRY_LOGS_ITEM);
            entries.add(STACKED_STRIPPED_CHERRY_LOGS_ITEM);
            entries.add(STACKED_CHERRY_PLANKS_ITEM);
            entries.add(STACKED_PALE_OAK_LOGS_ITEM);
            entries.add(STACKED_STRIPPED_PALE_OAK_LOGS_ITEM);
            entries.add(STACKED_PALE_OAK_PLANKS_ITEM);
            entries.add(STACKED_BAMBOO_BLOCKS_ITEM);
            entries.add(STACKED_STRIPPED_BAMBOO_BLOCKS_ITEM);
            entries.add(STACKED_BAMBOO_PLANKS_ITEM);
            entries.add(STACKED_CRIMSON_STEMS_ITEM);
            entries.add(STACKED_STRIPPED_CRIMSON_STEMS_ITEM);
            entries.add(STACKED_CRIMSON_PLANKS_ITEM);
            entries.add(STACKED_WARPED_STEMS_ITEM);
            entries.add(STACKED_STRIPPED_WARPED_STEMS_ITEM);
            entries.add(STACKED_WARPED_PLANKS_ITEM);
        });

        ItemGroup polymerGroup = builder.build();
        PolymerItemGroupUtils.registerPolymerItemGroup(Identifier.of(Stackedblocksfarmersdelightport.MOD_ID, "blocks"), polymerGroup);
        Stackedblocksfarmersdelightport.LOGGER.info("Registering Item Groups for " + Stackedblocksfarmersdelightport.MOD_ID);
    }

    public static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        var key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Stackedblocksfarmersdelightport.MOD_ID, name));
        Block block = factory.apply(settings.registryKey(key));
        return Registry.register(Registries.BLOCK, key, block);
    }

    public static BlockItem registerBlockItem(String name, Function<Item.Settings, BlockItem> factory, Item.Settings settings) {
        var key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Stackedblocksfarmersdelightport.MOD_ID, name));
        BlockItem item = factory.apply(settings.registryKey(key).useBlockPrefixedTranslationKey());
        return Registry.register(Registries.ITEM, key, item);
    }

    public static void registerFlammableBlocks() {
        addFlammable(BlockRegistry.STACKED_OAK_LOGS, 5, 5);
        addFlammable(BlockRegistry.STACKED_STRIPPED_OAK_LOGS, 5, 5);
        addFlammable(BlockRegistry.STACKED_OAK_PLANKS, 5, 20);
        addFlammable(BlockRegistry.STACKED_SPRUCE_LOGS, 5, 5);
        addFlammable(BlockRegistry.STACKED_STRIPPED_SPRUCE_LOGS, 5, 5);
        addFlammable(BlockRegistry.STACKED_SPRUCE_PLANKS, 5, 20);
        addFlammable(BlockRegistry.STACKED_BIRCH_LOGS, 5, 5);
        addFlammable(BlockRegistry.STACKED_STRIPPED_BIRCH_LOGS, 5, 5);
        addFlammable(BlockRegistry.STACKED_BIRCH_PLANKS, 5, 20);
        addFlammable(BlockRegistry.STACKED_JUNGLE_LOGS, 5, 5);
        addFlammable(BlockRegistry.STACKED_STRIPPED_JUNGLE_LOGS, 5, 5);
        addFlammable(BlockRegistry.STACKED_JUNGLE_PLANKS, 5, 20);
        addFlammable(BlockRegistry.STACKED_ACACIA_LOGS, 5, 5);
        addFlammable(BlockRegistry.STACKED_STRIPPED_ACACIA_LOGS, 5, 5);
        addFlammable(BlockRegistry.STACKED_ACACIA_PLANKS, 5, 20);
        addFlammable(BlockRegistry.STACKED_DARK_OAK_LOGS, 5, 5);
        addFlammable(BlockRegistry.STACKED_STRIPPED_DARK_OAK_LOGS, 5, 5);
        addFlammable(BlockRegistry.STACKED_DARK_OAK_PLANKS, 5, 20);
        addFlammable(BlockRegistry.STACKED_MANGROVE_LOGS, 5, 5);
        addFlammable(BlockRegistry.STACKED_STRIPPED_MANGROVE_LOGS, 5, 5);
        addFlammable(BlockRegistry.STACKED_MANGROVE_PLANKS, 5, 20);
        addFlammable(BlockRegistry.STACKED_CHERRY_LOGS, 5, 5);
        addFlammable(BlockRegistry.STACKED_STRIPPED_CHERRY_LOGS, 5, 5);
        addFlammable(BlockRegistry.STACKED_CHERRY_PLANKS, 5, 20);
        addFlammable(BlockRegistry.STACKED_PALE_OAK_LOGS, 5, 5);
        addFlammable(BlockRegistry.STACKED_STRIPPED_PALE_OAK_LOGS, 5, 5);
        addFlammable(BlockRegistry.STACKED_PALE_OAK_PLANKS, 5, 20);
        addFlammable(BlockRegistry.STACKED_BAMBOO_BLOCKS, 5, 5);
        addFlammable(BlockRegistry.STACKED_STRIPPED_BAMBOO_BLOCKS, 5, 5);
        addFlammable(BlockRegistry.STACKED_BAMBOO_PLANKS, 5, 20);
        addFlammable(BlockRegistry.STACKED_MELONS, 5, 20);
        addFlammable(BlockRegistry.STACKED_PUMPKINS, 5, 20);
    }

    private static void addFlammable(Block block, int burn, int spread) {
        FlammableBlockRegistry.getDefaultInstance().add(block, burn, spread);
    }
}