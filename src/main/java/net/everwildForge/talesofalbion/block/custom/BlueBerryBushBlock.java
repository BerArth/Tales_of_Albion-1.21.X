package net.everwildForge.talesofalbion.block.custom;

import net.everwildForge.talesofalbion.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;

public class BlueBerryBushBlock extends SweetBerryBushBlock {
    public BlueBerryBushBlock(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack m_7397_(LevelReader levelReader, BlockPos blockPos, BlockState blockState) {
        return new ItemStack(ModItems.BLUE_BERRIES.get());
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState p_330186_, Level p_334365_, BlockPos p_328580_, Player p_332233_, BlockHitResult p_329481_) {
        int i = p_330186_.getValue(AGE);
        boolean flag = i == 3;
        if (i > 1) {
            int j = 1 + p_334365_.random.nextInt(2);
            popResource(p_334365_, p_328580_, new ItemStack(ModItems.BLUE_BERRIES.get(), j + (flag ? 1 : 0)));
            p_334365_.playSound(null, p_328580_, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1.0F, 0.8F + p_334365_.random.nextFloat() * 0.4F);
            BlockState blockstate = p_330186_.setValue(AGE, Integer.valueOf(1));
            p_334365_.setBlock(p_328580_, blockstate, 2);
            p_334365_.gameEvent(GameEvent.BLOCK_CHANGE, p_328580_, GameEvent.Context.of(p_332233_, blockstate));
            return InteractionResult.m_19078_(p_334365_.isClientSide);
        } else {
            return super.useWithoutItem(p_330186_, p_334365_, p_328580_, p_332233_, p_329481_);
        }
    }

}
