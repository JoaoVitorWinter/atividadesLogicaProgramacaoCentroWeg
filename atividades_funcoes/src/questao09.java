import java.util.Scanner;

public class questao09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pesoCorporal, altura;
		int idade, sexo;
		
		System.out.println("Peso corporal (kg):");
		pesoCorporal = sc.nextDouble();
		
		System.out.println("Altura (cm):");
		altura = sc.nextDouble();
		
		System.out.println("Idade:");
		idade = sc.nextInt();
		
		System.out.println("Sexo:\n1 - Homem\n2 - Mulher");
		sexo = sc.nextInt();
		
		System.out.println("Seu gasto energétio basal é: " + calculoGEB(pesoCorporal, altura, idade, sexo));
		
		sc.close();

	}
	
	static double calculoGEB(double peso, double altura, int idade, int sexo) {
		if (sexo == 1) {
			return 66.47 + (13.75 * peso) + (5 * altura) - (6.76 * idade);
		} else {
			return 655.1 + (9.56 * peso) + (1.85 * altura) - (4.67 * idade);
		}
	}

}
