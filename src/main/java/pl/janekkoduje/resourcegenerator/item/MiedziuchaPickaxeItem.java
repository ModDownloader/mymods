
package pl.janekkoduje.resourcegenerator.item;

import pl.janekkoduje.resourcegenerator.ResourceGeneratorModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@ResourceGeneratorModElements.ModElement.Tag
public class MiedziuchaPickaxeItem extends ResourceGeneratorModElements.ModElement {
	@ObjectHolder("resource_generator:miedziucha_pickaxe")
	public static final Item block = null;
	public MiedziuchaPickaxeItem(ResourceGeneratorModElements instance) {
		super(instance, 34);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
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
		}.setRegistryName("miedziucha_pickaxe"));
	}
}
