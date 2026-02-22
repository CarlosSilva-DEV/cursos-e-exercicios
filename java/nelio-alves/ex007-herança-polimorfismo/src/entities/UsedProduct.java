package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
	private LocalDate manufactureDate;
	
	// Construtor
	public UsedProduct() {
	}

	public UsedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	// getters e setters
	public LocalDate getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	// metodos
	@Override
	public String priceTag() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formattedDate = dtf.format(manufactureDate);
		
		return this.getName() 
				+ " (used) $ " 
				+ String.format("%.2f", this.getPrice()) 
				+ " (Manufacture date: " 
				+ formattedDate
				+ ")";
	}
}
