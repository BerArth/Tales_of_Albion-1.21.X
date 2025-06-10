package net.everwildForge.talesofalbion.entity;

import net.everwildForge.talesofalbion.TalesofAlbion;
import net.everwildForge.talesofalbion.entity.custom.BadgerEntity;
import net.everwildForge.talesofalbion.entity.custom.RedDeerMEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TalesofAlbion.MOD_ID);

    public static final RegistryObject<EntityType<BadgerEntity>> BADGER =
            ENTITY_TYPES.register("badger",()-> EntityType.Builder.of(BadgerEntity::new, MobCategory.CREATURE)
                    .sized(1.5f,1.5f).build("badger"));

    public static final RegistryObject<EntityType<RedDeerMEntity>> REDDEERM  =
            ENTITY_TYPES.register("reddeerm",()-> EntityType.Builder.of(RedDeerMEntity::new, MobCategory.CREATURE)
                    .sized(1.5f,1.5f).build("reddeerm"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
