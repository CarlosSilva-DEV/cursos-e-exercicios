public class Main {
	public static void main(String[] args) {
		String nome = "Carlos Daniel da Silva   ";
		
		// funções de formatação de Strings
		System.out.println(nome.toLowerCase());
		System.out.println(nome.toUpperCase());
		System.out.println(nome.trim() + "\n"); // remove espaços no início e final da String
		
		// funções para recortar Strings
		System.out.println(nome.substring(2));
		System.out.println(nome.substring(0, 6) + "\n");
		
		// funções para substituir Strings
		System.out.println(nome.replace('a', 'v').replace('o', 'x').replace('e', 'x').replace('i', '1') + "\n");
		
		// funções para buscar Strings
		System.out.println(nome.indexOf("C"));
		System.out.println(nome.lastIndexOf("a") + "\n");
		
		// Recebe um elemento delimitador e separa a String
		String[] v = nome.split(" ");
		System.out.println(v[0]);
		System.out.println(v[1]);
		System.out.println(v[2]);
		System.out.println(v[3]);
	}
}
