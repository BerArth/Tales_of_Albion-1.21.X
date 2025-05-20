package net.everwildForge.talesofalbion.block;

import net.everwildForge.talesofalbion.TalesofAlbion;
import net.everwildForge.talesofalbion.block.custom.ModFlammableRotatedPillarBlock;
import net.everwildForge.talesofalbion.block.custom.WattleAndDaubFramedBlock;
import net.everwildForge.talesofalbion.item.ModItems;
import net.everwildForge.talesofalbion.worldgen.tree.ModTreeGrowers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
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
            () -> new Block(BlockBehaviour.Properties.of()
                .strength(3f).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> WATTLE_N_DAUB_SIDED = registerBlock("wattle_n_daub_sided",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> WATTLE_N_DAUB_FRAMED = registerBlock("wattle_n_daub_framed",
            () -> new WattleAndDaubFramedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> WATTLE_N_DAUB_DIAGONAL = registerBlock("wattle_n_daub_diagonal",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
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

    public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> THATCH_BLOCK = registerBlock("thatch_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.2f).requiresCorrectToolForDrops().sound(SoundType.WOOL)));

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
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
