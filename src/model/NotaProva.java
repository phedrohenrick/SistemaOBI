package model;

public class NotaProva implements RegistraTudo{

	private int pontuacao;

	private int classificacao;

	private boolean classificado;

	private String inscricao;

	private Edicao edicao;

	private Fase fase;

	private ModalidadeNivel modalidadeNivel;

	public NotaProva(int pontuacao, int classificacao, boolean classificado, String inscricao, Edicao edicao,
			Fase fase, ModalidadeNivel modalidadeNivel) {
		this.pontuacao = pontuacao;
		this.classificacao = classificacao;
		this.classificado = classificado;
		this.inscricao = inscricao;
		this.edicao = edicao;
		this.fase = fase;
		this.modalidadeNivel = modalidadeNivel;
	}
	
	public NotaProva() {
		
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

	public boolean isClassificado() {
		return classificado;
	}

	public void setClassificado(boolean classificado) {
		this.classificado = classificado;
	}

	public String getInscricao() {
		return inscricao;
	}

	public void setInscricao(String inscricao) {
		this.inscricao = inscricao;
	}

	public Edicao getEdicao() {
		return edicao;
	}

	public void setEdicao(Edicao edicao) {
		this.edicao = edicao;
	}

	public Fase getFase() {
		return fase;
	}

	public void setFase(Fase fase) {
		this.fase = fase;
	}

	public ModalidadeNivel getModalidadeNivel() {
		return modalidadeNivel;
	}

	public void setModalidadeNivel(ModalidadeNivel modalidadeNivel) {
		this.modalidadeNivel = modalidadeNivel;
	}
	
	public String toString() {
		return "NotaProva [pontuacao=" + pontuacao + ", classificacao=" + classificacao + ", classificado="
				+ classificado + ", inscricao=" + inscricao + ", edicao=" + edicao + ", fase=" + fase
				+ ", modalidadeNivel=" + modalidadeNivel + "]";
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