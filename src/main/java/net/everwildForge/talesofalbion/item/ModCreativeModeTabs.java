package net.everwildForge.talesofalbion.item;

import net.everwildForge.talesofalbion.TalesofAlbion;
import net.everwildForge.talesofalbion.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TalesofAlbion.MOD_ID);


    public static final RegistryObject<CreativeModeTab> SILVER_ITEMS_TABS = CREATIVE_MODE_TABS.register("silver_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SILVER_INGOT.get()))
                    .title(Component.translatable("creativetab.talesofalbion.silver_items"))
                    .displayItems(((pParameters, pOutput) -> {

                        pOutput.accept(new ItemStack(ModItems.SILVER_INGOT.get()));
                        pOutput.accept(new ItemStack(ModItems.RAW_SILVER.get()));
                        pOutput.accept(new ItemStack(ModItems.SILVER_NUGGET.get()));

                    })).build());

    public static final RegistryObject<CreativeModeTab> SILVER_BLOCKS_TABS = CREATIVE_MODE_TABS.register("silver_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.SILVER_BLOCK.get()))
                    .withTabsBefore(SILVER_ITEMS_TABS.getId())
                    .title(Component.translatable("creativetab.talesofalbion.silver_blocks"))
                    .displayItems(((pParameters, pOutput) -> {

                        pOutput.accept(new ItemStack(ModBlocks.RAW_SILVER_BLOCK.get()));
                        pOutput.accept(new ItemStack(ModBlocks.SILVER_ORE.get()));
                        pOutput.accept(new ItemStack(ModBlocks.DEEPSLATE_SILVER_ORE.get()));
                        pOutput.accept(new ItemStack(ModBlocks.SILVER_BLOCK.get()));

                    })).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
