package atividade_interface_grafica;

import javax.swing.JOptionPane;

public class Questao4 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, ("Classificação: "
				+ classificarNota(Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota:")))));
	}

	public static char classificarNota(double nota) {
		if (nota >= 9) {
			return 'A';
		} else if (nota >= 8) {
			return 'B';
		} else if (nota >= 7) {
			return 'C';
		} else if (nota >= 6) {
			return 'D';
		}
		
		return 'E';
	}

}
