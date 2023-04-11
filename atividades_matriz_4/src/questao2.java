import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		String[][] matriz;

		System.out.print("Digite um valor inteiro: ");
		n = sc.nextInt();

		matriz = new String[n + 3][n * 4 + 5];

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				if (coluna == 0 || coluna == matriz[0].length - 1) {
					matriz[linha][coluna] = "*";
				}

				if (coluna == (matriz[0].length - 1) / 2 && (linha != 0 && linha != matriz.length - 1)) {
					matriz[linha][coluna] = "*";
				}

				if (linha == 0 && (coluna != 0 && coluna != matriz[0].length - 1)) {
					matriz[linha][coluna] = "=";
				}

				if (linha == matriz.length - 1 && coluna != 0 && coluna != matriz[0].length - 1) {
					matriz[linha][coluna] = "-";
				}

			}
		}

		for (int linha = matriz.length - 2; linha > 0; linha--) {
			int contadorDoNumero = matriz.length - 2 - linha;
			for (int coluna = ((matriz[0].length - 1) / 2) - 1; coluna > 0; coluna--) {
				if (coluna % 2 == 0 && contadorDoNumero > 0 && linha <= n) {
					matriz[linha][coluna] = "" + (matriz.length - 2 - linha);
					contadorDoNumero--;
				} else {
					matriz[linha][coluna] = " ";
				}
			}
		}

		for (int linha = matriz.length - 2; linha > 0; linha--) {
			int contadorDoNumero = matriz.length - 2 - linha;
			for (int coluna = ((matriz[0].length + 1) / 2); coluna < matriz[0].length - 1; coluna++) {
				if (coluna % 2 == 0 && contadorDoNumero > 0 && linha <= n) {
					matriz[linha][coluna] = "" + (matriz.length - 2 - linha);
					contadorDoNumero--;
				} else {
					matriz[linha][coluna] = " ";
				}
			}
		}

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				System.out.print(matriz[linha][coluna]);
			}
			System.out.println();
		}

		sc.close();

	}

}
