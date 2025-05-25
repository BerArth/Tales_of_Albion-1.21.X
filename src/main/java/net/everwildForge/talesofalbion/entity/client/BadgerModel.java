package net.everwildForge.talesofalbion.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.everwildForge.talesofalbion.TalesofAlbion;
import net.everwildForge.talesofalbion.entity.custom.BadgerEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class BadgerModel<T extends BadgerEntity> extends HierarchicalModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(TalesofAlbion.MOD_ID,"badger"),"main");
    private final ModelPart root;
    private final ModelPart body;
    private final ModelPart head;
    private final ModelPart frontLeftLeg;
    private final ModelPart frontRightLeg;
    private final ModelPart backLeftLeg;
    private final ModelPart backRightLeg;
    private final ModelPart tail;
    private final ModelPart pelt;

    public BadgerModel(ModelPart root) {
        super(RenderType::entityCutout);
        this.root = root.getChild("badger");
        this.body = root.getChild("body");
        this.head = root.getChild("head");
        this.frontLeftLeg = root.getChild("front_left_leg");
        this.frontRightLeg = root.getChild("front_right_leg");
        this.backLeftLeg = root.getChild("back_left_leg");
        this.backRightLeg = root.getChild("back_right_leg");
        this.tail = body.getChild("tail");
        this.pelt = body.getChild("pelt");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        partdefinition.addOrReplaceChild("body",
                CubeListBuilder.create()
                        .texOffs(11, 16).addBox(-3.5F, 0.0F, -5.0F, 7.0F, 4.0F, 12.0F),
                PartPose.offset(0.0F, 20.0F, 0.0F));

        partdefinition.addOrReplaceChild("head",
                CubeListBuilder.create()
                        .texOffs(10, 20).addBox(-2.4F, -1.5F, -4.0F, 4.8F, 2.0F, 4.0F),
                PartPose.offset(0.0F, 18.5F, -5.5F));

        partdefinition.addOrReplaceChild("tail",
                CubeListBuilder.create()
                        .texOffs(25, 2).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F),
                PartPose.offset(0.0F, 19.0F, 6.9F));

        partdefinition.addOrReplaceChild("front_left_leg",
                CubeListBuilder.create()
                        .texOffs(14, 22).addBox(0.0F, 0.0F, 0.0F, 1.2F, 2.5F, 1.6F),
                PartPose.offset(2.8F, 21.5F, -3.8F));

        partdefinition.addOrReplaceChild("front_right_leg",
                CubeListBuilder.create()
                        .texOffs(18, 22).addBox(-1.2F, 0.0F, 0.0F, 1.2F, 2.5F, 1.6F),
                PartPose.offset(-2.8F, 21.5F, -3.8F));

        partdefinition.addOrReplaceChild("back_left_leg",
                CubeListBuilder.create()
                        .texOffs(2, 24).addBox(0.0F, 0.0F, 0.0F, 1.2F, 3.0F, 1.8F),
                PartPose.offset(2.8F, 21.0F, 5.85F));

        partdefinition.addOrReplaceChild("back_right_leg",
                CubeListBuilder.create()
                        .texOffs(0, 24).addBox(-1.2F, 0.0F, 0.0F, 1.2F, 3.0F, 1.8F),
                PartPose.offset(-2.8F, 21.0F, 5.85F));

        return LayerDefinition.create(meshdefinition, 32, 32);
    }

    public ModelPart root() {
        return root;
    }

    @Override
    public void setupAnim(T BadgerEntity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.applyHeadRotation(netHeadYaw, headPitch);
    }

    private void applyHeadRotation(float pNetHeadYaw, float pNetHeadPitch) {
        pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30f, 30f);
        pNetHeadPitch = Mth.clamp(pNetHeadPitch, -25f, 45f);
        this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180f);
        this.head.xRot = pNetHeadPitch * ((float)Math.PI / 180f);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer,int packedLight,int packedOverlay, int color){
        body.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
    }
}
