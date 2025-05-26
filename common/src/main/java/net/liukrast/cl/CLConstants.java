package net.liukrast.cl;

import net.liukrast.cl.platform.Services;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CLConstants {
    public static final String MOD_ID = "colored_lamps";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static ResourceLocation id(final String path) {return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);}
}