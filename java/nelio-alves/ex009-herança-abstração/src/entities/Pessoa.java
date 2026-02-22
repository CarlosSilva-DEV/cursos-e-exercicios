package entities;

public abstract class Pessoa {
	private String name;
	private Double yearIncome;
	
	// Construtor
	public Pessoa() {
	}

	public Pessoa(String name, Double yearIncome) {
		this.name = name;
		this.yearIncome = yearIncome;
	}
	
	// getters e setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Double getYearIncome() {
		return yearIncome;
	}
	public void setYearIncome(Double yearIncome) {
		this.yearIncome = yearIncome;
	}
	
	// metodos
	public abstract Double calcTaxes();
}