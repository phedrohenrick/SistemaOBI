package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;

public class Competidor implements RegistraTudo{

	private String nome;

	private String sexo;

	private String email;

	private Turma[] listaTurmas;

	private Calendar dataDeNascimento;

	private String matricula;

	private Cidade cidade;
	
	private String inscricao;

	public Competidor(String nome, String sexo, String email, Turma[] listaTurmas, Calendar dataDeNascimento,
			String matricula, Cidade cidade, String inscricao) {
		this.nome = nome;
		this.sexo = sexo;
		this.email = email;
		this.listaTurmas = listaTurmas;
		this.dataDeNascimento = dataDeNascimento;
		this.matricula = matricula;
		this.cidade = cidade;
		this.inscricao = inscricao;
	}

	public Competidor() {
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Turma[] getListaTurmas() {
		return listaTurmas;
	}

	public void setListaTurmas(Turma[] listaTurmas) {
		this.listaTurmas = listaTurmas;
	}

	public Calendar getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Calendar dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String getInscricao() {
		return inscricao;
	}

	public void setInscricao(String inscricao) {
		this.inscricao = inscricao;
	}

	public String toString() {
		return "Competidor [nome=" + nome + ", sexo=" + sexo + ", email=" + email + ", listaTurmas="
				+ Arrays.toString(listaTurmas) + ", dataDeNascimento=" + dataDeNascimento + ", matricula=" + matricula
				+ ", cidade=" + cidade + ", inscricao=" + inscricao + "]";
	}

	public void registrar() {

	}

	public int getIdade() {
		Calendar now = Calendar.getInstance();
		int year1 = now.get(Calendar.YEAR);
		int year2 = dataDeNascimento.get(Calendar.YEAR);
		int age = year1 - year2;
		int month1 = now.get(Calendar.MONTH);
		int month2 = dataDeNascimento.get(Calendar.MONTH);
		if (month2 > month1) {
		  age--;
		} else if (month1 == month2) {
		  int day1 = now.get(Calendar.DAY_OF_MONTH);
		  int day2 = dataDeNascimento.get(Calendar.DAY_OF_MONTH);
		  if (day2 > day1) {
		    age--;
		  }
		}
		
		return age;
	}

	/*public static Calendar convertStringToCalendar(String time,
		DateFormat df = new SimpleDateFormat("dd MM yyyy");
		Date date = df.parse("02 26 1991");
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
    }*/
	
	public void excluir() {
		Conexao conectar = new Conexao();
		Connection con = conectar.getConexao();
		String sql = "DELETE from competidor where matricula = ?" ;

		PreparedStatement deleteSQL = null;
		try {
			deleteSQL = con.prepareStatement(sql);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
		deleteSQL.setString(1, getMatricula());
		int myrs= deleteSQL.executeUpdate();  

		} catch (SQLException e) {
			e.printStackTrace();
		}

		
	}


}