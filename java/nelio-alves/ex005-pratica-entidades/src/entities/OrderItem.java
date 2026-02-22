package entities;

public class OrderItem {
	private Integer quantity;
	private Double price;
	private Product product;
	
	// Construtor
	public OrderItem() {
	}
	
	public OrderItem(Integer quantity, Double price, Product product) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	
	// getters e setters
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Product getProduct() {
		return product;
	}
	
	// metodos
	public Double subTotal() {
		return price * quantity;
	}

	@Override
	public String toString() {
		return this.product.getName() 
				+ ", $" + String.format("%.2f", price) 
				+ ", Quantity: " + quantity 
				+ ", Subtotal: $" + String.format("%.2f", this.subTotal());
	}
}
