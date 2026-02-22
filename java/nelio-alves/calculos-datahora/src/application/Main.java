package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		LocalDate d1 = LocalDate.parse("2026-01-30");
		LocalDateTime d2 = LocalDateTime.parse("2026-01-30T11:59:26");
		Instant d3 = Instant.parse("2026-01-30T11:59:26Z");

		// LocalDate
		LocalDate pastWeekLD = d1.minusDays(7);
		LocalDate nextWeekLD = d1.plusDays(7);

		System.out.println("LocalDate (Past Week): " + pastWeekLD);
		System.out.println("LocalDate (Next Week): " + nextWeekLD);
		System.out.println("");

		// LocalDateTime
		LocalDateTime pastWeekLDT = d2.minusDays(7);
		LocalDateTime nextWeekLDT = d2.plusDays(7);

		System.out.println("LocalDateTime (Past Week): " + pastWeekLDT);
		System.out.println("LocalDateTime (Next Week): " + nextWeekLDT);
		System.out.println("");

		// Instant
		Instant pastWeekInst = d3.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInst = d3.plus(7, ChronoUnit.DAYS);

		System.out.println("Instant (Past Week): " + pastWeekInst);
		System.out.println("Instant (Next Week): " + nextWeekInst);
		System.out.println("");
		
		// Duration (considera data com horas)
		Duration t1 = Duration.between(pastWeekInst, nextWeekInst);
		
		System.out.println("Instant (Duration between Past and Next Week: " + t1.toDays());
	}
}