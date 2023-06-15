
package net.mcreator.arcaneheart.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.arcaneheart.init.ArcaneHeartModFluids;

public class ArcaneManaBlock extends LiquidBlock {
	public ArcaneManaBlock() {
		super(() -> ArcaneHeartModFluids.ARCANE_MANA.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f).noCollission().noLootTable());
	}
}
