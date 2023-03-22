import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] codigoArtigos = new int[10];
		double[] precoVendaArtigos = new double[10];

		for (int indice = 0; indice < 10; indice++) {
			System.out.println("Código do " + (indice + 1) + "° artigo:");
			codigoArtigos[indice] = sc.nextInt();

			System.out.println("Preço de venda do " + (indice + 1) + "° artigo:");
			precoVendaArtigos[indice] = sc.nextDouble();
		}

		for (int i = 0; i < codigoArtigos.length; i++) {
			for (int j = i + 1; j < codigoArtigos.length; j++) {

				if (precoVendaArtigos[i] < precoVendaArtigos[j]) {
					int auxiliarCodigo = codigoArtigos[i];
					double auxiliarPreco = precoVendaArtigos[i];

					codigoArtigos[i] = codigoArtigos[j];
					codigoArtigos[j] = auxiliarCodigo;

					precoVendaArtigos[i] = precoVendaArtigos[j];
					precoVendaArtigos[j] = auxiliarPreco;
				}

			}
		}
		
		for (int indice = 0; indice < 3; indice++) {
			System.out.println("Preço do " + (indice + 1) + "° artigo mais caro: R$" + precoVendaArtigos[indice]);
			System.out.println("Seu código: " + codigoArtigos[indice] + "\n");
		}
		
		sc.close();

	}

}
