package net.everwildForge.talesofalbion;

import com.mojang.logging.LogUtils;
import net.everwildForge.talesofalbion.block.ModBlocks;
import net.everwildForge.talesofalbion.entity.ModEntities;
import net.everwildForge.talesofalbion.entity.client.BadgerRenderer;
import net.everwildForge.talesofalbion.entity.custom.BadgerEntity;
import net.everwildForge.talesofalbion.item.ModCreativeModeTabs;
import net.everwildForge.talesofalbion.item.ModItems;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TalesofAlbion.MOD_ID)
public class TalesofAlbion
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "talesofalbion";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public TalesofAlbion()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        //Pour les animaux et mobs
        ModEntities.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(ModBlocks::registerFlammables);
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        //ici on ajoute l'item dans le l'inventaire créatif(ici dans la section ingredient)
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS){
            event.accept(ModItems.SILVER_INGOT);
            event.accept(ModItems.RAW_SILVER);
            event.accept(ModItems.SILVER_NUGGET);

            event.accept(ModItems.DAUB_BALL);

            event.accept(ModItems.CHALK_POWDER);

            event.accept(ModItems.DRIED_PEAT);

            event.accept(ModItems.BLUE_BERRIES);
        }

        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS){
            event.accept(ModBlocks.SILVER_BLOCK);
            event.accept(ModBlocks.THATCH_BLOCK);
            event.accept(ModBlocks.THATCH_STAIRS);
            event.accept(ModBlocks.LATTICE_THATCH_BLOCK);
            event.accept(ModBlocks.LATTICE_THATCH_STAIRS);
            event.accept(ModBlocks.CHALK_STONE);
            event.accept(ModBlocks.CHALK_STONE_BRICKS);


            event.accept(ModBlocks.STRIPPED_ALDER_WOOD);
            event.accept(ModBlocks.ALDER_WOOD);
            event.accept(ModBlocks.STRIPPED_ALDER_LOG);
            event.accept(ModBlocks.ALDER_LOG);
            event.accept(ModBlocks.ALDER_PLANKS);
            event.accept(ModBlocks.ALDER_STAIRS);
            event.accept(ModBlocks.ALDER_SLAB);
            event.accept(ModBlocks.ALDER_PRESSURE_PLATE);
            event.accept(ModBlocks.ALDER_BUTTON);
            event.accept(ModBlocks.ALDER_FENCE);
            event.accept(ModBlocks.ALDER_FENCE_GATE);
            event.accept(ModBlocks.ALDER_DOOR);
            event.accept(ModBlocks.ALDER_TRAP_DOOR);


            event.accept(ModBlocks.WATTLE_N_DAUB_PLAIN);
            event.accept(ModBlocks.WATTLE_N_DAUB_DIAGONAL);
            event.accept(ModBlocks.WATTLE_N_DAUB_FRAMED);
            event.accept(ModBlocks.WATTLE_N_DAUB_SIDED);

            event.accept(ModBlocks.BEECH_LOG);
            event.accept(ModBlocks.BEECH_PLANKS);
            event.accept(ModBlocks.BEECH_WOOD);
            event.accept(ModBlocks.STRIPPED_BEECH_LOG);
            event.accept(ModBlocks.STRIPPED_BEECH_WOOD);
            event.accept(ModBlocks.BEECH_PLANKS);
            event.accept(ModBlocks.BEECH_STAIRS);
            event.accept(ModBlocks.BEECH_SLAB);
            event.accept(ModBlocks.BEECH_PRESSURE_PLATE);
            event.accept(ModBlocks.BEECH_BUTTON);
            event.accept(ModBlocks.BEECH_FENCE);
            event.accept(ModBlocks.BEECH_FENCE_GATE);
            event.accept(ModBlocks.BEECH_DOOR);
            event.accept(ModBlocks.BEECH_TRAP_DOOR);
        }

        if(event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS){
            event.accept(ModBlocks.SILVER_ORE);
            event.accept(ModBlocks.DEEPSLATE_SILVER_ORE);
            event.accept(ModBlocks.RAW_SILVER_BLOCK);

            event.accept(ModItems.HEATHER);

            event.accept(ModBlocks.CHALK_BLOCK);

            event.accept(ModBlocks.ALDER_SAPLING);
            event.accept(ModBlocks.ALDER_LEAVES);

            event.accept(ModBlocks.BEECH_SAPLING);
            event.accept(ModBlocks.BEECH_LEAVES);

            event.accept(ModBlocks.PEAT_DIRT);
            event.accept(ModBlocks.PEAT_GRASS);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HEATHER.get(), RenderType.cutout());
            //Register Mobs here :
            EntityRenderers.register(ModEntities.BADGER.get(), BadgerRenderer::new);
        }
    }
}
