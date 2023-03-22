import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetor1, vetor2;

		System.out.println("Tamanho dos vetores:");
		vetor1 = new int[sc.nextInt()];
		vetor2 = new int[vetor1.length];

		for (int indice = 0; indice < vetor1.length; indice++) {
			System.out.println((indice + 1) + "° valor do primeiro vetor:");
			vetor1[indice] = sc.nextInt();

			System.out.println((indice + 1) + "° valor do segundo vetor:");
			vetor2[indice] = sc.nextInt();
		}

		for (int i = 0; i < vetor1.length; i++) {
			for (int j = 0; j < vetor1.length; j++) {

				if (vetor1[i] == vetor2[j]) {
					System.out.println(
							"O primeiro vetor, na posição " + i + ", é igual ao segundo vetor na posição " + j);
					System.out.println("O valor de ambos é " + vetor1[i]);
				}

			}
		}

		sc.close();

	}

}
