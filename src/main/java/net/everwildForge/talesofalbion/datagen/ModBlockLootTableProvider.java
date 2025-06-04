package net.everwildForge.talesofalbion.datagen;

import net.everwildForge.talesofalbion.block.ModBlocks;
import net.everwildForge.talesofalbion.item.ModItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    protected void generate() {
        //c'est dans cette méthode que nous générons les loot que les différents blocks droprons
        dropSelf(ModBlocks.SILVER_BLOCK.get());
        dropSelf(ModBlocks.WATTLE_N_DAUB_PLAIN.get());
        dropSelf(ModBlocks.THATCH_BLOCK.get());
        dropSelf(ModBlocks.LATTICE_THATCH_BLOCK.get());
        dropSelf(ModBlocks.THATCH_STAIRS.get());
        dropSelf(ModBlocks.LATTICE_THATCH_STAIRS.get());
        dropSelf(ModBlocks.HEATHER.get());
        dropSelf(ModBlocks.WATTLE.get());

        //Wattle n daub
        dropSelf(ModBlocks.WATTLE_N_DAUB_PLAIN.get());
        dropSelf(ModBlocks.WATTLE_N_DAUB_DIAGONAL.get());
        dropSelf(ModBlocks.WATTLE_N_DAUB_SIDED.get());
        dropSelf(ModBlocks.WATTLE_N_DAUB_FRAMED.get());

        this.add(ModBlocks.SILVER_ORE.get(),
                block -> createOreDrop(ModBlocks.SILVER_ORE.get(), ModItems.RAW_SILVER.get()));

        this.add(ModBlocks.DEEPSLATE_SILVER_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_SILVER_ORE.get(), ModItems.RAW_SILVER.get()));

        dropSelf(ModBlocks.RAW_SILVER_BLOCK.get());

        this.add(ModBlocks.CHALK_BLOCK.get(),
                block -> createMultipleOreDrops(ModBlocks.CHALK_BLOCK.get(), ModItems.CHALK_POWDER.get(), 3, 5));

        dropSelf(ModBlocks.CHALK_STONE.get());
        dropSelf(ModBlocks.CHALK_STONE_BRICKS.get());

        //Alder
        this.dropSelf(ModBlocks.ALDER_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_ALDER_LOG.get());
        this.dropSelf(ModBlocks.ALDER_PLANKS.get());
        this.dropSelf(ModBlocks.ALDER_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_ALDER_WOOD.get());
        this.dropSelf(ModBlocks.ALDER_SAPLING.get());

        this.add(ModBlocks.ALDER_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.ALDER_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.ALDER_STAIRS.get());
        this.add(ModBlocks.ALDER_SLAB.get(), block ->
                createSlabItemTable(ModBlocks.ALDER_SLAB.get()));
        this.dropSelf(ModBlocks.ALDER_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.ALDER_BUTTON.get());

        dropSelf(ModBlocks.ALDER_FENCE.get());
        dropSelf(ModBlocks.ALDER_FENCE_GATE.get());

        this.add(ModBlocks.ALDER_DOOR.get(),
                block -> createDoorTable(ModBlocks.ALDER_DOOR.get()));
        this.dropSelf(ModBlocks.ALDER_TRAP_DOOR.get());

        //Beech
        this.dropSelf(ModBlocks.BEECH_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_BEECH_LOG.get());
        this.dropSelf(ModBlocks.BEECH_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_BEECH_WOOD.get());
        this.dropSelf(ModBlocks.BEECH_PLANKS.get());
        this.dropSelf(ModBlocks.BEECH_SAPLING.get());
        this.add(ModBlocks.BEECH_LEAVES.get(), block ->
                createLeavesDrops(block,ModBlocks.BEECH_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.BEECH_STAIRS.get());
        this.add(ModBlocks.BEECH_SLAB.get(), block ->
                createSlabItemTable(ModBlocks.BEECH_SLAB.get()));
        this.dropSelf(ModBlocks.BEECH_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.BEECH_BUTTON.get());
        dropSelf(ModBlocks.BEECH_FENCE.get());
        dropSelf(ModBlocks.BEECH_FENCE_GATE.get());

        this.add(ModBlocks.BEECH_DOOR.get(),
                block -> createDoorTable(ModBlocks.BEECH_DOOR.get()));
        this.dropSelf(ModBlocks.BEECH_TRAP_DOOR.get());

        //peat
        this.dropSelf(ModBlocks.PEAT_DIRT.get());
        this.add(ModBlocks.PEAT_GRASS.get(), block ->
                createSingleItemTableWithSilkTouch(ModBlocks.PEAT_GRASS.get(), ModBlocks.PEAT_DIRT.get()));
        this.dropSelf(ModBlocks.DRIED_PEAT_BLOCK.get());

        //blueberry
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.m_255025_(Registries.ENCHANTMENT);

        this.add(ModBlocks.BLUE_BERRY_BUSH.get(), block -> this.applyExplosionDecay(
                block,LootTable.lootTable().withPool(LootPool.lootPool().when(
                                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.BLUE_BERRY_BUSH.get())
                                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SweetBerryBushBlock.AGE, 3))
                                ).add(LootItem.lootTableItem(ModItems.BLUE_BERRIES.get()))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 3.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                ).withPool(LootPool.lootPool().when(
                                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.BLUE_BERRY_BUSH.get())
                                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SweetBerryBushBlock.AGE, 2))
                                ).add(LootItem.lootTableItem(ModItems.BLUE_BERRIES.get()))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                )));

    }

    //cette méthode comme dit dans la vidéo sert a faire des loot avec plusieur items drop (par exemple en vanila le charbon ou le cooper)
    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.m_255025_(Registries.ENCHANTMENT);//m_255025 = lookOrThrow dans la video (parchment n'a pas encore mappé cette méthode)
        return this.createSilkTouchDispatchTable(
                pBlock, this.applyExplosionDecay(
                        pBlock, LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                                .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }

    //recupere tout les blocs de créés dans ModBlocks
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
