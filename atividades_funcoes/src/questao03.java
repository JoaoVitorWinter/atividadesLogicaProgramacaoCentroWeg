import java.util.Scanner;

public class questao03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número inteiro:");

		if (parImpar(sc.nextInt())) {
			System.out.println("O número é par!");
		} else {
			System.out.println("O número é ímpar!");
		}

		sc.close();

	}

	static boolean parImpar(int numero) {
		if (numero % 2 == 0) {
			return true;
		}
		return false;
	}

}
