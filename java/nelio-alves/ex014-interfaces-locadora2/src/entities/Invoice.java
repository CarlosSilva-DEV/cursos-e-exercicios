package entities;

public class Invoice {
	private Double basicPayment;
	private Double tax;
	
	// Construtor
	public Invoice() {
	}

	public Invoice(Double basicPayment, Double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}
	
	// getters e setters
	public Double getBasicPayment() {
		return basicPayment;
	}
	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public Double getTax() {
		return tax;
	}

	public Double totalPayment() {
		return basicPayment + tax;
	}
}
