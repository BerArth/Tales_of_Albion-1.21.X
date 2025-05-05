package net.everwildForge.talesofalbion.datagen;

import net.everwildForge.talesofalbion.TalesofAlbion;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TalesofAlbion.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }
}
