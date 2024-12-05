package controller;

import java.sql.Date;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;
import model.Competidor;
import model.FactoryObject;
import model.MainModel;
import view.TelaCadastrarExcluir;
import view.TelaCompetidor;
import view.TelaExcluir;

public class CadastroController {
	private TelaCadastrarExcluir telaCadastrarExcluir;// view
	private MainModel mainModel; //model
	private TelaCompetidor a; //view
	private TelaExcluir b; //view de novo
	
	public CadastroController(TelaCadastrarExcluir telaCadastrarExcluir) {
		this.telaCadastrarExcluir = telaCadastrarExcluir;
		this.initController();
	}
		
	public void initController() {
		telaCadastrarExcluir.getCadastrar().addActionListener(e -> abrirCadastro());
		telaCadastrarExcluir.getExcluir().addActionListener(e -> abrirExcluir());
		telaCadastrarExcluir.getConsultar().addActionListener(e -> abrirConsultar());
	}


	public void abrirConsultar() {
		JOptionPane.showMessageDialog(a, "Essa função ainda não foi implementada");
	}

	public void abrirCadastro() {
		a = new TelaCompetidor();
		a.setTurmaItens(MainModel.getTurmas(), MainModel.getConta());
		a.setEstadoItens(MainModel.getEstados(), MainModel.getConta());
		a.setCidadeItens(MainModel.getCidades(a.getEstadoCampo().getSelectedItem().toString()), MainModel.getConta());
		a.getEnviar().addActionListener(e -> {
			try {
				controllerCompetidor();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				JOptionPane.showMessageDialog(a, "Algo de errado não está certo! Verifique seus dados e tente novamente.");
			}
		});
		a.getLimpar().addActionListener(e -> a.limparCampos());
		a.getTurmaNotFound().addActionListener(e -> turmaNaoEncontrada());
		a.getEstadoCampo().addActionListener(
				e -> a.setCidadeItens(MainModel.getCidades(a.getEstadoCampo().getSelectedItem().toString()),
				MainModel.getConta()));

	}
	public void abrirExcluir(){
		b = new TelaExcluir();
		b.getExcluir().addActionListener(e -> {
			try {
				deletarCompetidor();
			} catch (Exception e1) {
				e1.printStackTrace();
				JOptionPane.showMessageDialog(b, "Marque o checkbox para continuar");
			}
		});
		b.getInformacoes().addActionListener(e -> abrirInformacoes());
	}
	
	public void controllerCompetidor() throws Exception{
		mainModel = new MainModel(a.getMatriculaCampo().getText(), a.getNomeCampo().getText(), a.getSexo(),
				a.getEmailCampo().getText(), a.getDataCampo().getText(),
				(String)a.getTurmaCampo().getSelectedItem(), (String)a.getCidadeCampo().getSelectedItem(), 
				a.getInscricaoCampo().getText(), a.getModalidadeCampo().getText(),
				a.getNivelCampo().getText(), a.getEdicaoCampo().getText());
		mainModel.registrar();
		mainModel = null;
	}
	
	public void deletarCompetidor() throws MinhaExcecao{
		if(b.getCerteza().isSelected()) {
			Competidor c = (Competidor)FactoryObject.getObject("Competidor");
			c.setMatricula(b.getMatriculaCampo().getText());
			c.excluir();
		} else {
			throw new MinhaExcecao("O checkbox tem que estar selecionado!!!");
		}
		
	}
	
	public void abrirInformacoes() {
		JOptionPane.showMessageDialog(b, "Essa função ainda não foi implementada"); // para isso tinha q criar uma nova tela
	}
	
	public void turmaNaoEncontrada() {
		JOptionPane.showMessageDialog(null, "Essa função ainda não foi implementada");
	}
}
