import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] temperaturaMeses = new double[12];
		double maiorTemperatura, menorTemperatura;
		int posicaoMaiorTemperatura = 0, posicaoMenorTemperatura = 0;

		for (int indice = 0; indice < 12; indice++) {
			System.out.println("Temperatura do " + (indice + 1) + "° mês:");
			temperaturaMeses[indice] = sc.nextDouble();
		}

		maiorTemperatura = temperaturaMeses[0];
		menorTemperatura = maiorTemperatura;

		for (int indice = 1; indice < 12; indice++) {
			if (temperaturaMeses[indice] > maiorTemperatura) {
				maiorTemperatura = temperaturaMeses[indice];
				posicaoMaiorTemperatura = indice;
			}

			if (temperaturaMeses[indice] < menorTemperatura) {
				menorTemperatura = temperaturaMeses[indice];
				posicaoMenorTemperatura = indice;
			}
		}

		System.out.println("Maior temperatura do ano: " + maiorTemperatura + "°C");
		System.out.print("Mês da ocorrência: ");

		switch (posicaoMaiorTemperatura) {
		case 0:
			System.out.println("janeiro.");
			break;
		case 1:
			System.out.println("fevereiro.");
			break;
		case 2:
			System.out.println("março.");
			break;
		case 3:
			System.out.println("abril.");
			break;
		case 4:
			System.out.println("maio.");
			break;
		case 5:
			System.out.println("junho.");
			break;
		case 6:
			System.out.println("julho.");
			break;
		case 7:
			System.out.println("agosto.");
			break;
		case 8:
			System.out.println("setembro.");
			break;
		case 9:
			System.out.println("outubro.");
			break;
		case 10:
			System.out.println("novembro.");
			break;
		case 11:
			System.out.println("dezembro.");
			break;
		}

		System.out.println("Menor temperatura do ano: " + menorTemperatura + "°C");
		System.out.print("Mês da ocorrência: ");

		switch (posicaoMenorTemperatura) {
		case 0:
			System.out.println("janeiro.");
			break;
		case 1:
			System.out.println("fevereiro.");
			break;
		case 2:
			System.out.println("março.");
			break;
		case 3:
			System.out.println("abril.");
			break;
		case 4:
			System.out.println("maio.");
			break;
		case 5:
			System.out.println("junho.");
			break;
		case 6:
			System.out.println("julho.");
			break;
		case 7:
			System.out.println("agosto.");
			break;
		case 8:
			System.out.println("setembro.");
			break;
		case 9:
			System.out.println("outubro.");
			break;
		case 10:
			System.out.println("novembro.");
			break;
		case 11:
			System.out.println("dezembro.");
			break;
		}

		sc.close();

	}

}
