
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arcaneheart.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.arcaneheart.item.WaterManaPotionItem;
import net.mcreator.arcaneheart.item.WaterManaDropItem;
import net.mcreator.arcaneheart.item.StoneSpellpageItemItem;
import net.mcreator.arcaneheart.item.SpellbookItem;
import net.mcreator.arcaneheart.item.SandstoneSpellpageItemItem;
import net.mcreator.arcaneheart.item.SandSpellpageItemItem;
import net.mcreator.arcaneheart.item.OrderManaPotionItem;
import net.mcreator.arcaneheart.item.OrderManaDropItem;
import net.mcreator.arcaneheart.item.MortarPestleItem;
import net.mcreator.arcaneheart.item.MagicBowlItem;
import net.mcreator.arcaneheart.item.LightSpellpageItemItem;
import net.mcreator.arcaneheart.item.GravelSpellpageItemItem;
import net.mcreator.arcaneheart.item.FireSpellpageItem;
import net.mcreator.arcaneheart.item.FireManaPotionItem;
import net.mcreator.arcaneheart.item.FireManaDropItem;
import net.mcreator.arcaneheart.item.EntropyManaPotionItem;
import net.mcreator.arcaneheart.item.EntropyManaDropItem;
import net.mcreator.arcaneheart.item.EarthManaPotionItem;
import net.mcreator.arcaneheart.item.EarthManaDropItem;
import net.mcreator.arcaneheart.item.DirtSpellpageItemItem;
import net.mcreator.arcaneheart.item.CobbleSpellpageItemItem;
import net.mcreator.arcaneheart.item.ClaySpellpageItem;
import net.mcreator.arcaneheart.item.BowlOfManaItem;
import net.mcreator.arcaneheart.item.BottleOfManaItem;
import net.mcreator.arcaneheart.item.BiggerBottleItem;
import net.mcreator.arcaneheart.item.ArcaneManaItem;
import net.mcreator.arcaneheart.item.ArcaneManaDropItem;
import net.mcreator.arcaneheart.item.AirManaPotionItem;
import net.mcreator.arcaneheart.item.AirManaDropItem;
import net.mcreator.arcaneheart.ArcaneHeartMod;

public class ArcaneHeartModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ArcaneHeartMod.MODID);
	public static final RegistryObject<Item> ARCANE_MANA_DROP = REGISTRY.register("arcane_mana_drop", () -> new ArcaneManaDropItem());
	public static final RegistryObject<Item> ARCANE_MANA_BUCKET = REGISTRY.register("arcane_mana_bucket", () -> new ArcaneManaItem());
	public static final RegistryObject<Item> BIGGER_BOTTLE = REGISTRY.register("bigger_bottle", () -> new BiggerBottleItem());
	public static final RegistryObject<Item> EARTH_MANA_DROP = REGISTRY.register("earth_mana_drop", () -> new EarthManaDropItem());
	public static final RegistryObject<Item> WATER_MANA_DROP = REGISTRY.register("water_mana_drop", () -> new WaterManaDropItem());
	public static final RegistryObject<Item> FIRE_MANA_DROP = REGISTRY.register("fire_mana_drop", () -> new FireManaDropItem());
	public static final RegistryObject<Item> AIR_MANA_DROP = REGISTRY.register("air_mana_drop", () -> new AirManaDropItem());
	public static final RegistryObject<Item> ENTROPY_MANA_DROP = REGISTRY.register("entropy_mana_drop", () -> new EntropyManaDropItem());
	public static final RegistryObject<Item> ORDER_MANA_DROP = REGISTRY.register("order_mana_drop", () -> new OrderManaDropItem());
	public static final RegistryObject<Item> BOTTLE_OF_MANA = REGISTRY.register("bottle_of_mana", () -> new BottleOfManaItem());
	public static final RegistryObject<Item> BOWL_OF_MANA = REGISTRY.register("bowl_of_mana", () -> new BowlOfManaItem());
	public static final RegistryObject<Item> SPELLBOOK = REGISTRY.register("spellbook", () -> new SpellbookItem());
	public static final RegistryObject<Item> COBBLE_SPELLPAGE_ITEM = REGISTRY.register("cobble_spellpage_item", () -> new CobbleSpellpageItemItem());
	public static final RegistryObject<Item> SAND_SPELLPAGE_ITEM = REGISTRY.register("sand_spellpage_item", () -> new SandSpellpageItemItem());
	public static final RegistryObject<Item> GRAVEL_SPELLPAGE_ITEM = REGISTRY.register("gravel_spellpage_item", () -> new GravelSpellpageItemItem());
	public static final RegistryObject<Item> STONE_SPELLPAGE_ITEM = REGISTRY.register("stone_spellpage_item", () -> new StoneSpellpageItemItem());
	public static final RegistryObject<Item> DIRT_SPELLPAGE_ITEM = REGISTRY.register("dirt_spellpage_item", () -> new DirtSpellpageItemItem());
	public static final RegistryObject<Item> SANDSTONE_SPELLPAGE_ITEM = REGISTRY.register("sandstone_spellpage_item", () -> new SandstoneSpellpageItemItem());
	public static final RegistryObject<Item> LIGHT_SPELLPAGE_ITEM = REGISTRY.register("light_spellpage_item", () -> new LightSpellpageItemItem());
	public static final RegistryObject<Item> EARTH_MANA_POTION = REGISTRY.register("earth_mana_potion", () -> new EarthManaPotionItem());
	public static final RegistryObject<Item> FIRE_MANA_POTION = REGISTRY.register("fire_mana_potion", () -> new FireManaPotionItem());
	public static final RegistryObject<Item> WATER_MANA_POTION = REGISTRY.register("water_mana_potion", () -> new WaterManaPotionItem());
	public static final RegistryObject<Item> AIR_MANA_POTION = REGISTRY.register("air_mana_potion", () -> new AirManaPotionItem());
	public static final RegistryObject<Item> ENTROPY_MANA_POTION = REGISTRY.register("entropy_mana_potion", () -> new EntropyManaPotionItem());
	public static final RegistryObject<Item> ORDER_MANA_POTION = REGISTRY.register("order_mana_potion", () -> new OrderManaPotionItem());
	public static final RegistryObject<Item> MORTAR_PESTLE = REGISTRY.register("mortar_pestle", () -> new MortarPestleItem());
	public static final RegistryObject<Item> MAGIC_BOWL = REGISTRY.register("magic_bowl", () -> new MagicBowlItem());
	public static final RegistryObject<Item> FIRE_SPELLPAGE = REGISTRY.register("fire_spellpage", () -> new FireSpellpageItem());
	public static final RegistryObject<Item> CLAY_SPELLPAGE = REGISTRY.register("clay_spellpage", () -> new ClaySpellpageItem());
}
