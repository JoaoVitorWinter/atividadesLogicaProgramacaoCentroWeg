package jogoDaVelha;

import java.util.Random;
import java.util.Scanner;

public class Questao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		char[][] jogoDaVelha = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
		int linhaJogada, colunaJogada;

		System.out.println("Bem-vindo ao jogo da velha!");
		System.out.println("Aqui, você jogará contra um bot!");

		for (int indice = 0; indice < 5; indice++) {
			// Mostrar o tabuleiro
			mostrarTabuleiro(jogoDaVelha);

			// Verificar tabuleiro
			if (verificarTabuleiro(jogoDaVelha, 'O')) {
				System.out.println("Você perdeu!");
				break;
			}

			// Jogada do jogador
			do {
				do {
					System.out.print("Linha da jogada: ");
					linhaJogada = sc.nextInt();

					if (linhaJogada == 1 || linhaJogada == 2 || linhaJogada == 3) {
						break;
					}

					System.out.println("Valor inválido! Apenas 1, 2, ou 3!");
				} while (true);

				do {
					System.out.print("Coluna da jogada: ");
					colunaJogada = sc.nextInt();

					if (colunaJogada == 1 || colunaJogada == 2 || colunaJogada == 3) {
						break;
					}

					System.out.println("Valor inválido! Apenas 1, 2, ou 3!");
				} while (true);

				linhaJogada--;
				colunaJogada--;

				if (verificarJogada(jogoDaVelha, linhaJogada, colunaJogada)) {
					jogoDaVelha[linhaJogada][colunaJogada] = 'X';
					break;
				}

				System.out.println("Lugar já ocupado!");

			} while (true);

			// Mostrar tabuleiro novamente
			mostrarTabuleiro(jogoDaVelha);

			// Verificar tabuleiro
			if (verificarTabuleiro(jogoDaVelha, 'X')) {
				System.out.println("Você ganhou!");
				break;
			} else if (indice == 4) {
				System.out.println("Você empatou!");
				break;
			}

			// Calcular jogada do bot
			do {
				linhaJogada = random.nextInt(3);
				colunaJogada = random.nextInt(3);

				if (verificarJogada(jogoDaVelha, linhaJogada, colunaJogada)) {
					jogoDaVelha[linhaJogada][colunaJogada] = 'O';
					System.out.println("Agora a jogada do robô!");
					break;
				}
			} while (true);

		}

		sc.close();

	}

	static void mostrarTabuleiro(char[][] matriz) {
		System.out.println();
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				System.out.print(" " + matriz[linha][coluna]);
				if (coluna == 0 || coluna == 1) {
					System.out.print(" |");
				}
			}
			System.out.println();
			if (linha == 0 || linha == 1) {
				System.out.println("---+---+---");
			}
		}

		System.out.println();
	}

	static boolean verificarJogada(char[][] matriz, int linha, int coluna) {
		if (matriz[linha][coluna] == 'X' || matriz[linha][coluna] == 'O') {
			return false;
		}

		return true;
	}

	static boolean verificarTabuleiro(char[][] matriz, char simbolo) {
		// Verificação linhas
		for (int linha = 0; linha < matriz.length; linha++) {
			if (matriz[linha][0] == simbolo && matriz[linha][0] == matriz[linha][1] && matriz[linha][1] == matriz[linha][2]) {
				return true;
			}
		}

		// Verificação colunas
		for (int coluna = 0; coluna < matriz[0].length; coluna++) {
			if (matriz[0][coluna] == simbolo && matriz[0][coluna] == matriz[1][coluna] && matriz[1][coluna] == matriz[2][coluna]) {
				return true;
			}
		}

		// Verificação diagonal principal
		if (matriz[0][0] == simbolo && matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2]) {
			return true;
		}

		// Verificação diagonal secundária
		if (matriz[0][2] == simbolo && matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0]) {
			return true;
		}

		return false;
	}

}
