package problema3.entities;

import problema3.entities.Product;

public class Product {
	private String name;
	private Double price;
	
	// Construtor
	public Product() {
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	// getters e setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	// metodos
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	// por ser método comum, trabalha com a referência this (sem parâmetro Product)
	public String upperCaseName() {
		return this.name.toUpperCase();
	}
}
