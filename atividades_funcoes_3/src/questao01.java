import java.util.Scanner;

public class questao01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma cadeia de caracteres: ");

		System.out.println("A cadeia de caracteres é totalmente minúscula? " + verificarMinuscula(sc.next()));

		sc.close();

	}

	static boolean verificarMinuscula(String cadeia) {
		if (cadeia.equals(cadeia.toLowerCase())) {
			return true;
		}

		return false;
	}

}
