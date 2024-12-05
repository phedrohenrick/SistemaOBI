package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexao {

	private String driver = "org.postgresql.Driver";
	private String user = "postgres";
	private String senha;
	private String url = "jdbc:postgresql://localhost:5432/ifg";
	private Connection con = null;
	private static final long serialVersionUID = 1L;
	
	public Conexao() {
		try
		{
			try {
				senha = (String) Serializar.deserializar("./passCode.obj");
			} catch (Exception e) {
				//senha = "88cc0m11";
				senha = Conexao.hexToASCII("38386363306d3131");
				try {
					Serializar.serializar("./passCode.obj", senha);
				} catch (Exception e1) {
					System.out.println("ERRO AO SERIALIZAR!");
				}
			}
			Class.forName(driver);
			this.con = (Connection) DriverManager.getConnection(url, user, senha);
			System.out.println("Conexao realizada com sucesso.");
		}
		catch (ClassNotFoundException ex)
		{
			System.err.print(ex.getMessage());
		} 
		catch (SQLException e)
		{
			System.err.print(e.getMessage());
		}
	}
	
	public Connection getConexao(){
		return this.con;
	}

	public void fecharConexao(){
		try{
			if(con != null)
				con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static String hexToASCII(String hex)
    {
        // initialize the ASCII code string as empty.
        String ascii = "";
 
        for (int i = 0; i < hex.length(); i += 2) {
 
            // extract two characters from hex string
            String part = hex.substring(i, i + 2);
 
            // change it into base 16 and typecast as the character
            char ch = (char)Integer.parseInt(part, 16);
 
            // add this char to final ASCII string
            ascii = ascii + ch;
        }
 
        return ascii;
    }
	
}