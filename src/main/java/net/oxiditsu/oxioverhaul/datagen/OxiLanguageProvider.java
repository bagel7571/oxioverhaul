package net.oxiditsu.oxioverhaul.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.oxiditsu.oxioverhaul.oxioverhaul;
import net.oxiditsu.oxioverhaul.registry.OxiBlocks;

public final class OxiLanguageProvider extends LanguageProvider {
    public OxiLanguageProvider(PackOutput output) {
        super(output, oxioverhaul.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        addBlock(OxiBlocks.EXTRA_SHORT_GRASS, "Extra Short Grass");
    }
}
