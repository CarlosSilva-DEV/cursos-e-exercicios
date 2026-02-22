package services;

public class BrazilInterestService implements InterestService {
	private Double interestRate;
	
	// Construtor
	public BrazilInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	// metodos
	@Override
	public Double getInterestRate() {
		return interestRate;
	}
}