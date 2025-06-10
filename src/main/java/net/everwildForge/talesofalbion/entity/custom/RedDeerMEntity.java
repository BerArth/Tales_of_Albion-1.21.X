package net.everwildForge.talesofalbion.entity.custom;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class RedDeerMEntity extends Animal {

    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    public RedDeerMEntity(EntityType<? extends Animal> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 2.0));
        this.goalSelector.addGoal(2, new TemptGoal(this, 1.25, stack -> stack.is(Items.WHEAT), false));
        this.goalSelector.addGoal(3, new FollowParentGoal(this, 1.25));
        this.goalSelector.addGoal(5, new WaterAvoidingRandomStrollGoal(this, 1.0));
        this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));
    }

    public static AttributeSupplier.Builder createAttributes(){
        return Animal.createMobAttributes()
                //Les attributs sont très nombreux, se référer à Sam pour les attributs à renseigner
                .add(Attributes.MAX_HEALTH,25.0D)
                .add(Attributes.MOVEMENT_SPEED,0.40D)
                .add(Attributes.ARMOR,1.0D)
                .add(Attributes.FOLLOW_RANGE,15.0D)
                .add(Attributes.ATTACK_DAMAGE,5.0D)
                .add(Attributes.ATTACK_SPEED,2.0D)
                ;
    }

    @Override
    public boolean isFood(ItemStack pStack) {
        return pStack.is(Items.WHEAT);
    }

    @Override
    public @Nullable AgeableMob getBreedOffspring(ServerLevel pLevel, AgeableMob pOtherParent) {
        return null;
    }

    //ce code est à garder tel quel et sert à ce que les
    // animations ne se stackent pas les unes sur les autres
    // SAUF pour le this.idleAnimationTimeout
    private void setupAnimationStates(){
        if (this.idleAnimationTimeout > 0){
            this.idleAnimationTimeout -= 1;
        }
        else {
            //idleAnimationTimeout doit être égal à la durée de l'animation (en vingtième de secondes)
            //ici idleAnimationTimeout = 20 -> l'animation dure 1 seconde
            this.idleAnimationTimeout = 80;
            this.idleAnimationState.start(this.tickCount);
        }
    }

    //ce morceau sert à la fonction au dessus
    @Override
    public void tick() {
        super.tick();
        if (this.level().isClientSide()){
            this.setupAnimationStates();
        }
    }

}
