package entities;

public class Department {
	private String name;
	
	// Construtor
	public Department() {
	}
	
	public Department(String name) {
		this.name = name;
	}
	
	// getters e setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}