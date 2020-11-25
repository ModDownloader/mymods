package pl.janekkoduje.resourcegenerator.procedure;

import pl.janekkoduje.resourcegenerator.ElementsResourceGeneratorMod;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsResourceGeneratorMod.ModElement.Tag
public class ProcedureBlok extends ElementsResourceGeneratorMod.ModElement {
	public ProcedureBlok(ElementsResourceGeneratorMod instance) {
		super(instance, 18);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Blok!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(Blocks.EMERALD_BLOCK, (int) (1));
			_setstack.setCount(64);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
	}
}