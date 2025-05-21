package net.everwildForge.talesofalbion.entity.custom;

import net.everwildForge.talesofalbion.block.ModBlocks;
import net.everwildForge.talesofalbion.entity.ModEntities;
import net.everwildForge.talesofalbion.item.ModItems;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
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
        //Les goals sont les actions que vont chercher à effectuer les mobs.
        //La priorité 0 est LA chose priorisée avant tout dès qu'elle est possible
        this.goalSelector.addGoal(0,new FloatGoal(this));
        this.goalSelector.addGoal(1,new PanicGoal(this,2.0));
        this.goalSelector.addGoal(2, new TemptGoal(this, 1.25, stack -> stack.is(Items.WHEAT), false));

        this.goalSelector.addGoal(3, new AvoidEntityGoal<Villager>(this, Villager.class, 6.0F, 1.0D, 1.5D));
        this.goalSelector.addGoal(4, new FollowParentGoal(this, 1.25));
        this.goalSelector.addGoal(5,new LookAtPlayerGoal(this, Player.class, 5.0F));
        this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));
    }

    public static AttributeSupplier.Builder createAttributes(){
        return Animal.createMobAttributes()
                //Les attributs sont très nombreux, se référer à Sam pour les attributs à renseigner
                .add(Attributes.MAX_HEALTH,10.0D)
                .add(Attributes.MOVEMENT_SPEED,1.0D)
                .add(Attributes.ARMOR,1.0D)
                .add(Attributes.FOLLOW_RANGE,10.0D)
                .add(Attributes.ATTACK_DAMAGE,5.0D)
                .add(Attributes.ATTACK_SPEED,6.0D)
                .add(Attributes.JUMP_STRENGTH,5.0D)
                ;
    }

    @Override
    public boolean isFood(ItemStack pStack) {
        //item considéré comme nourriture
        return pStack.is(Items.WHEAT);
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring (ServerLevel plevel, AgeableMob pOtherParent){
        return ModEntities.BADGER.get().create(plevel);
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
            this.idleAnimationTimeout = 20;
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
