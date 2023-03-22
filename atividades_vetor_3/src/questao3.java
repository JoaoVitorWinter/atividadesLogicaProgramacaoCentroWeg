import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetorX = new int[15];

		for (int indice = 0; indice < 15; indice++) {
			System.out.println("Número:");
			vetorX[indice] = sc.nextInt();

			if (vetorX[indice] < 0) {
				vetorX[indice] = 0;
			}
		}

		System.out.println("Vetor modificado:");

		for (int numero : vetorX) {
			System.out.print(numero + " | ");
		}

		sc.close();

	}

}
