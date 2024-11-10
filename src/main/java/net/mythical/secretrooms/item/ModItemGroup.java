package net.mythical.secretrooms.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.mythical.secretrooms.SecretRooms;
import net.mythical.secretrooms.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup OWS = register("onewaystone", ItemGroup.create(ItemGroup.Row.TOP, -1).icon(() -> new ItemStack(ModBlocks.ONE_WAY_STONE)).entries((context, entries) -> {
        entries.add(ModBlocks.GHOST_COBBLE);
        entries.add(ModBlocks.GHOST_OAK);
        entries.add(ModBlocks.GHOST_STONE);
        entries.add(ModBlocks.HIDDEN_DOOR_COBBLE);
        entries.add(ModBlocks.HIDDEN_DOOR_OAK);
        entries.add(ModBlocks.HIDDEN_DOOR_STONE);
        entries.add(ModBlocks.ONE_WAY_COBBLE);
        entries.add(ModBlocks.ONE_WAY_OAK);
        entries.add(ModBlocks.ONE_WAY_STONE);
    }));

    public static ItemGroup register(String id, ItemGroup.Builder itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, Identifier.of(SecretRooms.MOD_ID, id), itemGroup.displayName(Text.translatable("itemgroup." + SecretRooms.MOD_ID + "." + id.replace("/", "."))).build());
    }
    public static void register() {}
}
