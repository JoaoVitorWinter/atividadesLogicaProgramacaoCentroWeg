package atividades_vetor_4;

import java.util.ArrayList;
import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> nomes = new ArrayList<String>();
		String nomeProcurar;
		int opcao, posicaoProcurar;

		do {
			System.out.println("======== MENU ======== \r\n" + "1) Cadastrar nome \r\n" + "2) Pesquisar nome \r\n"
					+ "3) Listar todos os nome \r\n" + "4) Excluir nome \r\n" + "5) Mudar nome \r\n"
					+ "0) Sair do programa \r\n" + "——————– \r\n" + "Digite sua escolha:");
			opcao = sc.nextInt();

			switch (opcao) {
			case 0:
				System.out.println("Tchau!");
				break;
			case 1:
				System.out.println((nomes.size() + 1) + "° nome:");
				nomes.add(sc.next());
				break;
			case 2:
				System.out.println("Digite um nome para procurar:");
				nomeProcurar = sc.next();

				for (int indice = 0; indice < nomes.size(); indice++) {

					if (nomeProcurar.equals(nomes.get(indice))) {
						System.out.println("Nome encontrado!\nPosição: " + indice);
						break;
					}

					if (indice == nomes.size() - 1) {
						System.out.println("Nome não localizado!");
					}

				}

				break;
			case 3:
				System.out.println("Lista dos nomes:");

				for (String nome : nomes) {
					System.out.println(nome);
				}

				break;
			case 4:
				System.out.println("Posição do nome que será apagado:");
				posicaoProcurar = sc.nextInt();

				if (posicaoProcurar >= 0 && posicaoProcurar < nomes.size() && nomes.size() > 0) {
					nomes.remove(posicaoProcurar);
					System.out.println("Nome removido!");
				} else {
					System.out.println("Posicão inexistente!");
				}

				break;
			case 5:
				System.out.println("Posição do nome que será mudado:");
				posicaoProcurar = sc.nextInt();

				if (posicaoProcurar >= 0 && posicaoProcurar < nomes.size() && nomes.size() > 0) {
					System.out.println("Novo nome:");
					nomes.set(posicaoProcurar, sc.next());
				} else {
					System.out.println("Posicão inexistente!");
				}
				break;

			default:
				System.out.println("Opção inválida!");
			}
		} while (opcao != 0);

		sc.close();

	}

}
