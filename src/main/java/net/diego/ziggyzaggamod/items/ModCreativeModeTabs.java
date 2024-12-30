package net.diego.ziggyzaggamod.items;

import net.diego.ziggyzaggamod.ZiggyZaggaMod;
import net.diego.ziggyzaggamod.blocks.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS
            = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ZiggyZaggaMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ZiggyZaggaTab =
            CREATIVE_MODE_TABS.register("ziggyzagga_tab",
                    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                            .title(Component.translatable("creativetab.ziggyzagga_tab"))
                            .displayItems((itemDisplayParameters, output) -> {
                                output.accept(ModItems.SAPPHIRE.get());
                                output.accept(ModItems.STEEL.get());
                                output.accept(ModItems.RUBY.get());
                                output.accept(ModItems.AMBER.get());
                                output.accept(ModItems.MARINITE.get());
                                output.accept(ModItems.ZIGIZITE.get());
                                output.accept(ModItems.ZAGAZITE.get());
                                output.accept(ModItems.ZIGIZITE_NUGGET.get());
                                output.accept(ModItems.ZAGAZITE_NUGGET.get());
                                output.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                                output.accept(ModBlocks.RUBY_BLOCK.get());
                                output.accept(ModBlocks.AMBER_BLOCK.get());

                            })
                            .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
