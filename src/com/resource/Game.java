package com.resource;

/**
 * <h1>Game</h1> This class having properties title, description and price
 * included with getter() and setters(). In Warehouse we are going to put Game
 * objects in Hashset so hashCode() and equals() method on title is overridden.
 * If title is same then game should be same.
 * 
 * @author swapnilu
 *
 */
public class Game {
	private String title;
	private String description;
	private float price;

	public Game() {

	}

	public Game(String title) {
		super();
		this.title = title;
	}

	public Game(String title, String description, float price) {
		this.title = title;
		this.description = description;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Game [title=" + title + ", description=" + description + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return title.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null && obj instanceof Game)
			return false;
		return this.title.equals(((Game) obj).title);
	}

}
