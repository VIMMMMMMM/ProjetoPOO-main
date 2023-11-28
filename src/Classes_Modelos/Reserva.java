/**Classe Reserva que possui seus atributos, getters e setters, juntamento com o toString @author Caio*/

package Classes_Modelos;

import java.util.Date;

public class Reserva {
	private Integer id;
    private Solicitacao solicitacao;
    private SituacaoReserva situacao;
    private Date diaDaReserva;

    public Date getDiaDaReserva() {
        return diaDaReserva;
    }
    public void setDiaDaReserva(Date diaDaReserva) {
        this.diaDaReserva = diaDaReserva;
    }
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Solicitacao getSolicitacao() {
		return solicitacao;
	}
	public void setSolicitacao(Solicitacao solicitacao) {
		this.solicitacao = solicitacao;
	}
	public SituacaoReserva getSituacao() {
		return situacao;
	}
	public void setSituacao(SituacaoReserva situacao) {
		this.situacao = situacao;
	}
    @Override
    public String toString() {
        return "Reserva [id=" + id + ", solicitacao=" + solicitacao + ", situacao=" + situacao + ", diaDaReserva="
                + diaDaReserva + "]";
    } 

}