package net.tropicraft.item.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

public class ItemScaleArmor extends ItemTropicraftArmor {

	public ItemScaleArmor(ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);

	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return getTexturePath("scale_" + type);
	}

}