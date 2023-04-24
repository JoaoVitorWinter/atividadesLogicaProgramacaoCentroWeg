import java.util.Scanner;

public class questao01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Diigite um número inteiro:");

		tabuada(sc.nextInt());

		sc.close();

	}

	static void tabuada(int numero) {
		for (int indice = 1; indice <= 10; indice++) {
			System.out.println(numero + " X " + indice + " = " + (numero * indice));
		}
	}

}
