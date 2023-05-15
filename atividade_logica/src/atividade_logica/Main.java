package atividade_logica;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int[] numeroVoo = new int[10];
		int[] tipoAviao = new int[10];
		int[] capacidadeVoo = new int[10];
		int[] capacidadeVooInicial = new int[10];
		double[] precoPassagem = new double[10];
		int numeroIdentidadePassageiro, numeroVooDesejado, prejuizos = 0, lucros = 0;
		String mensagemEstatistica = "";

		for (int indice = 0; indice < numeroVoo.length; indice++) {
			numeroVoo[indice] = Integer.parseInt(JOptionPane.showInputDialog("Número do " + (indice + 1) + "° voo:"));

			do {
				tipoAviao[indice] = Integer.parseInt(JOptionPane.showInputDialog("Tipo de avião utilizado:"));
				if (tipoAviao[indice] == 707 || tipoAviao[indice] == 727 || tipoAviao[indice] == 737) {
					break;
				}

				JOptionPane.showMessageDialog(null, "Tipo inválido!");
			} while (true);

			precoPassagem[indice] = Double.parseDouble(JOptionPane.showInputDialog("Preço da passagem:"));

			if (tipoAviao[indice] == 707) {
				capacidadeVoo[indice] = 200;
				capacidadeVooInicial[indice] = capacidadeVoo[indice];
			} else if (tipoAviao[indice] == 727) {
				capacidadeVoo[indice] = 170;
				capacidadeVooInicial[indice] = capacidadeVoo[indice];
			} else {
				capacidadeVoo[indice] = 120;
				capacidadeVooInicial[indice] = capacidadeVoo[indice];
			}
		}

		do {
			numeroIdentidadePassageiro = Integer
					.parseInt(JOptionPane.showInputDialog("Número de identidade do passageiro:"));

			if (numeroIdentidadePassageiro == 0) {
				break;
			}

			numeroVooDesejado = Integer.parseInt(JOptionPane.showInputDialog("Número do voo desejado:"));

			boolean reservado = false;
			int indexVoo = 0;
			for (int indice = 0; indice < numeroVoo.length; indice++) {
				if (numeroVooDesejado == numeroVoo[indice] && capacidadeVoo[indice] > 0) {
					reservado = true;
					indexVoo = indice;
					break;
				}
			}

			if (reservado) {
				capacidadeVoo[indexVoo]--;
				JOptionPane.showMessageDialog(null,
						"Número de identidade do passageiro: " + numeroIdentidadePassageiro
								+ "\nNúmero do voo desejado: " + numeroVooDesejado + "\nPreço da passagem: R$"
								+ precoPassagem[indexVoo] + "\nRESERVA CONFIRMADA");
			} else {
				JOptionPane.showMessageDialog(null, "Número de identidade do passageiro: " + numeroIdentidadePassageiro
						+ "\nNúmero do voo desejado: " + numeroVooDesejado + "\nVOO LOTADO");
			}

		} while (true);

		for (int indice = 0; indice < numeroVoo.length; indice++) {
			if (capacidadeVoo[indice] < (double) capacidadeVooInicial[indice] * 0.4) {
				mensagemEstatistica += "Voo " + numeroVoo[indice] + ": lucro.\n";
				lucros++;
			} else {
				mensagemEstatistica += "Voo " + numeroVoo[indice] + ": prejuízo.\n";
				prejuizos++;
			}
		}

		JOptionPane.showMessageDialog(null,
				(mensagemEstatistica + "Total de lucros: " + lucros + "\nTotal de prejuizos: " + prejuizos));

	}

}
