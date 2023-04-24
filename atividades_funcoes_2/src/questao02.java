import java.util.Scanner;

public class questao02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;

		System.out.print("Digite um número inteiro: ");
		a = sc.nextInt();

		System.out.print("Digite um número inteiro: ");
		b = sc.nextInt();

		System.out.println("Multiplicação de ambos os números: " + multiplicacao(a, b));

		sc.close();

	}

	static double multiplicacao(int a, int b) {
		int salto = a;

		for (int contador = 1; contador < b; contador++) {
			a += salto;
		}

		return a;
	}

}
