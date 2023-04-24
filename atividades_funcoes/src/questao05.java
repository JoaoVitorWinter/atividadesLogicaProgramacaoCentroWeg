import java.util.Scanner;

public class questao05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor inteiro:");

		if (anoBissexto(sc.nextInt())) {
			System.out.println("O ano é bissexto!");
		} else {
			System.out.println("O ano não é bissexto!");
		}

		sc.close();

	}

	static boolean anoBissexto(int ano) {
		if (ano % 4 == 0 && (ano % 100 != 0 || (ano % 100 == 0 && ano % 400 == 0))) {
			return true;
		}
		return false;
	}

}
