package com.resource;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
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
	 * Returns <a href=
	 * "https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html">Arraylist</a>
	 * of games according to filter on type available in warehouse
	 * 
	 * @param type takes game type as String
	 * @return list <a href=
	 *         "https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html">Arraylist</a>
	 *         of Game
	 * 
	 */

	public static List<Game> filterGame(GameType type) {
		List<Game> list = new ArrayList<Game>();
		System.out.println("Games having Type " + type);
		for (Game game : gameList) {
			if (game.getGameType().equals(type.getValue())) {
				list.add(game);
			}
		}
		return list;

	}

	/**
	 * Display list of game using <a href=
	 * "https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html">Arraylist</a>
	 * available warehouse
	 * 
	 * @param list takes ArrayList of Game
	 */
	public static void show(List<Game> list) {
		int count = 1;
		System.out.println("Game Title        Description                Price");
		for (Object game : list)
			System.out.println(count++ + "  " + ((Game) game).getTitle() + "      " + ((Game) game).getDescription()
					+ "  " + ((Game) game).getPrice());
	}

	/**
	 * Returns <a href=
	 * "https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html">Arraylist</a>
	 * of games according to filter on min max price available in warehouse
	 * 
	 * @param min minimum value for filter
	 * @param max maximum value for filter
	 * @return list <a href=
	 *         "https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html">Arraylist</a>
	 *         of Game
	 * 
	 */
	public static List<Game> filterGame(float min, float max) {
		List<Game> list = new ArrayList<Game>();
		System.out.println("Games having price between " + min + " and " + max);
		for (Game game : gameList) {
			if (game.getPrice() > min && game.getPrice() < max) {
				list.add(game);
			}
		}
		return list;

	}

	/**
	 * Returns <a href=
	 * "https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html">Arraylist</a>
	 * of games according to filter on type and min max price available in warehouse
	 * 
	 * @param type takes game type as String
	 * @param min  takes float for minimum value
	 * @param max  takes float for maximum value
	 * @return list <a href=
	 *         "https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html">Arraylist</a>
	 *         of Game
	 * 
	 */

	public static List<Game> filterGame(GameType type, float min, float max) {
		List<Game> list = new ArrayList<Game>();
		list = filterGame(type);
		list.retainAll(filterGame(min, max));
		return list;
	}
	/**
	 * Returns <a href=
	 * "https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html">Arraylist</a>
	 * of games available today in warehouse
	 * 
	 * @return list <a href=
	 *         "https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html">Arraylist</a>
	 *         of Game
	 * 
	 */
	public static List<Game> filterGame() {
		List<Game> list = gameList;
		Collections.sort(list);
		/*
		 * Iterator<Game> g= list.iterator(); while(g.hasNext()){
		 * if(((Game)g).getDate().after(Calendar.getInstance())) {
		 * //java.lang.ClassCastException: class java.util.ArrayList$Itr cannot be cast
		 * to class list.remove((Game)g); } g.next(); }
		 */
		List<Game> listGame = new ArrayList<Game>();
		for (Game game : list)
			if (game.getDate().before(Calendar.getInstance())) {
				listGame.add(game);
			}
		return listGame;
	}

	/**
	 * Returns <a href=
	 * "https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html">Arraylist</a>
	 * of upcoming games in warehouse
	 * @return 
	 * 
	 * @return list <a href=
	 *         "https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html">Arraylist</a>
	 *         of Game
	 * 
	 */
	public static List<Game> showUpComings() {
		List<Game> listGame = new ArrayList<Game>();
		for (Game game : gameList)
			if (game.getDate().after(Calendar.getInstance())) {
				listGame.add(game);
			}
		
		return listGame;
	}

}
