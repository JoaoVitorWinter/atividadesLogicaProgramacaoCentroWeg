package atividades_funcoes_4;

import java.util.Scanner;

public class questao04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");

		System.out.println("Reverso do numero: " + descobrirNumeroReverso(sc.nextInt()));
		
		sc.close();

	}

	static int descobrirNumeroReverso(int numero) {
		int quantidadeAlgarismos = 1;
		int numeroReverso = 0;
		int numeroAuxiliar = numero;

		while (numeroAuxiliar >= 10) {
			numeroAuxiliar /= 10;
			quantidadeAlgarismos++;
		}
		
		for (int indice = 0; indice < quantidadeAlgarismos; indice++) {
			numeroReverso += (numero % 10) * Math.pow(10, (quantidadeAlgarismos - indice - 1));
			numero /= 10;
		}

		return numeroReverso;
	}

}
