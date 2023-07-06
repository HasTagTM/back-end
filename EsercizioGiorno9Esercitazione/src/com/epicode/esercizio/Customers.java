package com.epicode.esercizio;

public class Customers {
	private Long id;
	private String name;
	private Integer tier;
	public Customers(Long id, String name, Integer tier) {
		super();
		this.id = id;
		this.name = name;
		this.tier = tier;
	}
	@Override
	public String toString() {
		return "Customers [id=" + id + ", name=" + name + ", tier=" + tier + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getTier() {
		return tier;
	}
	public void setTier(Integer tier) {
		this.tier = tier;
	}
	
}
