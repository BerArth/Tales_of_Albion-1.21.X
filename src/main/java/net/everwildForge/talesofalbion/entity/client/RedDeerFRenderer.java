package net.everwildForge.talesofalbion.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.everwildForge.talesofalbion.TalesofAlbion;
import net.everwildForge.talesofalbion.entity.custom.RedDeerFEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RedDeerFRenderer  extends MobRenderer<RedDeerFEntity, RedDeerFModel<RedDeerFEntity>> {

    public RedDeerFRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new RedDeerFModel<>(pContext.bakeLayer(RedDeerFModel.LAYER_LOCATION)), 0.3f);
    }

    @Override
    public ResourceLocation createRenderState(RedDeerFEntity pEntity) {
        return ResourceLocation.fromNamespaceAndPath(TalesofAlbion.MOD_ID,"textures/entity/reddeerf/reddeerf.png");
    }

    @Override
    public void render(RedDeerFEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight){
        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }

}
