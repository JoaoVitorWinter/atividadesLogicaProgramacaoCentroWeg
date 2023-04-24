import java.util.Scanner;

public class questao13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma cadeia de caracteres: ");

		System.out.println("A cadeia é uma sequência binária? " + definirBinario(sc.next()));

		sc.close();

	}

	static boolean definirBinario(String cadeia) {
		for (int indice = cadeia.length() - 1; indice > 0; indice--) {
			if (cadeia.charAt(indice) != '1' && cadeia.charAt(indice) != '0') {
				return false;
			}
		}

		return true;
	}

}
