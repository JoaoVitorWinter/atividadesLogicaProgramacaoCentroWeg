import java.util.Scanner;

public class questao09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero1, numero2;

		for (int indice = 0; indice < 10; indice++) {
			System.out.print("Digite um número inteiro positivo: ");
			numero1 = sc.nextInt();

			System.out.print("Digite outro: ");
			numero2 = sc.nextInt();

			System.out.println("Multiplicação de ambos: " + multiplicacao(numero1, numero2));
		}

		sc.close();

	}

	static int multiplicacao(int numero1, int numero2) {
		int resultado = 0;

		if (numero1 % 2 == 1) {
			resultado += numero2;
		}

		while (numero1 > 1) {
			numero1 /= 2;
			numero2 *= 2;

			if (numero1 % 2 == 1) {
				resultado += numero2;
			}
		}

		return resultado;

	}

}
