import java.util.Scanner;

public class questao05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um caractere: ");

		System.out.println("É uma letra maiúscula? " + caractereAlfabeticoMaiusculo(sc.next().charAt(0)));

		sc.close();

	}

	static boolean caractereAlfabeticoMaiusculo(char caractere) {
		if (caractere == 'A' || caractere == 'B' || caractere == 'C' || caractere == 'D' || caractere == 'E'
				|| caractere == 'F' || caractere == 'G' || caractere == 'H' || caractere == 'I' || caractere == 'J'
				|| caractere == 'K' || caractere == 'L' || caractere == 'M' || caractere == 'N' || caractere == 'O'
				|| caractere == 'P' || caractere == 'Q' || caractere == 'R' || caractere == 'S' || caractere == 'T'
				|| caractere == 'U' || caractere == 'V' || caractere == 'W' || caractere == 'X' || caractere == 'Y'
				|| caractere == 'Z') {
			return true;
		} else {
			return false;
		}
	}

}
