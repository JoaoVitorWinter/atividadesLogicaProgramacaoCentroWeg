import java.util.Scanner;

public class questao15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroDaAposta, quantidadeDezenasApostadas, quantidadeTemo = 0, quantidadeQuadra = 0, quantidadeQuina = 0;
		int[] dezenasSorteadas = new int[5], dezenasApostadas;
		String numerosTresAcertos = "", numerosQuatroAcertos = "", numerosCincoAcertos = "";

		for (int indice = 0; indice < dezenasSorteadas.length; indice++) {
			System.out.print((indice + 1) + "° dezena sorteada: ");
			dezenasSorteadas[indice] = sc.nextInt();
		}

		while (true) {
			System.out.print("Número da aposta: ");
			numeroDaAposta = sc.nextInt();

			if (numeroDaAposta == 0) {
				break;
			}

			System.out.print("Quantidade de dezenas apostadas: ");
			quantidadeDezenasApostadas = sc.nextInt();

			if (quantidadeDezenasApostadas > 10) {
				quantidadeDezenasApostadas = 10;
			}

			dezenasApostadas = new int[quantidadeDezenasApostadas];

			for (int indice = 0; indice < quantidadeDezenasApostadas; indice++) {
				System.out.print((indice + 1) + "° dezena apostada: ");
				dezenasApostadas[indice] = sc.nextInt();
			}

			if (verificarAcertos(dezenasSorteadas, dezenasApostadas) == 3) {
				numerosTresAcertos += numeroDaAposta + " ";
				quantidadeTemo++;
			} else if (verificarAcertos(dezenasSorteadas, dezenasApostadas) == 4) {
				numerosQuatroAcertos += numeroDaAposta + " ";
				quantidadeQuadra++;
			} else if (verificarAcertos(dezenasSorteadas, dezenasApostadas) >= 5) {
				numerosCincoAcertos += numeroDaAposta + " ";
				quantidadeQuina++;
			}
		}

		System.out.println("\nResultados:\n");
		System.out.println("Número das apostas de três acertos: " + numerosTresAcertos);
		System.out.println("Quantidade de apostas que fizeram o temo: " + quantidadeTemo);
		System.out.println("Número das apostas de quatro acertos: " + numerosQuatroAcertos);
		System.out.println("Quantidade de apostas que fizeram a quadra: " + quantidadeQuadra);
		System.out.println("Número das apostas de cinco acertos: " + numerosCincoAcertos);
		System.out.println("Quantidade de apostas que fizeram a quina: " + quantidadeQuina);
		
		sc.close();

	}

	static int verificarAcertos(int[] dezenasSorteadas, int[] dezenasApostadas) {
		int acertos = 0;
		for (int indiceSorteada = 0; indiceSorteada < dezenasSorteadas.length; indiceSorteada++) {
			for (int indiceAposta = 0; indiceAposta < dezenasApostadas.length; indiceAposta++) {
				if (dezenasSorteadas[indiceSorteada] == dezenasApostadas[indiceAposta]) {
					acertos++;
					break;
				}
			}
		}

		return acertos;
	}

}
