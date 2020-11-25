package pl.janekkoduje.resourcegenerator.procedure;

import pl.janekkoduje.resourcegenerator.ElementsResourceGeneratorMod;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsResourceGeneratorMod.ModElement.Tag
public class ProcedureEmeraldGeneratorBlockIsPlacedBy extends ElementsResourceGeneratorMod.ModElement {
	public ProcedureEmeraldGeneratorBlockIsPlacedBy(ElementsResourceGeneratorMod instance) {
		super(instance, 13);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure EmeraldGeneratorBlockIsPlacedBy!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).addExperienceLevel((int) 10);
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(Blocks.EMERALD_BLOCK, (int) (1));
			_setstack.setCount(10);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
	}
}
