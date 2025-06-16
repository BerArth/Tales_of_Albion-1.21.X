package net.everwildForge.talesofalbion.entity.goals;

import net.everwildForge.talesofalbion.entity.custom.RedDeerMEntity;
import net.minecraft.world.entity.ai.goal.Goal;

public class EatGrassGoal extends Goal {

    private final RedDeerMEntity deer;
    private int eatGrassTimer;

    public EatGrassGoal(RedDeerMEntity deer) {
        this.deer = deer;
    }

    @Override
    public boolean canUse() {
        return deer.onGround()
                && deer.level().getBlockState(deer.blockPosition().below()).is(net.minecraft.world.level.block.Blocks.GRASS_BLOCK)
                && deer.getRandom().nextInt(300) == 0; // ~1 fois toutes les 15 sec
    }

    @Override
    public void start() {
        this.eatGrassTimer = 40;
        deer.getNavigation().stop();
        if (deer.level().isClientSide()) {
            deer.eatAnimationState.start(deer.tickCount); // ✅ déclenche animation
        }
    }

    @Override
    public void tick() {
        this.eatGrassTimer--;
        if (eatGrassTimer == 4 && !deer.level().isClientSide()) {
            var pos = deer.blockPosition().below();
            if (deer.level().getBlockState(pos).is(net.minecraft.world.level.block.Blocks.GRASS_BLOCK)) {
                deer.level().destroyBlock(pos, false);
            }
        }
    }

    @Override
    public boolean canContinueToUse() {
        return this.eatGrassTimer > 0;
    }

}
