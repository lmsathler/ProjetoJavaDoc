package br.newtonpaiva.letstravel;

public class PagamentoRoteiro extends Roteiros{
	private String formaPagamento;
	private Integer codPagamento;
	private Roteiros roteiros;

	public PagamentoRoteiro() {
		super();
		this.formaPagamento = formaPagamento;
		this.codPagamento = codPagamento;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Integer getCodPagamento() {
		return codPagamento;
	}

	public void setCodPagamento(Integer codPagamento) {
		this.codPagamento = codPagamento;
	}

	public Roteiros getRoteiros() {
		return roteiros;
	}

	public void setRoteiros(Roteiros roteiros) {
		this.roteiros = roteiros;
	}
}

