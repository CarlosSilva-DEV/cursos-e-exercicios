package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Funcionario> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many employees will be registered?: ");
		int qtde = input.nextInt();
		System.out.println();
		
		// criando funcionarios
		for (int i = 0; i < qtde; i++) {
			Funcionario f = new Funcionario();
			System.out.printf("Employee #%d ID: ", (i + 1));
			f.setId(input.nextLong());
			input.nextLine();
			System.out.printf("Employee #%d Name: ", (i + 1));
			f.setName(input.nextLine());
			System.out.printf("Employee #%d Salary: ", (i + 1));
			f.setSalary(input.nextDouble());
			
			
			list.add(f);
			System.out.println();
		}
		
		// exibindo funcionarios
		System.out.println();
		for (Funcionario f : list) {
			System.out.println("Employee #" + f.getId());
			System.out.println("Id: " + f.getId());
			System.out.println("Name: " + f.getName());
			System.out.printf("Salary: $ %.2f\n\n", f.getSalary());
		}
		
		// aumento de salário
		System.out.print("\nEnter the employee Id that will have salary increase: ");
		Long id = input.nextLong();
		
		Funcionario filtered = list.stream()
				.filter(x -> x.getId() == id)
				.findFirst().orElse(null);
		
		if (filtered == null) {
			System.out.println("Invalid or inexistent id");
		} else {
			System.out.print("Enter the percentage: ");
			Double percent = input.nextDouble();
			filtered.increaseSalary(percent);
		}
		
		// exibir dados atualizados
		System.out.println("\n\nList of employees:");
		for (Funcionario f : list) {
			System.out.println(f.toString());
		}
		
		input.close();
	}
}