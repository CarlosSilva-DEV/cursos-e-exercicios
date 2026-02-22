package problema5.application;

import java.util.ArrayList;
import java.util.List;

import problema5.entities.Product;

public class Main {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		// IMPLEMENTAÇÃO ATRAVÉS EXPRESSÃO LAMBDA IN-LINE
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
		
		// usando reference method pro sysout
		list.forEach(System.out::println);
	}
}