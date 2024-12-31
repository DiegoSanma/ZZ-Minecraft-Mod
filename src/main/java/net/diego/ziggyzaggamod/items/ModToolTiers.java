package net.diego.ziggyzaggamod.items;

import net.diego.ziggyzaggamod.ZiggyZaggaMod;
import net.diego.ziggyzaggamod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier RUBY = TierSortingRegistry.registerTier(
            new ForgeTier(2,1500,5f,4f,25, ModTags.Blocks.NEEDS_RUBY_TOOL,
                    ()-> Ingredient.of(ModItems.RUBY.get())),new ResourceLocation(ZiggyZaggaMod.MOD_ID,"ruby"),
            List.of(Tiers.IRON),List.of());
    public static final Tier AMBER = TierSortingRegistry.registerTier(
            new ForgeTier(3,1500,5f,4f,25, ModTags.Blocks.NEEDS_AMBER_TOOL,
                    ()-> Ingredient.of(ModItems.AMBER.get())),new ResourceLocation(ZiggyZaggaMod.MOD_ID,"amber"),
            List.of(Tiers.DIAMOND),List.of());
}
