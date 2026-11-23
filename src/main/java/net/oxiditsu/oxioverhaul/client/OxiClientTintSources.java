package net.oxiditsu.oxioverhaul.client;

import java.util.List;

import net.minecraft.client.color.block.BlockTintSources;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.oxiditsu.oxioverhaul.oxioverhaul;
import net.oxiditsu.oxioverhaul.registry.OxiBlocks;

@EventBusSubscriber(modid = oxioverhaul.MODID, value = Dist.CLIENT)
public final class OxiClientTintSources {
    private OxiClientTintSources() {}

    @SubscribeEvent
    public static void registerBlockTintSources(RegisterColorHandlersEvent.BlockTintSources event) {
        // Use the same biome grass-colormap source as vanilla short grass.
        event.register(List.of(BlockTintSources.grass()), OxiBlocks.EXTRA_SHORT_GRASS.get());
    }
}
