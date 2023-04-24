import java.util.Scanner;

public class questao03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base;
		int expoente;

		System.out.print("Digite um número: ");
		base = sc.nextDouble();

		System.out.print("Digite um número inteiro positivo: ");
		expoente = sc.nextInt();

		System.out.println("A potência resultante é: " + potenciacao(base, expoente));

		sc.close();

	}

	static double potenciacao(double base, int expoente) {
		int resultado = 1;
		for (int contador = 0; contador < expoente; contador++) {
			resultado *= base;
		}

		return resultado;
	}

}
