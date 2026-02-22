package services;

public class GermanyTaxService implements TaxService {
	
	@Override
	public Double tax(Double amount) {
		if (amount <= 100) {
			return amount * 0.10;
		} else {
			return amount * 0.35;
		}
	}
}