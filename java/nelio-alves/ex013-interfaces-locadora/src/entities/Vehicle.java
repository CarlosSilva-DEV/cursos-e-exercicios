package entities;

public class Vehicle {
	private String model;
	
	// Construtor
	public Vehicle() {
	}

	public Vehicle(String model) {
		this.model = model;
	}
	
	// getters e setters
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
}
