package atividades_vetor_4;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[6];
		int quantidadePares = 0;

		for (int indice = 0; indice < 6; indice++) {
			System.out.println((indice + 1) + "° número inteiro:");
			numeros[indice] = sc.nextInt();

			if (numeros[indice] % 2 == 0) {
				quantidadePares++;
			}
		}

		System.out.println("\nResultados:\n");
		System.out.println("Quantidade de números pares: " + quantidadePares);
		System.out.println("Os números pares são:");

		for (int numero : numeros) {

			if (numero % 2 == 0) {
				System.out.print(numero + " | ");
			}
		}

		System.out.println("\nQuantidade de números ímpares: " + (6 - quantidadePares));
		System.out.println("Os números ímpares são:");

		for (int numero : numeros) {

			if (numero % 2 != 0) {
				System.out.print(numero + " | ");
			}
		}

		sc.close();

	}

}
