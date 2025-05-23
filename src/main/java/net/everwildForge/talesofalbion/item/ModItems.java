package net.everwildForge.talesofalbion.item;

import net.everwildForge.talesofalbion.TalesofAlbion;
import net.everwildForge.talesofalbion.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TalesofAlbion.MOD_ID);

    //C'est ici que les nouveau items doivent etre mis
    //Pour l'exemple ici l'item a ajouter dans le jeu sera "test"
    //-------------------Exemple----------------------------
    //public static final RegistryObject<Item> TEST = ITEMS.register("test", () -> new Item(new Item.Properties()));
    //------------------------------------------------------
    //Mettre les nouveaux blocs en dessous
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new  Item.Properties()));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DAUB_BALL = ITEMS.register("daub_ball", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HEATHER = ITEMS.register("heather",
            () -> new BlockItem(ModBlocks.HEATHER.get(), new Item.Properties()));

    public static final RegistryObject<Item> CHALK_POWDER = ITEMS.register("chalk_powder", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRIED_PEAT = ITEMS.register("dried_peat", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLUE_BERRIES = ITEMS.register("blue_berries",
            () -> new ItemNameBlockItem(ModBlocks.BLUE_BERRY_BUSH.get(), new Item.Properties().food(ModFoodProperties.BLUE_BERRIES)));


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}
