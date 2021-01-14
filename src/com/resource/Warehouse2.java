package com.resource;

import java.util.ArrayList;
import java.util.List;

/**
 * Constructs the object of warehouse class having properties city and HashSet
 * of Game class objects. In Warehouse we checking stock and removing Game.
 * 
 * @author swapnilu
 *
 */
public class Warehouse2 {
	private String city = "Wagholi";
	private static List<Game> gameList = new ArrayList<Game>();

	public Warehouse2() {
	}

	public Warehouse2(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public static List<Game> getGameList() {
		return gameList;
	}

	public static void setGameList(List<Game> gameList) {
		Warehouse2.gameList = gameList;
	}

	/**
	 * check for game in <a href=
	 * "https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html">Arraylist</a>
	 * of games warehouse
	 * 
	 * @param Takes game name as String
	 * @return Returns true if game in stock and false if not in stock.
	 */
	public static boolean checkStock(String game) {
		Game g = new Game(game);
		return gameList.contains(g);
	}

	/**
	 * removes the game from <a href=
	 * "https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html">Arraylist
	 * </a> of games in warehouse
	 * 
	 * @param Takes game name as String
	 * @return Returns true if game is deleted from ArrayList and false if not
	 *         deleted.
	 */
	public static boolean removeGame(String game) {
		Game g = new Game(game);
		return gameList.remove(g);
	}

	/**
	 * Display list of game filter on type using <a href=
	 * "https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html">Arraylist</a>
	 * available warehouse
	 * 
	 * @param type takes game type as String
	 * 
	 */

	public static void showGameByType(String type) {
		int count = 1;
		System.out.println("Game Title        Description                Price");
		for (Game game : gameList) {
			if (game.getType().equals(type)) {
				System.out.println(
						count++ + "  " + game.getTitle() + "      " + game.getDescription() + "  " + game.getPrice());
			}
		}

	}

	/**
	 * Display list of game between min and max parameters using <a href=
	 * "https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html">Arraylist</a>
	 * available warehouse
	 * 
	 * @param min takes float for minimum value
	 * @param max takes float for maximum value
	 */
	public static void showGameByPrice(float min, float max) {
		int count = 1;
		System.out.println("Games having price between " + min + " and " + max);
		System.out.println("Game Title        Description                Price");
		for (Game game : gameList) {
			if (game.getPrice() > min && game.getPrice() < max) {
				System.out.println(
						count++ + "  " + game.getTitle() + "      " + game.getDescription() + "  " + game.getPrice());
			}
		}

	}

	/**
	 * Display list of game having same type and between min and max parameters
	 * using <a href=
	 * "https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html">Arraylist</a>
	 * available warehouse
	 * 
	 * @param type takes game type as String
	 * @param min  takes float for minimum value
	 * @param max  takes float for maximum value
	 */

	public static void showGameByTypeAndPrice(String type, float min, float max) {
		int count = 1;
		System.out.println("Games having Type " + type + " price between " + min + " and " + max);
		System.out.println("Game Title        Description                Price");
		for (Game game : gameList) {
			if (game.getType().equals(type)) {
				if (game.getPrice() > min && game.getPrice() < max) {
					System.out.println(count++ + "  " + game.getTitle() + "      " + game.getDescription() + "  "
							+ game.getPrice());
				}
			}
		}

	}

}
