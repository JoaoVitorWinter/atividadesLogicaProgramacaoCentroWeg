import java.util.Scanner;

public class questao04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número inteiro positivo: ");

		System.out.println("Quantidade de dígitos do número: " + quantidadeDigitos(sc.nextInt()));

		sc.close();

	}

	static int quantidadeDigitos(int numero) {
		int quantidadeAlgarismos = 1;

		while (numero >= 10) {
			numero /= 10;
			quantidadeAlgarismos++;
		}

		return quantidadeAlgarismos;
	}

}
