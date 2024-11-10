package net.mythical.secretrooms.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.mythical.secretrooms.block.ModBlocks;

public class SecretRoomsModelProvider extends FabricModelProvider {
    public SecretRoomsModelProvider(FabricDataOutput output) {
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
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
