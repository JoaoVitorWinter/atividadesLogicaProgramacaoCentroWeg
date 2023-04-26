
public class questao07 {

	public static void main(String[] args) {
		for (int indice = 1000; indice <= 10000; indice++) {
			if (inverterNumero(indice) == indice) {
				System.out.println("Número palíndromo: " + indice);
			}
		}

	}

	static int inverterNumero(int numero) {
		int numeroInverso = 0;
		int quantidadeAlgarismos = 1;
		int numeroAuxiliar = numero;

		while (numeroAuxiliar >= 10) {
			numeroAuxiliar /= 10;
			quantidadeAlgarismos++;
		}

		for (int indice = 0; indice < quantidadeAlgarismos; indice++) {
			numeroInverso += (numero % 10) * Math.pow(10, quantidadeAlgarismos - (indice + 1));
			numero /= 10;

		}

		return numeroInverso;
	}

}
