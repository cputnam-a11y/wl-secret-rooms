package net.mythical.secretrooms.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.mythical.secretrooms.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class SecretRoomsRecipeProvider extends FabricRecipeProvider {
    public SecretRoomsRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GHOST_COBBLE, 3)
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .input('#', Blocks.COBBLESTONE)
                .criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Blocks.COBBLESTONE))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GHOST_OAK, 3)
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .input('#', Blocks.OAK_PLANKS)
                .criterion(hasItem(Blocks.OAK_PLANKS), conditionsFromItem(Blocks.OAK_PLANKS))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GHOST_STONE, 3)
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .input('#', Blocks.STONE)
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Blocks.STONE))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.HIDDEN_DOOR_COBBLE, 3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Blocks.COBBLESTONE)
                .criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Blocks.COBBLESTONE))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.HIDDEN_DOOR_OAK, 3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Blocks.OAK_PLANKS)
                .criterion(hasItem(Blocks.OAK_PLANKS), conditionsFromItem(Blocks.OAK_PLANKS))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.HIDDEN_DOOR_STONE, 3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Blocks.STONE)
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Blocks.STONE))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ONE_WAY_COBBLE, 3)
                .pattern("###")
                .pattern("CCC")
                .pattern("CCC")
                .input('#', Blocks.GLASS_PANE)
                .input('C', Blocks.COBBLESTONE)
                .criterion(hasItem(Blocks.GLASS_PANE), conditionsFromItem(Blocks.GLASS_PANE))
                .criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Blocks.COBBLESTONE))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ONE_WAY_OAK, 3)
                .pattern("###")
                .pattern("CCC")
                .pattern("CCC")
                .input('#', Blocks.GLASS_PANE)
                .input('C', Blocks.OAK_PLANKS)
                .criterion(hasItem(Blocks.GLASS_PANE), conditionsFromItem(Blocks.GLASS_PANE))
                .criterion(hasItem(Blocks.OAK_PLANKS), conditionsFromItem(Blocks.OAK_PLANKS))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ONE_WAY_STONE, 3)
                .pattern("###")
                .pattern("CCC")
                .pattern("CCC")
                .input('#', Blocks.GLASS_PANE)
                .input('C', Blocks.STONE)
                .criterion(hasItem(Blocks.GLASS_PANE), conditionsFromItem(Blocks.GLASS_PANE))
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Blocks.STONE))
                .offerTo(recipeExporter);
    }
}
