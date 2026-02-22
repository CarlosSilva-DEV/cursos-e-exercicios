package entities;

import java.time.LocalDate;

public class HourContract {
	private LocalDate moment;
	private Double valuePerHour;
	private Integer hours;
	
	// Construtor
	public HourContract() {
	}

	public HourContract(LocalDate moment, Double valuePerHour, Integer hours) {
		this.moment = moment;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}
	
	// getters e setters
	public LocalDate getMoment() {
		return moment;
	}
	public void setMoment(LocalDate moment) {
		this.moment = moment;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}
	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	// metodos
	public Double totalValue() {
		return valuePerHour * hours;
	}

	@Override
	public String toString() {
		return "HourContract [moment=" + moment 
				+ ", valuePerHour=" + valuePerHour 
				+ ", hours=" + hours + "]";
	}
	
	
}
