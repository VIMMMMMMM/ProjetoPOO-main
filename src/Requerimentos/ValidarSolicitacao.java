package Requerimentos;
/*
classe que valida solicitacao do Laboratorio @author Eduardo @author Kaique
 */

import Base_Dados.Base;
import Classes_Modelos.*;

import java.util.*;

public class ValidarSolicitacao {
    static Base base = new Base();

    public void validaReserva(Date diaReserva, List<Laboratorios> statusLaboratorio, Boolean statusDisciplina,
            Boolean statusProfessor, String disciplinaUser, String professorUser, boolean statusAlunos) {
        Date diaUser = new Date();
        if (diaReserva.before(diaUser))
            System.out.println(SituacaoReserva.REPROVADO);
        else {
            if (!statusLaboratorio.contains(true)) {
                System.out.println(SituacaoReserva.REPROVADO);
            } else {
                if (!statusDisciplina)
                    System.out.println(SituacaoReserva.REPROVADO);
                else {
                    if (!statusProfessor)
                        System.out.println(SituacaoReserva.REPROVADO);
                    else {
                        if (!statusAlunos) {
                            System.out.println(SituacaoReserva.REPROVADO);
                        } else {
                            System.out.println(SituacaoReserva.APROVADO);
                        }
                    }
                }
            }
        }

        switch (professorUser) {
            case "Professor01", "Professor02", "Professor03", "Professor04", "Professor05", "Professor06",
                    "Professor07", "Professor08", "Professor09", "Professor010" -> {
                if (disciplinaUser != "BES005" || disciplinaUser != "BES006" || disciplinaUser != "BES008") {
                    System.out.println(SituacaoReserva.REPROVADO);
                } else {
                    System.out.println(SituacaoReserva.APROVADO);
                }
            }
            case "Professor011", "Professor012", "Professor013", "Professor014" -> {
                if (disciplinaUser != "BES011" || disciplinaUser != "BES012" || disciplinaUser != "BES020"
                        || disciplinaUser != "BES026") {
                    System.out.println(SituacaoReserva.REPROVADO);
                } else {
                    System.out.println(SituacaoReserva.APROVADO);
                }
            }
            case "Professor015" -> {
                if (disciplinaUser != "BES038" || disciplinaUser != "BES049" || disciplinaUser != "BES048") {
                    System.out.println(SituacaoReserva.REPROVADO);
                } else {
                    System.out.println(SituacaoReserva.APROVADO);

                }

            }
        }

    }

}
