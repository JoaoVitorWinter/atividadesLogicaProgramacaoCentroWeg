import java.util.Scanner;

public class questao10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pesoCorporal, altura;

		System.out.print("Peso corporal em quilos: ");
		pesoCorporal = sc.nextDouble();

		System.out.print("Altura em metros:");
		altura = sc.nextDouble();

		System.out.println("IMC: " + calculoIMC(pesoCorporal, altura));
		System.out.println("Interpretação: " + interpretacaoIMC(calculoIMC(pesoCorporal, altura)));

		sc.close();

	}

	static double calculoIMC(double peso, double altura) {
		return peso / (altura * altura);
	}

	static String interpretacaoIMC(double imc) {
		if (imc < 20) {
			return "magro";
		} else if (imc <= 24) {
			return "normal";
		} else if (imc <= 29) {
			return "acima do peso";
		} else if (imc <= 34) {
			return "obeso";
		} else {
			return "muito obeso";
		}
	}

}
