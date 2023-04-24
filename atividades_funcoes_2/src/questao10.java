import java.util.Scanner;

public class questao10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma frase: ");

		System.out.println("Frase transformada em maiúscula: " + transformarMaiusculo(sc.nextLine()));

		sc.close();

	}

	static String transformarMaiusculo(String frase) {
		return frase.toUpperCase();
	}

}
