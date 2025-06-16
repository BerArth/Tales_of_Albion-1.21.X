package net.everwildForge.talesofalbion.entity.client;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

public class RedDeerFAnimations {

        public static final AnimationDefinition idle = AnimationDefinition.Builder.withLength(12.0F).looping()
                .addAnimation("neck", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(8.875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(10.25F, KeyframeAnimations.degreeVec(0.0081F, -7.499F, -0.1234F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(10.75F, KeyframeAnimations.degreeVec(0.0081F, -7.499F, -0.1234F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(12.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("neck", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("neck", new AnimationChannel(AnimationChannel.Targets.SCALE,
                        new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("skull", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.9167F, KeyframeAnimations.degreeVec(0.0F, -2.2F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(2.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(8.875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(10.25F, KeyframeAnimations.degreeVec(0.0F, -10.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(10.75F, KeyframeAnimations.degreeVec(0.0F, -10.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(12.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("skull", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.9167F, KeyframeAnimations.posVec(0.15F, 0.0F, 0.01F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(2.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(8.875F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(10.25F, KeyframeAnimations.posVec(0.697F, 0.0F, 0.0347F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(10.75F, KeyframeAnimations.posVec(0.697F, 0.0F, 0.0347F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(12.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("skull", new AnimationChannel(AnimationChannel.Targets.SCALE,
                        new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.9167F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(2.5F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(8.875F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(12.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("rightear", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.625F, KeyframeAnimations.degreeVec(-2.2897F, 45.1402F, -4.3954F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.7083F, KeyframeAnimations.degreeVec(-7.6117F, 12.9096F, -22.1067F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.8333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("rightear", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.8333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("rightear", new AnimationChannel(AnimationChannel.Targets.SCALE,
                        new Keyframe(1.5F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.8333F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("torso", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(8.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(12.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("torso", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(8.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(12.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("torso", new AnimationChannel(AnimationChannel.Targets.SCALE,
                        new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(2.0F, KeyframeAnimations.scaleVec(1.0382F, 1.0132F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(4.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(6.0F, KeyframeAnimations.scaleVec(1.0382F, 1.0132F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(8.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(10.0F, KeyframeAnimations.scaleVec(1.0382F, 1.0132F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(12.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("rightlegfront", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("leftlegfront", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("rightlegback", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("leftlegback", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(8.875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(12.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("head", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("head", new AnimationChannel(AnimationChannel.Targets.SCALE,
                        new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("neckhead", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(2.0F, KeyframeAnimations.degreeVec(-1.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(4.375F, KeyframeAnimations.degreeVec(-0.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(4.625F, KeyframeAnimations.degreeVec(-5.5358F, 7.4997F, -0.0699F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(5.4583F, KeyframeAnimations.degreeVec(-5.5358F, 7.4997F, -0.0699F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(6.0F, KeyframeAnimations.degreeVec(-1.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(8.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(10.0F, KeyframeAnimations.degreeVec(-1.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(10.25F, KeyframeAnimations.degreeVec(0.0F, -15.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(10.75F, KeyframeAnimations.degreeVec(0.0F, -15.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(12.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("neckhead", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(4.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(6.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(8.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(10.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(10.75F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(12.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("neckhead", new AnimationChannel(AnimationChannel.Targets.SCALE,
                        new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(4.375F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(12.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .build();

        public static final AnimationDefinition walk = AnimationDefinition.Builder.withLength(1.5F).looping()
                .addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.09F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.2083F, KeyframeAnimations.degreeVec(-1.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5F, KeyframeAnimations.degreeVec(1.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.7083F, KeyframeAnimations.degreeVec(0.09F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.9583F, KeyframeAnimations.degreeVec(-1.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.2917F, KeyframeAnimations.degreeVec(1.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.09F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("rightlegfront", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(35.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.375F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.75F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.125F, KeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.5F, KeyframeAnimations.degreeVec(35.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("rightlegfront", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, 0.25F, -1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 1.25F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.25F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("leftlegfront", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.375F, KeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.75F, KeyframeAnimations.degreeVec(35.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.125F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.5F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("leftlegfront", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 1.25F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, 0.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.25F, -1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("rightlegback", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.375F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.75F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.0417F, KeyframeAnimations.degreeVec(17.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.5F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("rightlegback", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -2.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, 0.25F, -2.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, 0.0F, 1.5F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.0417F, KeyframeAnimations.posVec(0.0F, 0.75F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -2.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("leftlegback", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.2917F, KeyframeAnimations.degreeVec(17.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.75F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.125F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.5F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("leftlegback", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 1.5F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.2917F, KeyframeAnimations.posVec(0.0F, 0.75F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, 0.0F, -2.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.25F, -2.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 2.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("neck", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(3.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.5F, KeyframeAnimations.degreeVec(3.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("neck", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.2F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.2083F, KeyframeAnimations.posVec(0.0F, 0.45F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, -0.11F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.9583F, KeyframeAnimations.posVec(0.0F, 0.45F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.2917F, KeyframeAnimations.posVec(0.0F, -0.11F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.2F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("skull", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(1.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.5F, KeyframeAnimations.degreeVec(1.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("skull", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.15F, -0.25F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.2083F, KeyframeAnimations.posVec(0.0F, 0.1F, -0.25F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, -0.46F, -0.25F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.9583F, KeyframeAnimations.posVec(0.0F, 0.1F, -0.25F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.2917F, KeyframeAnimations.posVec(0.0F, -0.46F, -0.25F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, -0.15F, -0.25F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.SCALE,
                        new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("rightear", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.75F, KeyframeAnimations.degreeVec(-5.0F, 7.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("leftear", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.375F, KeyframeAnimations.degreeVec(-5.0F, -7.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .build();

        public static final AnimationDefinition run = AnimationDefinition.Builder.withLength(0.7917F).looping()
                .addAnimation("deer", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.1667F, KeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.3333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5417F, KeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.7917F, KeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("deer", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.4167F, KeyframeAnimations.posVec(0.0F, 1.27F, -0.0032F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5417F, KeyframeAnimations.posVec(0.0F, 2.999F, 0.0436F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5833F, KeyframeAnimations.posVec(0.0F, 3.17F, 0.0262F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.6667F, KeyframeAnimations.posVec(0.0F, 1.3495F, -0.0062F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.7917F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.4167F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.4583F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5417F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.6667F, KeyframeAnimations.degreeVec(-4.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.7917F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("body", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.4167F, KeyframeAnimations.posVec(0.0F, -0.9976F, -0.0654F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.4583F, KeyframeAnimations.posVec(0.0F, -1.4981F, -0.1036F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5417F, KeyframeAnimations.posVec(0.0F, -0.9981F, -0.0636F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.6667F, KeyframeAnimations.posVec(0.0F, -0.8985F, -0.0692F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.7917F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("rightlegfront", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(-52.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.1667F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.3333F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5417F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.7917F, KeyframeAnimations.degreeVec(-52.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("rightlegfront", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.5635F, -0.7036F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.1667F, KeyframeAnimations.posVec(0.0F, 0.3592F, -0.7263F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.3333F, KeyframeAnimations.posVec(0.0F, 1.4F, -1.23F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5417F, KeyframeAnimations.posVec(0.0F, 3.3545F, -3.3163F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.7917F, KeyframeAnimations.posVec(0.0F, 0.5635F, -0.7036F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("leftlegfront", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(-42.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.1667F, KeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.3333F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5417F, KeyframeAnimations.degreeVec(-22.5223F, 2.2174F, -1.1549F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.7917F, KeyframeAnimations.degreeVec(-42.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("leftlegfront", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.5635F, -0.7036F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.1667F, KeyframeAnimations.posVec(0.0F, 0.5211F, 0.2917F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.3333F, KeyframeAnimations.posVec(0.0F, 1.56F, -1.71F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5417F, KeyframeAnimations.posVec(0.0F, 2.5591F, -2.7536F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.7917F, KeyframeAnimations.posVec(0.0F, 0.5635F, -0.7036F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("rightlegback", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(55.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.1667F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.3333F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.4167F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5417F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.7917F, KeyframeAnimations.degreeVec(55.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("rightlegback", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.7347F, 3.0757F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.1667F, KeyframeAnimations.posVec(0.0F, 2.2324F, 3.102F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.3333F, KeyframeAnimations.posVec(0.0F, -0.2893F, 1.2091F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.4167F, KeyframeAnimations.posVec(0.0F, -1.5391F, 1.2309F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5417F, KeyframeAnimations.posVec(0.0F, -0.6594F, 2.919F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.7917F, KeyframeAnimations.posVec(0.0F, 0.7347F, 3.0757F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("leftlegback", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.1667F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.3333F, KeyframeAnimations.degreeVec(-17.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5417F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.7917F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("leftlegback", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.7347F, 3.0757F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.1667F, KeyframeAnimations.posVec(0.0F, 1.7727F, 2.1246F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.3333F, KeyframeAnimations.posVec(0.0F, -0.9197F, 0.278F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.4583F, KeyframeAnimations.posVec(0.0F, -0.8066F, 1.1918F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5417F, KeyframeAnimations.posVec(0.0F, 0.0938F, 1.7901F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.7917F, KeyframeAnimations.posVec(0.0F, 0.7347F, 3.0757F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("skull", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.1667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.6667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("skull", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.1667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.249F, -0.0218F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.6667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("skull", new AnimationChannel(AnimationChannel.Targets.SCALE,
                        new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.1667F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.6667F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("rightear", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.1667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5F, KeyframeAnimations.degreeVec(4.4234F, -3.1424F, -4.4097F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5833F, KeyframeAnimations.degreeVec(2.8582F, 2.1695F, 7.639F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.6667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("rightear", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.1667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.6667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("rightear", new AnimationChannel(AnimationChannel.Targets.SCALE,
                        new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.1667F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.6667F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("leftear", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.1667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5F, KeyframeAnimations.degreeVec(4.4234F, 3.1424F, 4.4097F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5833F, KeyframeAnimations.degreeVec(2.8582F, -2.1695F, -7.639F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.6667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("leftear", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.1667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.6667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("leftear", new AnimationChannel(AnimationChannel.Targets.SCALE,
                        new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.1667F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.6667F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("neckhead", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.1667F, KeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5417F, KeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.6667F, KeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.7917F, KeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("neckhead", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.1089F, 1.2452F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5417F, KeyframeAnimations.posVec(0.0F, 0.4095F, 0.9782F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.6667F, KeyframeAnimations.posVec(0.0F, 0.41F, 1.03F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.7917F, KeyframeAnimations.posVec(0.0F, -0.1089F, 1.2452F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("neckhead", new AnimationChannel(AnimationChannel.Targets.SCALE,
                        new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .build();

        public static final AnimationDefinition eat = AnimationDefinition.Builder.withLength(5.0F).looping()
                .addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.5F, KeyframeAnimations.degreeVec(8.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(2.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(2.5F, KeyframeAnimations.degreeVec(8.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(3.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(3.5F, KeyframeAnimations.degreeVec(8.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(4.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(5.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("body", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, -1.5F, -0.5F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, -1.5F, -0.5F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(5.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("body", new AnimationChannel(AnimationChannel.Targets.SCALE,
                        new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(5.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("torso", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(5.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("torso", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(5.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("torso", new AnimationChannel(AnimationChannel.Targets.SCALE,
                        new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(2.5F, KeyframeAnimations.scaleVec(1.1F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(5.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("rightlegfront", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(4.0F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(4.5F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(4.75F, KeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(5.0F, KeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("rightlegfront", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 1.0812F, -2.8873F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(4.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(4.75F, KeyframeAnimations.posVec(0.0F, 0.7166F, -0.782F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(5.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("leftlegfront", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -2.5F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -2.5F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(19.9825F, 0.8548F, -2.3494F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(4.0F, KeyframeAnimations.degreeVec(19.9825F, 0.8548F, -2.3494F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(4.25F, KeyframeAnimations.degreeVec(19.9825F, 0.8548F, -2.3494F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(4.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -2.5F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(5.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -2.5F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("leftlegfront", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, 0.38F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, -0.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, -0.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(4.25F, KeyframeAnimations.posVec(0.0F, -0.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(4.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("leftlegback", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(5.0F, KeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("neck", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(5.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("neck", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(5.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("neck", new AnimationChannel(AnimationChannel.Targets.SCALE,
                        new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(5.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("skull", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.5F, KeyframeAnimations.degreeVec(-20.064F, 7.4355F, -0.9845F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(2.0F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(2.5F, KeyframeAnimations.degreeVec(-20.064F, -7.4355F, 0.9845F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(3.0F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(3.5F, KeyframeAnimations.degreeVec(-20.064F, 7.4355F, -0.9845F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(4.0F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(5.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("skull", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, -0.7512F, -0.011F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -0.7512F, -0.011F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(3.0F, KeyframeAnimations.posVec(0.0F, -0.7512F, -0.011F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, -0.7512F, -0.011F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(5.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("skull", new AnimationChannel(AnimationChannel.Targets.SCALE,
                        new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(5.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.5F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(2.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(2.5F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(3.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(3.5F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(4.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0029F, -0.0216F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.2479F, 0.0126F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0029F, -0.0216F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(2.5F, KeyframeAnimations.posVec(0.0F, 0.2479F, 0.0126F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(3.0F, KeyframeAnimations.posVec(0.0F, 0.0029F, -0.0216F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(3.5F, KeyframeAnimations.posVec(0.0F, 0.2479F, 0.0126F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 0.0029F, -0.0216F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("neckhead", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(97.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.5F, KeyframeAnimations.degreeVec(95.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(2.0F, KeyframeAnimations.degreeVec(97.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(2.5F, KeyframeAnimations.degreeVec(95.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(3.0F, KeyframeAnimations.degreeVec(97.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(3.5F, KeyframeAnimations.degreeVec(95.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(4.0F, KeyframeAnimations.degreeVec(97.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(5.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("neckhead", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, -3.7553F, -5.4626F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -3.7553F, -5.4626F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(3.0F, KeyframeAnimations.posVec(0.0F, -3.7553F, -5.4626F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, -3.7553F, -5.4626F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(5.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("neckhead", new AnimationChannel(AnimationChannel.Targets.SCALE,
                        new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(5.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .build();

}
