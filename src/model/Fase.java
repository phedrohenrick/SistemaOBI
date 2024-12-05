package model;

public class Fase implements RegistraTudo{

	private int nome;
	private String informacoes;
	
	public Fase(int nome, String informacoes) {
		this.nome = nome;
		this.informacoes = informacoes;
	}
	
	public Fase() {
		
	}
	public int getNome() {
		return nome;
	}
	public void setNome(int nome) {
		this.nome = nome;
	}
	public String getInformacoes() {
		return informacoes;
	}
	public void setInformacoes(String informacoes) {
		this.informacoes = informacoes;
	}
	
	public String toString() {
		return "Fase [nome=" + nome + ", informacoes=" + informacoes + "]";
	}

	@Override
	public void registrar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir() {
		// TODO Auto-generated method stub
		
	}
	
}