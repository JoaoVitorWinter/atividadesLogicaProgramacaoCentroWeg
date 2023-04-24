import java.util.Scanner;

public class questao12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um nome: ");

		System.out.println("Sobrenome dele: " + mostrarSobrenome(sc.nextLine()));

		sc.close();

	}

	static String mostrarSobrenome(String nome) {
		for (int indice = nome.length() - 1; indice > 0; indice--) {
			if (nome.charAt(indice) == ' ') {
				return nome.substring(indice + 1);
			}
		}

		return "Sem sobrenome!";
	}

}
