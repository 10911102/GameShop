package com.resource;

enum Type {
	ACTION("Game having more action"),
	AXTION_ADVENTURE(null), 
	ADVENTURE(null), 
	ROLE_PLYAING(null), 
	SIMULATION(null), 
	STRATEGY("Game played with good strategy"), 
	SPORTS(null), 
	PUZZLE(null);
	
	private String description;
	private Type(String description) {
		this.description=description;
	}
	public String getDescription() {
		return this.description;
	}
	
}