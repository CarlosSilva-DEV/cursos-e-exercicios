package entities;

public class Funcionario {
	private Long id;
	private String name;
	private Double salary;
	
	// Construtor
	public Funcionario() {
	}
	
	public Funcionario(Long id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	// getters e setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id= id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	// metodos
	public Double increaseSalary(Double x) {
		Double percent = x / 100;
		this.salary += (salary * percent);
		return salary;
	}
	public String toString() {
		return id 
				+ ", " 
				+ name 
				+ ", " 
				+ String.format("%.2f", salary);
	}
}
