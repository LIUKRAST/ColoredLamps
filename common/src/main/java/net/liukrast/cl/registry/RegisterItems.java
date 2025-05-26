package net.liukrast.cl.registry;

import net.liukrast.cl.CLConstants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;

public class RegisterItems {
    public static final Item WRENCH = new Item(new Item.Properties().stacksTo(1));
    public static void register() {
        Registry.register(BuiltInRegistries.ITEM, CLConstants.id("wrench"), WRENCH);
    }
}
