package model;

public class ModalidadeNivel implements RegistraTudo{

	private String nomeModalidade;

	private String nivel;
	
	public ModalidadeNivel(String nomeModalidade, String nivel, String linkRegulamento) {
		this.nomeModalidade = nomeModalidade;
		this.nivel = nivel;
		this.linkRegulamento = linkRegulamento;
	}
	
	public ModalidadeNivel() {
		
	}

	public String getLinkRegulamento() {
		return linkRegulamento;
	}

	public void setLinkRegulamento(String linkRegulamento) {
		this.linkRegulamento = linkRegulamento;
	}

	private String linkRegulamento;

	public String getNomeModalidade() {
		return nomeModalidade;
	}

	public void setNomeModalidade(String nomeModalidade) {
		this.nomeModalidade = nomeModalidade;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
	public String toString() {
		return "ModalidadeNivel [nomeModalidade=" + nomeModalidade + ", nivel=" + nivel + ", linkRegulamento="
				+ linkRegulamento + "]";
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