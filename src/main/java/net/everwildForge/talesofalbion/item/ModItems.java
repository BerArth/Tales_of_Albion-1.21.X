package net.everwildForge.talesofalbion.item;

import net.everwildForge.talesofalbion.TalesofAlbion;
import net.everwildForge.talesofalbion.block.ModBlocks;
import net.everwildForge.talesofalbion.item.custom.SilverSwordItem;
import net.minecraft.world.item.*;
import net.everwildForge.talesofalbion.entity.ModEntities;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
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

    public static final RegistryObject<Item> SILVER_PENNIG = ITEMS.register("silver_pennig",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SILVERINLAID_IRON_SWORD = ITEMS.register("silverinlaid_iron_sword",
            () -> new SilverSwordItem(Tiers.IRON, new Item.Properties()
                    .attributes(SwordItem.m_322253_(Tiers.IRON, 6, -1.6f)), 100f));

    public static final RegistryObject<Item> SILVERINLAID_GOLDEN_SWORD = ITEMS.register("silverinlaid_golden_sword",
            () -> new SilverSwordItem(Tiers.GOLD, new Item.Properties()
                    .attributes(SwordItem.m_322253_(Tiers.IRON, 4, -1.6f)), 10f));

    public static final RegistryObject<Item> SILVERINLAID_DIAMOND_SWORD = ITEMS.register("silverinlaid_diamond_sword",
            () -> new SilverSwordItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(SwordItem.m_322253_(Tiers.IRON, 7, -1.6f)), 20f));

    //Animals eggs
    public static final RegistryObject<Item> BADGER_SPAWN_EGG = ITEMS.register("badger_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.BADGER,0xa09784,0x2a2a2a,new Item.Properties()));

    public static final RegistryObject<Item> RED_DEER_MALE_SPAWN_EGG = ITEMS.register("red_deer_male_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.REDDEERM,0xa09751,0x47a2a2,new Item.Properties()));
 public static final RegistryObject<Item> RED_DEER_FEMALE_SPAWN_EGG = ITEMS.register("red_deer_female_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.REDDEERF,0xa09751,0x48a2a2,new Item.Properties()));


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}
