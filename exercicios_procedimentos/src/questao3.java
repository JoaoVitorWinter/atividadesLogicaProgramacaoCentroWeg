import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class questao3 {
	static LocalDate dataAtual = LocalDate.now(), dataNova;
	static Locale local;
	static DateTimeFormatter modoFormatado;
	static DateTimeFormatter diaDaSemanaFormatacao = DateTimeFormatter.ofPattern("EEEE");
	static int x, escolhaLinguagem;
	static String dataFormatada, diaDaSemana;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Número de dias:");
		x = sc.nextInt();

		System.out.println("Escolha uma língua para imprimir:\n1 - Português\n2 - Inglês\n3 - Francês\n4 - Espanhol");
		escolhaLinguagem = sc.nextInt();

		switch (escolhaLinguagem) {
		case 1:
			local = new Locale("pt", "BR");
			break;
		case 2:
			local = new Locale("en", "US");
			break;
		case 3:
			local = new Locale("fr", "FR");
			break;
		case 4:
			local = new Locale("es", "ES");
			break;
		default:

		}

		modoFormatado = DateTimeFormatter.ofPattern("dd/MM/yyyy (EEEE)", local);
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
