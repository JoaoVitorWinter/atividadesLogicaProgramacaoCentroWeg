package atividades_vetor_4;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] vendedoresTotalDeVenda = new double[10], comissoes = new double[vendedoresTotalDeVenda.length];
		String[] nomes = new String[vendedoresTotalDeVenda.length];
		double totalDeVendas = 0, maiorValorReceber = 0, menorValorReceber = 0;
		int posicaoMenorValor = 0, posicaoMaiorValor = 0;

		for (int indice = 0; indice < nomes.length; indice++) {
			System.out.println("Nome do " + (indice + 1) + "° vendedor:");
			nomes[indice] = sc.next();

			System.out.println("Seu total de vendas em reais:");
			vendedoresTotalDeVenda[indice] = sc.nextDouble();
			totalDeVendas += vendedoresTotalDeVenda[indice];

			System.out.println("Seu percentual de comissão:");
			comissoes[indice] = sc.nextDouble();

			if (indice == 0) {
				maiorValorReceber = vendedoresTotalDeVenda[indice] * comissoes[indice] / 100;
				posicaoMaiorValor = indice;
				menorValorReceber = vendedoresTotalDeVenda[indice] * comissoes[indice] / 100;
				posicaoMenorValor = indice;
			}

			if (vendedoresTotalDeVenda[indice] * comissoes[indice] / 100 > maiorValorReceber) {
				maiorValorReceber = vendedoresTotalDeVenda[indice] * comissoes[indice] / 100;
				posicaoMaiorValor = indice;
			}

			if (vendedoresTotalDeVenda[indice] * comissoes[indice] / 100 < menorValorReceber) {
				menorValorReceber = vendedoresTotalDeVenda[indice] * comissoes[indice] / 100;
				posicaoMenorValor = indice;
			}

		}

		System.out.println("\nResultados:\n");
		System.out.println("Nome\t\tValor a receber");

		for (int indice = 0; indice < nomes.length; indice++) {
			System.out.println(nomes[indice] + "\t\tR$" + (vendedoresTotalDeVenda[indice] * comissoes[indice] / 100));
		}

		System.out.println("\nTotal de venda de todos os vendedores: R$" + totalDeVendas);
		System.out.println(nomes[posicaoMaiorValor] + " receberá o maior valor: R$" + maiorValorReceber);
		System.out.println(nomes[posicaoMenorValor] + " receberá o menor valor: R$" + menorValorReceber);

		sc.close();

	}

}
