package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.printf("\nProduct #%d data:\n", i + 1);
			System.out.print("Common, used or imported (c/u/i)? ");
			char productType = input.next().charAt(0);

			switch (productType) {
			case 'c':
				Product p1 = new Product();
				
				input.nextLine();
				System.out.print("Name: ");
				p1.setName(input.nextLine());
				System.out.print("Price: ");
				p1.setPrice(input.nextDouble());

				list.add(p1);
				break;
			case 'u':
				UsedProduct p2 = new UsedProduct();
				
				input.nextLine();
				System.out.print("Name: ");
				p2.setName(input.nextLine());
				System.out.print("Price: ");
				p2.setPrice(input.nextDouble());
				input.nextLine();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String dateString = input.nextLine();

				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate parsedDate = LocalDate.parse(dateString, dtf);
				p2.setManufactureDate(parsedDate);

				list.add(p2);
				break;
			case 'i':
				ImportedProduct p3 = new ImportedProduct();
				
				input.nextLine();
				System.out.print("Name: ");
				p3.setName(input.nextLine());
				System.out.print("Price: ");
				p3.setPrice(input.nextDouble());
				System.out.print("Customs fee: ");
				p3.setCustomsFee(input.nextDouble());

				list.add(p3);
				break;
			default:
				System.out.println("Caractere inválido! Por favor, tente novamente");
			}
		}
		
		System.out.println("\n\nPRICE TAGS:");
		
		for (Product p : list) {
			System.out.println(p.priceTag());
		}

		input.close();
	}
}