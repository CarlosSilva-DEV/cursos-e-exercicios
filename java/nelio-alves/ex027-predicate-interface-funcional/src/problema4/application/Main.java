package problema4.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import problema4.entities.Product;

public class Main {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		// IMPLEMENTAÇÃO ATRAVÉS EXPRESSÃO LAMBDA DECLARADA
		Predicate<Product> pred = p -> p.getPrice() >= 100.00;
		list.removeIf(pred);
		
		for (Product p : list) {
			System.out.println(p);
		}
	}
}