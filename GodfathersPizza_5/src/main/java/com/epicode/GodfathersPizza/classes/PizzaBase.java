package com.epicode.GodfathersPizza.classes;

public abstract class PizzaBase {
	
	private String nome;
	private Double calories;
	private Double price;
	
	public String getMenuLine() {
		return this.nome + "- calories" + this.calories + "prezzo" + this.price;	
	}
	
	public PizzaBase(String nome, Double calories, Double price) {
		super();
		this.nome = nome;
		this.calories = calories;
		this.price = price;
	}

	public PizzaBase() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getCalories() {
		return calories;
	}

	public void setCalories(Double calories) {
		this.calories = calories;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "PizzaBase [nome=" + nome + ", calories=" + calories + ", price=" + price + "]";
	}
	
	
}
