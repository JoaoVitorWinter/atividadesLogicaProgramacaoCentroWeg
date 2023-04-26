
public class questao08 {

	public static void main(String[] args) {
		for (int indice = 1000; indice < 10000; indice++) {
			if (verificarNumero(indice) == indice) {
				System.out.println("Número palíndromo: " + indice);
			}
		}

	}

	static int verificarNumero(int numero) {
		int primeiroNumero, segundoNumero;

		primeiroNumero = numero / 100;
		segundoNumero = numero % 100;

		numero = primeiroNumero + segundoNumero;

		return numero * numero;
	}

}
