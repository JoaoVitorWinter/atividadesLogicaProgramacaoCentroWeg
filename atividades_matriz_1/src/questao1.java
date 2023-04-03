import java.util.Scanner;

public class questao1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matrizA, matrizB, matrizSom, matrizSub, matrizMul;
		int linhas, colunas;

		System.out.println("Quantidade de linhas:");
		linhas = sc.nextInt();

		System.out.println("Quantidade de colunas:");
		colunas = sc.nextInt();

		matrizA = new int[linhas][colunas];
		matrizB = new int[matrizA.length][matrizA[0].length];
		matrizSom = new int[matrizA.length][matrizA[0].length];
		matrizSub = new int[matrizA.length][matrizA[0].length];
		matrizMul = new int[matrizA.length][matrizA[0].length];

		for (int linha = 0; linha < matrizA.length; linha++) {
			for (int coluna = 0; coluna < matrizA[0].length; coluna++) {
				System.out
						.println("Valor da matriz A na " + (linha + 1) + "° linha e na " + (coluna + 1) + "° coluna:");
				matrizA[linha][coluna] = sc.nextInt();

				System.out
						.println("Valor da matriz B na " + (linha + 1) + "° linha e na " + (coluna + 1) + "° coluna:");
				matrizB[linha][coluna] = sc.nextInt();

				matrizSom[linha][coluna] = matrizA[linha][coluna] + matrizB[linha][coluna];
				matrizSub[linha][coluna] = matrizA[linha][coluna] - matrizB[linha][coluna];
				matrizMul[linha][coluna] = matrizA[linha][coluna] * matrizB[linha][coluna];
			}
		}

		System.out.println("\nResultados:\n");

		System.out.println("Soma:");
		for (int linha = 0; linha < matrizSom.length; linha++) {
			for (int coluna = 0; coluna < matrizSom[0].length; coluna++) {
				System.out.print(matrizSom[linha][coluna] + " | ");
			}
			System.out.println("");
		}

		System.out.println("Subtração:");
		for (int linha = 0; linha < matrizSub.length; linha++) {
			for (int coluna = 0; coluna < matrizSub[0].length; coluna++) {
				System.out.print(matrizSub[linha][coluna] + " | ");
			}
			System.out.println("");
		}

		System.out.println("Multiplicação:");
		for (int linha = 0; linha < matrizMul.length; linha++) {
			for (int coluna = 0; coluna < matrizMul[0].length; coluna++) {
				System.out.print(matrizMul[linha][coluna] + " | ");
			}
			System.out.println("");
		}

		sc.close();

	}
}
