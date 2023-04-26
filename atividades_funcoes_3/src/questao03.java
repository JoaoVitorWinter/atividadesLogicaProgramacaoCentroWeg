import java.util.Scanner;

public class questao03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma cadeia de caracteres: ");

		System.out.println("Resposta: " + analiseCadeia(sc.next()));

		sc.close();

	}

	static int analiseCadeia(String cadeia) {
		int quantidadeAlfabetica = 0, quantidadeNumerica = 0;
		for (int indice = 0; indice < cadeia.length(); indice++) {
			if (Character.toString(cadeia.charAt(indice)).matches("[A-Z]")
					|| Character.toString(cadeia.charAt(indice)).matches("[a-z]")) {
				quantidadeAlfabetica++;
			} else if (Character.toString(cadeia.charAt(indice)).matches("[0-9]")) {
				quantidadeNumerica++;
			} else {
				return -1;
			}
		}

		if (quantidadeNumerica >= quantidadeAlfabetica) {
			return 0;
		} else {
			return 1;
		}
	}

}
