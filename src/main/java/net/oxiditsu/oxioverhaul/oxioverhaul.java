package net.oxiditsu.oxioverhaul;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.oxiditsu.oxioverhaul.registry.OxiBlocks;

@Mod(oxioverhaul.MODID)
public class oxioverhaul {
    public static final String MODID = "oxioverhaul";
    public static final Logger LOGGER = LogUtils.getLogger();

    public oxioverhaul(IEventBus modEventBus, ModContainer modContainer) {
        OxiBlocks.register(modEventBus);
    }
}
