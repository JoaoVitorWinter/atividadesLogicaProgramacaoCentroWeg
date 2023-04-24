import java.util.Scanner;

public class questao04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero1, numero2;

		System.out.println("Digite um número inteiro:");
		numero1 = sc.nextInt();

		System.out.println("Digite outro:");
		numero2 = sc.nextInt();

		if (multiplo(numero1, numero2)) {
			System.out.println("O primeiro número é múltiplo do outro!");
		} else {
			System.out.println("O primeiro número não é múltiplo do outro!");
		}

		sc.close();

	}

	static boolean multiplo(int numero1, int numero2) {
		if (numero1 % numero2 == 0) {
			return true;
		}
		return false;
	}

}
