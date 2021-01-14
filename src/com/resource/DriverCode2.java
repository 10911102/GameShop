package com.resource;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 * <h1>DriverCode2</h1> A Java Application for Game Shop and Warehouse Business
 * Communication This application will help Game Shop and Warehouse to make
 * business. This code is to test the application with different parameters
 * 
 * 
 * @author swapnilu
 * @version 1.0
 */
public class DriverCode2 {
	public static void main(String[] args) {
		List<Game> games = new ArrayList<Game>(); // Using collection ArrayList because insertion operation on list is
													// faster then other collection
		games.add(new Game("Contra", "Action", "Contra is a run and gun game", 100.2f));
		games.add(new Game("PubG", "Action", "Player Unknown's battleground", 111.5f));
		games.add(new Game("HitMan", "Action", "Sniper stimulation game", 120.5f));
		games.add(new Game("Chess", "Board", "Brain booster game", 10f));
		Warehouse2.setGameList(games);// setting list(Set)

		// Initializing and test on GameShop objects
		GameShop2 objPune = new GameShop2("Pune", LocalTime.of(10, 00), LocalTime.of(19, 00));
		GameShop2 objMumbai = new GameShop2("Mumbai", LocalTime.of(12, 00), LocalTime.of(21, 00));
		/*
		 * System.out.println(objPune); System.out.println(objMumbai);
		 * System.out.println(LocalTime.now());
		 */
		// Filter method on game type
		objPune.displayGameByType("Action");
		System.out.println();
		objMumbai.displayGameByPrice(100, 125);
		objMumbai.displayGameByTypeAndPrice("Action",100, 125);

		System.out.println();
		// Testing buyGame() with different objects and parameters
		objPune.buyGame("Contra");
		objMumbai.buyGame("Contra");
		objMumbai.buyGame("Contra");

	}
}
