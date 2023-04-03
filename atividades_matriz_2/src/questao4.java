import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[5][5], cubo = new int[5][5];

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				System.out.println("Valor da " + (linha + 1) + "° linha da " + (coluna + 1) + "° coluna:");
				matriz[linha][coluna] = sc.nextInt();
				cubo[linha][coluna] = (int) Math.pow(matriz[linha][coluna], 3);
			}
		}

		for (int linha = 0; linha < cubo.length; linha++) {
			for (int coluna = 0; coluna < cubo[0].length; coluna++) {
				System.out.print(cubo[linha][coluna] + " ");
			}
			System.out.println("");
		}

		sc.close();

	}

}
