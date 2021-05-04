package ru.OBC;

import org.bukkit.Location;
import org.bukkit.Material;


public class RandomTutorial {

	public static void random(int x, int y, int z, Location loc) {
		loc.getBlock().setType(Material.OAK_LOG);
	}
}
