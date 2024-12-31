package net.diego.ziggyzaggamod.datagen;

import net.diego.ziggyzaggamod.ZiggyZaggaMod;
import net.diego.ziggyzaggamod.blocks.ModBlocks;
import net.diego.ziggyzaggamod.items.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S',ModItems.SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()),has(ModItems.SAPPHIRE.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUBY_SWORD.get())
                .pattern("R")
                .pattern("R")
                .pattern("#")
                .define('R',ModItems.RUBY.get())
                .define('#', Items.STICK)
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()),has(ModItems.SAPPHIRE.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AMBER_STAFF.get())
                .pattern("B")
                .pattern("A")
                .pattern("#")
                .define('B',Items.BLAZE_POWDER)
                .define('A',ModItems.AMBER.get())
                .define('#', Items.STICK)
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()),has(ModItems.SAPPHIRE.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SAPPHIRE.get(),9)
                .requires(ModBlocks.SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SAPPHIRE_BLOCK.get()),has(ModBlocks.SAPPHIRE_BLOCK.get()))
                .save(consumer);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemlike}), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike)).
                    save(pFinishedRecipeConsumer, ZiggyZaggaMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }
}
