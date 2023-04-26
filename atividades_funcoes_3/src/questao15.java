import java.util.Scanner;

public class questao15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroDaAposta, quantidadeDezenasApostadas, dezenaApostada;
		int[] dezenasSorteadas = new int[5];
		
		for (int indice = 0; indice < dezenasSorteadas.length; indice++) {
			System.out.print((indice + 1) + "° dezena sorteada: ");
			dezenasSorteadas[indice] = sc.nextInt();
		}
		
		while (true) {
			System.out.print("Número da aposta: ");
			numeroDaAposta = sc.nextInt();
			
			if (numeroDaAposta == 0) {
				break;
			}
		}

	}

}
