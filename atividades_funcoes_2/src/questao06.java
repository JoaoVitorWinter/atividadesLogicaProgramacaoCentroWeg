import java.util.Scanner;

public class questao06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um caractere: ");

		System.out.println("É uma letra minúscula? " + caractereAlfabeticoMinusculo(sc.next().charAt(0)));

		sc.close();

	}

	static boolean caractereAlfabeticoMinusculo(char caractere) {
		if (caractere == 'a' || caractere == 'b' || caractere == 'c' || caractere == 'd' || caractere == 'e'
				|| caractere == 'f' || caractere == 'g' || caractere == 'h' || caractere == 'i' || caractere == 'j'
				|| caractere == 'k' || caractere == 'l' || caractere == 'm' || caractere == 'n' || caractere == 'o'
				|| caractere == 'p' || caractere == 'q' || caractere == 'r' || caractere == 's' || caractere == 't'
				|| caractere == 'u' || caractere == 'v' || caractere == 'w' || caractere == 'x' || caractere == 'y'
				|| caractere == 'z') {
			return true;
		} else {
			return false;
		}
	}

}
