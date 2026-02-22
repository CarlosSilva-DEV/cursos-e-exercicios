package entities;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Instant moment;
	private OrderStatus status;
	private List<OrderItem> items = new ArrayList<>();
	private Client client;
	
	// Construtor
	public Order() {
		this.moment = Instant.now();
	}
	
	public Order(OrderStatus status) {
		this.moment = Instant.now();
		this.status = status;
	}
	
	// getters e setters
	public Instant getMoment() {
		return moment;
	}
	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public List<OrderItem> getItems() {
		return items;
	}
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	// metodos
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		Double total = 0.0;
		
		for (OrderItem i : items) {
			total += i.subTotal();
		}
		
		return total;
	}
	
	@Override
	public String toString() {
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
		String parsedInst = dtf1.format(moment);
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String parsedBirthDate = dtf2.format(client.getBirthDate());
		
		StringBuilder sb = new StringBuilder();
		sb.append("\n\nORDER SUMMARY\n");
		sb.append("-------------------------------------------------\n");
		sb.append("Order moment: " + parsedInst);
		sb.append("\nOrder status: " + status);
		sb.append("\nClient: " + this.client.getName() + " (" + parsedBirthDate + ") - " + this.client.getEmail());
		sb.append("\nOrder items:\n");
		
		for (OrderItem i : items) {
			sb.append(i.toString() + "\n");
		}
		
		sb.append("\nTotal price: $" + String.format("%.2f", this.total()));
		
		return sb.toString();
	}
}
