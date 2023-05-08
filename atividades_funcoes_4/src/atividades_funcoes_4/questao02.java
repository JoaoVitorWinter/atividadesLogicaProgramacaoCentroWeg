package atividades_funcoes_4;

import java.util.Scanner;

public class questao02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valorPrestacao, valorTotalPrestacoes = 0;
		int diasAtraso, quantidadePrestacoes = 0;
		
		do {
			System.out.print("Valor da prestação: ");
			valorPrestacao = sc.nextDouble();
			
			if (valorPrestacao == 0) {
				break;
			}
			
			System.out.print("Número de dias em atraso: ");
			diasAtraso = sc.nextInt();
			
			valorPrestacao = valorPagamento(valorPrestacao, diasAtraso);
			
			valorTotalPrestacoes += valorPrestacao;
			quantidadePrestacoes++;
			
			System.out.println("Valor a ser pago: R$" + valorPrestacao);
			
		} while (true);
		
		System.out.println("\nRelatório:");
		System.out.println("Quantidade de prestações pagas no dia: " + quantidadePrestacoes);
		System.out.println("Valor total das prestações pagas no dia: " + valorTotalPrestacoes);
		
		sc.close();

	}
	
	static double valorPagamento (double valor, int diasAtraso) {
		
		if (diasAtraso > 0) {
			return valor * (1 + 0.03 + diasAtraso * 0.001);
		}
		
		return valor;
	}

}
