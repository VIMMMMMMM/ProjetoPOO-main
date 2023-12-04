package Requerimentos;
/*
classe que valida solicitacao do Laboratorio @author Eduardo @author Kaique
 */

import Base_Dados.Base;
import Classes_Modelos.*;

import java.util.*;

public class ValidarSolicitacao {
    private boolean validarData(Date diaReserva) {
        Date diaAtual = new Date();

        if (diaReserva.before(diaAtual)) {
            System.out.println(SituacaoReserva.REPROVADO);
            return false;
        } else {
            return true;
        }
    }


    private boolean validarProfessor(List<Professores> professores, String professorUser, String disciplinaUser) {
        Map<String, Integer> mapaProfessores = new HashMap<>();
        Map<Integer, Integer> mapaProfessores1 = new HashMap<>();
        for (int i = 0; i < professores.size(); i++) {
            mapaProfessores.put(professores.get(i).getNome(), i);
        }
        for (int i = 0; i < professores.size(); i++) {
            mapaProfessores1.put(professores.get(i).getId(), i);
        }
        if (mapaProfessores.containsKey(professorUser) && professores.get(mapaProfessores1.get(mapaProfessores.get(professorUser))).getId()<10 && (!disciplinaUser.equals("BES005") && !disciplinaUser.equals("BES006") && !disciplinaUser.equals("BES008"))) {
            System.out.println(SituacaoReserva.REPROVADO);
            return false;
        } else if (mapaProfessores.containsKey(professorUser) && (professores.get(mapaProfessores1.get(mapaProfessores.get(professorUser))).getId()>=10 && professores.get(mapaProfessores.get(professorUser)).getId()<14) && (!disciplinaUser.equals("BES011") && !disciplinaUser.equals("BES012") && !disciplinaUser.equals("BES020") && !disciplinaUser.equals("BES026"))) {
            System.out.println(SituacaoReserva.REPROVADO);
            return false;
        } else  if (mapaProfessores.containsKey(professorUser) && professores.get(mapaProfessores1.get(mapaProfessores.get(professorUser))).getId()==14 && (!disciplinaUser.equals("BES038") && !disciplinaUser.equals("BES049") && !disciplinaUser.equals("BES048"))) {
            System.out.println(SituacaoReserva.REPROVADO);
            return false;
        } else {
            return true;
        }
    }








    private boolean validarDisciplina(List<Disciplinas> disciplinas, String disciplinaUser) {
        Map<String, Integer> mapaDisciplina = new HashMap<>();
        for (int i = 0; i < disciplinas.size(); i++) {
            mapaDisciplina.put(disciplinas.get(i).getSigla(), i);
        }
        if (!mapaDisciplina.containsKey(disciplinaUser)) {
            System.out.println(SituacaoReserva.REPROVADO);
            return false;
        } else {
            return true;
        }
    }

    public boolean validaReserva(Date diaReserva, List<Disciplinas> disciplina,
            List<Professores> professor, String disciplinaUser, String professorUser) {


        if (validarData(diaReserva)) {
                if (validarProfessor(professor, professorUser,disciplinaUser)) {
                    if (validarDisciplina(disciplina, disciplinaUser)) {
                        System.out.println(SituacaoReserva.APROVADO);
                        return true;
                    }
                }
            }


        return false;
    }

}
