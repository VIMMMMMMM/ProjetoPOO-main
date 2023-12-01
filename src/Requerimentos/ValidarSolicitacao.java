package Requerimentos;
/*
classe que valida solicitacao do Laboratorio @author Eduardo @author Kaique
 */

import Classes_Modelos.Alunos;
import Classes_Modelos.Laboratorios;
import Classes_Modelos.SituacaoReserva;

import java.util.Date;
import java.util.List;

public class ValidarSolicitacao  {
    public void validaReserva() {

    }
    /*/
    metodo que implementa a validacao do dia da reserva @author Eduardo @author Kaique @author Gustavo
     */
    public void validaDiaReserva(Date diaReserva, Date diaReservado)  {
        Date diaUser = new Date();
        if (diaReserva.before(diaUser))
            System.out.println(SituacaoReserva.REPROVADO);
        else {
            System.out.println(SituacaoReserva.APROVADO);
        }
       // if (diaReservado.compareTo(diaReserva) <= 0)
            //System.out.println(SituacaoReserva.REPROVADO);
    }
    public void validaReservaLaboratorio( List<Laboratorios>statusLaboratorio )  {
        if (!statusLaboratorio.equals(true)) {
            System.out.println(SituacaoReserva.REPROVADO);
        } else {
            System.out.println(SituacaoReserva.APROVADO);
        }

    }
    public void validaDisciplina(Boolean statusDisciplina)  {
        if (!statusDisciplina)
            System.out.println(SituacaoReserva.REPROVADO);
            else {
            System.out.println(SituacaoReserva.APROVADO);
        }
    }
    public void validaProfessor(Boolean statusProfessor) {
        if (!statusProfessor)
            System.out.println(SituacaoReserva.REPROVADO);
        else {
            System.out.println(SituacaoReserva.APROVADO);
        }

    }
    public void validaAlunos(Boolean statusAlunos, List<Alunos> grupoAlunos) {
        if (!statusAlunos)
            System.out.println(SituacaoReserva.REPROVADO);
        else {
            System.out.println(SituacaoReserva.APROVADO);
        }
    }
}
