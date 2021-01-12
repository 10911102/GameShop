package com.resource;

import java.util.HashSet;
import java.util.Set;

/**
 * <h1>Warehouse</h1> This class having properties city and HashSet of Game
 * class objects included with getter() and setters(). In Warehouse we are
 * providing methods checkStoke() and removeGame() which take String as
 * parameter and manipulate the HashSet.
 * 
 * @author swapnilu
 *
 */

public class Warehouse {
	private String city = "Wagholi";
	private static Set<Game> gameSet = new HashSet<Game>();

	public Warehouse() {

	}

	public Warehouse(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public static Set<Game> getGameSet() {
		return gameSet;
	}

	public static void setGameSet(Set<Game> gameSet) {
		Warehouse.gameSet = gameSet;
	}

	public static boolean checkStock(String game) {
		Game g = new Game(game);
		return gameSet.contains(g);
	}

	public static boolean removeGame(String game) {
		Game g = new Game(game);
		return gameSet.remove(g);
	}

}
