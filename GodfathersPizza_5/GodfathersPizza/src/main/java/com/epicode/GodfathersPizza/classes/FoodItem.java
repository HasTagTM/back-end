package com.epicode.GodfathersPizza.classes;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "menu pizzeria")
public interface FoodItem {

	public String getName();
	public Double getPrice();
	
}
