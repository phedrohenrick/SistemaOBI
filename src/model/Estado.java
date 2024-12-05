package model;

public class Estado implements RegistraTudo{

	private String estado = "Goiás";

	private String siglaEstado = "GO";

	public Estado(String estado, String siglaEstado) {
		this.estado = estado;
		this.siglaEstado = siglaEstado;
	}
	
	public Estado() {
		
	}

	public void registrar() {

	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getSiglaEstado() {
		return siglaEstado;
	}

	public void setSiglaEstado(String siglaEstado) {
		this.siglaEstado = siglaEstado;
	}
	
	public String toString() {
		return "Estado [estado=" + estado + ", siglaEstado=" + siglaEstado + "]";
	}

	@Override
	public void excluir() {
		// TODO Auto-generated method stub
		
	}

}