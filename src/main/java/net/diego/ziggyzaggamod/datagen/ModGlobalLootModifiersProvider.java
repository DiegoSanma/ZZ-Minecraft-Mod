package net.diego.ziggyzaggamod.datagen;

import net.diego.ziggyzaggamod.ZiggyZaggaMod;
import net.diego.ziggyzaggamod.items.ModItems;
import net.diego.ziggyzaggamod.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.functions.LootItemConditionalFunction;
import net.minecraft.world.level.storage.loot.functions.LootItemFunctions;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceWithLootingCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, ZiggyZaggaMod.MOD_ID);
    }

    @Override
    protected void start() {

        add("amber_from_blaze", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/blaze")).build(),
                LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.1f,0.05f).build()
                }, ModItems.AMBER.get()));

        add("ruby_from_jungle_temples", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/jungle_temple")).build()}, ModItems.RUBY.get()));
        add("amber_staff_from_bastions", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_other")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build()}, ModItems.RUBY.get()));

    }
}
