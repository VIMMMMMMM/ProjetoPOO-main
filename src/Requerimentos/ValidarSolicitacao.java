package Requerimentos;
/*
classe que valida solicitacao do Laboratorio @author Eduardo @author Kaique
 */

import Base_Dados.Base;
import Classes_Modelos.*;

import java.util.*;

public class ValidarSolicitacao {
    static Base base = new Base();

    private boolean validarData(Date diaReserva) {
        Date diaAtual = new Date();

        if (diaReserva.before(diaAtual)) {
            System.out.println(SituacaoReserva.REPROVADO);
            return false;
        } else {
            return true;
        }
    }

    private boolean validarLaboratorio (List<Laboratorios> laboratorios, String laboratorioUser) {
        Map<String, Integer> mapaLaboratorio = new HashMap<>();
        
         for (int i = 0; i < laboratorios.size(); i++) {
            mapaLaboratorio.put(laboratorios.get(i).getDescricao(), i);
        }

        if (!mapaLaboratorio.containsKey(laboratorioUser)) {
           System.out.println(SituacaoReserva.REPROVADO);
           return false;
        }else {
            return true;
        }
        
    }
        

    private boolean validarProfessor(List<Professores> professores, String professorUser, String disciplinaUser) {
         Map<String, Integer> mapaProfessores = new HashMap<>();

        for (int i = 0; i < professores.size(); i++) {
            mapaProfessores.put(professores.get(i).getNome(), i);
        }
        
        if (!mapaProfessores.containsKey(professorUser)) {
            System.out.println(SituacaoReserva.REPROVADO);
            return false;
        }
        else {
            if (mapaProfessores.(professorUser) && disciplinaUser != "BES005" || disciplinaUser != "BES006" || disciplinaUser != "BES008") {
                
                System.out.println(SituacaoReserva.REPROVADO);
                return false;
            } else {
                return true;
            }

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

    public void validaReserva(Date diaReserva, List<Laboratorios> laboratorio, List<Disciplinas> disciplina,
            List<Professores> professor, String disciplinaUser, String professorUser, List<Alunos> aluno) {
        Date diaUser = new Date();

        if (validarData(diaReserva)) {
            if (validarLaboratorio(laboratorio, professorUser)) {
                if (validarProfessor(professor, professorUser)) {
                    if (validarDisciplina(disciplina, disciplinaUser)) {
                        System.out.println(SituacaoReserva.APROVADO);
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
