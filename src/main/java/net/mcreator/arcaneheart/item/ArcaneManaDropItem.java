
package net.mcreator.arcaneheart.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ArcaneManaDropItem extends Item {
	public ArcaneManaDropItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
