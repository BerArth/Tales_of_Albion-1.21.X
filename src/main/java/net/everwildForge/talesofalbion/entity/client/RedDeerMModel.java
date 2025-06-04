package net.everwildForge.talesofalbion.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.everwildForge.talesofalbion.TalesofAlbion;
import net.everwildForge.talesofalbion.entity.custom.BadgerEntity;
import net.everwildForge.talesofalbion.entity.custom.RedDeerMEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class RedDeerMModel<T extends RedDeerMEntity> extends HierarchicalModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(TalesofAlbion.MOD_ID, "reddeer"), "main");

    private final ModelPart deer;
    private final ModelPart body;
    private final ModelPart torso;
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
    private final ModelPart rightantler;
    private final ModelPart base;
    private final ModelPart mid;
    private final ModelPart stub;
    private final ModelPart stub2;
    private final ModelPart stub3;
    private final ModelPart end;
    private final ModelPart stub4;
    private final ModelPart leftantler;
    private final ModelPart base2;
    private final ModelPart deer_sub_23;
    private final ModelPart mid2;
    private final ModelPart deer_sub_25;
    private final ModelPart stub5;
    private final ModelPart deer_sub_27;
    private final ModelPart stub6;
    private final ModelPart deer_sub_29;
    private final ModelPart stub7;
    private final ModelPart deer_sub_31;
    private final ModelPart end2;
    private final ModelPart deer_sub_33;
    private final ModelPart stub8;
    private final ModelPart deer_sub_35;


    public RedDeerMModel(ModelPart root) {
        this.body = this.deer.getChild("body");
        this.head = this.skull.getChild("head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition deer = partdefinition.addOrReplaceChild("deer", CubeListBuilder.create(), PartPose.offset(-1.0F, 5.0F, 0.0F));

        PartDefinition body = deer.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -3.0F, -2.0F, 10.0F, 10.0F, 14.0F, new CubeDeformation(0.0F))
                .texOffs(8, 9).addBox(-1.0F, -3.0F, 12.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -1.0F, 2.0F));

        PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(31, 37).addBox(-5.0F, -5.5F, -4.5F, 10.0F, 11.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.5F, -6.5F));

        PartDefinition rightlegfront = deer.addOrReplaceChild("rightlegfront", CubeListBuilder.create().texOffs(0, 46).addBox(0.0F, -1.0F, -1.0F, 2.0F, 13.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 7.0F, -7.0F));

        PartDefinition leftlegfront = deer.addOrReplaceChild("leftlegfront", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-2.0F, -1.0F, -1.0F, 2.0F, 13.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, 7.0F, -7.0F));

        PartDefinition rightlegback = deer.addOrReplaceChild("rightlegback", CubeListBuilder.create().texOffs(45, 21).addBox(-1.0F, -1.0F, -1.0F, 3.0F, 13.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 7.0F, 11.0F));

        PartDefinition leftlegback = deer.addOrReplaceChild("leftlegback", CubeListBuilder.create().texOffs(45, 21).mirror().addBox(-2.0F, -1.0F, -1.0F, 3.0F, 13.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, 7.0F, 11.0F));

        PartDefinition neckhead = deer.addOrReplaceChild("neckhead", CubeListBuilder.create(), PartPose.offset(1.0F, -1.0F, -5.75F));

        PartDefinition neck = neckhead.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(0, 24).addBox(-3.0F, -1.5845F, -10.4632F, 6.0F, 8.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9599F, 0.0F, 0.0F));

        PartDefinition skull = neckhead.addOrReplaceChild("skull", CubeListBuilder.create(), PartPose.offset(0.0F, -7.5F, -5.25F));

        PartDefinition head = skull.addOrReplaceChild("head", CubeListBuilder.create().texOffs(34, 0).addBox(-2.5F, -2.2507F, -10.0831F, 5.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.0F, 0.3491F, 0.0F, 0.0F));

        PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(26, 24).addBox(-2.0F, -0.0977F, -3.0317F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0843F, -7.144F, -0.3491F, 0.0F, 0.0F));

        PartDefinition rightear = head.addOrReplaceChild("rightear", CubeListBuilder.create().texOffs(0, 24).addBox(-4.3246F, -0.9112F, -0.0979F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -0.7121F, -0.6957F, -0.211F, 0.056F, 0.2559F));

        PartDefinition leftear = head.addOrReplaceChild("leftear", CubeListBuilder.create().texOffs(0, 24).mirror().addBox(-0.6754F, -0.9112F, -0.0979F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0F, -0.7121F, -0.6957F, -0.211F, -0.056F, -0.2559F));

        PartDefinition rightantler = skull.addOrReplaceChild("rightantler", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.25F, -5.0F, 0.0F, -0.5144F, 0.2507F, -1.1571F));

        PartDefinition base = rightantler.addOrReplaceChild("base", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 1.0F, 0.0F));

        PartDefinition mid = rightantler.addOrReplaceChild("mid", CubeListBuilder.create().texOffs(8, 0).addBox(-2.4078F, -10.2056F, -1.25F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(26, 24).addBox(-2.4078F, -12.2056F, -1.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1309F, -6.4156F, 0.0F, -0.1446F, 0.27F, 0.5912F));

        PartDefinition stub = rightantler.addOrReplaceChild("stub", CubeListBuilder.create().texOffs(26, 32).addBox(-0.3489F, -0.2698F, -0.7823F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2407F, 0.7823F, -0.6428F, -1.4518F, 0.734F, 0.1767F));

        PartDefinition stub2 = rightantler.addOrReplaceChild("stub2", CubeListBuilder.create().texOffs(0, 29).addBox(-1.1342F, 1.8095F, -0.5382F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.887F, -1.2118F, 0.0F, -1.9443F, 0.8582F, -0.4779F));

        PartDefinition stub3 = rightantler.addOrReplaceChild("stub3", CubeListBuilder.create().texOffs(26, 30).addBox(-4.6114F, 0.3324F, 0.6692F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8609F, -8.5932F, -1.9658F, -1.9771F, 0.5862F, -0.6883F));

        PartDefinition end = rightantler.addOrReplaceChild("end", CubeListBuilder.create().texOffs(0, 31).addBox(-0.5F, -5.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7101F, -15.2262F, 1.2093F, -0.3798F, 0.288F, 1.1787F));

        PartDefinition stub4 = rightantler.addOrReplaceChild("stub4", CubeListBuilder.create().texOffs(0, 27).addBox(-3.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1541F, -16.6251F, -0.9529F, -1.4971F, 0.5862F, -0.6883F));

        PartDefinition leftantler = skull.addOrReplaceChild("leftantler", CubeListBuilder.create(), PartPose.offsetAndRotation(1.25F, -5.0F, 0.0F, -0.5144F, -0.2507F, 1.1571F));

        PartDefinition base2 = leftantler.addOrReplaceChild("base2", CubeListBuilder.create(), PartPose.offset(1.0F, 1.0F, 0.0F));

        PartDefinition deer_sub_23 = base2.addOrReplaceChild("deer_sub_23", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition mid2 = leftantler.addOrReplaceChild("mid2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1309F, -6.4156F, 0.0F, -0.1446F, -0.27F, -0.5912F));

        PartDefinition deer_sub_25 = mid2.addOrReplaceChild("deer_sub_25", CubeListBuilder.create().texOffs(8, 0).mirror().addBox(0.4078F, -10.2056F, -1.25F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(26, 24).mirror().addBox(1.4078F, -12.2056F, -1.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition stub5 = leftantler.addOrReplaceChild("stub5", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2407F, 0.7823F, -0.6428F, -1.4518F, -0.734F, -0.1767F));

        PartDefinition deer_sub_27 = stub5.addOrReplaceChild("deer_sub_27", CubeListBuilder.create().texOffs(26, 32).mirror().addBox(-6.6511F, -0.2698F, -0.7823F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition stub6 = leftantler.addOrReplaceChild("stub6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.887F, -1.2118F, 0.0F, -1.9443F, -0.8582F, 0.4779F));

        PartDefinition deer_sub_29 = stub6.addOrReplaceChild("deer_sub_29", CubeListBuilder.create().texOffs(0, 29).mirror().addBox(-3.8658F, 1.8095F, -0.5382F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition stub7 = leftantler.addOrReplaceChild("stub7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8609F, -8.5932F, -1.9658F, -1.9771F, -0.5862F, 0.6883F));

        PartDefinition deer_sub_31 = stub7.addOrReplaceChild("deer_sub_31", CubeListBuilder.create().texOffs(26, 30).mirror().addBox(-2.3886F, 0.3324F, 0.6692F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition end2 = leftantler.addOrReplaceChild("end2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7101F, -15.2262F, 1.2093F, -0.3798F, -0.288F, -1.1787F));

        PartDefinition deer_sub_33 = end2.addOrReplaceChild("deer_sub_33", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-0.5F, -5.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition stub8 = leftantler.addOrReplaceChild("stub8", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.1541F, -16.6251F, -0.9529F, -1.4971F, -0.5862F, 0.6883F));

        PartDefinition deer_sub_35 = stub8.addOrReplaceChild("deer_sub_35", CubeListBuilder.create().texOffs(0, 27).mirror().addBox(-1.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        deer.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

}
