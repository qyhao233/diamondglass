package com.kreezcraft.diamondglass.recipes;

import com.kreezcraft.diamondglass.blocks.ModBlocks;
import com.kreezcraft.diamondglass.items.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(ModBlocks.DIAMOND_SAND, new ItemStack(ModBlocks.DIAMOND_GLASS), 10f);
/*
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.DIAMOND_GLASS_PANE, 16), "SSS", "SSS", 'S', ModBlocks.DIAMOND_GLASS);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.DIAMOND_SANDSTONE, 4), "SS", "SS", 'S', ModBlocks.DIAMOND_SAND);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.DIAMOND_SMOOTH_SANDSTONE, 4), "SS", "SS", 'S', ModBlocks.DIAMOND_SANDSTONE);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.DIAMOND_CHISELED_SANDSTONE), "S", "S", 'S', ModBlocks.DIAMOND_SANDSTONE_SLAB);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.DIAMOND_SANDSTONE_SLAB, 6), "SSS", 'S', ModBlocks.DIAMOND_SANDSTONE);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.DIAMOND_SMOOTH_SANDSTONE_SLAB, 6), "SSS", 'S', ModBlocks.DIAMOND_SMOOTH_SANDSTONE);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.DIAMOND_CHISELED_SANDSTONE_SLAB, 6), "SSS", 'S', ModBlocks.DIAMOND_CHISELED_SANDSTONE);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.DIAMOND_SANDSTONE_STAIRS, 6), "  S", " SS", "SSS", 'S', ModBlocks.DIAMOND_SANDSTONE);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.DIAMOND_SMOOTH_SANDSTONE_STAIRS, 6), "  S", " SS", "SSS", 'S', ModBlocks.DIAMOND_SMOOTH_SANDSTONE);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.DIAMOND_CHISELED_SANDSTONE_STAIRS, 6), "  S", " SS", "SSS", 'S', ModBlocks.DIAMOND_CHISELED_SANDSTONE);

		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.DIAMOND_GLASS_SLAB, 6), "SSS", 'S', ModBlocks.DIAMOND_GLASS);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.DIAMOND_GLASS_STAIRS, 6), "  S", " SS", "SSS", 'S', ModBlocks.DIAMOND_GLASS);
*/
	}

}
