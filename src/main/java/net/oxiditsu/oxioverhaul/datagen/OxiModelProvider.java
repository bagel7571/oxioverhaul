package net.oxiditsu.oxioverhaul.datagen;

import net.minecraft.client.color.item.GrassColorSource;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.oxiditsu.oxioverhaul.oxioverhaul;
import net.oxiditsu.oxioverhaul.registry.OxiBlocks;

public final class OxiModelProvider extends ModelProvider {
    public OxiModelProvider(PackOutput output) {
        super(output, oxioverhaul.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        // Generates the crossed plant blockstate/model and a flat, generated-style inventory model.
        blockModels.createCrossBlockWithDefaultItem(
                OxiBlocks.EXTRA_SHORT_GRASS.get(),
                BlockModelGenerators.PlantType.TINTED
        );

        // Match vanilla short grass: tint the flat item icon with the grass colormap too.
        blockModels.registerSimpleTintedItemModel(
                OxiBlocks.EXTRA_SHORT_GRASS.get(),
                Identifier.fromNamespaceAndPath(oxioverhaul.MODID, "item/extra_short_grass"),
                new GrassColorSource(0.5F, 1.0F)
        );
    }
}
