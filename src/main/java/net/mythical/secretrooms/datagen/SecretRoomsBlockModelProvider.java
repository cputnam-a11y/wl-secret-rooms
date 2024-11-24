package net.mythical.secretrooms.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.mythical.secretrooms.block.ModBlocks;

import java.util.function.Consumer;

import static net.minecraft.data.client.VariantSettings.Rotation;

public class SecretRoomsBlockModelProvider extends FabricModelProvider {
    public SecretRoomsBlockModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator generator) {
        generator.registerSimpleCubeAll(ModBlocks.GHOST_COBBLE);
        generator.registerSimpleCubeAll(ModBlocks.GHOST_OAK);
        generator.registerSimpleCubeAll(ModBlocks.GHOST_STONE);
        generator.registerDoor(ModBlocks.HIDDEN_DOOR_COBBLE);
        generator.registerDoor(ModBlocks.HIDDEN_DOOR_OAK);
        generator.registerDoor(ModBlocks.HIDDEN_DOOR_STONE);
        registerOneWayBlock(generator.blockStateCollector, ModBlocks.ONE_WAY_COBBLE, Identifier.of("secretrooms", "block/onewaycobble"));
        registerOneWayBlock(generator.blockStateCollector, ModBlocks.ONE_WAY_OAK, Identifier.of("secretrooms", "block/onewayoak"));
        registerOneWayBlock(generator.blockStateCollector, ModBlocks.ONE_WAY_STONE, Identifier.of("secretrooms", "block/onewaystone"));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
    static void registerOneWayBlock(Consumer<BlockStateSupplier> blockStateCollector, Block block, Identifier modelId) {
        var bss = VariantsBlockStateSupplier.create(block)
                .coordinate(
                        BlockStateVariantMap.create(Properties.HORIZONTAL_FACING)
                                .register(
                                        Direction.NORTH,
                                        BlockStateVariant.create()
                                                .put(
                                                        VariantSettings.MODEL,
                                                        modelId
                                                )
                                                .put(
                                                        VariantSettings.UVLOCK,
                                                        true
                                                )
                                )
                                .register(
                                        Direction.SOUTH,
                                        BlockStateVariant.create()
                                                .put(
                                                        VariantSettings.MODEL,
                                                        modelId
                                                )
                                                .put(
                                                        VariantSettings.Y,
                                                        Rotation.R90
                                                )
                                                .put(
                                                        VariantSettings.UVLOCK,
                                                        true
                                                )
                                )
                                .register(
                                        Direction.EAST,
                                        BlockStateVariant.create()
                                                .put(
                                                        VariantSettings.MODEL,
                                                        modelId
                                                )
                                                .put(
                                                        VariantSettings.Y,
                                                        Rotation.R180
                                                )
                                                .put(
                                                        VariantSettings.UVLOCK,
                                                        true
                                                )
                                )
                                .register(
                                        Direction.WEST,
                                        BlockStateVariant.create()
                                                .put(
                                                        VariantSettings.MODEL,
                                                        modelId
                                                )
                                                .put(
                                                        VariantSettings.Y,
                                                        Rotation.R270
                                                )
                                                .put(
                                                        VariantSettings.UVLOCK,
                                                        true
                                                )
                                )
                );
        blockStateCollector.accept(bss);
    }
}
