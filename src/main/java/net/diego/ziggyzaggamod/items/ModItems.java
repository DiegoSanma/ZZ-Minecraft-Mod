package net.diego.ziggyzaggamod.items;

import net.diego.ziggyzaggamod.ZiggyZaggaMod;
import net.diego.ziggyzaggamod.items.custom.AmberStaff;
import net.diego.ziggyzaggamod.util.ModTags;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ZiggyZaggaMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE =
            ITEMS.register("sapphire",() -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STEEL =
            ITEMS.register("steel",() -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RUBY =
            ITEMS.register("ruby",() -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AMBER =
            ITEMS.register("amber",() -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MARINITE =
            ITEMS.register("marinite",() -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ZAGAZITE =
            ITEMS.register("zagazite",() -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ZIGIZITE =
            ITEMS.register("zigizite",() -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZAGAZITE_NUGGET =
            ITEMS.register("zagazite_nugget",() -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ZIGIZITE_NUGGET =
            ITEMS.register("zigizite_nugget",() -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BURGER =
            ITEMS.register("burger",() -> new Item(new Item.Properties().food(ModFoods.BURGER)));

    public static final RegistryObject<Item> AMBER_STAFF =
            ITEMS.register("amber_staff",() -> new AmberStaff(ModToolTiers.AMBER,3,1,new Item.Properties()));

    public static final RegistryObject<Item> RUBY_SWORD =
            ITEMS.register("ruby_sword",() -> new SwordItem(ModToolTiers.RUBY,2,2,new Item.Properties()));

    public static final RegistryObject<Item> RUBY_HELMET =
            ITEMS.register("ruby_helmet",
                    () -> new ArmorItem(ModArmorMaterials.RUBY,ArmorItem.Type.HELMET,new Item.Properties()));
    public static final RegistryObject<Item> RUBY_CHESTPLATE =
            ITEMS.register("ruby_chestplate",
                    () -> new ArmorItem(ModArmorMaterials.RUBY,ArmorItem.Type.CHESTPLATE,new Item.Properties()));
    public static final RegistryObject<Item> RUBY_LEGGINGS =
            ITEMS.register("ruby_leggings",
                    () -> new ArmorItem(ModArmorMaterials.RUBY,ArmorItem.Type.LEGGINGS,new Item.Properties()));
    public static final RegistryObject<Item> RUBY_BOOTS =
            ITEMS.register("ruby_boots",
                    () -> new ArmorItem(ModArmorMaterials.RUBY,ArmorItem.Type.BOOTS,new Item.Properties()));
    public static final RegistryObject<Item> STEEL_HELMET =
            ITEMS.register("steel_helmet",
                    () -> new ArmorItem(ModArmorMaterials.STEEL,ArmorItem.Type.HELMET,new Item.Properties()));
    public static final RegistryObject<Item> STEEL_CHESTPLATE =
            ITEMS.register("steel_chestplate",
                    () -> new ArmorItem(ModArmorMaterials.STEEL,ArmorItem.Type.CHESTPLATE,new Item.Properties()));
    public static final RegistryObject<Item> STEEL_LEGGINGS =
            ITEMS.register("steel_leggings",
                    () -> new ArmorItem(ModArmorMaterials.STEEL,ArmorItem.Type.LEGGINGS,new Item.Properties()));
    public static final RegistryObject<Item> STEEL_BOOTS =
            ITEMS.register("steel_boots",
                    () -> new ArmorItem(ModArmorMaterials.STEEL,ArmorItem.Type.BOOTS,new Item.Properties()));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
