package com.epicode.GodfathersPizza.classes;

public abstract class Drink {
	private String name;
	private Double calories;
	private double price;
	
	public String getMenuLine() {
		return this.name + "calorie : " + this.calories + "prezzo: " + this.price;
	}
	
	public Drink(String name, Double calories, double price) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
	}
	
	
}
