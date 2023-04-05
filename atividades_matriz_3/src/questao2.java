import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[][] matriz = new double[4][4];

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				System.out.println("Valor da " + (linha + 1) + "° linha da " + (coluna + 1) + "° coluna:");
				matriz[linha][coluna] = sc.nextDouble();
			}
		}

		System.out.println("\nResultados:\n");
		System.out.print("Elementos da diagonal principal: ");

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				if (linha == coluna) {
					System.out.print(matriz[linha][coluna] + " ");
				}
			}
		}

		System.out.print("\nElementos fora da diagonal principal: ");

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				if (linha != coluna) {
					System.out.print(matriz[linha][coluna] + " ");
				}
			}
		}

		System.out.print("\nElementos da diagonal secundária: ");

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				if (coluna == matriz[0].length - 1 - linha) {
					System.out.print(matriz[linha][coluna] + " ");
				}
			}
		}

		System.out.print("\nElementos fora da diagonal secundária: ");

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				if (coluna != matriz[0].length - 1 - linha) {
					System.out.print(matriz[linha][coluna] + " ");
				}
			}
		}

		System.out.print("\nElementos da diagonal principal e secundária: ");

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				if (coluna == matriz[0].length - 1 - linha || linha == coluna) {
					System.out.print(matriz[linha][coluna] + " ");
				}
			}
		}

		System.out.print("\nElementos fora da diagonal principal e secundária: ");

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				if (coluna != matriz[0].length - 1 - linha && linha != coluna) {
					System.out.print(matriz[linha][coluna] + " ");
				}
			}
		}

		sc.close();

	}

}
