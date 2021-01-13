package com.resource;

import java.util.HashSet;
import java.util.Set;

/**
 * Constructs the object of warehouse class having properties city and HashSet
 * of Game class objects. In Warehouse we checking stock and removing Game.
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

	/**
	 * check for game in <a href=
	 * "https://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html">hashset</a>
	 * of games warehouse
	 * 
	 * @param Takes game name as String
	 * @return Returns true if game in stock and false if not in stock.
	 */
	public static boolean checkStock(String game) {
		Game g = new Game(game);
		return gameSet.contains(g);
	}

	/**
	 * removes the game from <a href=
	 * "https://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html">hashset
	 * </a> of games in warehouse
	 * 
	 * @param Takes game name as String
	 * @return Returns true if game is deleted from hashset and false if not
	 *         deleted.
	 */
	public static boolean removeGame(String game) {
		Game g = new Game(game);
		return gameSet.remove(g);
	}

}
