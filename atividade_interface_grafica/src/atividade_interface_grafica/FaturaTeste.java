package atividade_interface_grafica;

import javax.swing.JOptionPane;

// Questão 3
public class FaturaTeste {

	public static void main(String[] args) {
		Fatura fatura1 = new Fatura("1", "Computador", 10, 1200);
		Fatura fatura2 = new Fatura("2", "Mouse", 50, 50);
		Fatura fatura3 = new Fatura("3", "Teclado", 30, 100);
		Fatura fatura4 = new Fatura("4", "Monitor", 20, 400);
		Fatura fatura5 = new Fatura("5", "Cadeira", 15, 500);

		JOptionPane.showMessageDialog(null, ("Fatura total da primeira fatura: R$" + fatura1.getTotalFatura()));
		JOptionPane.showMessageDialog(null, "Preço da segunda fatura: R$" + fatura2.getPreco());
		JOptionPane.showMessageDialog(null, "Quantidade comprada da terceira fatura: " + fatura3.getQuantidadeComprada(	));
		JOptionPane.showMessageDialog(null, ("Descrição da quarta fatura: " + fatura4.getDescricao()));
		JOptionPane.showMessageDialog(null,
				("Quinta fatura\nNúmero: " + fatura5.getNumero() + "\nDescrição: " + fatura5.getDescricao()
						+ "\nQuantidade comprada: " + fatura5.getQuantidadeComprada() + "\nPreço: R$"
						+ fatura5.getPreco() + "\nFatura total: R$" + fatura5.getTotalFatura()));

	}

}
