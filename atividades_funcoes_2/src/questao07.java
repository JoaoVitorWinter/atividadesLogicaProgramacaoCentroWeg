import java.util.Scanner;

public class questao07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um caractere: ");

		System.out.println("É um digito? " + caractereDigito(sc.next().charAt(0)));

		sc.close();

	}

	static boolean caractereDigito(char caractere) {
		if (caractere == '1' || caractere == '2' || caractere == '3' || caractere == '4' || caractere == '5'
				|| caractere == '6' || caractere == '7' || caractere == '8' || caractere == '9') {
			return true;
		} else {
			return false;
		}
	}

}
