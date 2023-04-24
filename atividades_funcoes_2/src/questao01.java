import java.util.Scanner;

public class questao01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma temperatura em graus Fahrenheit: ");

		System.out.println("Temperatura em graus Celsius: " + calcularTemperatura(sc.nextDouble()));

		sc.close();

	}

	static double calcularTemperatura(double temperatura) {
		return (temperatura - 32) * 5 / 9;
	}

}
