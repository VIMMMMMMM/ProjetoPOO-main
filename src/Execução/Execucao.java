/**Criação da classe Execução para chamar um metodo que esta na classe Imprimir para executar todo o codigo @author Murilo */

package Execução;

import Requerimentos.SolicitarLaboratorio;

public class Execucao {

	/** Metodo main que ira chamar a classe solicitar laboratorio @author Eduardo */
	public static void main(String[] args) {
		SolicitarLaboratorio solicitarLaboratorio = new SolicitarLaboratorio();
		solicitarLaboratorio.Usuario();
	}
}