package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.printf("\nEmployee #%d data:\n", i + 1);
			System.out.print("Outsourced? (y/n) ");
			char employeeType = input.next().charAt(0);

			if (employeeType == 'y') {
				OutsourcedEmployee e1 = new OutsourcedEmployee();
				
				input.nextLine();
				System.out.print("Name: ");
				e1.setName(input.nextLine());
				System.out.print("Hours: ");
				e1.setHours(input.nextInt());
				System.out.print("Value per hour: $ ");
				e1.setValuePerHour(input.nextDouble());
				System.out.print("Additional charge: $ ");
				e1.setAdditionalCharge(input.nextDouble());
				
				list.add(e1);
				
			} else if (employeeType == 'n') {
				Employee e1 = new Employee();
				
				input.nextLine();
				System.out.print("Name: ");
				e1.setName(input.nextLine());
				System.out.print("Hours: ");
				e1.setHours(input.nextInt());
				System.out.print("Value per hour: $ ");
				e1.setValuePerHour(input.nextDouble());
				
				list.add(e1);
			} else {
				System.out.println("Caractere inválido, tente novamente");
			}
		}
		
		System.out.println("\n\nPAYMENTS:");
		
		for (Employee e : list) {
			System.out.println(e.getName() + " - $ " + e.payment());
		}
		
		input.close();
	}
}