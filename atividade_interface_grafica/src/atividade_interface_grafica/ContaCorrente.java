package atividade_interface_grafica;

import javax.swing.JOptionPane;

// Questão 2
public class ContaCorrente {

	static float saldo;

	public static void main(String[] args) {
		definirSaldoInicial(1000);
		JOptionPane.showMessageDialog(null, ("Saldo: R$" + saldo));
		sacar(500);
		depositar(50);
		JOptionPane.showMessageDialog(null, ("Saldo: R$" + saldo));
		sacar(600);
		JOptionPane.showMessageDialog(null, ("Saldo: R$" + saldo));
	}

	static void definirSaldoInicial(float valorInicial) {
		saldo = valorInicial;
	}

	static void depositar(float deposito) {
		saldo += deposito;
	}

	static boolean sacar(float saque) {
		if (saldo >= saque) {
			saldo -= saque;
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "Saldo insuficente para o saque!");
			return false;
		}
	}

}
