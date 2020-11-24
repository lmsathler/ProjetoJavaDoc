package br.newtonpaiva.letstravel;

public class Turista extends Pessoa{
	private boolean cadastrar;	

	public Turista() {
		super(nome, idade, sexo, endereco, telefone, email, senha);
		this.cadastrar = cadastrar;
		
	}

	public boolean getCadastrar() {
		return cadastrar;
	}

	public void setCadastrar(boolean cadastrar) {
		this.cadastrar = cadastrar;
	}

  public String toString (){
    return super.toString()+ "\n" + "cadastrar: " +cadastrar+ "\n";
  }
}
