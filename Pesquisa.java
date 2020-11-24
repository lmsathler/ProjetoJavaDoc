package br.newtonpaiva.letstravel;

public class Pesquisa {
	private String cidade;
	private String estado;
	private String dataViagem;
	private Integer codRoteiro;

	public Pesquisa() {
		this.cidade = cidade;
		this.estado = estado;
		this.dataViagem = dataViagem;
		this.codRoteiro = codRoteiro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDataViagem() {
		return dataViagem;
	}

	public void setDataViagem(String dataViagem) {
		this.dataViagem = dataViagem;
	}

	public Integer getCodRoteiro() {
		return codRoteiro;
	}

	public void setCodRoteiro(Integer codRoteiro) {
		this.codRoteiro = codRoteiro;
	}
  public String toString(){
    return "cidade: " + cidade + "estado: " + estado + "data da viagem: " + dataViagem + "codigo roteiro: " + codRoteiro;
  }
}
