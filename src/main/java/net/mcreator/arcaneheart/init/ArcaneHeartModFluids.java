
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arcaneheart.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.arcaneheart.fluid.ArcaneManaFluid;
import net.mcreator.arcaneheart.ArcaneHeartMod;

public class ArcaneHeartModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, ArcaneHeartMod.MODID);
	public static final RegistryObject<FlowingFluid> ARCANE_MANA = REGISTRY.register("arcane_mana", () -> new ArcaneManaFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_ARCANE_MANA = REGISTRY.register("flowing_arcane_mana", () -> new ArcaneManaFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(ARCANE_MANA.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_ARCANE_MANA.get(), RenderType.translucent());
		}
	}
}
