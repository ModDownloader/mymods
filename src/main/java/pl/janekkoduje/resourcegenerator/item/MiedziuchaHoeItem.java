
package pl.janekkoduje.resourcegenerator.item;

import pl.janekkoduje.resourcegenerator.ResourceGeneratorModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

@ResourceGeneratorModElements.ModElement.Tag
public class MiedziuchaHoeItem extends ResourceGeneratorModElements.ModElement {
	@ObjectHolder("resource_generator:miedziucha_hoe")
	public static final Item block = null;
	public MiedziuchaHoeItem(ResourceGeneratorModElements instance) {
		super(instance, 38);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
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
		}, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("miedziucha_hoe"));
	}
}
