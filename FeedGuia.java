package br.newtonpaiva.letstravel;

import java.util.ArrayList;
import java.util.List;

public class FeedGuia{
	private Integer classificacao;
	private String lista;
	private List<Roteiros> roteiros = new ArrayList<Roteiros>();

	public FeedGuia() {
		this.classificacao = classificacao;
		this.lista = lista;
		
	}

	public Integer getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(Integer classificacao) {
		this.classificacao = classificacao;
	}

	public String getLista() {
		return lista;
	}

	public void setLista(String lista) {
		this.lista = lista;
	}
  public String toString(){
    String rot = "";
    for (Roteiros r: roteiros){
      rot= rot + r.toString() + "\n";
    }
    return "classificação: " +classificacao.toString()+ "\n"+ "lista: "+ lista + "\n" + "Roteiro: " + rot;
  }
}
