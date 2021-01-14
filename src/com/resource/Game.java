package com.resource;

/**
 * Constructs new Game object having properties title, description and price.
 * Objects are compared on title if title is same then object should be same.
 * 
 * 
 * @author swapnilu
 *
 */
public class Game {
	private String title;
	private String type;
	private String description;
	private float price;

	public Game() {

	}

	public Game(String title) {
		this.title = title;
	}

	public Game(String title, String description, float price) {
		this.title = title;
		this.description = description;
		this.price = price;
	}

	public Game(String title, String type, String description, float price) {
		this.title = title;
		this.type = type;
		this.description = description;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
		return "Game title=" + title + ", type=" + type + ", description=" + description + ", price=" + price + "";
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
