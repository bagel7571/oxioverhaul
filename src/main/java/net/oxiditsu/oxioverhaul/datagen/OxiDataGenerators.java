package net.oxiditsu.oxioverhaul.datagen;

import net.neoforged.neoforge.data.event.GatherDataEvent;

public final class OxiDataGenerators {
    private OxiDataGenerators() {}

    public static void gatherClientData(GatherDataEvent.Client event) {
        event.createProvider(OxiModelProvider::new);
        event.createProvider(OxiLanguageProvider::new);
    }
}
