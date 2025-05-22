package net.everwildForge.talesofalbion.datagen;

import net.everwildForge.talesofalbion.TalesofAlbion;
import net.everwildForge.talesofalbion.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocksStateProvider extends BlockStateProvider {
    public ModBlocksStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TalesofAlbion.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.SILVER_BLOCK);
        blockWithItem(ModBlocks.SILVER_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SILVER_ORE);
        blockWithItem(ModBlocks.RAW_SILVER_BLOCK);
        blockWithItem(ModBlocks.THATCH_BLOCK);
        simpleCrossBlock(ModBlocks.HEATHER.get(), "heather");

        blockWithItem(ModBlocks.CHALK_BLOCK, "chalk_bottom", "chalk_top", "chalk");
        blockWithItem(ModBlocks.CHALK_STONE);
        blockWithItem(ModBlocks.CHALK_STONE_BRICKS, "chalk_stone_bricks_bottom", "chalk_stone_bricks_top", "chalk_stone_bricks");


        //Alder
        logBlock(ModBlocks.ALDER_LOG.get());
        logBlock(ModBlocks.STRIPPED_ALDER_LOG.get());
        axisBlock(ModBlocks.ALDER_WOOD.get(), blockTexture(ModBlocks.ALDER_LOG.get()), blockTexture(ModBlocks.ALDER_LOG.get()));
        axisBlock(ModBlocks.STRIPPED_ALDER_WOOD.get(), blockTexture(ModBlocks.STRIPPED_ALDER_LOG.get()), blockTexture(ModBlocks.STRIPPED_ALDER_LOG.get()));

        blockItem(ModBlocks.ALDER_LOG);
        blockItem(ModBlocks.ALDER_WOOD);
        blockItem(ModBlocks.STRIPPED_ALDER_LOG);
        blockItem(ModBlocks.STRIPPED_ALDER_WOOD);

        blockWithItem(ModBlocks.ALDER_PLANKS);

        leavesBlock(ModBlocks.ALDER_LEAVES);
        saplingBlock(ModBlocks.ALDER_SAPLING);

        stairsBlock(ModBlocks.ALDER_STAIRS.get(), blockTexture(ModBlocks.ALDER_PLANKS.get()));
        slabBlock(ModBlocks.ALDER_SLAB.get(), blockTexture(ModBlocks.ALDER_PLANKS.get()), blockTexture(ModBlocks.ALDER_PLANKS.get()));
        pressurePlateBlock(ModBlocks.ALDER_PRESSURE_PLATE.get(), blockTexture(ModBlocks.ALDER_PLANKS.get()));
        buttonBlock(ModBlocks.ALDER_BUTTON.get(), blockTexture(ModBlocks.ALDER_PLANKS.get()));

        fenceBlock(ModBlocks.ALDER_FENCE.get(), blockTexture(ModBlocks.ALDER_PLANKS.get()));
        fenceGateBlock(ModBlocks.ALDER_FENCE_GATE.get(), blockTexture(ModBlocks.ALDER_PLANKS.get()));

        doorBlockWithRenderType(ModBlocks.ALDER_DOOR.get(), modLoc("block/alder_door_bottom"), modLoc("block/alder_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.ALDER_TRAP_DOOR.get(), modLoc("block/alder_trapdoor"), true, "cutout");

        blockItem(ModBlocks.ALDER_STAIRS);
        blockItem(ModBlocks.ALDER_SLAB);
        blockItem(ModBlocks.ALDER_PRESSURE_PLATE);
        blockItem(ModBlocks.ALDER_FENCE_GATE);
        blockItem(ModBlocks.ALDER_TRAP_DOOR, "_bottom");

        //Wattle n' Daub
        blockWithItem(ModBlocks.WATTLE_N_DAUB_PLAIN);
        logBlock((RotatedPillarBlock) ModBlocks.WATTLE_N_DAUB_DIAGONAL.get());
        logBlock((RotatedPillarBlock) ModBlocks.WATTLE_N_DAUB_FRAMED.get());
        blockItem(ModBlocks.WATTLE_N_DAUB_FRAMED);
        logBlock((RotatedPillarBlock) ModBlocks.WATTLE_N_DAUB_SIDED.get());

        //Beech
        logBlock(ModBlocks.BEECH_LOG.get());
        logBlock(ModBlocks.STRIPPED_BEECH_LOG.get());
        axisBlock(ModBlocks.BEECH_WOOD.get(), blockTexture(ModBlocks.BEECH_LOG.get()), blockTexture(ModBlocks.BEECH_LOG.get()));
        axisBlock(ModBlocks.STRIPPED_BEECH_WOOD.get(), blockTexture(ModBlocks.STRIPPED_BEECH_LOG.get()), blockTexture(ModBlocks.STRIPPED_BEECH_LOG.get()));

        blockItem(ModBlocks.BEECH_LOG);
        blockItem(ModBlocks.BEECH_WOOD);
        blockItem(ModBlocks.STRIPPED_BEECH_LOG);
        blockItem(ModBlocks.STRIPPED_BEECH_WOOD);

        blockWithItem(ModBlocks.BEECH_PLANKS);

        leavesBlock(ModBlocks.BEECH_LEAVES);
        saplingBlock(ModBlocks.BEECH_SAPLING);

        //peat
        blockWithItem(ModBlocks.PEAT_DIRT);
        blockWithItem(ModBlocks.PEAT_GRASS, "peat_block", "peat_block_top", "peat_block_side");

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void simpleCrossBlock(Block block, String name) {
        simpleBlock(block, models().cross(name, modLoc("block/" + name)));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject, String bottom, String top, String side) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().cubeBottomTop(
                        name(blockRegistryObject.get()),
                        modLoc("block/" + side),
                        modLoc("block/" + bottom),
                        modLoc("block/" + top)
                )
        );
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject, String left, String right) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().cubeColumnHorizontal(
                        name(blockRegistryObject.get()),
                        modLoc("block/"+ left),
                        modLoc("block/"+ right)));
    }

    private String name(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block).getPath();
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("talesofalbion:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("talesofalbion:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), ResourceLocation.parse("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }



}
