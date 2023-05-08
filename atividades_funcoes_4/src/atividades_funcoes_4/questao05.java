package atividades_funcoes_4;

import java.util.Random;
import java.util.Scanner;

public class questao05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int primeiroLancamento, lancamentoNoJogo;

		primeiroLancamento = lancarDados(random);
		System.out.println("Primeiro lance de dados deu a soma de: " + primeiroLancamento);

		if (primeiroLancamento == 7 || primeiroLancamento == 11) {
			System.out.println("Você ganhou!\nVocê é um natural!");
		} else if (primeiroLancamento == 2 || primeiroLancamento == 3 || primeiroLancamento == 12) {
			System.out.println("Você perdeu!\nCraps!");
		} else {
			System.out.println("Seu ponto é " + primeiroLancamento);

			do {
				lancamentoNoJogo = lancarDados(random);
				
				System.out.println("Novo lançamento: "  + lancamentoNoJogo);

				if (lancamentoNoJogo == primeiroLancamento) {
					System.out.println("Você ganhou!");
					break;
				}

				if (lancamentoNoJogo == 7) {
					System.out.println("Você perdeu!");
					break;
				}

			} while (true);
		}

		sc.close();

	}

	static int lancarDados(Random random) {
		return random.nextInt(11) + 2;
	}

}
