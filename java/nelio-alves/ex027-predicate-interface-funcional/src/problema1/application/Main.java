package problema1.application;

import java.util.ArrayList;
import java.util.List;

import problema1.entities.Product;
import problema1.util.ProductPredicate;

public class Main {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		// IMPLEMENTAÇÃO DA INTERFACE PREDICATE
		list.removeIf(new ProductPredicate());
		
		for (Product p : list) {
			System.out.println(p);
		}
	}
}