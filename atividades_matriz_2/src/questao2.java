import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[7][4];
		int menorValor = 0;
		String posicao = "";

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				System.out.println("Valor da " + (linha + 1) + "° linha da " + (coluna + 1) + "° coluna:");
				matriz[linha][coluna] = sc.nextInt();

				if (linha == 0 && coluna == 0) {
					menorValor = matriz[linha][coluna];
					posicao = "Linha: " + linha + "\n" + "Coluna: " + coluna;
				} else if (matriz[linha][coluna] < menorValor) {
					menorValor = matriz[linha][coluna];
					posicao = "Linha: " + linha + "\n" + "Coluna: " + coluna;
				}

			}
		}

		System.out.println("Menor valor:" + menorValor);
		System.out.println("Posição:\n" + posicao);

		sc.close();
	}

}
