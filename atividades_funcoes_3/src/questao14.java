import java.util.Scanner;

public class questao14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] notas = new double[5];
		double notaFinal;
		int numeroAluno;

		for (int indice = 0; indice < 80; indice++) {
			System.out.print("Número do aluno: ");
			numeroAluno = sc.nextInt();

			for (int indiceNotas = 0; indiceNotas < 4; indiceNotas++) {
				System.out.print("Nota da " + (indiceNotas + 1) + "° prova: ");
				notas[indiceNotas] = sc.nextDouble();
			}

			System.out.print("Nota da prova final: ");
			notas[notas.length - 1] = sc.nextDouble();

			notaFinal = notas[notas.length - 1] + somaTresMaiores(notas[0], notas[1], notas[2], notas[3]);

			System.out.println("Número do aluno: " + numeroAluno);
			System.out.println("Nota final: " + notaFinal);
			System.out.println("Conceito: " + conceitoObtido(notaFinal));
		}
		
		sc.close();

	}

	static double somaTresMaiores(double nota1, double nota2, double nota3, double nota4) {
		double[] notas = { nota1, nota2, nota3, nota4 };

		for (int i = 0; i < notas.length; i++) {
			for (int j = i + 1; j < notas.length; j++) {
				if (notas[i] < notas[j]) {
					double auxiliar = notas[i];
					notas[i] = notas[j];
					notas[j] = auxiliar;
				}
			}
		}

		return notas[0] + notas[1] + notas[2];
	}

	static String conceitoObtido(double notaFinal) {
		if (notaFinal >= 90) {
			return "A";
		} else if (notaFinal >= 80) {
			return "B";
		} else if (notaFinal >= 70) {
			return "C";
		} else if (notaFinal >= 60) {
			return "D";
		} else if (notaFinal >= 40) {
			return "E";
		} else {
			return "F";
		}
	}

}
