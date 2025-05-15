package net.everwildForge.talesofalbion.datagen;

import net.everwildForge.talesofalbion.TalesofAlbion;
import net.everwildForge.talesofalbion.block.ModBlocks;
import net.everwildForge.talesofalbion.tag.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, TalesofAlbion.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.ALDER_LOG.get().asItem())
                .add(ModBlocks.ALDER_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_ALDER_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_ALDER_WOOD.get().asItem())
                .add(ModBlocks.BEECH_WOOD.get().asItem())
                .add(ModBlocks.BEECH_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_BEECH_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_BEECH_LOG.get().asItem())
        ;

        tag(ItemTags.PLANKS)
                .add(ModBlocks.ALDER_PLANKS.get().asItem())
                .add(ModBlocks.BEECH_PLANKS.get().asItem());


        tag(ModTags.Items.ALDER_LOGS)
                .add(ModBlocks.ALDER_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_ALDER_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_ALDER_WOOD.get().asItem())
                .add(ModBlocks.ALDER_WOOD.get().asItem());
    }


}
