package aplicacao;

import view.TelaCompetidor;
import controller.CadastroController;
import model.Conexao;
import model.MainModel;
import model.Serializar;
import view.TelaCadastrarExcluir;

public class App {
	public static void main(String args[]) {
		//System.out.println("HAHA");
		TelaCadastrarExcluir frame = new TelaCadastrarExcluir();
		CadastroController control = new CadastroController(frame);

	}
}
