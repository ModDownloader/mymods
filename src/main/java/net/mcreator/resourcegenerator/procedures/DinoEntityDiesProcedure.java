package net.mcreator.resourcegenerator.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.entity.item.ExperienceOrbEntity;

import net.mcreator.resourcegenerator.ResourceGeneratorModElements;
import net.mcreator.resourcegenerator.ResourceGeneratorMod;

import java.util.Map;

@ResourceGeneratorModElements.ModElement.Tag
public class DinoEntityDiesProcedure extends ResourceGeneratorModElements.ModElement {
	public DinoEntityDiesProcedure(ResourceGeneratorModElements instance) {
		super(instance, 51);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure DinoEntityDies!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure DinoEntityDies!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure DinoEntityDies!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		for (int index0 = 0; index0 < (int) (50); index0++) {
			ResourceGeneratorMod.LOGGER.debug("Dino Zdech\u0142");
			ResourceGeneratorMod.LOGGER.info("Dino Zdech\u0142");
			ResourceGeneratorMod.LOGGER.warn("Dino Zdech\u0142");
			ResourceGeneratorMod.LOGGER.error("Dino Zdech\u0142");
			ResourceGeneratorMod.LOGGER.fatal("Dino Zdech\u0142");
			if (world instanceof World && !world.getWorld().isRemote) {
				world.getWorld().addEntity(new ExperienceOrbEntity(world.getWorld(), x, 100, z, (int) 1000000));
			}
		}
	}
}
