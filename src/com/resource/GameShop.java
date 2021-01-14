package com.resource;

import java.time.LocalTime;

/**
 * Construct Gameshop Object with city, openTime and closeTime.
 * 
 * @author swapnilu
 *
 */

public class GameShop extends Warehouse {
	private LocalTime openTime;
	private LocalTime closeTime;

	public GameShop() {
		// super();
	}

	public GameShop(String city, LocalTime openTime, LocalTime closeTime) {
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
		if (this.openTime.getHour() < (LocalTime.now().getHour())
				&& this.closeTime.getHour() > (LocalTime.now().getHour())) {
			if (Warehouse.checkStock(game) && Warehouse.removeGame(game)) {
				System.out.println("Order placed");
				flag = true;
			} else
				System.out.println("Sorry,Try another game this game will be availabe soon");
		} else {
			System.out.println("Shop is Closed, Visit again between" + this.openTime.getHour() + " and "
					+ this.closeTime.getHour());
		}
		return flag;
	}

}
