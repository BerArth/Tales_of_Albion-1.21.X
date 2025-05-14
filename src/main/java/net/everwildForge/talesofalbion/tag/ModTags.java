package net.everwildForge.talesofalbion.tag;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> ALDER_BLOCKS =
                BlockTags.create(ResourceLocation.fromNamespaceAndPath("talesofalbion", "alder_blocks")
                );
    }
}
