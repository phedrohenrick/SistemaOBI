package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class TelaExcluir extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel matricula;
	private JTextField matriculaCampo;
	private JButton informacoes;
	private JCheckBox certeza;
	private JButton excluir;
	private JLabel certeza1;

	/**
	 * Create the frame.
	 */
	public TelaExcluir() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaExcluir.class.getResource("/recursos/images.jpg")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 225, 170);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		matricula = new JLabel("Matricula");
		matricula.setBounds(10, 11, 63, 14);
		contentPane.add(matricula);
		
		matriculaCampo = new JTextField();
		matriculaCampo.setBounds(87, 8, 112, 20);
		contentPane.add(matriculaCampo);
		matriculaCampo.setColumns(10);
		
		informacoes = new JButton("Informacoes");
		informacoes.setBounds(10, 68, 189, 23);
		contentPane.add(informacoes);
		
		certeza = new JCheckBox("Eu tenho certeza que quero ");
		certeza.setBounds(10, 32, 193, 20);
		contentPane.add(certeza);
		
		excluir = new JButton("Excluir");
		excluir.setBounds(10, 102, 189, 23);
		contentPane.add(excluir);
		
		certeza1 = new JLabel("excluir esse competidor.");
		certeza1.setBounds(15, 50, 184, 14);
		contentPane.add(certeza1);
		this.setVisible(true);
	}


	public JButton getInformacoes() {
		return informacoes;
	}

	public JButton getExcluir() {
		return excluir;
	}

	public void setInformacoes(JButton informacoes) {
		this.informacoes = informacoes;
	}

	public void setExcluir(JButton excluir) {
		this.excluir = excluir;
	}


	@Override
	public String toString() {
		return "TelaExcluir [contentPane=" + contentPane + ", matricula=" + matricula + ", matriculaCampo="
				+ matriculaCampo + ", informacoes=" + informacoes + ", certeza=" + certeza + ", excluir=" + excluir
				+ ", certeza1=" + certeza1 + "]";
	}


	public JTextField getMatriculaCampo() {
		// TODO Auto-generated method stub
		return this.matriculaCampo;
	}


	public JCheckBox getCerteza() {
		return certeza;
	}
	
	
}
