
public class questao06 {

	public static void main(String[] args) {
		for (int indice = 1; indice <= 500; indice++) {
			if (verificarPrimo(indice)) {
				System.out.println("Número perfeito: " + indice);
			}
		}

	}

	static boolean verificarPrimo(int numero) {
		int somaDivisores = 0;

		for (int indice = 1; indice < numero; indice++) {
			if (numero % indice == 0) {
				somaDivisores += indice;
			}

		}

		if (somaDivisores == numero) {
			return true;
		} else {
			return false;
		}
	}

}
