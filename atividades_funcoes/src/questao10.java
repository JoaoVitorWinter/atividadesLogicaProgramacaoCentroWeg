import java.util.Scanner;

public class questao10 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double altura;
		int sexo;

		System.out.println("Altura (m):");
		altura = sc.nextDouble();
		
		System.out.println("Sexo:\n1 - Homem\n2 - Mulher");
		sexo = sc.nextInt();
		
		System.out.println("Seu peso ideal é: " + pesoIdeal(altura, sexo));
		
		sc.close();

	}
	
	static double pesoIdeal(double altura, int sexo) {
		if (sexo == 1) {
			return 72.7 * altura - 58;
		} else {
			return 62.1 * altura - 44.7;
		}
	}
	
}
