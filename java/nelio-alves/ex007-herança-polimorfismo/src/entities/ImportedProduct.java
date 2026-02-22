package entities;

public class ImportedProduct extends Product {
	private Double customsFee;
	
	// Construtor
	public ImportedProduct() {
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	//getters e setters
	public Double getCustomsFee() {
		return customsFee;
	}
	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	// metodos
	@Override
	public String priceTag() {
		return this.getName() 
				+ " $ " 
				+ String.format("%.2f", this.totalPrice()) 
				+ " (Customs fee: $ " 
				+ String.format("%.2f", customsFee) 
				+ ")";
	}
	
	public Double totalPrice() {
		return this.getPrice() + customsFee;
	}
}
