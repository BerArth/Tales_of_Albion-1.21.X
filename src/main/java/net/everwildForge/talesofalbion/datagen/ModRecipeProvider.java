package net.everwildForge.talesofalbion.datagen;

import net.everwildForge.talesofalbion.TalesofAlbion;
import net.everwildForge.talesofalbion.block.ModBlocks;
import net.everwildForge.talesofalbion.item.ModItems;
import net.everwildForge.talesofalbion.tag.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(output, pRegistries);
    }

    @Override
    protected void m_245200_(RecipeOutput recipeOutput) {  //m_245200 = buildRecipes

        List<ItemLike> SILVER_SMELTABLE = List.of(ModItems.RAW_SILVER.get(), ModBlocks.SILVER_ORE.get());
        List<ItemLike> SILVER_BLASTABLE = List.of(ModItems.RAW_SILVER.get(),  ModBlocks.SILVER_ORE.get(), ModBlocks.DEEPSLATE_SILVER_ORE.get());


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SILVER_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.SILVER_INGOT.get())
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT.get())).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 9)
                .requires(ModBlocks.SILVER_BLOCK.get())
                .group("SILVER_INGOT")
                .unlockedBy(getHasName(ModBlocks.SILVER_BLOCK.get()), has(ModBlocks.SILVER_BLOCK.get())).save(recipeOutput, TalesofAlbion.MOD_ID + ":silver_ingot_from_block");

        oreSmelting(recipeOutput, SILVER_SMELTABLE, RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 0.25f, 200, "silver");
        oreBlasting(recipeOutput, SILVER_BLASTABLE, RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 0.25f, 100, "silver");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_SILVER_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RAW_SILVER.get())
                .unlockedBy(getHasName(ModItems.RAW_SILVER.get()), has(ModItems.RAW_SILVER.get())).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_SILVER.get(), 9)
                .requires(ModBlocks.RAW_SILVER_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_SILVER_BLOCK.get()), has(ModBlocks.RAW_SILVER_BLOCK.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.SILVER_NUGGET.get())
                .group("SILVER_INGOT")
                .unlockedBy(getHasName(ModItems.SILVER_NUGGET.get()), has(ModItems.SILVER_NUGGET.get()))
                .save(recipeOutput, TalesofAlbion.MOD_ID + ":silver_ingot_from_nuggets");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SILVER_NUGGET.get(), 9)
                .requires(ModItems.SILVER_INGOT.get())
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHALK_STONE.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.CHALK_POWDER.get())
                .unlockedBy(getHasName(ModItems.CHALK_POWDER.get()), has(ModItems.CHALK_POWDER.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHALK_STONE_BRICKS.get())
                .pattern("AA")
                .pattern("AA")
                .define('A', ModBlocks.CHALK_STONE.get())
                .unlockedBy(getHasName(ModBlocks.CHALK_STONE.get()), has(ModBlocks.CHALK_STONE.get())).save(recipeOutput);

        //ALDER
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ALDER_PLANKS.get(), 4)
                .requires(ModTags.Items.ALDER_LOGS)
                .unlockedBy(getHasName(ModBlocks.ALDER_LOG.get()), has(ModBlocks.ALDER_LOG.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ALDER_WOOD.get())
                .pattern("AA")
                .pattern("AA")
                .define('A', ModBlocks.ALDER_LOG.get())
                .unlockedBy(getHasName(ModBlocks.ALDER_LOG.get()), has(ModBlocks.ALDER_LOG.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_ALDER_WOOD.get())
                .pattern("AA")
                .pattern("AA")
                .define('A', ModBlocks.STRIPPED_ALDER_LOG.get())
                .unlockedBy(getHasName(ModBlocks.STRIPPED_ALDER_LOG.get()), has(ModBlocks.STRIPPED_ALDER_LOG.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, ModBlocks.ALDER_DOOR.get(), 3)
                .pattern("AA")
                .pattern("AA")
                .pattern("AA")
                .define('A', ModBlocks.ALDER_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.ALDER_PLANKS.get()), has(ModBlocks.ALDER_PLANKS.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, ModBlocks.ALDER_TRAP_DOOR.get(), 2)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.ALDER_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.ALDER_PLANKS.get()), has(ModBlocks.ALDER_PLANKS.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ALDER_STAIRS.get(), 4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.ALDER_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.ALDER_PLANKS.get()), has(ModBlocks.ALDER_PLANKS.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ALDER_SLAB.get(), 6)
                .pattern("AAA")
                .define('A', ModBlocks.ALDER_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.ALDER_PLANKS.get()), has(ModBlocks.ALDER_PLANKS.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, ModBlocks.ALDER_PRESSURE_PLATE.get())
                .pattern("AA")
                .define('A', ModBlocks.ALDER_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.ALDER_PLANKS.get()), has(ModBlocks.ALDER_PLANKS.get())).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE ,ModBlocks.ALDER_BUTTON.get(), 1)
                .requires(ModBlocks.ALDER_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.ALDER_PLANKS.get()), has(ModBlocks.ALDER_PLANKS.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.ALDER_FENCE.get())
                .pattern("A/A")
                .pattern("A/A")
                .define('A', ModBlocks.ALDER_PLANKS.get())
                .define('/', Items.STICK)
                .unlockedBy(getHasName(ModBlocks.ALDER_PLANKS.get()), has(ModBlocks.ALDER_PLANKS.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, ModBlocks.ALDER_FENCE_GATE.get())
                .pattern("A/A")
                .pattern("A/A")
                .define('/', ModBlocks.ALDER_PLANKS.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModBlocks.ALDER_PLANKS.get()), has(ModBlocks.ALDER_PLANKS.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.DAUB_BALL.get())
                .pattern("WSW")
                .pattern("CPC")
                .pattern("WSW")
                .define('W', Items.WHEAT)
                .define('S', Items.SAND)
                .define('C', Items.CLAY)
                .define('P', ModItems.CHALK_POWDER.get())
                .unlockedBy(getHasName(ModItems.CHALK_POWDER.get()),has(ModItems.CHALK_POWDER.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.WATTLE_N_DAUB_PLAIN.get())
                .pattern("DWD")
                .pattern("DWD")
                .pattern("DWD")
                .define('W', Items.WHEAT)
                .define('D', ModItems.DAUB_BALL.get())
                .unlockedBy(getHasName(ModItems.DAUB_BALL.get()),has(ModItems.DAUB_BALL.get())).save(recipeOutput);


        //peat

        oreSmelting(recipeOutput, ModBlocks.PEAT_DIRT.get(), RecipeCategory.MISC, ModItems.DRIED_PEAT.get(), 0.25f, 150, "peat");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIED_PEAT_BLOCK.get())
                .pattern("AA")
                .pattern("AA")
                .define('A', ModItems.DRIED_PEAT.get())
                .unlockedBy(getHasName(ModItems.DRIED_PEAT.get()), has(ModItems.DRIED_PEAT.get())).save(recipeOutput);


       SingleItemRecipeBuilder.stonecutting(
               Ingredient.of(ModItems.SILVER_INGOT.get()), RecipeCategory.MISC, ModItems.SILVER_PENNIG.get(), 1)
               .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT.get())).save(recipeOutput);

       //thatch

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.THATCH_BLOCK.get(), 2)
                .pattern("CSC")
                .pattern("SHS")
                .pattern("CSC")
                .define('C', Items.SUGAR_CANE)
                .define('S', Items.STICK)
                .define('H', Items.HAY_BLOCK)
                .unlockedBy(getHasName(Items.HAY_BLOCK),has(Items.HAY_BLOCK)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.LATTICE_THATCH_BLOCK.get(), 2)
                .pattern("SSS")
                .pattern("STS")
                .pattern("STS")
                .define('S', Items.STICK)
                .define('T', ModBlocks.THATCH_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.THATCH_BLOCK.get()),has(ModBlocks.THATCH_BLOCK.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.THATCH_STAIRS.get(), 3)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .define('T', ModBlocks.THATCH_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.THATCH_BLOCK.get()),has(ModBlocks.THATCH_BLOCK.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.LATTICE_THATCH_STAIRS.get(), 3)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .define('T', ModBlocks.LATTICE_THATCH_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.THATCH_BLOCK.get()),has(ModBlocks.THATCH_BLOCK.get())).save(recipeOutput);
    }


    //recette pour le four
    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreSmelting(RecipeOutput recipeOutput, ItemLike input, RecipeCategory category, ItemLike result,
                                      float experience, int cookingTime, String group) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new,
                List.of(input), category, result, experience, cookingTime, group, "_from_smelting");
    }


    //recette pour le blastfurnace
    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, TalesofAlbion.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }

}
