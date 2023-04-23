package net.mythical.secretrooms.block;

import net.mythical.secretrooms.block.custom.ModDoorBlock;
import net.mythical.secretrooms.block.custom.OneWayBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mythical.secretrooms.SecretRooms;


public class ModBlocks {

    public static final Block ONEWAYOAK = registerBlock("onewayoak",
            new OneWayBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(4.0f).requiresTool().nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block ONEWAYSTONE = registerBlock("onewaystone",
            new OneWayBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(4.0f).requiresTool().nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block ONEWAYCOBBLE = registerBlock("onewaycobble",
            new OneWayBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(4.0f).requiresTool().nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block HIDDENDOOROAK = registerBlock("hiddendooroak",
            new ModDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f).requiresTool()), ItemGroup.BUILDING_BLOCKS);

    public static final Block HIDDENDOORSTONE = registerBlock("hiddendoorstone",
            new ModDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f).requiresTool()), ItemGroup.BUILDING_BLOCKS);

    public static final Block HIDDENDOORCOBBLE = registerBlock("hiddendoorcobble",
            new ModDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f).requiresTool()), ItemGroup.BUILDING_BLOCKS);

    public static final Block GHOSTCOBBLE = registerBlock("ghostcobble",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool().noCollision()), ItemGroup.BUILDING_BLOCKS);

    public static final Block GHOSTOAK = registerBlock("ghostoak",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(4.0f).requiresTool().noCollision()), ItemGroup.BUILDING_BLOCKS);

    public static final Block GHOSTSTONE = registerBlock("ghoststone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool().noCollision()), ItemGroup.BUILDING_BLOCKS);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(SecretRooms.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(SecretRooms.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering Mod Blocks for " + SecretRooms.MOD_ID);
    }

}
