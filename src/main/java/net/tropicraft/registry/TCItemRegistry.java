package net.tropicraft.registry;

import net.minecraft.item.Item;
import net.tropicraft.info.TCNames;
import net.tropicraft.item.ItemTropicraft;
import net.tropicraft.item.ItemTropicraftFood;
import cpw.mods.fml.common.registry.GameRegistry;

public class TCItemRegistry {

	public static final ItemTropicraft frogLeg = new ItemTropicraft();
	public static final ItemTropicraftFood cookedFrogLeg = new ItemTropicraftFood(2, 0.15F);
	public static final ItemTropicraft poisonFrogSkin = new ItemTropicraft();
	
	public static final ItemTropicraftFood freshMarlin = new ItemTropicraftFood(2, 0.3F);
	public static final ItemTropicraftFood searedMarlin = new ItemTropicraftFood(8, 0.65F);
	
	public static final ItemTropicraftFood grapefruit = new ItemTropicraftFood(2, 0.2F);
	public static final ItemTropicraftFood lemon = new ItemTropicraftFood(2, 0.2F);
	public static final ItemTropicraftFood lime = new ItemTropicraftFood(2, 0.2F);
	public static final ItemTropicraftFood orange = new ItemTropicraftFood(2, 0.2F);
	
	public static final ItemTropicraft scale = new ItemTropicraft();
	
	public static final ItemTropicraftFood coconutChunk = new ItemTropicraftFood(1, 0.1F);
	public static final ItemTropicraftFood pineappleCubes = new ItemTropicraftFood(1, 0.1F);
	
	public static void init() {
		registerItem(frogLeg, TCNames.frogLeg);
		registerItem(cookedFrogLeg, TCNames.cookedFrogLeg);
		registerItem(poisonFrogSkin, TCNames.poisonFrogSkin);
		
		registerItem(freshMarlin, TCNames.freshMarlin);
		registerItem(searedMarlin, TCNames.searedMarlin);
		
		registerItem(grapefruit, TCNames.grapefruit);
		registerItem(lemon, TCNames.lemon);
		registerItem(lime, TCNames.lime);
		registerItem(orange, TCNames.orange);
		
		registerItem(scale, TCNames.scale);
		
		registerItem(coconutChunk, TCNames.coconutChunk);
		registerItem(pineappleCubes, TCNames.pineappleCubes);
	}
	
	private static void registerItem(Item item, String name) {
		GameRegistry.registerItem(item, name);
		item.setUnlocalizedName(name);
	}
}
