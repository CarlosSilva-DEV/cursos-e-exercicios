package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Defina um número de linhas para a matriz: ");
		int m = input.nextInt();
		System.out.print("Defina um número de colunas para a matriz: ");
		int n = input.nextInt();
		
		int[][] matriz = new int[m][n];
		
		// laço pra gerar a matriz 2d
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Insira um número: ");
				matriz[i][j] = input.nextInt();
			}
		}
		
		System.out.print("Insira o número que deseja buscar na matriz: ");
		int x = input.nextInt();
		
		// laço percorrendo linhas e colunas da matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				
				// verifica se o número atual é o número que desejamos buscar
				if (matriz[i][j] == x) {
					System.out.printf("Posição (linha, coluna): %d, %d\n", i, j);
					if (j > 0) {
						// mesma linha, 1 coluna antes
						System.out.printf("Esquerda: %d\n", matriz[i][j - 1]);
					}
					if (i > 0) {
						// linha acima, mesma coluna
						System.out.printf("Cima: %d\n", matriz[i - 1][j]);
					}
					if (j < matriz[i].length-1) {
						// mesma linha, 1 coluna após
						System.out.printf("Direita: %d\n", matriz[i][j + 1]);
					}
					if (i < matriz.length-1) {
						// linha abaixo, mesma coluna
						System.out.printf("Baixo: %d\n", matriz[i + 1][j]);
					}
				}
			}
		}
		
		input.close();
	}
}