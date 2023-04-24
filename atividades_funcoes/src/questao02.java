import java.util.Scanner;

public class questao02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número inteiro:");

		System.out.println("Número absoluto: " + valorAbsoluto(sc.nextInt()));

		sc.close();

	}

	static int valorAbsoluto(int numero) {
		if (numero < 0) {
			numero *= -1;
		}

		return numero;
	}

}
