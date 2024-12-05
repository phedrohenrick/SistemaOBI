package model;

public class Turma implements RegistraTudo{

	private String turma;
	
	private String serie;

	private String sigla;

	private String curso = "Técnico em Informática para Internet";

	private int ano;

	public Turma(String turma, String serie, String sigla, String curso, int ano) {
		this.turma = turma;
		this.serie = serie;
		this.sigla = sigla;
		this.curso = curso;
		this.ano = ano;
	}
	
	public Turma() {
		
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getSerie() {
		return serie;
	}
	
	public void setSerie(String serie) {
		this.serie = serie;
	}
	
	public String toString() {
		return "Turma [turma=" + turma + ", serie=" + serie + ", sigla=" + sigla + ", curso=" + curso + ", ano=" + ano
				+ "]";
	}

	public void registrar() {

	} //here

	public void remover() {

	}//here

	@Override
	public void excluir() {
		// TODO Auto-generated method stub
		
	}

}