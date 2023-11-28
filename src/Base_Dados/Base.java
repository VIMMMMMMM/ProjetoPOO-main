/**Criação da classe "Base" que implementa os metodos da interface iBase. @author Caio e @author Murilo */

package Base_Dados;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Classes_Modelos.Alunos;
import Classes_Modelos.Departamentos;
import Classes_Modelos.Disciplinas;
import Classes_Modelos.Laboratorios;
import Classes_Modelos.Professores;

public class Base implements IBase {

    private final Integer QNTD_DEPARTAMENTOS = 3;
    private final Integer QNTD_PROFESSORES = 15;
    private final Integer QNTD_LABORATORIOS = 12;

    /**Metodo cujo o mesmo é uma sobrescrita do metodo que possui na interface IBase, que cria uma lista da classse Laboratorios e faz o set de todos os seus atributos utilizando também o tratamento de erro e o switch case para que podemos setar os laboratorios especificos com seus respectivos valores @author Murilo*/
    @Override
public List<Laboratorios> getLaboratorios() {
    List<Laboratorios> listaLaboratorio = new ArrayList<>();
    try {
        for (int i = 1; i <= QNTD_LABORATORIOS; i++) {
            Laboratorios laboratorios = new Laboratorios();
            laboratorios.setDescricao("LAB" + i);

            switch (laboratorios.getDescricao()) {
                case "LAB2", "LAB3", "LAB4", "LAB5", "LAB6", "LAB7" -> {
                    laboratorios.setCapacidade(20);
                    laboratorios.setId(i);
                    laboratorios.setStatus(true);
                }
                case "LAB8", "LAB9", "LAB11", "LAB12" -> {
                    laboratorios.setCapacidade(15);
                    laboratorios.setId(i);
                    laboratorios.setStatus(true);
                }
                case "LAB1", "LAB10" -> {
                    laboratorios.setCapacidade(30);
                    laboratorios.setId(i);
                    laboratorios.setStatus(true);
                }
            }
            listaLaboratorio.add(laboratorios);
        }
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }

    return listaLaboratorio;
}

