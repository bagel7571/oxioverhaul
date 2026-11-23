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
        // Generate the crossed, biome-tinted plant block without registering a default item model.
        blockModels.createCrossBlock(
                OxiBlocks.EXTRA_SHORT_GRASS.get(),
                BlockModelGenerators.PlantType.TINTED
        );

        // Generate the flat item texture model, then register its item definition with grass tint.
        Identifier itemModel = blockModels.createFlatItemModelWithBlockTexture(
                OxiBlocks.EXTRA_SHORT_GRASS.get().asItem(),
                OxiBlocks.EXTRA_SHORT_GRASS.get()
        );
        blockModels.registerSimpleTintedItemModel(
                OxiBlocks.EXTRA_SHORT_GRASS.get(),
                itemModel,
                new GrassColorSource(0.5F, 1.0F)
        );
    }
}
