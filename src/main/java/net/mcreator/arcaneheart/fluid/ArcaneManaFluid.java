
package net.mcreator.arcaneheart.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.arcaneheart.init.ArcaneHeartModItems;
import net.mcreator.arcaneheart.init.ArcaneHeartModFluids;
import net.mcreator.arcaneheart.init.ArcaneHeartModFluidTypes;
import net.mcreator.arcaneheart.init.ArcaneHeartModBlocks;

public abstract class ArcaneManaFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> ArcaneHeartModFluidTypes.ARCANE_MANA_TYPE.get(), () -> ArcaneHeartModFluids.ARCANE_MANA.get(),
			() -> ArcaneHeartModFluids.FLOWING_ARCANE_MANA.get()).explosionResistance(100f).bucket(() -> ArcaneHeartModItems.ARCANE_MANA_BUCKET.get()).block(() -> (LiquidBlock) ArcaneHeartModBlocks.ARCANE_MANA.get());

	private ArcaneManaFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.EFFECT;
	}

	public static class Source extends ArcaneManaFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends ArcaneManaFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
