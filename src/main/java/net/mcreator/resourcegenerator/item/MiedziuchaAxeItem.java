
package net.mcreator.resourcegenerator.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.resourcegenerator.ResourceGeneratorModElements;

@ResourceGeneratorModElements.ModElement.Tag
public class MiedziuchaAxeItem extends ResourceGeneratorModElements.ModElement {
	@ObjectHolder("resource_generator:miedziucha_axe")
	public static final Item block = null;
	public MiedziuchaAxeItem(ResourceGeneratorModElements instance) {
		super(instance, 35);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(MiedziuchaIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("miedziucha_axe"));
	}
}
