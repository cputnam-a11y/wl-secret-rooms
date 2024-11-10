package net.mythical.secretrooms.block;

import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.mythical.secretrooms.SecretRooms;
import net.mythical.secretrooms.block.custom.ModDoorBlock;
import net.mythical.secretrooms.block.custom.OneWayBlock;

import static net.mythical.secretrooms.block.SettingsCloner.copy;

public class ModBlocks {
    public static final AbstractBlock.Settings GLASS_SETTINGS =
            AbstractBlock.Settings
                    .create()
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never);
    public static final AbstractBlock.Settings OAK_DOOR_SETTINGS =
            AbstractBlock.Settings
                    .create()
                    .mapColor(MapColor.OAK_TAN)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .nonOpaque()
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY);
    public static final Block ONE_WAY_OAK =
            registerBlock(
                    "onewayoak",
                    new OneWayBlock(
                            copy(GLASS_SETTINGS)
                                    .strength(4.0f)
                                    .requiresTool()
                                    .nonOpaque()
                                    .mapColor(MapColor.BROWN)
                    )
            );


    public static final Block ONE_WAY_STONE =
            registerBlock(
                    "onewaystone",
                    new OneWayBlock(
                            copy(GLASS_SETTINGS)
                                    .strength(4.0f)
                                    .requiresTool()
                                    .nonOpaque()
                                    .mapColor(MapColor.STONE_GRAY)
                    )
            );

    public static final Block ONE_WAY_COBBLE =
            registerBlock(
                    "onewaycobble",
                    new OneWayBlock(
                            copy(GLASS_SETTINGS)
                                    .strength(4.0f)
                                    .requiresTool()
                                    .nonOpaque()
                                    .mapColor(MapColor.STONE_GRAY)
                    )
            );

    public static final Block HIDDEN_DOOR_OAK =
            registerBlock(
                    "hiddendooroak",
                    new ModDoorBlock(
                            BlockSetType.OAK,
                            copy(OAK_DOOR_SETTINGS)
                                    .strength(4.0f)
                                    .requiresTool()
                                    .nonOpaque()
                    )
            );

    public static final Block HIDDEN_DOOR_STONE =
            registerBlock(
                    "hiddendoorstone",
                    new ModDoorBlock(
                            BlockSetType.OAK,
                            copy(OAK_DOOR_SETTINGS)
                                    .strength(4.0f)
                                    .requiresTool()
                                    .nonOpaque())
            );

    public static final Block HIDDEN_DOOR_COBBLE =
            registerBlock(
                    "hiddendoorcobble",
                    new ModDoorBlock(
                            BlockSetType.OAK,
                            copy(OAK_DOOR_SETTINGS)
                                    .strength(4.0f)
                                    .requiresTool()
                                    .nonOpaque()

                    )
            );

    public static final Block GHOST_COBBLE =
            registerBlock(
                    "ghostcobble",
                    new Block(
                            Block.Settings
                                    .copy(Blocks.COBBLESTONE)
                                    .strength(4.0f)
                                    .requiresTool()
                                    .noCollision()
                    )
            );

    public static final Block GHOST_OAK =
            registerBlock(
                    "ghostoak",
                    new Block(
                            Block.Settings
                                    .copy(Blocks.OAK_LOG)
                                    .mapColor(MapColor.OAK_TAN)
                                    .strength(4.0f)
                                    .requiresTool()
                                    .noCollision()
                    )
            );

    public static final Block GHOST_STONE =
            registerBlock(
                    "ghoststone",
                    new Block(
                            Block.Settings
                                    .copy(Blocks.STONE)
                                    .strength(4.0f)
                                    .requiresTool()
                                    .noCollision()
                    )
            );
    //public static final Block TORCH_LEVER = registerBlock("torchlever",
    //        new LeverBlock(Block.Settings.of(Material.STONE).strength(4.0f).requiresTool().noCollision()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(SecretRooms.MOD_ID, name), block);
    }

    @SuppressWarnings("UnusedReturnValue")
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(
                Registries.ITEM,
                Identifier.of(SecretRooms.MOD_ID, name),
                new BlockItem(block, new Item.Settings())
        );
    }

    public static void registerModBlocks() {
        System.out.println("Registering Mod Blocks for " + SecretRooms.MOD_ID);
    }

}
