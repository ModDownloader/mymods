
package pl.janekkoduje.resourcegenerator.item.crafting;

import pl.janekkoduje.resourcegenerator.item.ItemMiedziuchaIngot;
import pl.janekkoduje.resourcegenerator.block.BlockMiedziuchaOre;
import pl.janekkoduje.resourcegenerator.ElementsResourceGeneratorMod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@ElementsResourceGeneratorMod.ModElement.Tag
public class RecipeMiedziuchaOreSmelting extends ElementsResourceGeneratorMod.ModElement {
	public RecipeMiedziuchaOreSmelting(ElementsResourceGeneratorMod instance) {
		super(instance, 33);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockMiedziuchaOre.block, (int) (1)), new ItemStack(ItemMiedziuchaIngot.block, (int) (1)), 0.7F);
	}
}
