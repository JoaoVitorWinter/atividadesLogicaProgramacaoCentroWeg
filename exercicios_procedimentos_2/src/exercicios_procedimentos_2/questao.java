package exercicios_procedimentos_2;

import java.util.Random;
import java.util.Scanner;

public class questao {
	static Random random = new Random();
	static int numeroSorteado = random.nextInt(1001);
	static int tentativas = 0, palpite;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Digite seu palpite:");
			palpite = sc.nextInt();
			tentativas++;

			maiorOuMenor();

		} while (palpite != numeroSorteado);
		
		sc.close();

	}

	static void maiorOuMenor() {
		if (palpite > numeroSorteado) {
			System.out.println("O palpite foi maior que o número sorteado!");
		} else if (palpite < numeroSorteado) {
			System.out.println("O palpite foi menor que o número sorteado!");
		} else {
			System.out.println("Você acertou o número em " + tentativas + " tentativa(s)");
		}
	}

}
