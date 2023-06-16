
package net.mcreator.arcaneheart.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AirManaPotionItem extends Item {
	public AirManaPotionItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
