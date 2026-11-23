package net.oxiditsu.oxioverhaul.registry;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.oxiditsu.oxioverhaul.oxioverhaul;

public final class OxiBlocks {
    private OxiBlocks() {}

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(oxioverhaul.MODID);
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(oxioverhaul.MODID);

    // BushBlock gives this plant the same replaceable, non-solid and support-checking
    // behavior as vanilla short grass. Copying its properties keeps its physical settings.
    public static final DeferredBlock<BushBlock> MEADOW_GRASS = BLOCKS.registerBlock(
            "meadow_grass",
            BushBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.SHORT_GRASS)
    );

    public static final DeferredItem<?> MEADOW_GRASS_ITEM =
            ITEMS.registerSimpleBlockItem(MEADOW_GRASS);

    public static void register(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        modEventBus.addListener(OxiBlocks::addToCreativeTab);
    }

    private static void addToCreativeTab(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey().equals(CreativeModeTabs.NATURAL_BLOCKS)) {
            event.accept(MEADOW_GRASS_ITEM);
        }
    }
}
