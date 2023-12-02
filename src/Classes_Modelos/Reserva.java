/**Classe Reserva que implementa a interface IReservas @author Eduardo @author Kaique @author Gustavo */

package Classes_Modelos;

import Requerimentos.SolicitarLaboratorio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Reserva implements IReservas{
	private Integer id;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Reserva> reservasEfetivadas() {
		List<Solicitacao> solicitacoes= new ArrayList<>();

		return null;
	}
	public abstract void impressaoReserva();
}