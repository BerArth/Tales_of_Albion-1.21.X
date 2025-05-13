package net.everwildForge.talesofalbion.datagen;

import net.everwildForge.talesofalbion.TalesofAlbion;
import net.everwildForge.talesofalbion.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
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
        blockWithItem(ModBlocks.WATTLE_N_DAUB_PLAIN);
        blockWithItem(ModBlocks.THATCH_BLOCK);
        simpleCrossBlock(ModBlocks.HEATHER.get(), "heather");

        blockWithItem(ModBlocks.CHALK_BLOCK, "chalk_bottom", "chalk_top", "chalk");
        blockWithItem(ModBlocks.CHALK_STONE);
        blockWithItem(ModBlocks.CHALK_STONE_BRICKS, "chalk_stone_bricks_bottom", "chalk_stone_bricks_top", "chalk_stone_bricks");

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
