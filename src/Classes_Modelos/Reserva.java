/**Classe Reserva que implementa a interface IReservas @author Eduardo @author Kaique @author Gustavo */

package Classes_Modelos;

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

	public List<Reserva> diaDaReserva() {


		return null;
	}
	public abstract void impressaoReserva();
}