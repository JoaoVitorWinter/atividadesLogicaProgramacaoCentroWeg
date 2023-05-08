package atividades_funcoes_4;

import java.util.Scanner;

public class questao03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");

		System.out.println("Quantidade de algarismos: " + calcularQuantidadeNumeros(sc.nextInt()));
		
		sc.close();

	}

	static int calcularQuantidadeNumeros(int numero) {
		int quantidadeAlgarismos = 1;

		while (numero >= 10) {
			numero /= 10;
			quantidadeAlgarismos++;
		}

		return quantidadeAlgarismos;
	}

}
