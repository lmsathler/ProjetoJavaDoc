package br.newtonpaiva.letstravel;

public class RoteiroPersonalizado extends Roteiros{
	private Integer codRoteiroPersonalizado;

	public RoteiroPersonalizado() {
		super();
		this.codRoteiroPersonalizado = codRoteiroPersonalizado;
	}

	public Integer getCodRoteiroPersonalizado() {
		return codRoteiroPersonalizado;
	}

	public void setCodRoteiroPersonalizado(Integer codRoteiroPersonalizado) {
		this.codRoteiroPersonalizado = codRoteiroPersonalizado;
	}
  public String toString(){
    return "Roteiros: " + super.toString() + "Codigo do roteiro personalizado: " + codRoteiroPersonalizado;
  }
}
