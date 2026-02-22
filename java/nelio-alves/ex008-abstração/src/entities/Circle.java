package entities;

import entities.enums.Color;

public class Circle extends Shape {
	private Double radius;
	
	// Construtor
	public Circle() {
		super();
	}

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}
	
	// getters e setters
	public Double getRadius() {
		return radius;
	}
	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	// metodos
	@Override
	public Double area() {
		return Math.PI * (radius * radius);
	}
}
