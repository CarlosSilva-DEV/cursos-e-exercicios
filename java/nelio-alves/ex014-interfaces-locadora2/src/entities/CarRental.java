package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CarRental {
	private LocalDateTime start;
	private LocalDateTime finish;
	private Vehicle vehicle;
	private Invoice invoice;
	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
	// Construtor
	public CarRental() {
	}

	public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) {
		this.start = start;
		this.finish = finish;
		this.vehicle = vehicle;
	}
	
	// getters e setters
	public LocalDateTime getStart() {
		return start;
	}
	public void setStart(String start) {
		LocalDateTime parsedStart = LocalDateTime.parse(start, dtf);
		this.start = parsedStart;
		
	}

	public LocalDateTime getFinish() {
		return finish;
	}
	public void setFinish(String finish) {
		LocalDateTime parsedFinish = LocalDateTime.parse(finish, dtf);
		this.finish = parsedFinish;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
}
