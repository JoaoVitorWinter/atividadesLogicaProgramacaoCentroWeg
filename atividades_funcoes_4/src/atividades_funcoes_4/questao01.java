package atividades_funcoes_4;

import java.util.Scanner;

public class questao01 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int horas, minutos;
		char horarioLetra;

		do {

			System.out.print("Horas em notação de 24 horas: ");
			horas = sc.nextInt();

			System.out.print("Minutos: ");
			minutos = sc.nextInt();

			horarioLetra = setarAOuP(horas);
			horas = conversaoHoras(horas);
			System.out.println(mostrarHoras(horas, minutos, horarioLetra));

		} while (true);

	}

	static char setarAOuP(int hora) {
		if (hora >= 12) {
			return 'P';
		}

		return 'A';
	}

	static int conversaoHoras(int hora) {
		if (hora >= 12) {
			return hora - 12;
		}

		return hora;
	}

	static String mostrarHoras(int hora, int minuto, char letra) {
		return "Horas na notação de 12 horas: " + hora + ":" + minuto + " " + letra + ".M.";
	}

}
