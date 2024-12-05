package model;

public class Cidade implements RegistraTudo{

	private int codigoIBGE;

	private String nome = "Ceres";

	private Estado estado;

	public Cidade(int codigoIBGE, String nome, Estado estado) {
		this.codigoIBGE = codigoIBGE;
		this.nome = nome;
		this.estado = estado;
	}
	
	public Cidade() {
	}
	
	public void registrar() {//here

	}

	public int getCodigoIBGE() {
		return codigoIBGE;
	}

	public void setCodigoIBGE(int codigoIBGE) {
		this.codigoIBGE = codigoIBGE;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public String toString() {
		return "nome=" + nome + "\nestado=" + estado + "\ncodigoIBGE=" + codigoIBGE;
	}

	public int getNumeroDeCompetidores() {
		return 0;//here
	}

	public void excluir() {
		// TODO Auto-generated method stub
		
	}

}