package net.everwildForge.talesofalbion.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.everwildForge.talesofalbion.TalesofAlbion;
import net.everwildForge.talesofalbion.entity.custom.RedDeerMEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RedDeerMRenderer  extends MobRenderer<RedDeerMEntity, RedDeerMModel<RedDeerMEntity>> {

    public RedDeerMRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new RedDeerMModel<>(pContext.bakeLayer(RedDeerMModel.LAYER_LOCATION)), 0.3f);
    }

    @Override
    public ResourceLocation createRenderState(RedDeerMEntity pEntity) {
        return ResourceLocation.fromNamespaceAndPath(TalesofAlbion.MOD_ID,"textures/entity/reddeer/reddeerm.png");
    }

    @Override
    public void render(RedDeerMEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight){
        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }

}
