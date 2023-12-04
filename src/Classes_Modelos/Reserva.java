/**Classe Reserva que implementa a interface IReservas @author Eduardo @author Kaique */

package Classes_Modelos;

import java.util.*;

public class Reserva implements IReservas {
	private int id;
	private Integer solicitacao;
	private Date diaReserva;
	private Integer duracao;
	private String professores;
	private String disciplinas;
	private Date diaLiberacao;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getSolicitacao() {
		return solicitacao;
	}

	public void setSolicitacao(Integer solicitacao) {
		this.solicitacao = solicitacao;
	}

	public Date getDiaReserva() {
		return diaReserva;
	}

	public void setDiaReserva(Date diaReserva) {
		this.diaReserva = diaReserva;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	public String getProfessores() {
		return professores;
	}

	public void setProfessores(String professores) {
		this.professores = professores;
	}

	public String getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Date getDiaLiberacao() {
		return diaLiberacao;
	}

	public void setDiaLiberacao(Date diaLiberacao) {
		this.diaLiberacao = diaLiberacao;
	}

	/**
	 * Este método cria uma lista de reservas efetivadas a partir de uma lista de
	 * solicitações.
	 * List<Solicitacao> solicitacaoList Uma lista de objetos Solicitacao que
	 * representam as solicitações de reserva.
	 * return Uma lista de objetos Reserva que representam as reservas
	 * efetivadas. @author Eduardo @author Kaique
	 */

	public List<?> reservasEfetivadas(List<Solicitacao> solicitacaoList) {
		Random random = new Random();
		Date date = new Date();
		Reserva reserva = new Reserva();
		int reservaR = random.nextInt(1000);
		List<Reserva> reservaList = new ArrayList<>();
		reserva.setId(reservaR);
		reserva.setSolicitacao(solicitacaoList.get(0).getId());
		reserva.setDiaReserva(solicitacaoList.get(0).getData());
		reserva.setDuracao(solicitacaoList.get(0).getTempoDeUtilizacao());
		reserva.setProfessores(solicitacaoList.get(0).getProfessor().getNome());
		reserva.setDisciplinas(solicitacaoList.get(0).getDisciplina().getSigla());
		reserva.setDiaLiberacao(date);

		reservaList.add(reserva);
		System.out.println(reservaList);
		return reservaList;
	}

	public String toString() {
		return "Reserva{" +
				"id=" + id +
				", solicitacao=" + solicitacao +
				", situacao=" + SituacaoReserva.APROVADO +
				",\n diaReserva=" + diaReserva +
				",\n duracao=" + duracao +
				",\n professores=" + professores +
				",\n disciplinas=" + disciplinas +
				",\n diaLiberacao=" + diaLiberacao +
				'}';
	}
}