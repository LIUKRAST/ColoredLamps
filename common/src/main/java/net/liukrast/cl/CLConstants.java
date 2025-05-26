package net.liukrast.cl;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CLConstants {
    public static final String MOD_ID = "colored_lamps";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static ResourceLocation id(final String path) {return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);}
}