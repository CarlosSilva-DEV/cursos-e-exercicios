package application;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Client c1 = new Client();
		Order o1 = new Order();
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		c1.setName(input.nextLine());
		System.out.print("Email: ");
		c1.setEmail(input.nextLine());
		System.out.print("Birth date (DD/MM/YYYY): ");
		String dateString = input.nextLine();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate birthDate = LocalDate.parse(dateString, dtf);
		c1.setBirthDate(birthDate);
		
		System.out.println("\nEnter order data:");
		System.out.print("Status (all caps): ");
		o1.setStatus(OrderStatus.valueOf(input.nextLine()));
		System.out.print("How many items to this order?: ");
		Integer n = input.nextInt();
		
		for (int i = 0; i < n; i++) {
			Product p = new Product();
			
			System.out.printf("\nEnter #%d item data:\n", i + 1);
			System.out.print("Product name: ");
			input.nextLine();
			p.setName(input.nextLine());
			System.out.print("Product price: ");
			p.setPrice(input.nextDouble());
			System.out.print("Quantity: ");
			Integer qtde = input.nextInt();
			
			OrderItem item = new OrderItem(qtde, p.getPrice(), p);
			
			o1.addItem(item);
		}
		
		o1.setClient(c1);
		
		System.out.println(o1);

		input.close();
	}
}