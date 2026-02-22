package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = input.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("\nTax payer #%d data:\n", i + 1);
			System.out.print("Individual or company (i/c)? ");
			char typeOfPayer = input.next().charAt(0);
			
			switch (typeOfPayer) {
				case 'i':
					PessoaFisica pf = new PessoaFisica();
					
					input.nextLine();
					System.out.print("Name: ");
					pf.setName(input.nextLine());
					System.out.print("Anual income: ");
					pf.setYearIncome(input.nextDouble());
					System.out.print("Health expenditures: ");
					pf.setHealthExpenses(input.nextDouble());
					
					list.add(pf);
					break;
				case 'c':
					PessoaJuridica pj = new PessoaJuridica();
					
					input.nextLine();
					System.out.print("Name: ");
					pj.setName(input.nextLine());
					System.out.print("Anual income: ");
					pj.setYearIncome(input.nextDouble());
					System.out.print("Number of Employees: ");
					pj.setNumOfEmployees(input.nextInt());
					
					list.add(pj);
					break;
			}
		}
		
		System.out.println("\n\nTAXES PAID:");
		Double total = 0.00;
		
		for (Pessoa p : list) {
			Double tax = p.calcTaxes();
			System.out.println(p.getName() + ": $ " + String.format("%.2f", tax));
			total += tax;
		}
		
		System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", total));
		
		input.close();
	}
}