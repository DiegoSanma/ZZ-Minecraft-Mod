package net.diego.ziggyzaggamod.entity;

import net.diego.ziggyzaggamod.ZiggyZaggaMod;
import net.diego.ziggyzaggamod.entity.custom.SausageDogEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
           DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ZiggyZaggaMod.MOD_ID);

    public static final RegistryObject<EntityType<SausageDogEntity>> SAUSAGE_DOG =
        ENTITY_TYPES.register("sausage_dog",() -> EntityType.Builder.of(SausageDogEntity::new, MobCategory.CREATURE)
                .sized(2.5f,2.5f).build("sausage_dog"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
