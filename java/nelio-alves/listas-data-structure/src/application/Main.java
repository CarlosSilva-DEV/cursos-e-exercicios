package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// Generics não aceita tipos primitivos
		List<String> list = new ArrayList<>();

		// adicionar elementos à lista
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");

		// adicionar em posição específica
		list.add(2, "Marco");

		// for each para exibir cada elemento separadamente
		System.out.println("Nomes na lista (separadamente)");
		System.out.println("---------------------------------------------------");
		for (String i : list) {
			System.out.println(i);
		}
		
		
		// exibindo lista completa e o tamanho
		System.out.println("\n\nLista Completa");
		System.out.println("---------------------------------------------------");
		System.out.println(list);
		System.out.println("Tamanho da Lista: " + list.size());
		// buscando posição do elemento na lista (retorna -1 quando não existe)
		System.out.println("Posição de Bob: " + list.indexOf("Bob") + "\n\n");
		
		
		// - criando filtro, instanciando nova lista para filtrar a lista original através de stream
		List<String> filter = list.stream()
				.filter(x -> x.charAt(0) == 'A')
				.collect(Collectors.toList()); // reconvertendo para lista

		System.out.println("Filtros por letras");
		System.out.println("---------------------------------------------------");
		System.out.println("Nomes que começam com a letra 'A': " + filter);
		
		// buscando primeiro elemento da lista com base em lambda
		String name = list.stream()
				.filter(x -> x.charAt(0) == 'M')
				.findFirst().orElse(null);
		System.out.println("Primeiro elemento da lista com a letra M: " + name);
		
		
		
		/* remover elemento da lista 
		list.remove("Anna");
		
		// remover de posição específica
		list.remove(1);
	 
	 	// remover por predicado (expressão lambda)
		list.removeIf(x -> x.charAt(0) == 'M');
		 
		// for each para exibir cada elemento separadamente
		for (String i : list) {
	 		System.out.println(i);
		}
		 
		// exibindo lista completa e o tamanho
		System.out.println("\n" + list);
		System.out.println("Tamanho da Lista: " + list.size());
		System.out.println("Posição de Bob: " + list.indexOf("Bob") + "\n\n");
		*/
	}
}