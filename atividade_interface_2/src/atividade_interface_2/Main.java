package atividade_interface_2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int escolha;
		boolean atividadesTerminadas = false;

		double saldoInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial!"));

		ContaCorrente cliente = new ContaCorrente(saldoInicial);

		JOptionPane.showMessageDialog(null, "Digite:" + "\n1 - Depositar;" + "\n2 - Sacar;" + "\n3 - Ver saldo;" + "\n4 - Sair."
				+ "\nErros serão considerados como sair!");

		while (!atividadesTerminadas) {
			escolha = Integer.parseInt(JOptionPane.showInputDialog("Selecione o que você deseja fazer!"));

			switch (escolha) {
			case 1:
				cliente.deposito(Double.parseDouble(JOptionPane.showInputDialog("Digite o depósito em reais!")));
				break;
			case 2:
				JOptionPane.showMessageDialog(null,cliente.saque(Double.parseDouble(JOptionPane.showInputDialog("Digite o saque em reais!"))));
				break;
			case 3:
				JOptionPane.showMessageDialog(null, ("Seu saldo: R$" + cliente.getSaldo()));
				break;
			default:
				JOptionPane.showMessageDialog(null, "Foi um prazer fazer negócios com você!");
				atividadesTerminadas = true;
				break;
			}
		}

	}

}
