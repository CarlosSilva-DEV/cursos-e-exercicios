package problema3.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import problema3.entities.Product;

public class Main {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		/* IMPLEMENTAÇÃO ATRAVÉS DE METHOD REFERENCE (COMUM)
		 * stream() = transforma a lista em sequência de dados (stream)
		 * map() = aplica uma função para cada dado na stream
		 * collect() = transforma a stream em uma lista
		 */
		
		List<String> names = list.stream()
				.map(Product::upperCaseName).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}
}