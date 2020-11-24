package br.newtonpaiva.letstravel;

import java.time.LocalDate;

public class Guia extends Pessoa{
	private Integer codGuia;
	private String localPasseio;
	private Integer experiencia;
	private String habilidades;
	private Integer credencial;
	private Pessoa pessoa;

	public Guia() {
		super(nome, idade, sexo, endereco, telefone, email, senha);
		this.codGuia = codGuia;
		this.localPasseio = localPasseio;
		this.experiencia = experiencia;
		this.habilidades = habilidades;
		this.credencial = credencial;
	}

	public Integer getCodGuia() {
		return codGuia;
	}

	public void setCodGuia(Integer codGuia) {
		this.codGuia = codGuia;
	}

	public String getLocalPasseio() {
		return localPasseio;
	}

	public void setLocalPasseio(String localPasseio) {
		this.localPasseio = localPasseio;
	}

	public Integer getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(Integer experiencia) {
		this.experiencia = experiencia;
	}

	public String getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(String habilidades) {
		this.habilidades = habilidades;
	}

	public Integer getCredencial() {
		return credencial;
	}

	public void setCredencial(Integer credencial) {
		this.credencial = credencial;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
  public String toString(){
    return super.toString()+ "\n" + "Codigo do guia:" + codGuia + "local passeio: " + localPasseio + "experiencia :" + experiencia + "habilidades: " + habilidades + "credencial: " + credencial;
  }
}


