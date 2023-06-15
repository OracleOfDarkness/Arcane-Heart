
package net.mcreator.arcaneheart.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.arcaneheart.init.ArcaneHeartModFluids;

public class ArcaneManaItem extends BucketItem {
	public ArcaneManaItem() {
		super(ArcaneHeartModFluids.ARCANE_MANA, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
