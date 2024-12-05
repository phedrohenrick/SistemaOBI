package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.GregorianCalendar;


public class MainModel implements RegistraTudo{
	static int conta;
	String matricula;
	String nome;
	String sexo;
	String email;
	String dataNascimento;
	String turma;
	String cidade;
	String inscricao;
	String edicao;
	String modalidade;
	String nivel;
	

	
	public MainModel(String matricula, String nome, String sexo, String email, String dataNascimento, String turma,
			String cidade, String inscricao, String modalidade, String nivel, String edicao) {
		this.matricula = matricula;
		this.nome = nome;
		this.sexo = sexo;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.turma = turma;
		this.cidade = cidade;
		this.inscricao = inscricao;
		this.modalidade = modalidade;
		this.nivel = nivel;
		this.edicao = edicao;
	}



	public static ArrayList<String> getTurmas() {
		Conexao conectar = null;
		ArrayList<String> listaTurmas = new ArrayList<String>();
		try{
			conectar = new Conexao();



			System.out.println("Usuario da Conexao: " + conectar.getConexao().getMetaData().getUserName());
			System.out.println("URL da Conexao: " + conectar.getConexao().getMetaData().getURL());
			
			Connection con = conectar.getConexao();

			String comandoDMLAlunosMaiorEMenor = "SELECT sigla FROM turma";

			try {
				ResultSet resultado = null;


				//PreparedStatement stmTodosAlunos = con.prepareStatement(comandoDMLTodosAlunos);
				PreparedStatement stmAlunosMaiorEMenor = con.prepareStatement(comandoDMLAlunosMaiorEMenor);
				System.out.println(stmAlunosMaiorEMenor.toString());
				resultado = stmAlunosMaiorEMenor.executeQuery();
				conta = 0;
				if(resultado != null){
					while(resultado.next()){
						listaTurmas.add(resultado.getString(1));
						conta++;
					}
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
				if(con != null){
					try{
						System.err.print("Falha no carregamento de turmas!");
						con.rollback();
					}catch(SQLException sqlE){
						sqlE.printStackTrace();
					}
				}

			}
			finally{
				if(con != null){
					try {
						con.setAutoCommit(true);
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					

				}

			}
			

		}catch(Exception ex){
				ex.printStackTrace();
		}finally{
				if(conectar != null)
					conectar.fecharConexao();
		}

		return listaTurmas;
	}
	
	public static ArrayList<String> getEstados() {
		Conexao conectar = null;
		ArrayList<String> listaEstados = new ArrayList<String>();
		try{
			conectar = new Conexao();



			System.out.println("Usuario da Conexao: " + conectar.getConexao().getMetaData().getUserName());
			System.out.println("URL da Conexao: " + conectar.getConexao().getMetaData().getURL());
			
			Connection con = conectar.getConexao();

			String comandoDMLAlunosMaiorEMenor = "SELECT sigla FROM estado";

			try {
				ResultSet resultado = null;


				//PreparedStatement stmTodosAlunos = con.prepareStatement(comandoDMLTodosAlunos);
				PreparedStatement stmAlunosMaiorEMenor = con.prepareStatement(comandoDMLAlunosMaiorEMenor);
				System.out.println(stmAlunosMaiorEMenor.toString());
				resultado = stmAlunosMaiorEMenor.executeQuery();
				conta = 0;
				if(resultado != null){
					while(resultado.next()){
						listaEstados.add(resultado.getString(1));
						conta++;
					}
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
				if(con != null){
					try{
						System.err.print("Falha no carregamento de estados!");
						con.rollback();
					}catch(SQLException sqlE){
						sqlE.printStackTrace();
					}
				}

			}
			finally{
				if(con != null){
					try {
						con.setAutoCommit(true);
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					

				}

			}
			

		}catch(Exception ex){
				ex.printStackTrace();
		}finally{
				if(conectar != null)
					conectar.fecharConexao();
		}

		return listaEstados;
	}
	
	public static ArrayList<String> getCidades(String estado) {
		Conexao conectar = null;
		ArrayList<String> listaCidades = new ArrayList<String>();
		try{
			conectar = new Conexao();



			System.out.println("Usuario da Conexao: " + conectar.getConexao().getMetaData().getUserName());
			System.out.println("URL da Conexao: " + conectar.getConexao().getMetaData().getURL());
			
			Connection con = conectar.getConexao();

			String comandoDMLAlunosMaiorEMenor = "SELECT nome FROM cidade WHERE fk_estado_sigla = ?";
			try {
				ResultSet resultado = null;


				//PreparedStatement stmTodosAlunos = con.prepareStatement(comandoDMLTodosAlunos);
				PreparedStatement stmAlunosMaiorEMenor = con.prepareStatement(comandoDMLAlunosMaiorEMenor);
				stmAlunosMaiorEMenor.setString(1,  estado);
				System.out.println(stmAlunosMaiorEMenor.toString());
				resultado = stmAlunosMaiorEMenor.executeQuery();
				conta = 0;
				if(resultado != null){
					while(resultado.next()){
						listaCidades.add(resultado.getString(1));
						conta++;
					}
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
				if(con != null){
					try{
						System.err.print("Falha no carregamento de cidades!");
						con.rollback();
					}catch(SQLException sqlE){
						sqlE.printStackTrace();
					}
				}

			}
			finally{
				if(con != null){
					try {
						con.setAutoCommit(true);
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					

				}

			}
			

		}catch(Exception ex){
				ex.printStackTrace();
		}finally{
				if(conectar != null)
					conectar.fecharConexao();
		}

		return listaCidades;
	}
	
	public static int getConta() {
		return conta;
	}

	@Override
	public void registrar() {
		Conexao conectar = null;
		try{
			conectar = new Conexao();
			String sql = "INSERT INTO public.competidor (datanasc, email, sexo, nome, matricula, fk_cidade_codigoibge) VALUES (?,?,?,?,?,(SELECT codigoibge FROM cidade where nome = ?));"
					//+ 	"INSERT INTO competidorturma" //n quero implementar o novo bd aqui
					+ 	"INSERT INTO public.inscricao (inscricao) VALUES (?);"
					+ 	"INSERT INTO public.participacao (fk_competidor_matricula, fk_inscricao_inscricao, fk_edicao_ano) VALUES (?, ?, ?);"
					+ 	"INSERT INTO public.notaprova(classificado, fk_modalidadenivel_nome, fk_modalidadenivel_nivel, fk_fase_nome) VALUES ( ?, ?, ?, ?);";



			System.out.println("Usuario da Conexao: " + conectar.getConexao().getMetaData().getUserName());
			System.out.println("URL da Conexao: " + conectar.getConexao().getMetaData().getURL());
			
			Connection con = conectar.getConexao();

			try {
				int resultado;


				//PreparedStatement stmTodosAlunos = con.prepareStatement(comandoDMLTodosAlunos);
				PreparedStatement stmAlunosMaiorEMenor = con.prepareStatement(sql);
				stmAlunosMaiorEMenor.setString(1, dataNascimento);
				stmAlunosMaiorEMenor.setString(2,  email.toString());
				stmAlunosMaiorEMenor.setString(3,  sexo.toString());
				stmAlunosMaiorEMenor.setString(4,  nome.toString());
				stmAlunosMaiorEMenor.setString(5,  matricula.toString());
				stmAlunosMaiorEMenor.setString(6,  cidade.toString());
				stmAlunosMaiorEMenor.setString(7, inscricao);
				stmAlunosMaiorEMenor.setString(8, matricula);
				stmAlunosMaiorEMenor.setString(9, inscricao);
				stmAlunosMaiorEMenor.setInt(10, Integer.parseInt(edicao));
				stmAlunosMaiorEMenor.setBoolean(11, true);
				stmAlunosMaiorEMenor.setString(12, modalidade);
				stmAlunosMaiorEMenor.setString(13, nivel);
				stmAlunosMaiorEMenor.setString(14, "1");
				//falta mais alguns aqui
				System.out.println(stmAlunosMaiorEMenor.toString());
				resultado = stmAlunosMaiorEMenor.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
				if(con != null){
					try{
						System.err.print("Falha na inserção dos dados!");
						con.rollback();
					}catch(SQLException sqlE){
						sqlE.printStackTrace();
					}
				}

			}
			finally{
				if(con != null){
					try {
						con.setAutoCommit(true);
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					

				}

			}
			

		}catch(Exception ex){
				ex.printStackTrace();
		}finally{
				if(conectar != null)
					conectar.fecharConexao();
		}

	}

	@Override
	public void excluir() {
		// TODO Auto-generated method stub
		
	}
}
