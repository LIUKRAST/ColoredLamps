package net.liukrast.cl.registry;

import net.liukrast.cl.CLConstants;
import net.liukrast.cl.block.ColorControllerBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class RegisterBlocks {
    public static final Block COLORED_LAMP = new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE));
    public static final Block COLOR_CONTROLLER = new ColorControllerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK));
    public static void register() {
        Registry.register(BuiltInRegistries.BLOCK, CLConstants.id("colored_lamp"), COLORED_LAMP);
        Registry.register(BuiltInRegistries.ITEM, CLConstants.id("colored_lamp"), new BlockItem(COLORED_LAMP, new Item.Properties()));
        Registry.register(BuiltInRegistries.BLOCK, CLConstants.id("colored_lamp"), COLOR_CONTROLLER);
        Registry.register(BuiltInRegistries.ITEM, CLConstants.id("colored_lamp"), new BlockItem(COLOR_CONTROLLER, new Item.Properties()));
    }
}
