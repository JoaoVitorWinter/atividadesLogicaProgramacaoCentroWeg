import java.util.Scanner;

public class questao04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um caractere: ");

		System.out.println("É um caracetere alfabético? " + caractereAlfabetico(sc.next().charAt(0)));

		sc.close();

	}

	static boolean caractereAlfabetico(char caractere) {
		if (caractere == 'A' || caractere == 'B' || caractere == 'C' || caractere == 'D' || caractere == 'E'
				|| caractere == 'F' || caractere == 'G' || caractere == 'H' || caractere == 'I' || caractere == 'J'
				|| caractere == 'K' || caractere == 'L' || caractere == 'M' || caractere == 'N' || caractere == 'O'
				|| caractere == 'P' || caractere == 'Q' || caractere == 'R' || caractere == 'S' || caractere == 'T'
				|| caractere == 'U' || caractere == 'V' || caractere == 'W' || caractere == 'X' || caractere == 'Y'
				|| caractere == 'Z' || caractere == 'a' || caractere == 'b' || caractere == 'c' || caractere == 'd'
				|| caractere == 'e' || caractere == 'f' || caractere == 'g' || caractere == 'h' || caractere == 'i'
				|| caractere == 'j' || caractere == 'k' || caractere == 'l' || caractere == 'm' || caractere == 'n'
				|| caractere == 'o' || caractere == 'p' || caractere == 'q' || caractere == 'r' || caractere == 's'
				|| caractere == 't' || caractere == 'u' || caractere == 'v' || caractere == 'w' || caractere == 'x'
				|| caractere == 'y' || caractere == 'z') {
			return true;
		} else {
			return false;
		}
	}

}
