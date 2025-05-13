package net.everwildForge.talesofalbion.datagen;

import net.everwildForge.talesofalbion.TalesofAlbion;
import net.everwildForge.talesofalbion.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
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
        blockWithItem(ModBlocks.DAUB_BLOCK);
        blockWithItem(ModBlocks.THATCH_BLOCK);
        simpleCrossBlock(ModBlocks.HEATHER.get(), "heather");

        blockWithItem(ModBlocks.CHALK_BLOCK, "chalk_bottom", "chalk_top", "chalk");
        blockWithItem(ModBlocks.CHALK_STONE);
        blockWithItem(ModBlocks.CHALK_STONE_BRICKS, "chalk_stone_bricks_bottom", "chalk_stone_bricks_top", "chalk_stone_bricks");
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


}
