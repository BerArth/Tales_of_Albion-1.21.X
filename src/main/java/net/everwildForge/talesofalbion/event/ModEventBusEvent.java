package net.everwildForge.talesofalbion.event;

import net.everwildForge.talesofalbion.TalesofAlbion;
import net.everwildForge.talesofalbion.entity.ModEntities;
import net.everwildForge.talesofalbion.entity.client.BadgerModel;
import net.everwildForge.talesofalbion.entity.client.RedDeerMModel;
import net.everwildForge.talesofalbion.entity.custom.BadgerEntity;
import net.everwildForge.talesofalbion.entity.custom.RedDeerMEntity;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TalesofAlbion.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvent {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(BadgerModel.LAYER_LOCATION, BadgerModel::createBodyLayer);
        event.registerLayerDefinition(RedDeerMModel.LAYER_LOCATION, RedDeerMModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.BADGER.get(), BadgerEntity.createAttributes().build());
        event.put(ModEntities.REDDEERM.get(), RedDeerMEntity.createAttributes().build());
    }
}
