package net.everwildForge.talesofalbion.datagen;

import net.everwildForge.talesofalbion.TalesofAlbion;
import net.everwildForge.talesofalbion.block.ModBlocks;
import net.everwildForge.talesofalbion.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TalesofAlbion.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        basicItem(ModItems.SILVER_INGOT.get());
        basicItem(ModItems.RAW_SILVER.get());
        basicItem(ModItems.SILVER_NUGGET.get());
        basicItem(ModItems.DAUB_BALL.get());
        basicItem(ModItems.CHALK_POWDER.get());
        basicItem(ModItems.DRIED_PEAT.get());
        basicItem(ModItems.BLUE_BERRIES.get());

        buttonItem(ModBlocks.ALDER_BUTTON, ModBlocks.ALDER_PLANKS);
        buttonItem(ModBlocks.BEECH_BUTTON, ModBlocks.BEECH_PLANKS);
        fenceItem(ModBlocks.ALDER_FENCE, ModBlocks.ALDER_PLANKS);
        fenceItem(ModBlocks.BEECH_FENCE, ModBlocks.BEECH_PLANKS);
        simpleBlockItem(ModBlocks.ALDER_DOOR);
        simpleBlockItem(ModBlocks.BEECH_DOOR);


        saplingItem(ModBlocks.ALDER_SAPLING);
        saplingItem(ModBlocks.BEECH_SAPLING);

        basicItem(ModItems.SILVER_PENNIG.get());

        handheldItem(ModItems.SILVERINLAID_DIAMOND_SWORD);
        handheldItem(ModItems.SILVERINLAID_IRON_SWORD);
        handheldItem(ModItems.SILVERINLAID_GOLDEN_SWORD);


        withExistingParent(ModItems.BADGER_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.RED_DEER_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));


    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(TalesofAlbion.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void buttonItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(TalesofAlbion.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void fenceItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(TalesofAlbion.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(TalesofAlbion.MOD_ID,"block/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<? extends Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(TalesofAlbion.MOD_ID,"item/" + item.getId().getPath()));
    }

    protected void blockItem(RegistryObject<Block> block) {
        this.withExistingParent(
                block.getId().getPath(),
                modLoc("block/" + block.getId().getPath())
        );
    }


}
