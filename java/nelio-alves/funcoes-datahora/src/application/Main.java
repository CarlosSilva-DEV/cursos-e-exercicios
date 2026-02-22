package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		LocalDate d1 = LocalDate.now();
		LocalDateTime d2 = LocalDateTime.now();
		Instant d3 = Instant.now();
		LocalDate d4 = LocalDate.parse("2022-07-20");
		LocalDateTime d5 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d6 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d7 = Instant.parse("2022-07-20T01:30:26-03:00");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d8 = LocalDate.parse("20/07/2022", fmt1);
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d9 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		LocalDate d10 = LocalDate.of(2026, 01, 29);
		LocalDateTime d11 = LocalDateTime.of(2026, 01, 29, 20, 03);
		
		
		// Instanciamento de datas (sistema) e conversão texto para data-hora
		System.out.println("LocalDate: " + d1);
		System.out.println("LocalDateTime: " + d2);
		System.out.println("Instant: " + d3);
		System.out.println("------------------------------------------------------------\n");

		System.out.println("LocalDate (parse): " + d4);
		System.out.println("LocalDateTime (parse): " + d5);
		System.out.println("Instant (parse): " + d6);
		System.out.println("Instant (parse com conversão de fuso): " + d7);
		System.out.println("------------------------------------------------------------\n");

		System.out.println("LocalDate (parse com formatação): " + d8);
		System.out.println("LocalDateTime (parse com formatação): " + d9);
		System.out.println("LocalDate (of): " + d10);
		System.out.println("LocalDateTime (of): " + d11);
		System.out.println("------------------------------------------------------------\n");
		
		
		// Conversão data-hora global para formato local
		Instant d12 = Instant.parse("2022-07-20T01:30:26Z");
		
		// convertendo um Instant para uma data local com o fuso padrão do sistema
		LocalDate r1 = LocalDate.ofInstant(d12, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d12, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d12, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d12, ZoneId.of("Portugal"));
		
		System.out.println("LocalDate (Instant convertido UTC): " + r1);
		System.out.println("LocalDate (Instant convertido Portugal): " + r2);
		System.out.println("LocalDateTime (Instant convertido UTC): " + r3);
		System.out.println("LocalDateTime (Instant convertido Portugal): " + r4);
		System.out.println("------------------------------------------------------------\n");
		
		
		// Extrair dados de formato data-hora local
		LocalDate d13 = LocalDate.parse("2022-07-20");
		LocalDateTime d14 = LocalDateTime.parse("2022-07-20T01:30:26");
		
		System.out.println("LocalDate (apenas dia): " + d13.getDayOfMonth());
		System.out.println("LocalDate (apenas mês): " + d13.getMonthValue());
		System.out.println("LocalDate (apenas ano): " + d13.getYear());
		
		System.out.println("LocalDateTime (apenas hora): " + d14.getHour());
		System.out.println("LocalDateTime (apenas minutos): " + d14.getMinute());
		System.out.println("LocalDateTime (apenas segundos): " + d14.getSecond());
	}
}