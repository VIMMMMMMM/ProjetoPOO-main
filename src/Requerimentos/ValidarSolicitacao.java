package Requerimentos;
/*
classe que valida solicitacao do Laboratorio @author Eduardo @author Kaique
 */

import Base_Dados.Base;
import Classes_Modelos.*;

import java.util.*;

public class ValidarSolicitacao  {
      static Base base=new Base();
    public void validaReserva() {

    validaAlunos(true,base.getAlunos(1,10));
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
    public void validaProfessor(Boolean statusProfessor, String disciplinaUser) {
        ListIterator<Professores> listaProfessores = base.getProfessores().listIterator();
        if (!statusProfessor)
            System.out.println(SituacaoReserva.REPROVADO);
        else {
            System.out.println(SituacaoReserva.APROVADO);
        }
        while (listaProfessores.hasNext()){
     if (!disciplinaUser.equals(listaProfessores)) {
         System.out.println(SituacaoReserva.REPROVADO);
     }
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
