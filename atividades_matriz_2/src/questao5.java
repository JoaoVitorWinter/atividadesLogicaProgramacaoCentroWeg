import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[][] matriz = new double[3][4];

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				System.out.println("Valor da " + (linha + 1) + "° linha da " + (coluna + 1) + "° coluna:");
				matriz[linha][coluna] = sc.nextInt();
			}
		}

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {

				if (coluna == 0) {

					if (linha == 0) {
						System.out.println("Valor do canto superior esquerdo: " + matriz[linha][coluna]);
					}

					if (linha == matriz.length - 1) {
						System.out.println("Valor do canto inferior esquerdo: " + matriz[linha][coluna]);
					}

				}

			}
		}

		sc.close();

	}

}
