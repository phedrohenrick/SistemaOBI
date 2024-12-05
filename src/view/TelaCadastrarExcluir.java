package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Toolkit;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Label;
import java.awt.Canvas;
import java.awt.Panel;
import java.awt.Color;

public class TelaCadastrarExcluir extends JFrame {

	private JButton cadastrar;
	private JButton excluir;
	private JButton consultar;
	
	public TelaCadastrarExcluir() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaCadastrarExcluir.class.getResource("/recursos/images.jpg")));
		setBounds(100, 100, 142, 175);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		cadastrar = new JButton("Cadastrar");
		cadastrar.setBackground(new Color(229, 252, 194));
		cadastrar.setBounds(10, 11, 105, 30);
		getContentPane().add(cadastrar);
		
		excluir = new JButton("Excluir");
		excluir.setBackground(new Color(229, 252, 194));
		excluir.setBounds(10, 52, 105, 30);
		getContentPane().add(excluir);
		
		consultar = new JButton("Consultar");
		consultar.setBackground(new Color(229, 252, 194));
		consultar.setBounds(10, 93, 105, 33);
		getContentPane().add(consultar);
		this.setVisible(true);
		
		

	}

	public JButton getCadastrar() {
		return cadastrar;
	}

	public void setCadastrar(JButton cadastrar) {
		this.cadastrar = cadastrar;
	}

	public JButton getExcluir() {
		return excluir;
	}

	public void setExcluir(JButton excluir) {
		this.excluir = excluir;
	}

	public JButton getConsultar() {
		return consultar;
	}

	public void setConsultar(JButton consultar) {
		this.consultar = consultar;
	}

	@Override
	public String toString() {
		return "TelaCadastrarExcluir [cadastrar=" + cadastrar + ", excluir=" + excluir + ", consultar=" + consultar
				+ "]";
	}
	
	
}
