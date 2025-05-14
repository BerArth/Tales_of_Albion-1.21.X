package net.everwildForge.talesofalbion.worldgen.tree;

import net.everwildForge.talesofalbion.TalesofAlbion;
import net.everwildForge.talesofalbion.worldgen.ore.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower ALDER = new TreeGrower(TalesofAlbion.MOD_ID + ":alder",
            Optional.empty(), Optional.of(ModConfiguredFeatures.ALDER_KEY), Optional.empty());
    public static final TreeGrower BEECH = new TreeGrower(TalesofAlbion.MOD_ID + ":beech",
            Optional.empty(), Optional.of(ModConfiguredFeatures.BEECH_KEY),Optional.empty());
}
