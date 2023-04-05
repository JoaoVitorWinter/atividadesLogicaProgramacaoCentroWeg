import java.util.Scanner;

public class questao6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[5][5];
		int valor;

		System.out.println("Digite um valor:");
		valor = sc.nextInt();

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				matriz[linha][coluna] = valor;

				if ((linha == 0 && coluna == 0) || (linha == 0 && coluna == matriz[0].length - 1)
						|| (linha == matriz.length - 1 && coluna == 0)
						|| (linha == matriz.length -1  && coluna == matriz[0].length - 1)
						|| (linha == (matriz.length - 1) / 2 && coluna == (matriz[0].length - 1) / 2)) {
					System.out.print(matriz[linha][coluna] + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		sc.close();

	}

}
