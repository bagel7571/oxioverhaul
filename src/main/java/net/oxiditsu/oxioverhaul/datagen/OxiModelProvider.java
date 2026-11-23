package net.oxiditsu.oxioverhaul.datagen;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.data.PackOutput;
import net.oxiditsu.oxioverhaul.oxioverhaul;
import net.oxiditsu.oxioverhaul.registry.OxiBlocks;

public final class OxiModelProvider extends ModelProvider {
    public OxiModelProvider(PackOutput output) {
        super(output, oxioverhaul.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        // Generates the crossed plant blockstate/model and a flat, generated-style inventory model.
        // The flat item model uses the block texture and is rendered with Minecraft's normal
        // generated-item pixel extrusion, just like vanilla short grass.
        blockModels.createCrossBlockWithDefaultItem(
                OxiBlocks.EXTRA_SHORT_GRASS.get(),
                BlockModelGenerators.PlantType.TINTED
        );
    }
}
