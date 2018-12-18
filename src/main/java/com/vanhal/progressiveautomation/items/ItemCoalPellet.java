package com.vanhal.progressiveautomation.items;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;

public class ItemCoalPellet extends BaseItem {
	protected int burnTime = 100;

	public ItemCoalPellet() {
		super("coal_pellet");
		//setTextureName(Ref.MODID+":Coal_Pellet");
		int coalTime = TileEntityFurnace.getItemBurnTime(new ItemStack(Items.COAL));
		burnTime = coalTime / 8;
	}

    protected void addNormalRecipe() {
/*    	ShapelessOreRecipe recipe = new ShapelessOreRecipe(new ItemStack(this, 8), Items.COAL);
		GameRegistry.addRecipe(recipe);
		recipe = new ShapelessOreRecipe(new ItemStack(this, 8), new ItemStack(Items.COAL, 1, 1));
		GameRegistry.addRecipe(recipe); */
	}

	protected void addUpgradeRecipe() {
		addNormalRecipe();
	}

	public int getBurnTime(ItemStack fuel) {
		if (fuel.isItemEqual(new ItemStack(this))) {
			return burnTime;
		} else {
			return 0;
		}
	}
}
