package entities;

public class PessoaJuridica extends Pessoa {
	private Integer numOfEmployees;
	
	// Construtor
	public PessoaJuridica() {
	}

	public PessoaJuridica(String name, Double yearIncome, Integer numOfEmployees) {
		super(name, yearIncome);
		this.numOfEmployees = numOfEmployees;
	}
	
	// getters e setters
	public Integer getNumOfEmployees() {
		return numOfEmployees;
	}
	public void setNumOfEmployees(Integer numOfEmployees) {
		this.numOfEmployees = numOfEmployees;
	}
	
	// metodos
	@Override
	public Double calcTaxes() {
		Double total = 0.00;
		
		if (numOfEmployees > 10) {
			// imposto de 14%
			total = this.getYearIncome() * 0.14;
		} else if (numOfEmployees > 0) {
			// imposto de 16%
			total = this.getYearIncome() * 0.16;
		} else {
			System.out.println("Valor inválido: Número de Funcionários não pode ser menor ou igual a 0");
		}
		
		return total;
	}
}
