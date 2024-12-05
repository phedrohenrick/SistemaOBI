package model;

public class Edicao implements RegistraTudo{

	private int ano;
	private String linkRegulamento;

	public Edicao(int ano, String linkRegulamento) {
		this.ano = ano;
		this.linkRegulamento = linkRegulamento;
	}

	public Edicao() {
		
	}
	
	public String getLinkRegulamento() {
		return linkRegulamento;
	}

	public void setLinkRegulamento(String linkRegulamento) {
		this.linkRegulamento = linkRegulamento;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String toString() {
		return "Edicao [ano=" + ano + ", linkRegulamento=" + linkRegulamento + "]";
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