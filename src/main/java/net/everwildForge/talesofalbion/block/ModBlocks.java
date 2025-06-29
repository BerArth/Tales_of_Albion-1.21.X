package net.everwildForge.talesofalbion.block;

import net.everwildForge.talesofalbion.TalesofAlbion;
import net.everwildForge.talesofalbion.block.custom.BlueBerryBushBlock;
import net.everwildForge.talesofalbion.block.custom.ModFlammableRotatedPillarBlock;
import net.everwildForge.talesofalbion.block.custom.WattleAndDaubBlock;
import net.everwildForge.talesofalbion.item.ModItems;
import net.everwildForge.talesofalbion.worldgen.tree.ModTreeGrowers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TalesofAlbion.MOD_ID);


    //C'est ici que nous ajoutons les nouveaux blocs au jeu
    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    //Wattlendaub
    public static final RegistryObject<Block> WATTLE_N_DAUB_PLAIN = registerBlock("wattle_n_daub_plain",
            () -> new WattleAndDaubBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> WATTLE_N_DAUB_SIDED = registerBlock("wattle_n_daub_sided",
            () -> new WattleAndDaubBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> WATTLE_N_DAUB_FRAMED = registerBlock("wattle_n_daub_framed",
            () -> new WattleAndDaubBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> WATTLE_N_DAUB_DIAGONAL = registerBlock("wattle_n_daub_diagonal",
            () -> new WattleAndDaubBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));

    //Beech
    public static final RegistryObject<RotatedPillarBlock> BEECH_LOG = registerBlock("beech_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_LOG)));
    public static final RegistryObject<RotatedPillarBlock> BEECH_WOOD = registerBlock("beech_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_WOOD)));
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_BEECH_LOG = registerBlock("stripped_beech_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_BIRCH_LOG)));
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_BEECH_WOOD = registerBlock("stripped_beech_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_BIRCH_WOOD)));
    public static final RegistryObject<Block> BEECH_PLANKS = registerBlock("beech_planks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;}
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;}
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;}
            });
    public static final RegistryObject<Block> BEECH_LEAVES = registerBlock("beech_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;}
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;}
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;}
            });
    public static final RegistryObject<Block> BEECH_SAPLING = registerBlock("beech_sapling",
            () -> new SaplingBlock(ModTreeGrowers.BEECH,BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_SAPLING)));

    public static final RegistryObject<StairBlock> BEECH_STAIRS = registerBlock("beech_stairs",
            () -> new StairBlock(ModBlocks.BEECH_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_STAIRS)));

    public static final RegistryObject<SlabBlock> BEECH_SLAB = registerBlock("beech_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));

    public static final RegistryObject<PressurePlateBlock> BEECH_PRESSURE_PLATE = registerBlock("beech_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.BIRCH, BlockBehaviour.Properties.of().strength(0.5f)));
    public static final RegistryObject<ButtonBlock> BEECH_BUTTON = registerBlock("beech_button",
            () -> new ButtonBlock(BlockSetType.BIRCH, 30, BlockBehaviour.Properties.of().strength(0.5f)
                    .noCollission()));

    public static final RegistryObject<FenceBlock> BEECH_FENCE = registerBlock("beech_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_FENCE)));

    public static final RegistryObject<FenceGateBlock> BEECH_FENCE_GATE = registerBlock("beech_fence_gate",
            () -> new FenceGateBlock(WoodType.BIRCH, BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_FENCE_GATE).sound(SoundType.WOOD)));

    public static final RegistryObject<DoorBlock> BEECH_DOOR = registerBlock("beech_door",
            () -> new DoorBlock(BlockSetType.BIRCH, BlockBehaviour.Properties.of().strength(1f).noCollission()));
    public static final RegistryObject<TrapDoorBlock> BEECH_TRAP_DOOR= registerBlock("beech_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.BIRCH, BlockBehaviour.Properties.of().strength(1f).noOcclusion()));


    public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> THATCH_BLOCK = registerBlock("thatch_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).sound(SoundType.WOOL)));

    public static final RegistryObject<Block> LATTICE_THATCH_BLOCK = registerBlock("lattice_thatch_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).sound(SoundType.WOOL)));

    public static final RegistryObject<StairBlock> THATCH_STAIRS = registerBlock("thatch_stairs",
            () -> new StairBlock(ModBlocks.THATCH_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS).sound(SoundType.WOOL)));

    public static final RegistryObject<StairBlock> LATTICE_THATCH_STAIRS = registerBlock("lattice_thatch_stairs",
            () -> new StairBlock(ModBlocks.THATCH_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS).sound(SoundType.WOOL)));

    public static final RegistryObject<Block> HEATHER = BLOCKS.register("heather",
            ()-> new FlowerBlock(MobEffects.LUCK, 5, Block.Properties.of().noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));

    //Chalk
    public static final RegistryObject<Block> CHALK_BLOCK = registerBlock("chalk_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.5f).sound(SoundType.BASALT)));

    public static final RegistryObject<Block> CHALK_STONE = registerBlock("chalk_stone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> CHALK_STONE_BRICKS = registerBlock("chalk_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    //Alder
    public static final RegistryObject<RotatedPillarBlock> ALDER_LOG = registerBlock("alder_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));

    public static final RegistryObject<RotatedPillarBlock> ALDER_WOOD = registerBlock("alder_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));

    public static final RegistryObject<RotatedPillarBlock> STRIPPED_ALDER_LOG = registerBlock("stripped_alder_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));

    public static final RegistryObject<RotatedPillarBlock> STRIPPED_ALDER_WOOD = registerBlock("stripped_alder_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> ALDER_PLANKS = registerBlock("alder_planks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> ALDER_LEAVES = registerBlock("alder_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> ALDER_SAPLING = registerBlock("alder_sapling",
            () -> new SaplingBlock(ModTreeGrowers.ALDER,BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));


    public static final RegistryObject<StairBlock> ALDER_STAIRS = registerBlock("alder_stairs",
            () -> new StairBlock(ModBlocks.ALDER_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));

    public static final RegistryObject<SlabBlock> ALDER_SLAB = registerBlock("alder_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));

    public static final RegistryObject<PressurePlateBlock> ALDER_PRESSURE_PLATE = registerBlock("alder_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().strength(0.5f)));
    public static final RegistryObject<ButtonBlock> ALDER_BUTTON = registerBlock("alder_button",
            () -> new ButtonBlock(BlockSetType.OAK, 30, BlockBehaviour.Properties.of().strength(0.5f)
                    .noCollission()));

    public static final RegistryObject<FenceBlock> ALDER_FENCE = registerBlock("alder_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));

    public static final RegistryObject<FenceGateBlock> ALDER_FENCE_GATE = registerBlock("alder_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE).sound(SoundType.WOOD)));

    public static final RegistryObject<DoorBlock> ALDER_DOOR = registerBlock("alder_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().strength(1f).noCollission()));
    public static final RegistryObject<TrapDoorBlock> ALDER_TRAP_DOOR= registerBlock("alder_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().strength(1f).noOcclusion()));

    //peat

    public static final RegistryObject<Block> PEAT_DIRT = registerBlock("peat_dirt",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f).sound(SoundType.ROOTED_DIRT)));

    public static final RegistryObject<Block> PEAT_GRASS = registerBlock("peat_grass",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f).sound(SoundType.GRASS)));

    public static final RegistryObject<Block> DRIED_PEAT_BLOCK = registerBlock("dried_peat_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f).requiresCorrectToolForDrops().sound(SoundType.STONE)));


    //blueberry
    public static final RegistryObject<Block> BLUE_BERRY_BUSH = BLOCKS.register("blue_berry_bush",
            () -> new BlueBerryBushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SWEET_BERRY_BUSH)));

    public static final RegistryObject<Block> OLDWOOD_VERTICAL_PLANKS = registerBlock("oldwood_vertical_planks",
            () -> new Block(BlockBehaviour.Properties.of().strength(2.0f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void registerFlammables(){
        FireBlock fire = (FireBlock) Blocks.FIRE;

        fire.setFlammable(ModBlocks.ALDER_FENCE.get(), 5, 20);
        fire.setFlammable(ModBlocks.ALDER_FENCE_GATE.get(), 5, 20);
        fire.setFlammable(ModBlocks.BEECH_FENCE.get(), 5, 20);
        fire.setFlammable(ModBlocks.BEECH_FENCE_GATE.get(), 5, 20);
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
