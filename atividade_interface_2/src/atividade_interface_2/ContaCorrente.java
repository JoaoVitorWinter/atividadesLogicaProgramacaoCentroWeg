package atividade_interface_2;

class ContaCorrente {
	private double saldo = 0;
	private double taxaOperacao = 0.005;
	
	
	
	public ContaCorrente(double saldo) {
		super();
		this.saldo = saldo;
	}

	public void deposito(double quantia) {
		this.saldo += quantia;
	}
	
	public String saque(double quantia) {
		if (quantia <= this.saldo) {
			this.saldo -= quantia;
			return "Saque realizado!"
					+ "\nQuantidade sacada: R$" + (quantia - quantia * this.taxaOperacao)
					+ "\nQuantidade para a taxa de operação: R$" + (quantia * this.taxaOperacao);
		} else {
			return "Saque inválido!";
		}
	}

	public double getSaldo() {
		return saldo;
	}
	
	public double getTaxaOperacao() {
		return taxaOperacao;
	}

	public void setTaxaOperacao(double taxaOperacao) {
		this.taxaOperacao = taxaOperacao;
	}

}
