import java.util.Scanner;

public class questao11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma frase: ");

		System.out.println("Frase transformada em minúscula: " + transformarMinusculo(sc.nextLine()));

		sc.close();

	}

	static String transformarMinusculo(String frase) {
		return frase.toLowerCase();
	}

}
