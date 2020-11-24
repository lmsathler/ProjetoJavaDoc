package br.newtonpaiva.letstravel;

public class Pessoa {
	protected static String nome;
	protected static Integer idade;
	protected static String sexo;
	protected static String endereco;
	protected static Integer telefone;
	protected static String email;
	protected static String senha;
	
	public Pessoa(String nome, Integer idade, String sexo, String endereco, Integer telefone, String email, String senha) {
		Pessoa.nome = nome;
		Pessoa.idade = idade;
		Pessoa.sexo = sexo;
		Pessoa.endereco = endereco;
		Pessoa.telefone = telefone;
		Pessoa.email = email;
		Pessoa.senha = senha;
	}

	public static String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		Pessoa.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		Pessoa.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		Pessoa.sexo = sexo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		Pessoa.endereco = endereco;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		Pessoa.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		Pessoa.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		Pessoa.senha = senha;
	}
  public String toString(){
    return "nome: "+nome+"\n" + "idade: " +idade+"\n" + "sexo: "+sexo+"\n"+ "endereço: "+ endereco+ "\n" + "telefone: " +telefone+"\n" +"email: " +email+ "\n"+ "senha: "+senha+"\n";
  }
}
