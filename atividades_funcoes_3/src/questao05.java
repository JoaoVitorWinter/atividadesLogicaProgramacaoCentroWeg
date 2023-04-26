
public class questao05 {

	public static void main(String[] args) {

		for (int indice = 10; indice <= 100; indice++) {
			if (verificarPrimo(indice)) {
				System.out.println("Primo: " + indice);
			}
		}

	}

	static boolean verificarPrimo(int numero) {
		int quantidadeDivisores = 0;

		for (int indice = 1; indice <= numero; indice++) {
			if (numero % indice == 0) {
				quantidadeDivisores++;
			}

			if (quantidadeDivisores > 2) {
				return false;
			}
		}

		return true;
	}

}
