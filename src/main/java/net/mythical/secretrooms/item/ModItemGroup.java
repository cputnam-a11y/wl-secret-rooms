package net.mythical.secretrooms.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.mythical.secretrooms.SecretRooms;
import net.mythical.secretrooms.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup OWS = FabricItemGroupBuilder.build(new Identifier(SecretRooms.MOD_ID, "onewaystone"),
            () -> new ItemStack(ModBlocks.GHOSTSTONE));
}
