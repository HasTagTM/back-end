package com.epicode.esercizio;

import java.time.LocalDate;
import java.util.List;

public class Order {
	private Long id;
	private String status;
	private LocalDate orderDate;
	private LocalDate delyveryDate;
	private List<Product> products;
	private Customers customers;
	public Order(Long id, String status, LocalDate orderDate, LocalDate delyveryDate, List<Product> products,
			Customers customers) {
		super();
		this.id = id;
		this.status = status;
		this.orderDate = orderDate;
		this.delyveryDate = delyveryDate;
		this.products = products;
		this.customers = customers;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", status=" + status + ", orderDate=" + orderDate + ", delyveryDate=" + delyveryDate
				+ ", products=" + products + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public LocalDate getDelyveryDate() {
		return delyveryDate;
	}
	public void setDelyveryDate(LocalDate delyveryDate) {
		this.delyveryDate = delyveryDate;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Customers getCustomers() {
		return customers;
	}
	public void setCustomers(Customers customers) {
		this.customers = customers;
	}
	
}
