import java.util.Scanner;

public class questao08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um caractere: ");

		System.out.println("Letra transformada em maiúscula: " + transformarMaiusculo(sc.next().charAt(0)));

		sc.close();

	}

	static char transformarMaiusculo(char caractere) {
		return Character.toUpperCase(caractere);
	}

}
