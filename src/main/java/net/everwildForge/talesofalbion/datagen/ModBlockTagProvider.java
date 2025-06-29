package net.everwildForge.talesofalbion.datagen;

import net.everwildForge.talesofalbion.TalesofAlbion;
import net.everwildForge.talesofalbion.block.ModBlocks;
import net.everwildForge.talesofalbion.tag.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TalesofAlbion.MOD_ID, existingFileHelper);
    }

    //tags = quelle outils utilisé pour le cassé/ si besoins d'un outils en fer, diams ...
    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(ModBlocks.WATTLE_N_DAUB_PLAIN.get())
                .add(ModBlocks.PEAT_DIRT.get())
                .add(ModBlocks.PEAT_GRASS.get())
        ;

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.SILVER_BLOCK.get())
                .add(ModBlocks.SILVER_ORE.get())
                .add(ModBlocks.DEEPSLATE_SILVER_ORE.get())
                .add(ModBlocks.RAW_SILVER_BLOCK.get())
                .add(ModBlocks.CHALK_STONE.get())
                .add(ModBlocks.CHALK_STONE_BRICKS.get())
                .add(ModBlocks.WATTLE_N_DAUB_PLAIN.get())
                .add(ModBlocks.WATTLE_N_DAUB_DIAGONAL.get())
                .add(ModBlocks.WATTLE_N_DAUB_FRAMED.get())
                .add(ModBlocks.WATTLE_N_DAUB_SIDED.get())
                .add(ModBlocks.DRIED_PEAT_BLOCK.get())
        ;

        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.THATCH_BLOCK.get())
                .add(ModBlocks.THATCH_STAIRS.get())
                .add(ModBlocks.LATTICE_THATCH_BLOCK.get())
                .add(ModBlocks.LATTICE_THATCH_STAIRS.get())
                .addTag(ModTags.Blocks.ALDER_BLOCKS)
                .add(ModBlocks.BEECH_LOG.get())
                .add(ModBlocks.BEECH_WOOD.get())
                .add(ModBlocks.STRIPPED_BEECH_LOG.get())
                .add(ModBlocks.STRIPPED_BEECH_WOOD.get())
        ;


        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SILVER_BLOCK.get())
                .add(ModBlocks.SILVER_ORE.get())
                .add(ModBlocks.DEEPSLATE_SILVER_ORE.get())
                .add(ModBlocks.RAW_SILVER_BLOCK.get());

        tag(BlockTags.FLOWERS).add(ModBlocks.HEATHER.get());
        tag(BlockTags.SMALL_FLOWERS).add(ModBlocks.HEATHER.get());

        tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.ALDER_LOG.get())
                .add(ModBlocks.ALDER_WOOD.get())
                .add(ModBlocks.STRIPPED_ALDER_LOG.get())
                .add(ModBlocks.STRIPPED_ALDER_WOOD.get())
                .add(ModBlocks.STRIPPED_ALDER_WOOD.get())
                .add(ModBlocks.BEECH_LOG.get())
                .add(ModBlocks.BEECH_WOOD.get())
                .add(ModBlocks.STRIPPED_BEECH_LOG.get())
                .add(ModBlocks.STRIPPED_BEECH_WOOD.get())
        ;

        tag(BlockTags.LOGS)
                .add(ModBlocks.ALDER_LOG.get())
                .add(ModBlocks.ALDER_WOOD.get())
                .add(ModBlocks.STRIPPED_ALDER_LOG.get())
                .add(ModBlocks.STRIPPED_ALDER_WOOD.get())
        ;

        tag(BlockTags.PLANKS)
                .add(ModBlocks.ALDER_PLANKS.get())
        ;

        tag(BlockTags.FENCES)
                .add(ModBlocks.ALDER_FENCE.get())
        ;

        tag(ModTags.Blocks.ALDER_BLOCKS)
                .add(
                        ModBlocks.ALDER_LOG.get(),
                        ModBlocks.ALDER_WOOD.get(),
                        ModBlocks.STRIPPED_ALDER_LOG.get(),
                        ModBlocks.STRIPPED_ALDER_WOOD.get(),
                        ModBlocks.ALDER_STAIRS.get(),
                        ModBlocks.ALDER_SLAB.get(),
                        ModBlocks.ALDER_PRESSURE_PLATE.get(),
                        ModBlocks.ALDER_BUTTON.get(),
                        ModBlocks.ALDER_FENCE_GATE.get(),
                        ModBlocks.ALDER_FENCE.get(),
                        ModBlocks.ALDER_DOOR.get(),
                        ModBlocks.ALDER_TRAP_DOOR.get()
                );
    }
}
