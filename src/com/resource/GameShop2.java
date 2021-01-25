package com.resource;

import java.time.LocalTime;

/**
 * Construct Gameshop Object with city, openTime and closeTime.
 * 
 * @author swapnilu
 *
 */

public class GameShop2 extends Warehouse2 {
	private LocalTime openTime;
	private LocalTime closeTime;

	public GameShop2() {
		// super();
	}

	public GameShop2(String city, LocalTime openTime, LocalTime closeTime) {
		this.setCity(city);
		this.openTime = openTime;
		this.closeTime = closeTime;
	}

	public LocalTime getOpenTime() {
		return openTime;
	}

	public void setOpenTime(LocalTime openTime) {
		this.openTime = openTime;
	}

	public LocalTime getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(LocalTime closeTime) {
		this.closeTime = closeTime;
	}

	@Override
	public String toString() {
		return "GameShop2 [city=" + this.getCity() + " openTime=" + openTime + ", closeTime=" + closeTime + "]";
	}

	/**
	 * Status of the shop that currently shop is open or not. if shop is not open
	 * then shows the appropriate massage.
	 * 
	 * @return returns true if shop is open
	 * 
	 */
	public boolean isOpen() {
		boolean flag = (this.openTime.getHour() < (LocalTime.now().getHour())
				&& this.closeTime.getHour() > (LocalTime.now().getHour()));
		if (!flag) {
			System.out.println("Shop is Closed, Visit again between" + this.openTime.getHour() + " and "
					+ this.closeTime.getHour());
		}
		return flag;
	}

	/**
	 * Help to buy specific game from warehouse. Also checks for stock before
	 * placing order and removes the specified game from warehouse stock. and also
	 * take care of shop opening and closing time before checking the stock.
	 * 
	 * @param game Takes the game name as String
	 * @return Returns true if order successfully placed and false if not placed.
	 *
	 */
	public boolean buyGame(String game) {
		boolean flag = false;
		if (isOpen()) {
			if (Warehouse2.checkStock(game) && Warehouse2.removeGame(game)) {
				System.out.println("Order placed");
				flag = true;
			} else
				System.out.println("Sorry,Try another game this game will be availabe soon");
		}
		return flag;
	}

}
