import java.util.Scanner;

public class questao09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um caractere: ");

		System.out.println("Letra transformada em minúscula: " + transformarMinusculo(sc.next().charAt(0)));

		sc.close();

	}

	static char transformarMinusculo(char caractere) {
		return Character.toLowerCase(caractere);
	}

}
