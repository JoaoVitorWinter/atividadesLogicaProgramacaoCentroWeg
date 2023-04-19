import java.util.Scanner;

public class questao1 {
	static double valor;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tipoConversao;

		System.out.println("Valor em reais:");
		valor = sc.nextDouble();

		System.out.println("Digite:\n1 - Conversão para dólar\n2 - Conversão para iene");
		tipoConversao = sc.nextInt();

		if (tipoConversao == 1) {
			conversaoDolar();
		} else {
			conversaoIene();
		}

		sc.close();

	}

	static void conversaoDolar() {
		valor *= 0.3;
		System.out.println("Valor em doláres: US$ " + valor);
	}

	static void conversaoIene() {
		valor *= 30;
		System.out.println("Valor em ienes: ¥ " + valor);
	}

}
