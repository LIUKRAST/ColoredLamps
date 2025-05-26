package net.liukrast.cl;


import net.liukrast.cl.registry.RegisterBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.RegisterEvent;

@Mod(CLConstants.MOD_ID)
public class ColoredLamps {

    public ColoredLamps(IEventBus eventBus) {
        eventBus.register(this);
    }

    @SubscribeEvent
    private void registerEvent(RegisterEvent event) {
        event.register(BuiltInRegistries.BLOCK.key(),helper -> RegisterBlocks.register());
        event.register(BuiltInRegistries.ITEM.key(),helper -> RegisterBlocks.register());
    }
}