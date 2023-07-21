
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arcaneheart.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.arcaneheart.ArcaneHeartMod;

public class ArcaneHeartModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ArcaneHeartMod.MODID);
	public static final RegistryObject<SoundEvent> ENDIES_REMIX_FIGURE_8 = REGISTRY.register("endies_remix_figure_8", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("arcane_heart", "endies_remix_figure_8")));
}
