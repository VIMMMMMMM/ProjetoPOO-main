/**Classe Reserva que implementa a interface IReservas @author Eduardo @author Kaique @author Gustavo */

package Classes_Modelos;

import Requerimentos.SolicitarLaboratorio;

import java.util.*;

public  class Reserva implements IReservas {
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Map<?,?> reservasEfetivadas(List<Solicitacao>solicitacaoList) {
		Map<List<Solicitacao>, Integer> map= new HashMap<>();
		for (int i = 0; i < solicitacaoList.size(); i++) {
			map.put(solicitacaoList,i);
		}
	imprirReservaEfetivada(map);
		return map;
	}
	public void imprirReservaEfetivada(Map<?,?>map){
		System.out.println(map);
	}
}
