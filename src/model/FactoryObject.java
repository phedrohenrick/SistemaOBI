package model;

public class FactoryObject {
	public static Object getObject(String tipo) {
		Object retorno = null;
		if(tipo == "NotaProva") {
			retorno = new NotaProva();
		}
		else if (tipo == "Competidor") {
			retorno = new Competidor();
		}
		else if (tipo == "Turma") {
			retorno = new Turma();
		}
		else if (tipo == "Edicao") {
			retorno = new Edicao();
		}
		else if (tipo == "Cidade") {
			retorno = new Cidade();
		}
		else if (tipo == "Estado") {
			retorno = new Estado();
		}
		else if (tipo == "ModalidadeNivel") {
			retorno = new ModalidadeNivel();
		}
		else if (tipo == "Fase") {
			retorno = new Fase();
		}
		return retorno;
		
	}
}