package net.everwildForge.talesofalbion.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.everwildForge.talesofalbion.TalesofAlbion;
import net.everwildForge.talesofalbion.entity.custom.BadgerEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BadgerRenderer extends MobRenderer<BadgerEntity, BadgerModel<BadgerEntity>> {
    public BadgerRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new BadgerModel<>(pContext.bakeLayer(BadgerModel.LAYER_LOCATION)), 0.85f);
    }

    /***/

    @Override
    public ResourceLocation createRenderState(BadgerEntity pEntity) {
        return ResourceLocation.fromNamespaceAndPath(TalesofAlbion.MOD_ID,"textures/entity/badger/badger.png");
    }

    @Override
    public void render(BadgerEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight){
        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
