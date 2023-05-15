package atividade_interface_grafica;

import javax.swing.JOptionPane;

public class Questao1 {

	public static void main(String[] args) {
		int x, y, z;

		x = Integer.parseInt(JOptionPane.showInputDialog("Posição X:"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Posição Y:"));
		z = Integer.parseInt(JOptionPane.showInputDialog("Distância fixa Z:"));

		JOptionPane.showMessageDialog(null, ("Quantidade de passos necessários: " + atravessaRua(x, y, z)));

	}

	static int atravessaRua(int x, int y, int z) {
		return (int) Math.ceil((double) (y - x) / z);
	}

}
