package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Product p1 = new Product();
		
		System.out.println("Enter the product data: ");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Name: ");
		p1.setName(input.nextLine());
		System.out.print("Price: ");
		p1.setPrice(input.nextDouble());
		System.out.print("Quantity in stock: ");
		p1.setQuantity(input.nextInt());
		
		System.out.println("\n\nProduct data: " + p1.toString());
		
		
		System.out.print("\nEnter the number of products to be added in stock: ");
		p1.addProducts(input.nextInt());
		System.out.println("Updated data: " + p1.toString());
		
		System.out.print("\nEnter the number of products to be removed from stock: ");
		p1.removeProducts(input.nextInt());
		System.out.println("Updated data: " + p1.toString());
		
		input.close();
	}
}