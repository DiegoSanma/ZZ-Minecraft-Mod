package net.diego.ziggyzaggamod.items;

import net.diego.ziggyzaggamod.ZiggyZaggaMod;
import net.minecraft.world.item.Item;
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

    public static final RegistryObject<Item> AMETHYST =
            ITEMS.register("amethyst",() -> new Item(new Item.Properties()));

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

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
