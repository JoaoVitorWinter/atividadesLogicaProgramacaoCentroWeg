import java.util.Scanner;

public class questao7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matriz;
		int valor, linhas, colunas;

		System.out.println("Tamanho da matriz (linha):");
		linhas = sc.nextInt();
		System.out.println("Tamanho da matriz (coluna):");
		colunas = sc.nextInt();

		matriz = new int[linhas][colunas];

		System.out.println("Digite um valor:");
		valor = sc.nextInt();

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				matriz[linha][coluna] = valor;

				if ((linha == 0 && coluna == 0) || (linha == 0 && coluna == matriz[0].length - 1)
						|| (linha == matriz.length - 1 && coluna == 0)
						|| (linha == matriz.length - 1 && coluna == matriz[0].length - 1)) {
					System.out.print(matriz[linha][coluna] + " ");

				} else if (matriz.length % 2 == 1 && matriz[0].length % 2 == 1) {
					if (linha == (matriz.length - 1) / 2 && coluna == (matriz[0].length - 1) / 2 && matriz.length > 2
							&& matriz[0].length > 2) {
						System.out.print(matriz[linha][coluna] + " ");
					} else {
						System.out.print("  ");
					}
				} else if (matriz.length % 2 == 0 && matriz[0].length % 2 == 0) {
					if ((linha == matriz.length / 2 || linha == matriz.length / 2 - 1)
							&& (coluna == matriz[0].length / 2 || coluna == matriz[0].length / 2 - 1)
							&& matriz.length > 2 && matriz[0].length > 2) {
						System.out.print(matriz[linha][coluna] + " ");
					} else {
						System.out.print("  ");
					}
				} else if (matriz.length % 2 == 0 && matriz[0].length % 2 == 1) {
					if ((linha == matriz.length / 2 || linha == matriz.length / 2 - 1)
							&& coluna == (matriz[0].length - 1) / 2 && matriz.length > 2 && matriz[0].length > 2) {
						System.out.print(matriz[linha][coluna] + " ");
					} else {
						System.out.print("  ");
					}
				} else {
					if (linha == (matriz.length - 1) / 2
							&& (coluna == matriz[0].length / 2 || coluna == matriz[0].length / 2 - 1)
							&& matriz.length > 2 && matriz[0].length > 2) {
						System.out.print(matriz[linha][coluna] + " ");
					} else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}

		sc.close();

	}

}
