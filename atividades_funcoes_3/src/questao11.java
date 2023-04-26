import java.util.Scanner;

public class questao11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto;
		int n;

		System.out.print("Texto para criptografar: ");
		texto = sc.next();

		System.out.print("Quantidade para a criptografia: ");
		n = sc.nextInt();

		System.out.println("Texto criptografado: " + criptografar(texto, n));

		sc.close();

	}

	static String criptografar(String texto, int n) {
		n %= 26;
		char[] alfabetoMaiusculo = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
				'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		char[] alfabetoMinusculo = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
				'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		String textoCriptografado = "";

		for (int indice = 0; indice < texto.length(); indice++) {
			if (texto.charAt(indice) == Character.toUpperCase(texto.charAt(indice))) {
				for (int letraPosicao = 0; letraPosicao < alfabetoMaiusculo.length; letraPosicao++) {
					if (texto.charAt(indice) == alfabetoMaiusculo[letraPosicao]) {
						if (letraPosicao + n > 25) {
							textoCriptografado += alfabetoMaiusculo[letraPosicao + n - 26];
						} else {
							textoCriptografado += alfabetoMaiusculo[letraPosicao + n];
						}
					}
				}
			} else {
				for (int letraPosicao = 0; letraPosicao < alfabetoMinusculo.length; letraPosicao++) {
					if (texto.charAt(indice) == alfabetoMinusculo[letraPosicao]) {
						if (letraPosicao + n > 25) {
							textoCriptografado += alfabetoMinusculo[letraPosicao + n - 26];
						} else {
							textoCriptografado += alfabetoMinusculo[letraPosicao + n];
						}
					}
				}
			}
		}

		return textoCriptografado;
	}

}
