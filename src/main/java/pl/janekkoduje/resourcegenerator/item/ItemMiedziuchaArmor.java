
package pl.janekkoduje.resourcegenerator.item;

import pl.janekkoduje.resourcegenerator.ElementsResourceGeneratorMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@ElementsResourceGeneratorMod.ModElement.Tag
public class ItemMiedziuchaArmor extends ElementsResourceGeneratorMod.ModElement {
	@GameRegistry.ObjectHolder("resource_generator:miedziucha_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("resource_generator:miedziucha_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("resource_generator:miedziucha_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("resource_generator:miedziucha_armorboots")
	public static final Item boots = null;
	public ItemMiedziuchaArmor(ElementsResourceGeneratorMod instance) {
		super(instance, 44);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("MIEDZIUCHA_ARMOR", "resource_generator:miedziucha", 100,
				new int[]{15, 15, 15, 15}, 50,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("miedziucha_armorhelmet")
				.setRegistryName("miedziucha_armorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("miedziucha_armorbody")
				.setRegistryName("miedziucha_armorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("miedziucha_armorlegs")
				.setRegistryName("miedziucha_armorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("miedziucha_armorboots")
				.setRegistryName("miedziucha_armorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("resource_generator:miedziucha_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("resource_generator:miedziucha_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("resource_generator:miedziucha_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("resource_generator:miedziucha_armorboots", "inventory"));
	}
}
