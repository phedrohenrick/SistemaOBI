package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.MainModel;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JFormattedTextField;
import java.awt.Label;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.DropMode;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TelaCompetidor extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private JPanel contentPane;
	private JLabel nome;
	private JTextField nomeCampo;
	private JLabel sexo;
	private JRadioButton male;
	private JRadioButton female;
	private JRadioButton nonBinary;
	private JLabel email;
	private JTextField emailCampo;
	private JRadioButton outro;
	private JLabel turma;
	private JComboBox<String>turmaCampo;
	private JButton turmaNotFound;
	private JLabel data;
	private JFormattedTextField dataCampo;
	private JLabel matricula;
	private JTextField matriculaCampo;
	private JLabel estado;
	private JComboBox<String>estadoCampo;
	private JLabel cidade;
	private JComboBox<String>cidadeCampo;
	private JLabel inscricao;
	private JTextField inscricaoCampo;
	private JLabel edicao;
	private JTextField edicaoCampo;
	private JLabel nivel;
	private JTextField modalidadeCampo;
	private JTextField nivelCampo;
	private JLabel modalidade;
	private JButton enviar;
	private JButton limpar;
	private ButtonGroup sexoCampo;

	/**

	/**
	 * Create the frame.
	 */
	public TelaCompetidor() {
		setTitle("Cadastro de Competidores");
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaCompetidor.class.getResource("/recursos/images.jpg")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(89, 79, 79));
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nome = new JLabel("Nome");
		nome.setBounds(10, 11, 51, 14);
		contentPane.add(nome);
		nome.setVisible(true);
		
		nomeCampo = new JTextField();
		nomeCampo.setBounds(71, 8, 174, 20);
		contentPane.add(nomeCampo);
		nomeCampo.setColumns(50);
		
		sexo = new JLabel("Sexo");
		sexo.setBounds(10, 36, 51, 14);
		contentPane.add(sexo);
		
		male = new JRadioButton("M");
		male.setBounds(67, 32, 38, 23);
		contentPane.add(male);
		
		female = new JRadioButton("F");
		female.setBounds(107, 32, 31, 23);
		contentPane.add(female);
		
		nonBinary = new JRadioButton("NB");
		nonBinary.setBounds(139, 32, 45, 23);
		contentPane.add(nonBinary);
		
		email = new JLabel("Email");
		email.setBounds(10, 61, 51, 14);
		contentPane.add(email);
		
		emailCampo = new JTextField();
		emailCampo.setBounds(71, 58, 174, 20);
		contentPane.add(emailCampo);
		emailCampo.setColumns(50);
		
		outro = new JRadioButton("Outro");
		outro.setBounds(181, 32, 64, 23);
		contentPane.add(outro);
		
		sexoCampo = new ButtonGroup();
		sexoCampo.add(male);
		sexoCampo.add(female);
		sexoCampo.add(nonBinary);
		sexoCampo.add(outro);
		
		turma = new JLabel("Turma");
		turma.setBounds(10, 86, 51, 14);
		contentPane.add(turma);
		
		turmaCampo = new JComboBox<String>();
		turmaCampo.setToolTipText("Selecione Sua Turma...");
		turmaCampo.setMaximumRowCount(10);
		turmaCampo.setBounds(71, 82, 174, 22);
		contentPane.add(turmaCampo);
		
		turmaNotFound = new JButton("Não Encontrou? Clique Aqui");
		turmaNotFound.setBounds(10, 111, 235, 23);
		contentPane.add(turmaNotFound);
		
		data = new JLabel("Data de Nascimento");
		data.setBounds(10, 145, 120, 14);
		contentPane.add(data);
		
		dataCampo = new JFormattedTextField();
		dataCampo.setBounds(140, 142, 105, 20);
		contentPane.add(dataCampo);
		
		matricula = new JLabel("Matricula");
		matricula.setBounds(10, 169, 64, 14);
		contentPane.add(matricula);
		
		matriculaCampo = new JTextField();
		matriculaCampo.setBounds(84, 166, 161, 20);
		contentPane.add(matriculaCampo);
		matriculaCampo.setColumns(10);
		
		estado = new JLabel("Estado");
		estado.setBounds(10, 194, 64, 14);
		contentPane.add(estado);
		
		estadoCampo = new JComboBox<String>();
		estadoCampo.setBounds(71, 190, 174, 22);
		contentPane.add(estadoCampo);
		
		cidade = new JLabel("Cidade");
		cidade.setBounds(10, 226, 46, 14);
		contentPane.add(cidade);
		
		cidadeCampo = new JComboBox<String>();
		cidadeCampo.setBounds(71, 219, 174, 22);
		contentPane.add(cidadeCampo);
		
		inscricao = new JLabel("Inscrição");
		inscricao.setBounds(266, 11, 64, 14);
		contentPane.add(inscricao);
		
		inscricaoCampo = new JTextField();
		inscricaoCampo.setBounds(338, 8, 86, 20);
		contentPane.add(inscricaoCampo);
		inscricaoCampo.setColumns(10);
		
		edicao = new JLabel("Edição");
		edicao.setBounds(266, 36, 64, 14);
		contentPane.add(edicao);
		
		modalidade = new JLabel("Modalidade");
		modalidade.setBounds(266, 61, 74, 14);
		contentPane.add(modalidade);
		
		nivel = new JLabel("Nível");
		nivel.setBounds(266, 86, 46, 14);
		contentPane.add(nivel);
		
		edicaoCampo = new JTextField();
		edicaoCampo.setBounds(338, 33, 86, 20);
		contentPane.add(edicaoCampo);
		edicaoCampo.setColumns(10);
		
		modalidadeCampo = new JTextField();
		modalidadeCampo.setBounds(338, 58, 86, 20);
		contentPane.add(modalidadeCampo);
		modalidadeCampo.setColumns(10);
		
		nivelCampo = new JTextField();
		nivelCampo.setBounds(338, 86, 86, 20);
		contentPane.add(nivelCampo);
		nivelCampo.setColumns(10);
		
		enviar = new JButton("Enviar");
		enviar.setBounds(312, 190, 112, 23);
		contentPane.add(enviar);
		
		limpar = new JButton("Limpar");
		limpar.setBounds(312, 222, 112, 23);
		contentPane.add(limpar);
		this.setVisible(true);
	}
	
	public void setTurmaItens(ArrayList<String> listaTurmas, int tamanho) {
		for (int i = 0; i < tamanho; i++) { 
			this.getTurmaCampo().addItem(listaTurmas.get(i));
		}
	}
	
	public void setEstadoItens(ArrayList<String> listaEstados, int tamanho) {
		for (int i = 0; i < tamanho; i++) {
			this.getEstadoCampo().addItem(listaEstados.get(i));
		}
	}
	
	public void setCidadeItens(ArrayList<String> listaCidades, int tamanho) {
		this.getCidadeCampo().removeAllItems();
		for (int i = 0; i < tamanho; i++) {
			this.getCidadeCampo().addItem(listaCidades.get(i));
		}
	}
	
	public void limparCampos() {
		this.getNomeCampo().setText("");
		this.getEmailCampo().setText("");
		this.getDataCampo().setText("");
		this.getMatriculaCampo().setText("");
		this.getInscricaoCampo().setText("");
		this.getEdicaoCampo().setText("");
		this.getModalidadeCampo().setText("");
		this.getNivelCampo().setText("");
		this.sexoCampo.clearSelection();
		update(getGraphics());
		this.update(getGraphics());
	}

	public String getSexo() {
		String sexo = null;
		if(male.isSelected())
			sexo = "M";
		else if(female.isSelected())
			sexo = "F";
		else
			sexo = "N";
		return sexo;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JLabel getNome() {
		return nome;
	}

	public JTextField getNomeCampo() {
		return nomeCampo;
	}

	public JRadioButton getMale() {
		return male;
	}

	public JRadioButton getFemale() {
		return female;
	}

	public JRadioButton getNonBinary() {
		return nonBinary;
	}

	public JLabel getEmail() {
		return email;
	}

	public JTextField getEmailCampo() {
		return emailCampo;
	}

	public JRadioButton getOutro() {
		return outro;
	}

	public JLabel getTurma() {
		return turma;
	}

	public JComboBox<String> getTurmaCampo() {
		return turmaCampo;
	}

	public JButton getTurmaNotFound() {
		return turmaNotFound;
	}

	public JLabel getData() {
		return data;
	}

	public JFormattedTextField getDataCampo() {
		return dataCampo;
	}

	public JLabel getMatricula() {
		return matricula;
	}

	public JTextField getMatriculaCampo() {
		return matriculaCampo;
	}

	public JLabel getEstado() {
		return estado;
	}

	public JComboBox<String> getEstadoCampo() {
		return estadoCampo;
	}

	public JLabel getCidade() {
		return cidade;
	}

	public JComboBox<String> getCidadeCampo() {
		return cidadeCampo;
	}

	public JLabel getInscricao() {
		return inscricao;
	}

	public JTextField getInscricaoCampo() {
		return inscricaoCampo;
	}

	public JLabel getEdicao() {
		return edicao;
	}

	public JTextField getEdicaoCampo() {
		return edicaoCampo;
	}

	public JLabel getNivel() {
		return nivel;
	}

	public JTextField getModalidadeCampo() {
		return modalidadeCampo;
	}

	public JTextField getNivelCampo() {
		return nivelCampo;
	}

	public JLabel getModalidade() {
		return modalidade;
	}

	public JButton getEnviar() {
		return enviar;
	}

	public JButton getLimpar() {
		return limpar;
	}

}
