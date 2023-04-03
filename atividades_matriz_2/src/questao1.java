import java.util.Scanner;

public class questao1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[5][5];
		int quantidadePares = 0;
		double somaPares = 0;

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				System.out.println("Valor da " + (linha + 1) + "° linha da " + (coluna + 1) + "° coluna:");
				matriz[linha][coluna] = sc.nextInt();

				if (matriz[linha][coluna] % 2 == 0) {
					quantidadePares++;
					somaPares += matriz[linha][coluna];
				}

			}
		}

		System.out.println("Média dos números pares: " + (somaPares / quantidadePares));

		sc.close();

	}
}
