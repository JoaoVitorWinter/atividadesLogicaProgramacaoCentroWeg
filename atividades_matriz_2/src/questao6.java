import java.util.Scanner;

public class questao6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[7][8];

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				matriz[linha][coluna] = linha + coluna;
				System.out.print(matriz[linha][coluna] + " ");
			}
			System.out.println("");
		}

		sc.close();

	}

}
