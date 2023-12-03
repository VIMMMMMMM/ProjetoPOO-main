package Requerimentos;
/*
classe que valida solicitacao do Laboratorio @author Eduardo @author Kaique
 */

import Base_Dados.Base;
import Classes_Modelos.*;

import java.util.*;

public class ValidarSolicitacao {
    static Base base = new Base();

    public void validaReserva(Date diaReserva, List<Laboratorios> statusLaboratorio, Boolean statusDisciplina, Boolean statusProfessor, String disciplinaUser, String professorUser, boolean statusAlunos) {
        Date diaUser = new Date();
        if (diaReserva.before(diaUser))
            System.out.println(SituacaoReserva.REPROVADO);
        else {
            System.out.println(SituacaoReserva.APROVADO);
        }
        if (!statusLaboratorio.equals(true)) {
            System.out.println(SituacaoReserva.REPROVADO);
        } else {
            System.out.println(SituacaoReserva.APROVADO);
        }
        if (!statusDisciplina)
            System.out.println(SituacaoReserva.REPROVADO);
        else {
            System.out.println(SituacaoReserva.APROVADO);
        }
        if (!statusProfessor)
            System.out.println(SituacaoReserva.REPROVADO);
        else {
            System.out.println(SituacaoReserva.APROVADO);
        }
        if (!statusAlunos) {
            System.out.println(SituacaoReserva.REPROVADO);
        } else {
            System.out.println(SituacaoReserva.APROVADO);
        }
    }
}
