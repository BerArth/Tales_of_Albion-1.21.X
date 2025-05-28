package net.everwildForge.talesofalbion.item.custom;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class SilverSwordItem extends SwordItem {

    private final float damage;

    public SilverSwordItem(Tier tier,  Properties properties, float damage) {
        super(tier, properties);
        this.damage = damage;
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (target.getType() == EntityType.IRON_GOLEM) {
            target.hurt(target.damageSources().mobAttack(attacker), damage);
        }

        return super.hurtEnemy(stack, target, attacker);
    }

}
