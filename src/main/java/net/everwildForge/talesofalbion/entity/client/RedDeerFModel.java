package net.everwildForge.talesofalbion.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.everwildForge.talesofalbion.TalesofAlbion;
import net.everwildForge.talesofalbion.entity.custom.RedDeerFEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class RedDeerFModel<T extends RedDeerFEntity> extends HierarchicalModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(TalesofAlbion.MOD_ID, "reddeerf"), "main");

    private final ModelPart deer;
    private final ModelPart body;
    private final ModelPart rightlegfront;
    private final ModelPart leftlegfront;
    private final ModelPart rightlegback;
    private final ModelPart leftlegback;
    private final ModelPart neckhead;
    private final ModelPart neck;
    private final ModelPart skull;
    private final ModelPart head;
    private final ModelPart jaw;
    private final ModelPart rightear;
    private final ModelPart leftear;

    public RedDeerFModel(ModelPart root) {
        super(RenderType::entityCutout);
        this.deer = root.getChild("deer");
        this.body = this.deer.getChild("body");
        this.rightlegfront = this.deer.getChild("rightlegfront");
        this.leftlegfront = this.deer.getChild("leftlegfront");
        this.rightlegback = this.deer.getChild("rightlegback");
        this.leftlegback = this.deer.getChild("leftlegback");
        this.neckhead = this.deer.getChild("neckhead");
        this.neck = this.neckhead.getChild("neck");
        this.skull = this.neckhead.getChild("skull");
        this.head = this.skull.getChild("head");
        this.jaw = this.head.getChild("jaw");
        this.rightear = this.head.getChild("rightear");
        this.leftear = this.head.getChild("leftear");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition deer = partdefinition.addOrReplaceChild("deer", CubeListBuilder.create(), PartPose.offset(-1.25F, 5.0F, 0.0F));

        PartDefinition body = deer.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.25F, -4.0F, -11.0F, 9.0F, 10.0F, 23.0F, new CubeDeformation(0.0F))
                .texOffs(0, 33).addBox(-0.75F, -3.0F, 12.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 0.0F, 2.0F));

        PartDefinition rightlegfront = deer.addOrReplaceChild("rightlegfront", CubeListBuilder.create().texOffs(12, 0).addBox(0.0F, -1.0F, -1.0F, 2.0F, 13.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 7.0F, -7.0F));

        PartDefinition leftlegfront = deer.addOrReplaceChild("leftlegfront", CubeListBuilder.create().texOffs(12, 0).mirror().addBox(-1.5F, -1.0F, -1.0F, 2.0F, 13.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, 7.0F, -7.0F));

        PartDefinition rightlegback = deer.addOrReplaceChild("rightlegback", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, -1.0F, 3.0F, 13.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 7.0F, 11.0F));

        PartDefinition leftlegback = deer.addOrReplaceChild("leftlegback", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.0F, -1.0F, -1.0F, 3.0F, 13.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, 7.0F, 11.0F));

        PartDefinition neckhead = deer.addOrReplaceChild("neckhead", CubeListBuilder.create(), PartPose.offset(1.0F, -1.0F, -5.75F));

        PartDefinition neck = neckhead.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(0, 33).addBox(-1.75F, -1.5845F, -10.4632F, 4.0F, 7.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9599F, 0.0F, 0.0F));

        PartDefinition skull = neckhead.addOrReplaceChild("skull", CubeListBuilder.create(), PartPose.offset(0.225F, -7.5F, -5.25F));

        PartDefinition head = skull.addOrReplaceChild("head", CubeListBuilder.create().texOffs(22, 33).addBox(-2.525F, -10.5472F, -12.7035F, 5.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.05F, 6.0F, 6.0F, 0.3491F, 0.0F, 0.0F));

        PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(0, 15).addBox(-1.5F, -0.3729F, -3.3088F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.2977F, -9.4141F, -0.2618F, 0.0F, 0.0F));

        PartDefinition rightear = head.addOrReplaceChild("rightear", CubeListBuilder.create().texOffs(11, 15).addBox(-4.3246F, -1.9112F, -0.0979F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -9.2349F, -2.9145F, -0.211F, 0.1869F, 0.5613F));

        PartDefinition leftear = head.addOrReplaceChild("leftear", CubeListBuilder.create().texOffs(11, 15).mirror().addBox(-0.5377F, -2.1189F, -0.0777F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0F, -9.0F, -3.0F, -0.211F, -0.1695F, -0.5613F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(RedDeerFEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.m_142109_().getAllParts().forEach(ModelPart::resetPose);
        //add the animation to rotate the head towards the player when he is nearby
        this.applyHeadRotation(netHeadYaw, headPitch);

        //method animate walk
        this.m_267799_(RedDeerFAnimations.walk, limbSwing, limbSwingAmount,2f,2f);
        //method animate.3
        this.m_233385_(entity.idleAnimationState, RedDeerFAnimations.idle,ageInTicks,1f);
    }

    private void applyHeadRotation(float pNetHeadYaw, float pNetHeadPitch) {
        pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30f, 30f);
        pNetHeadPitch = Mth.clamp(pNetHeadPitch, -25f, 45f);
        this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180f);
        this.head.xRot = pNetHeadPitch * ((float)Math.PI / 180f);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
        deer.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
    }

    @Override
    public ModelPart m_142109_() {
        return deer;
    }

}
