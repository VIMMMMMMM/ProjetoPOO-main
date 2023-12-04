package Requerimentos;
/*
classe que valida solicitacao do Laboratorio @author Eduardo & @author Kaique
 */

import Base_Dados.Base;
import Classes_Modelos.*;

import java.util.*;

/**
 * Classe ValidarSolicitacao para validar uma reserva. @author Kaique & @author Eduardo
 *
 */

public class ValidarSolicitacao {

    /**
     * Método para validar a data da reserva.
     * Date diaReserva A data da reserva a ser validada.
     * return false se a data da reserva for anterior à data atual, true caso
     * contrário. @author Kaique & @author Eduardo
     */

    private boolean validarData(Date diaReserva) {
        Date diaAtual = new Date();

        if (diaReserva.before(diaAtual)) {
            System.out.println(SituacaoReserva.REPROVADO);
            return false;
        } else {
            return true;
        }
    }

    /**
     * Valida se o professor e a disciplina associados à solicitação são válidos.
     *
     * List<Professores> professores Lista de professores disponíveis.
     * String professorUser Nome do professor fornecido pelo usuário.
     * String disciplinaUser Sigla da disciplina fornecida pelo usuário.
     * return true se o professor e a disciplina forem válidos, return false se
     * forem inválidos. @author Kaique & @author Eduardo
     */

    private boolean validarProfessor(List<Professores> professores, String professorUser, String disciplinaUser) {
        Map<String, Integer> mapaProfessores = new HashMap<>();
        Map<Integer, Integer> mapaProfessores1 = new HashMap<>();
        for (int i = 0; i < professores.size(); i++) {
            mapaProfessores.put(professores.get(i).getNome(), i);
        }
        for (int i = 0; i < professores.size(); i++) {
            mapaProfessores1.put(professores.get(i).getId(), i);
        }
        if (mapaProfessores.containsKey(professorUser)
                && professores.get(mapaProfessores1.get(mapaProfessores.get(professorUser))).getId() < 10
                && (!disciplinaUser.equals("BES005") && !disciplinaUser.equals("BES006")
                        && !disciplinaUser.equals("BES008"))) {
            System.out.println(SituacaoReserva.REPROVADO);
            return false;
        } else if (mapaProfessores.containsKey(professorUser)
                && (professores.get(mapaProfessores1.get(mapaProfessores.get(professorUser))).getId() >= 10
                        && professores.get(mapaProfessores.get(professorUser)).getId() < 14)
                && (!disciplinaUser.equals("BES011") && !disciplinaUser.equals("BES012")
                        && !disciplinaUser.equals("BES020") && !disciplinaUser.equals("BES026"))) {
            System.out.println(SituacaoReserva.REPROVADO);
            return false;
        } else if (mapaProfessores.containsKey(professorUser)
                && professores.get(mapaProfessores1.get(mapaProfessores.get(professorUser))).getId() == 14
                && (!disciplinaUser.equals("BES038") && !disciplinaUser.equals("BES049")
                        && !disciplinaUser.equals("BES048"))) {
            System.out.println(SituacaoReserva.REPROVADO);
            return false;
        } else {
            return true;
        }
    }

    /**
     * Valida se a disciplina fornecida é válida.
     *
     * List<Disciplinas> disciplinas Lista de disciplinas disponíveis.
     * String disciplinaUser Sigla da disciplina fornecida pelo usuário.
     * return true se a disciplina for válida, false se for inválida. @author Kaique & @author Eduardo
     */

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

    /**
     * Valida a solicitação de reserva considerando data, professor e disciplina.
     *
     * Date diaReserva Data da reserva.
     * List<Disciplinas> disciplinas Lista de disciplinas disponíveis.
     * List<Professores> professores Lista de professores disponíveis.
     * String disciplinaUser Sigla da disciplina fornecida pelo usuário.
     * String professorUser Nome do professor fornecido pelo usuário.
     * return code true se a solicitação for aprovada,false se for reprovada.
     * Imprime na tela o Enum aprovado caso for aprovado. @author Kaique & @author Eduardo
     */

    public boolean validaReserva(Date diaReserva, List<Disciplinas> disciplina,
            List<Professores> professor, String disciplinaUser, String professorUser) {

        if (validarData(diaReserva)) {
            if (validarProfessor(professor, professorUser, disciplinaUser)) {
                if (validarDisciplina(disciplina, disciplinaUser)) {
                    System.out.println(SituacaoReserva.APROVADO);
                    return true;
                }
            }
        }

        return false;
    }

}
