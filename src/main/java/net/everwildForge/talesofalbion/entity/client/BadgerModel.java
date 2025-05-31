package net.everwildForge.talesofalbion.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.everwildForge.talesofalbion.TalesofAlbion;
import net.everwildForge.talesofalbion.entity.custom.BadgerEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class BadgerModel<T extends BadgerEntity> extends HierarchicalModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(TalesofAlbion.MOD_ID,"badger"),"main");
    private final ModelPart badger;
    private final ModelPart body;
    private final ModelPart bodymain;
    private final ModelPart pelt;
    private final ModelPart tail;
    private final ModelPart head;
    private final ModelPart frontleftleg;
    private final ModelPart frontrightleg;
    private final ModelPart backrightleg;
    private final ModelPart backleftleg;

    public BadgerModel(ModelPart root) {
        super(RenderType::entityCutout);
        this.badger = root.getChild("badger");
        this.body = this.badger.getChild("body");
        this.bodymain = this.body.getChild("bodymain");
        this.pelt = this.bodymain.getChild("pelt");
        this.tail = this.body.getChild("tail");
        this.head = this.badger.getChild("head");
        this.frontleftleg = this.badger.getChild("frontleftleg");
        this.frontrightleg = this.badger.getChild("frontrightleg");
        this.backrightleg = this.badger.getChild("backrightleg");
        this.backleftleg = this.badger.getChild("backleftleg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition badger = partdefinition.addOrReplaceChild("badger", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, -1.0F));

        PartDefinition body = badger.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0083F, -4.1667F, 2.2667F));

        PartDefinition bodymain = body.addOrReplaceChild("bodymain", CubeListBuilder.create(), PartPose.offset(-0.0083F, -0.3333F, -0.2667F));

        PartDefinition body_r1 = bodymain.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -2.0F, -6.0F, 7.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0262F, 0.0F, 0.0F));

        PartDefinition pelt = bodymain.addOrReplaceChild("pelt", CubeListBuilder.create().texOffs(0, 16).addBox(3.5125F, 0.5F, -5.5F, 0.0F, 4.0F, 11.0F, new CubeDeformation(0.0F))
                .texOffs(22, 16).addBox(-3.5125F, 0.5F, -5.5F, 0.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0125F, -2.0F, 0.4F));

        PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(-0.0083F, -1.5273F, 5.6631F));

        PartDefinition tail_r1 = tail.addOrReplaceChild("tail_r1", CubeListBuilder.create().texOffs(26, 31).addBox(0.0F, -3.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.444F, 1.0702F, 0.3927F, 0.0F, 0.0F));

        PartDefinition head = badger.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 31).addBox(-2.5F, -0.5359F, -3.775F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(18, 31).addBox(-1.0F, -0.5359F, -5.775F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.6483F, -4.2595F, 0.0873F, 0.0F, 0.0F));

        PartDefinition lefthear_r1 = head.addOrReplaceChild("lefthear_r1", CubeListBuilder.create().texOffs(22, 35).addBox(0.3946F, -1.2408F, 0.5584F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, -0.5378F, -1.8185F, -0.0361F, -0.3911F, 0.0944F));

        PartDefinition righthear_r1 = head.addOrReplaceChild("righthear_r1", CubeListBuilder.create().texOffs(18, 35).addBox(-1.3946F, -1.2408F, 0.5584F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -0.5378F, -1.8185F, -0.0361F, 0.3911F, -0.0944F));

        PartDefinition frontleftleg = badger.addOrReplaceChild("frontleftleg", CubeListBuilder.create().texOffs(30, 35).addBox(-0.6F, -0.25F, -0.8F, 1.2F, 2.5F, 1.6F, new CubeDeformation(0.0F)), PartPose.offset(2.8F, -2.25F, -2.8F));

        PartDefinition frontrightleg = badger.addOrReplaceChild("frontrightleg", CubeListBuilder.create().texOffs(34, 35).addBox(-0.6F, -0.25F, -0.8F, 1.2F, 2.5F, 1.6F, new CubeDeformation(0.0F)), PartPose.offset(-2.8F, -2.25F, -2.8F));

        PartDefinition backrightleg = badger.addOrReplaceChild("backrightleg", CubeListBuilder.create().texOffs(30, 31).addBox(-0.6F, -0.5F, -0.9F, 1.2F, 3.0F, 1.8F, new CubeDeformation(0.0F)), PartPose.offset(-2.8F, -2.5F, 6.85F));

        PartDefinition backleftleg = badger.addOrReplaceChild("backleftleg", CubeListBuilder.create().texOffs(34, 31).addBox(-0.6F, -0.5F, -0.9F, 1.2F, 3.0F, 1.8F, new CubeDeformation(0.0F)), PartPose.offset(2.8F, -2.5F, 6.85F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(BadgerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.m_142109_().getAllParts().forEach(ModelPart::resetPose);
        //add the animation to rotate the head towards the player when he is nearby
        this.applyHeadRotation(netHeadYaw, headPitch);

        //method animate walk
        this.m_267799_(BadgerAnimations.WALK, limbSwing, limbSwingAmount,2f,2.5f);
        //method animate
        this.m_233385_(entity.idleAnimationState,BadgerAnimations.IDLE,ageInTicks,1f);
    }

    private void applyHeadRotation(float pNetHeadYaw, float pNetHeadPitch) {
        pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30f, 30f);
        pNetHeadPitch = Mth.clamp(pNetHeadPitch, -25f, 45f);
        this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180f);
        this.head.xRot = pNetHeadPitch * ((float)Math.PI / 180f);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer,int packedLight,int packedOverlay, int color){
        badger.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
    }

    @Override
    //method root in the tutorial
    public ModelPart m_142109_() {
       return badger;
    }
}
