package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Worker w1 = new Worker();
		Department d1 = new Department();
		
		System.out.print("Enter department's name: ");
		d1.setName(input.nextLine());
		
		System.out.println("\nEnter worker data: ");
		System.out.print("Name: ");
		w1.setName(input.nextLine());
		System.out.print("Level: ");
		w1.setLevel(WorkerLevel.valueOf(input.nextLine()));
		System.out.print("Base Salary: $ ");
		w1.setBaseSalary(input.nextDouble());
		w1.setDepartment(d1);
		
		System.out.print("\n\nHow many contracts to this worker?: ");
		int n = input.nextInt();
		
		// laço para adicionar contratos
		for (int i = 0; i < n; i++) {
			HourContract c = new HourContract();
			
			System.out.printf("\nEnter contract #%d data: \n", i + 1);
			input.nextLine();
			System.out.print("Date (DD/MM/YYYY): ");
			String date = input.nextLine();
			
			// especifica formato diferente da String, cria LocalDate com base em String + formato
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate dateInstance = LocalDate.parse(date, dtf);
			c.setMoment(dateInstance);
			
			System.out.print("Value per hour: $ ");
			c.setValuePerHour(input.nextDouble());
			System.out.print("Duration (hours): ");
			c.setHours(input.nextInt());
			
			w1.addContract(c);
		}
		
		input.nextLine();
		System.out.print("\n\nEnter month and year to calculate income (MM/YYYY): ");
		
		String monthYear = input.nextLine();
		String[] v = monthYear.split("/");
		Double income = w1.income(Integer.parseInt(v[0]), Integer.parseInt(v[1]));
		
		System.out.printf("\nName: %s\n", w1.getName());
		System.out.printf("Department: %s\n", w1.getDepartment().getName());
		System.out.printf("Income for %s: $ %.2f", monthYear, income);
		input.close();
	}
}
