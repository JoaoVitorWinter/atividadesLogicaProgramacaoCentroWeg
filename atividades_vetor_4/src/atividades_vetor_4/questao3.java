package atividades_vetor_4;

import java.util.Random;
import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		double[] temperaturas = new double[121];
		double menorTemperatura = 0, maiorTemperatura = 0, somaTemperaturas = 0;

		for (int indice = 0; indice < temperaturas.length; indice++) {
			temperaturas[indice] = random.nextDouble() * 25 + 15;
			somaTemperaturas += temperaturas[indice];

			if (indice == 0) {
				menorTemperatura = temperaturas[indice];
				maiorTemperatura = temperaturas[indice];
			}

			if (temperaturas[indice] > maiorTemperatura) {
				maiorTemperatura = temperaturas[indice];
			}

			if (temperaturas[indice] < menorTemperatura) {
				menorTemperatura = temperaturas[indice];
			}

		}

		System.out.println("Resultados:\n");
		System.out.println("Menor temperatura ocorrida: " + menorTemperatura + "°C");
		System.out.println("Maior temperatura ocorrida:" + maiorTemperatura + "°C");
		System.out.println("Média de temperaturas do período:" + (somaTemperaturas / temperaturas.length) + "°C");

		sc.close();

	}

}
