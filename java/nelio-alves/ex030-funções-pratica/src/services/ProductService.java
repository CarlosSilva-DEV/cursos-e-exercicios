package services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {
	
	// criando método que aceita um predicado como parâmetro
	public Double sumByFirstLetter(List<Product> list, Predicate<Product> criteria) {
		Double sum = 0.00;
		
		for (Product p : list) {
			if (criteria.test(p)) { // método interno de Predicate
				sum += p.getPrice();
			}
		}
		
		return sum;
	}
}