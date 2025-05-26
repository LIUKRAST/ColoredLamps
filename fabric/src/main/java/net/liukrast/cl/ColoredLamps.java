package net.liukrast.cl;

import net.fabricmc.api.ModInitializer;
import net.liukrast.cl.registry.RegisterBlocks;
import net.liukrast.cl.registry.RegisterItems;

public class ColoredLamps implements ModInitializer {
    
    @Override
    public void onInitialize() {
        RegisterBlocks.register();
        RegisterItems.register();
    }
}
