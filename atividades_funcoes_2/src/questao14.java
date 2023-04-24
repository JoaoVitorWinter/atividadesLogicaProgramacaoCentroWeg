import java.util.Scanner;

public class questao14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma palavra: ");

		System.out.println("A palavra é um palíndromo? " + verificarPalindromo(sc.next()));

		sc.close();

	}

	static boolean verificarPalindromo(String palavra) {
		for (int indice = 0; indice < palavra.length(); indice++) {
			if (palavra.charAt(indice) != palavra.charAt(palavra.length() - 1 - indice)) {
				return false;
			}
		}

		return true;
	}

}