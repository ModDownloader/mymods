
package pl.janekkoduje.resourcegenerator.item;

import pl.janekkoduje.resourcegenerator.creativetab.TabGenerators;
import pl.janekkoduje.resourcegenerator.ElementsResourceGeneratorMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.Set;
import java.util.HashMap;

@ElementsResourceGeneratorMod.ModElement.Tag
public class ItemHiperkilof extends ElementsResourceGeneratorMod.ModElement {
	@GameRegistry.ObjectHolder("resource_generator:hiperkilof")
	public static final Item block = null;
	public ItemHiperkilof(ElementsResourceGeneratorMod instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("HIPERKILOF", 50, 500, 27f, 0f, 10)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 50);
				return ret.keySet();
			}

			@Override
			@SideOnly(Side.CLIENT)
			public boolean hasEffect(ItemStack itemstack) {
				return true;
			}
		}.setUnlocalizedName("hiperkilof").setRegistryName("hiperkilof").setCreativeTab(TabGenerators.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("resource_generator:hiperkilof", "inventory"));
	}
}
