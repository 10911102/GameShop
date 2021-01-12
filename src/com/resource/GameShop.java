package com.resource;

import java.time.LocalTime;

/**
 * <h1>GameShop</h1> This class having properties openTime and closeTime
 * included with getter() and setters(). In Gameshop we are providing method to
 * buy a game from warehouse which take String as parameter and invokes the
 * checkStoke() and removeGame() from Warehouse.
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

	public boolean buyGame(String game) {
		boolean flag = false;
		if (this.openTime.getHour() < (LocalTime.now().getHour())
				&& this.closeTime.getHour() > (LocalTime.now().getHour())) {
			if (Warehouse.checkStock(game) && Warehouse.removeGame(game)) {
				System.out.println("Order placed");
				flag = true;
			}
			System.out.println("Sorry,Try another game this game will be availabe soon");
		} else {
			System.out.println("Shop is Closed, Visit again between" + this.openTime.getHour() + " and "
					+ this.closeTime.getHour());
		}
		return flag;
	}

}
