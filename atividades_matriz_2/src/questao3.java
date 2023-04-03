import java.util.Scanner;

public class questao3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[][] matriz = new double[5][5];
		double somaTotal = 0, somaLinha4 = 0, somaColuna2 = 0, somaDiagonalPrincipal = 0, somaDiagonalSecundaria = 0;

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				System.out.println("Valor da " + (linha + 1) + "° linha da " + (coluna + 1) + "° coluna:");
				matriz[linha][coluna] = sc.nextDouble();
				somaTotal += matriz[linha][coluna];

				if (linha == 3) {
					somaLinha4 += matriz[linha][coluna];
				}

				if (coluna == 1) {
					somaColuna2 += matriz[linha][coluna];
				}

				if (coluna == linha) {
					somaDiagonalPrincipal += matriz[linha][coluna];
				}

				if (coluna == matriz[0].length - 1 - linha) {
					somaDiagonalSecundaria += matriz[linha][coluna];
				}
			}
		}

		System.out.println("\nResultados:\n");
		System.out.println("Soma da linha 4: " + somaLinha4);
		System.out.println("Soma da coluna 2: " + somaColuna2);
		System.out.println("Soma da diagonal principal: " + somaDiagonalPrincipal);
		System.out.println("Soma da diagonal secundária: " + somaDiagonalSecundaria);
		System.out.println("Soma total da matriz: " + somaTotal);

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				System.out.print(matriz[linha][coluna] + " ");
			}

			System.out.println("");
		}

		sc.close();

	}
}
