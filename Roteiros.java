package br.newtonpaiva.letstravel;

public class Roteiros {
	protected static String nome;
	protected static String mapa;
	protected static Double valor;
	protected static String data;

	public Roteiros() {
		Roteiros.nome = nome;
		Roteiros.mapa = mapa;
		Roteiros.valor = valor;
		Roteiros.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		Roteiros.nome = nome;
	}

	public String getMapa() {
		return mapa;
	}

	public void setMapa(String mapa) {
		Roteiros.mapa = mapa;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		Roteiros.valor = valor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		Roteiros.data = data;
	}
  public String toString(){
    return "nome: " + nome+ "mapa: " +mapa+ "valor: " +valor+ "data: "+valor;
  }
}
