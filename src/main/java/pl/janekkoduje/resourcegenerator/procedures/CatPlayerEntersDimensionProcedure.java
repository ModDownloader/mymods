package pl.janekkoduje.resourcegenerator.procedures;

import pl.janekkoduje.resourcegenerator.ResourceGeneratorModElements;
import pl.janekkoduje.resourcegenerator.ResourceGeneratorMod;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

@ResourceGeneratorModElements.ModElement.Tag
public class CatPlayerEntersDimensionProcedure extends ResourceGeneratorModElements.ModElement {
	public CatPlayerEntersDimensionProcedure(ResourceGeneratorModElements instance) {
		super(instance, 26);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ResourceGeneratorMod.LOGGER.warn("Failed to load dependency entity for procedure CatPlayerEntersDimension!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity && !entity.world.isRemote) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Attention! The tnt can crash minecraft"), (false));
		}
	}
}