    /** */
    @Override
public List<Departamentos> getDepartamentos() {
        List <Departamentos> listaDepartamentos = new ArrayList<>();
        try {
            for (int i = 1; i <=QNTD_DEPARTAMENTOS; i++){
                Departamentos departamentos = new Departamentos();

                switch (i) {
                    case 1 -> {
                        departamentos.setId(i);
                        departamentos.setDescricao("Engenharia de Software");
                        departamentos.setSigla("ES");
                    }
                    case 2 -> {
                        departamentos.setId(i);
                        departamentos.setDescricao("Computação de Alto Desempenho");
                        departamentos.setSigla("CAD");
                    }
                    case 3 -> {
                        departamentos.setId(i);
                        departamentos.setDescricao("Infraestrutura Computacional");
                        departamentos.setSigla("IC");
                    }
                }
            listaDepartamentos.add(departamentos);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return listaDepartamentos;
    }

    @Override
    public List<Professores> getProfessores() {
        List <Professores> listaProfessores = new ArrayList<>();
        

        try {
            for (int i = 1; i <= QNTD_PROFESSORES; i++){
            Professores professor = new Professores();
            professor.setNome("Professor0" + i);

                switch (professor.getNome()) {
                    case "Professor01", "Professor02", "Professor03", "Professor04", "Professor05", "Professor06", "Professor07", "Professor08", "Professor09", "Professor10" -> {
                        professor.setId(i);
                        professor.setDepartamento(getDepartamentos().get(0));
                        professor.setStatus(true); //precisa mudar
                        professor.setConjuntoDisciplina(disciplinasDoProfessor(0, 1)); //obs
                    }
                    case "Professor011", "Professor012", "Professor013", "Professor014" -> {
                        professor.setId(i);
                        professor.setDepartamento(getDepartamentos().get(1));
                        professor.setStatus(true);
                        professor.setConjuntoDisciplina(disciplinasDoProfessor(1, 1));//obs
                    }
                    case "Professor015" -> {
                        professor.setId(i);
                        professor.setDepartamento(getDepartamentos().get(2));
                        professor.setStatus(true);
                        professor.setConjuntoDisciplina(disciplinasDoProfessor(2, 1));//obs
                    }
                }
            
            listaProfessores.add(professor);
        }

        
        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }
        
        return listaProfessores;
    }

    /**Criação da Classe disciplina que vai setar cada um de seus atributos atraves do switch case para definir o set em cada exeção da disciplina e depois adiciona-la dentro de uma lista do tipo Disciplina @author Murilo */
    @Override
    public List<Disciplinas> getDisciplinas() {
        List<Disciplinas> listaDisciplinas = new ArrayList<>();
        try {
            for (int i = 1; i <= 10; i++) {
                Disciplinas disciplinas = new Disciplinas();
                switch (i) {
                    case 1 -> {
                        disciplinas.setDescricao("LOGICA DE PROGRAMAÇÃO");
                        disciplinas.setId(i);
                        disciplinas.setSigla("BES005");
                        disciplinas.setStatus(true);
                    }
                    case 2 -> {
                        disciplinas.setDescricao("ESTRUTURA DE DADOS");
                        disciplinas.setId(i);
                        disciplinas.setSigla("BES006");
                        disciplinas.setStatus(true);
                    }
                    case 3 -> {
                        disciplinas.setDescricao("PROGRAMAÇÃO ORIENTADA A OBJETOS");
                        disciplinas.setId(i);
                        disciplinas.setSigla("BES008");
                        disciplinas.setStatus(false);
                    }
                    case 4 -> {
                        disciplinas.setDescricao("BANCO DE DADOS");
                        disciplinas.setSigla("BES011");
                        disciplinas.setId(i);
                        disciplinas.setStatus(true);
                        ;
                    }
                    case 5 -> {
                        disciplinas.setDescricao("ENGENHARIA DE REQUISITOS");
                        disciplinas.setId(i);
                        disciplinas.setSigla("BES012");
                        disciplinas.setStatus(true);
                    }
                    case 6 -> {
                        disciplinas.setDescricao("PROGRAMAÇAO PARA DISPOSITIVOS MOVEIS");
                        disciplinas.setId(i);
                        disciplinas.setSigla("BES020");
                        disciplinas.setStatus(true);
                    }
                    case 7 -> {
                        disciplinas.setDescricao("SISTEMAS DISTRIBUIDOS");
                        disciplinas.setId(i);
                        disciplinas.setSigla("BES026");
                        disciplinas.setStatus(true);
                    }
                    case 8 -> {
                        disciplinas.setDescricao("INTELIGENCIA ARTIFICIAL");
                        disciplinas.setId(i);
                        disciplinas.setSigla("BES038");
                        disciplinas.setStatus(true);
                    }
                    case 9 -> {
                        disciplinas.setDescricao("PROGRAMAÇÃO WEB");
                        disciplinas.setId(i);
                        disciplinas.setSigla("BES049");
                        disciplinas.setStatus(true);
                    }
                    case 10 -> {
                        disciplinas.setDescricao("PROGRAMAÇÃO FRONT-END");
                        disciplinas.setId(i);
                        disciplinas.setSigla("BES048");
                        disciplinas.setStatus(true);
                    }
                }
                listaDisciplinas.add(disciplinas);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
    }

       return listaDisciplinas;
}

    @Override
    public List<Alunos> getAlunos(int qtden, int inicio) {
        return null;
    }
    
    /**Criação da classe @author Murilo */
    private Set<Disciplinas> disciplinasDoProfessor(Integer inicio, Integer quantidade) {

     Set<Disciplinas> dis = new HashSet<Disciplinas>();
     List<Disciplinas> disc = getDisciplinas();
     
     for (int i = inicio; i < inicio + quantidade; i++){
        dis.add(disc.get(i));
        
        }
           return dis;
    }
}