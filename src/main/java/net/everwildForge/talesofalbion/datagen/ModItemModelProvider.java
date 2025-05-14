package net.everwildForge.talesofalbion.datagen;

import net.everwildForge.talesofalbion.TalesofAlbion;
import net.everwildForge.talesofalbion.block.ModBlocks;
import net.everwildForge.talesofalbion.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
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

        saplingItem(ModBlocks.ALDER_SAPLING);
        saplingItem(ModBlocks.BEECH_SAPLING);
    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(TalesofAlbion.MOD_ID,"block/" + item.getId().getPath()));
    }

}
