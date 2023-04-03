import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[6][6];
		int x;

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				System.out.println((linha + 1) + "° linha da " + (coluna + 1) + "° coluna:");
				matriz[linha][coluna] = sc.nextInt();
			}
		}

		System.out.println("Valor a ser procurado:");
		x = sc.nextInt();

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				if (matriz[linha][coluna] == x) {
					System.out.println("Encontrado!");
					System.out.println("Linha: " + linha);
					System.out.println("Coluna: " + coluna);
					linha = matriz.length;
					break;
				}

				if (linha == matriz.length - 1 && coluna == matriz[0].length - 1) {
					System.out.println("Não encontrado!");
				}
			}
		}

		sc.close();

	}

}
