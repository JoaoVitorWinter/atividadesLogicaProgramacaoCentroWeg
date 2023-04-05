import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[5][5];

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				System.out.println("Valor da " + (linha + 1) + "° linha da " + (coluna + 1) + "° coluna:");
				matriz[linha][coluna] = sc.nextInt();
			}
		}
		
		System.out.println("Resultados:");
		
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				if (coluna == matriz[linha][coluna]) {
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
