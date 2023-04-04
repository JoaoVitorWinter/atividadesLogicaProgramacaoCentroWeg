import java.util.Scanner;

public class FolhaPagamento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] funcionarios;
		double[][] salarioEDescontos;
		double somaSalariosBrutos = 0, somaDescontosINSS = 0, somaDescontosImpostoDeRenda = 0, somaSalariosLiquidos = 0;

		System.out.println("Quantidade de funcionários:");
		funcionarios = new String[(sc.nextInt())];
		salarioEDescontos = new double[funcionarios.length][4];

		if (funcionarios.length > 0) {
			for (int indice = 0; indice < funcionarios.length; indice++) {

				do {
					System.out.println("Nome do " + (indice + 1) + "° funcionário: ");
					funcionarios[indice] = sc.next();

					if (funcionarios[indice].length() >= 2) {
						break;
					}

					System.out.println("Informação inválida!\nInsira novamente!");
				} while (true);

				do {
					System.out.println("Salário do funcionário em reais:");
					salarioEDescontos[indice][0] = sc.nextDouble();

					if (salarioEDescontos[indice][0] >= 465) {
						break;
					}

					System.out.println("Informação inválida!\nInsira novamente!");
				} while (true);

				if (salarioEDescontos[indice][0] <= 965.67) {
					salarioEDescontos[indice][1] = salarioEDescontos[indice][0] * 0.08;
				} else if (salarioEDescontos[indice][0] <= 1609.45) {
					salarioEDescontos[indice][1] = salarioEDescontos[indice][0] * 0.09;
				} else if (salarioEDescontos[indice][0] <= 3218.9) {
					salarioEDescontos[indice][1] = salarioEDescontos[indice][0] * 0.11;
				} else {
					salarioEDescontos[indice][1] = 354.07;
				}

				if (salarioEDescontos[indice][0] <= 1434) {
					salarioEDescontos[indice][2] = 0;
				} else if (salarioEDescontos[indice][0] <= 2150) {
					salarioEDescontos[indice][2] = salarioEDescontos[indice][0] * 0.075;
				} else if (salarioEDescontos[indice][0] <= 2886) {
					salarioEDescontos[indice][2] = salarioEDescontos[indice][0] * 0.15;
				} else if (salarioEDescontos[indice][0] <= 3582) {
					salarioEDescontos[indice][2] = salarioEDescontos[indice][0] * 0.225;
				} else {
					salarioEDescontos[indice][2] = salarioEDescontos[indice][0] * 0.275;
				}

				salarioEDescontos[indice][3] = salarioEDescontos[indice][0] - salarioEDescontos[indice][1]
						- salarioEDescontos[indice][2];
				somaSalariosBrutos += salarioEDescontos[indice][0];
				somaDescontosINSS += salarioEDescontos[indice][1];
				somaDescontosImpostoDeRenda += salarioEDescontos[indice][2];
				somaSalariosLiquidos += salarioEDescontos[indice][3];

			}

			System.out.println("\nResumo da folha de pagamento:");

			for (int indice = 0; indice < funcionarios.length; indice++) {
				System.out.println("Funcionário: " + funcionarios[indice]);
				System.out.println("Salário bruto: " + salarioEDescontos[indice][0]);
				System.out.println("Desconto INSS: " + salarioEDescontos[indice][1]);
				System.out.println("Desconto imposto de renda: " + salarioEDescontos[indice][2]);
				System.out.println("Salário líquido: " + salarioEDescontos[indice][3] + "\n");
			}

			System.out.println("Somas:");
			System.out.println("Soma dos salários brutos: R$" + somaSalariosBrutos);
			System.out.println("Soma dos descontos do INSS: R$" + somaDescontosINSS);
			System.out.println("Soma dos descontos do imposto de renda: R$" + somaDescontosImpostoDeRenda);
			System.out.println("Soma dos salários líquidos: R$" + somaSalariosLiquidos);

		} else {
			System.out.println("Informação inválida! Encerrando programa...");
		}

		sc.close();

	}

}
