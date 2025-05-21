package net.everwildForge.talesofalbion.entity.custom;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;

public class BadgerEntity extends Animal {
    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    public BadgerEntity(EntityType<? extends Animal> pEntityType, Level pLevel) {
        super(pEntityType,pLevel);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0,new FloatGoal(this));
        this.goalSelector.addGoal(1,new PanicGoal(this,1.50));
    }

    @Override
    public boolean isFood(ItemStack pstack) {
        return false;
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring (ServerLevel plevel, AgeableMob pOtherParent){
        return null;
    }
}
