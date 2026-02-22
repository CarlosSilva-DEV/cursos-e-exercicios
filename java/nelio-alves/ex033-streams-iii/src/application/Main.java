package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the file path: ");
		String path = input.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			List<Product> products = new ArrayList<>();
			
			String line = br.readLine();
			
			while (line != null) {
				String[] fields = line.split(",");
				
				products.add(new Product(fields[0], Double.parseDouble(fields[1])));
				
				line = br.readLine();
			}
			
			List<Double> prices = new ArrayList<>();
			
			// adicionar valores a lista prices
			for (int i = 0; i < products.size(); i++) {
				prices.add(products.get(i).getPrice());
			}
			
			// pipeline: obtém Produtos pelo preço e realiza cálculo da media
			Double avg = products.stream()
					.map(p -> p.getPrice())
					.reduce(0.0, (x, y) -> x + y) / products.size();
			
			System.out.println("\nAverage price: $ " + String.format("%.2f", avg));
			
			// comparator: expressão pra comparar duas Strings
			Comparator<String> comparator = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			// pipeline:
			List<String> names = products.stream()
					.filter(p -> p.getPrice() < avg) // filtro por preços abaixo da média
					.map(p -> p.getName()) // obtém nomes dos Produtos
					.sorted(comparator.reversed()) // ordena com lógica do Comparator e a inverte (decrescente)
					.collect(Collectors.toList()); // conversão pra lista
			
			names.forEach(System.out::println);
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			input.close();
		}
	}
}