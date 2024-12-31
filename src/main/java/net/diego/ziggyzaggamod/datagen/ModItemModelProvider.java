package net.diego.ziggyzaggamod.datagen;

import net.diego.ziggyzaggamod.ZiggyZaggaMod;
import net.diego.ziggyzaggamod.items.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ZiggyZaggaMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.AMBER);
        simpleItem(ModItems.STEEL);
        simpleItem(ModItems.SAPPHIRE);
        simpleItem(ModItems.MARINITE);
        simpleItem(ModItems.RUBY);
        simpleItem(ModItems.ZAGAZITE);
        simpleItem(ModItems.ZAGAZITE_NUGGET);
        simpleItem(ModItems.ZIGIZITE);
        simpleItem(ModItems.ZIGIZITE_NUGGET);
        simpleItem(ModItems.BURGER);

        handheldItem(ModItems.RUBY_SWORD);
        //handheldItem(ModItems.AMBER_STAFF);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ZiggyZaggaMod.MOD_ID, "item/" + item.getId().getPath()));
    }
    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(ZiggyZaggaMod.MOD_ID, "item/" + item.getId().getPath()));
    }

}
