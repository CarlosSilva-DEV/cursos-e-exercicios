package problema1.application;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetProgram {

	public static void main(String[] args) {
		// LinkedHashSet: implementação intermediária, elementos em ordem de adição
		Set<String> set = new LinkedHashSet<>();
		
		// operações de manipulação de Set (não exclusivas do LinkedHashSet)
		set.add("TV");
		set.add("Tablet");
		set.add("Telephone");
		set.add("Toaster");
		set.add("Notebook");
		set.add("Computer");
		
		System.out.println("ORIGINAL SET:");
		for (String s : set) {
			System.out.println(s);
		}
		System.out.println("contains 'Notebook'?: " + set.contains("Notebook"));
		
		set.remove("Notebook");
		set.removeIf(x -> x.length() <= 2);
		set.removeIf(x -> x.charAt(0) == 'T');
		
		System.out.println("\n\nSET AFTER REMOVAL:");
		for (String s : set) {
			System.out.println(s);
		}
		System.out.println("contains 'Notebook'?: " + set.contains("Notebook"));
	}
}