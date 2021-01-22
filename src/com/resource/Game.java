package com.resource;

import java.util.Calendar;

/**
 * Constructs new Game object having properties title, description and price.
 * Objects are compared on title if title is same then object should be same.
 * 
 * 
 * @author swapnilu
 *
 */
public class Game implements Comparable<Game>{

	private String title;
	private GameType type;
	private String description;
	private float price;
	private Calendar date;

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

	public Game(String title, GameType type, String description, float price) {
		this.title = title;
		this.type = type;
		this.description = description;
		this.price = price;
		this.date=Calendar.getInstance();
	}
	public Game(String title, GameType type, String description, float price,Calendar date) {
		this.title = title;
		this.type = type;
		this.description = description;
		this.price = price;
		this.date=date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGameType() {
		return type.getValue();
	}

	public void setType(GameType type) {
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

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Game title=" + title + ", type=" + type.getValue() + ", description=" + description + ", price=" + price + "";
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

	@Override
	public int compareTo(Game o) {
		int re;
		if(this.date.before(o.date)) {
			re=-1;
		}else if(this.date.after(o.date)) {
			re=1;
		}else {
			re=0;
		}
		return re;
	}

}
