package atividades_funcoes_4;

import java.util.Scanner;

public class questao12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("Digite um número: ");
		n = sc.nextInt();
		
		imprimirDesenho(n);
		
		sc.close();

	}
	
	static void imprimirDesenho(int n) {
		String[][] matriz;

		if (n % 2 == 0) {
			matriz = new String[n / 2 + 1][n * 2 - 1];

			for (int linha = 0; linha < matriz.length - 1; linha++) {
				for (int coluna = 0; coluna < matriz[0].length; coluna++) {
					if (coluna % 2 == 0) {
						matriz[linha][coluna] = "" + (linha * 2 + 2);
					} else {
						matriz[linha][coluna] = " ";
					}
				}
			}

			for (int linha = 0; linha < matriz.length - 2; linha++) {
				int contadorEspacos = ((matriz[0].length - 1) / 2) - (linha * 2 + 1);
				for (int coluna = 0; coluna < (matriz[0].length - 1) / 2; coluna++) {
					if (contadorEspacos > 0) {
						matriz[linha][coluna] = " ";
						contadorEspacos--;
					}
				}
			}

			for (int linha = 0; linha < matriz.length - 2; linha++) {
				int contadorEspacos = ((matriz[0].length - 1) / 2) - (linha * 2 + 1);
				for (int coluna = matriz[0].length - 1; coluna > (matriz[0].length + 1) / 2; coluna--) {
					if (contadorEspacos > 0) {
						matriz[linha][coluna] = " ";
						contadorEspacos--;
					}
				}
			}
		} else {
			matriz = new String[(n + 1) / 2 + 1][n * 2 - 1];

			for (int linha = 0; linha < matriz.length - 1; linha++) {
				for (int coluna = 0; coluna < matriz[0].length; coluna++) {
					if (coluna % 2 == 0) {
						matriz[linha][coluna] = "" + (linha * 2 + 1);
					} else {
						matriz[linha][coluna] = " ";
					}
				}
			}

			for (int linha = 0; linha < matriz.length - 2; linha++) {
				int contadorEspacos = ((matriz[0].length - 1) / 2) - (linha * 2);
				for (int coluna = 0; coluna < (matriz[0].length - 1) / 2; coluna++) {
					if (contadorEspacos > 0) {
						matriz[linha][coluna] = " ";
						contadorEspacos--;
					}
				}
			}

			for (int linha = 0; linha < matriz.length - 2; linha++) {
				int contadorEspacos = ((matriz[0].length - 1) / 2) - (linha * 2);
				for (int coluna = matriz[0].length - 1; coluna > (matriz[0].length + 1) / 2; coluna--) {
					if (contadorEspacos > 0) {
						matriz[linha][coluna] = " ";
						contadorEspacos--;
					}
				}
			}
		}

		for (int coluna = 0; coluna < matriz[0].length; coluna++) {
			matriz[matriz.length - 1][coluna] = "=";
		}

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				System.out.print(matriz[linha][coluna]);
			}
			System.out.println();
		}
	}

}
