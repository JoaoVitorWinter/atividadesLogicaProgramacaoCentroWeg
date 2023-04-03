import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[4][4];

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				System.out.println("Valor da " + (linha + 1) + "° linha da " + (coluna + 1) + "° coluna:");
				matriz[linha][coluna] = sc.nextInt();
			}
		}

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				if (linha == coluna) {
					System.out.print(matriz[linha][coluna] + " ");
				}
			}
		}

		System.out.println("");

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				if (linha != coluna) {
					System.out.print(matriz[linha][coluna] + " ");
				}
			}
		}

		sc.close();

	}

}
