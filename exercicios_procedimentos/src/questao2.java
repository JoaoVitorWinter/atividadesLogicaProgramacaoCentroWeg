import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class questao2 {
	static LocalDate dataAtual = LocalDate.now(), dataNova;
	static DateTimeFormatter modoFormatado = DateTimeFormatter.ofPattern("dd/MM/yyyy (EEEE)");
	static int x;
	static String dataFormatada;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Número de dias:");
		x = sc.nextInt();

		descobrirNovaData();
		formatacao();

		System.out.println("Daqui a " + x + " dias será dia " + dataFormatada);

		sc.close();

	}

	static void descobrirNovaData() {
		dataNova = dataAtual.plusDays(x);
	}

	static void formatacao() {
		dataFormatada = dataNova.format(modoFormatado);
	}

}
