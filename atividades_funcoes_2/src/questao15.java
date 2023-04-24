import java.util.Scanner;

public class questao15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma cadeia de caracteres: ");

		System.out.println("A cadeia de caracteres é totalmente maiúscula? " + verificarMaiuscula(sc.next()));

		sc.close();

	}

	static boolean verificarMaiuscula(String cadeia) {
		for (int indice = 0; indice < cadeia.length(); indice++) {
			if (cadeia.charAt(indice) != Character.toUpperCase(cadeia.charAt(indice))) {
				return false;
			}
		}

		return true;
	}

}
