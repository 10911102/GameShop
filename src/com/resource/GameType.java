package com.resource;

enum GameType {
	ACT("Action"),
	ACTAD("Action_Adventure"), 
	AD("Adventure"), 
	RPG("Role_Playling"), 
	SIMULATION("Simulation"), 
	STRATEGY("Stratrgy"), 
	SPORTS("Sports"), 
	PUZZLE("Puzzle");
	
	private String value;
	private GameType(String value) {
		this.value=value;
	}
	public String getValue() {
		return this.value;
	}
	
}