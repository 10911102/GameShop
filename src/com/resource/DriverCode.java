
package com.resource;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

/**
 * <h1>GameShop</h1> A Java Application for Game Shop and Warehouse Business
 * Communication This application will help Game Shop and Warehouse to make
 * business. This code is to test the application with different parameters
 * 
 * 
 * @author swapnilu
 * @version 1.0
 */
public class DriverCode {
	public static void main(String[] args) {
		Set<Game> games = new HashSet<Game>(); // Using collection HashSet because searching operation on set is
		games.add(new Game("Contra", "Action Game", 100.2f));// faster then other collection
		games.add(new Game("PubG", "Action Game", 111.5f));
		games.add(new Game("Chess", "Board Game", 10f));
		Warehouse.setGameSet(games);// setting list(Set)

		// Initializing and test on GameShop objects
		GameShop objPune = new GameShop("Pune", LocalTime.of(10, 00), LocalTime.of(19, 00));
		GameShop objMumbai = new GameShop("Mumbai", LocalTime.of(12, 00), LocalTime.of(21, 00));
		System.out.println(objPune);
		System.out.println(objMumbai);
		System.out.println(LocalTime.now());
		// Testing buyGame() with different objects and parameters
		objPune.buyGame("Contra");
		objMumbai.buyGame("Contra");
		objMumbai.buyGame("Contra");

	}

}
