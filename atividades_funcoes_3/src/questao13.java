import java.util.Scanner;

public class questao13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número inteiro:");

		System.out.println("O número da sequência de Fibonacci nessa posição é: " + fibonacci(sc.nextInt()));

		sc.close();

	}

	static int fibonacci(int posicao) {
		int numero1 = 1;
		int numero2 = 0;

		for (int indice = 1; indice <= posicao; indice++) {
			if (indice % 2 == 1) {
				numero1 += numero2;
			} else {
				numero2 += numero1;
			}
		}

		if (posicao % 2 == 1) {
			return numero1;
		} else {
			return numero2;
		}
	}

}
