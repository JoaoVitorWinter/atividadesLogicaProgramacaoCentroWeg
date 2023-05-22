package atividade_interface_2;

public class ContaCorrenteEspecial extends ContaCorrente {

	public ContaCorrenteEspecial(double saldo) {
		super(saldo);
		this.setTaxaOperacao(0.001);
	}
	
	
}
