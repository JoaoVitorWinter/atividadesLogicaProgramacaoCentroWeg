package atividade_interface_grafica;

public class Fatura {

	private String numero, descricao;
	private int quantidadeComprada;
	private double preco;

	public Fatura(String numero, String descricao, int quantidadeComprada, double preco) {
		super();
		this.numero = numero;
		this.descricao = descricao;
		this.quantidadeComprada = quantidadeComprada;
		this.preco = preco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidadeComprada() {
		return quantidadeComprada;
	}

	public void setQuantidadeComprada(int quantidadeComprada) {
		this.quantidadeComprada = quantidadeComprada;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getTotalFatura() {
		if (this.quantidadeComprada * this.preco > 0) {
			return this.quantidadeComprada * this.preco;
		} else {
			return 0;
		}
	}

}
