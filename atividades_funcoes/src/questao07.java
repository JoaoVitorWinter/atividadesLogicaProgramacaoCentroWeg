import java.util.Scanner;

public class questao07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número inteiro:");

		System.out.println("Fatorial deste número: " + fatorial(sc.nextInt()));

		sc.close();

	}

	static int fatorial(int numero) {
		for (int i = numero - 1; i > 1; i--) {
			numero *= i;
		}
		return numero;
	}

}
