package net.everwildForge.talesofalbion.datagen;

import net.everwildForge.talesofalbion.TalesofAlbion;
import net.everwildForge.talesofalbion.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TalesofAlbion.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        basicItem(ModItems.SILVER_INGOT.get());
        basicItem(ModItems.RAW_SILVER.get());
    }
}
