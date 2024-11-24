package net.mythical.secretrooms.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.mythical.secretrooms.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class SecretRoomsEnglishLangProvider extends FabricLanguageProvider {
    protected SecretRoomsEnglishLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModBlocks.ONE_WAY_OAK, "One Way Wall (Oak)");
        translationBuilder.add(ModBlocks.ONE_WAY_STONE, "One Way Wall (Stone)");
        translationBuilder.add(ModBlocks.ONE_WAY_COBBLE, "One Way Wall (Cobblestone)");

        translationBuilder.add(ModBlocks.HIDDEN_DOOR_OAK, "Hidden Door (Oak Planks)");
        translationBuilder.add(ModBlocks.HIDDEN_DOOR_COBBLE, "Hidden Door (Cobblestone)");
        translationBuilder.add(ModBlocks.HIDDEN_DOOR_STONE, "Hidden Door (Stone)");

        translationBuilder.add(ModBlocks.GHOST_OAK, "Ghost Block (Oak)");
        translationBuilder.add(ModBlocks.GHOST_STONE, "Ghost Block (Stone)");
        translationBuilder.add(ModBlocks.GHOST_COBBLE, "Ghost Block (Cobblestone)");

        translationBuilder.add("itemGroup.secretrooms.onewaystone", "Secret Rooms");
    }
}
