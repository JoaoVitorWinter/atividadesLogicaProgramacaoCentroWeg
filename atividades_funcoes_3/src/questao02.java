import java.util.Scanner;

public class questao02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadeia1, cadeia2;

		System.out.print("Digite uma cadeia de caracteres: ");
		cadeia1 = sc.next();

		System.out.print("Digite outro: ");
		cadeia2 = sc.next();

		System.out.println("As cadeias são iguais? " + cadeiasIguais(cadeia1, cadeia2));

		sc.close();

	}

	static boolean cadeiasIguais(String cadeia1, String cadeia2) {
		if (cadeia1.length() != cadeia2.length()) {
			return false;
		}

		for (int indice = 0; indice < cadeia1.length(); indice++) {
			if (cadeia1.charAt(indice) != cadeia2.charAt(indice)) {
				return false;
			}
		}

		return true;
	}

}
