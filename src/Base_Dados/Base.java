/**
 * Criação da classe "Base" que implementa os metodos da interface iBase. @author Caio e @author Murilo
 */

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

    /**
     * Implementação do metodo que é da interface IBase, metodo que retorna uma List
     * da classe laboratorio, usa-se o tratamento de erro (try e catch), usa-se uma
     * estrutura de repetição para todo o preenchimento da List. Uso do switch case
     * que auxilia ao o que o usuario ira digitar e se for correspondente com as
     * opções ele ira setar de acordo com cada laboratorio especifico. @author
     * Murilo
     */
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

    /**
     * Este metodo cria um List do tipo Departamentos e dentro de uma estrutura de
     * repetição ele adiciona dentro dessa List a chamada de um metodo que faz todo
     * o set da classe Departamento, tudo dentro de um tratamento de erro (try
     * catch) e no final retornando uma List. @author Murilo & @author Caio
     */
    @Override
    public List<Departamentos> getDepartamentos() {
        List<Departamentos> listaDepartamentos = new ArrayList<>();
        try {
            for (int i = 0; i < QNTD_DEPARTAMENTOS; i++) {
                listaDepartamentos.add(criarDepartamentos(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return listaDepartamentos;
    }

    /** @author Caio */
    @Override
    public List<Professores> getProfessores() {
        List<Professores> listaProfessores = new ArrayList<>();

        try {
            for (int i = 1; i <= QNTD_PROFESSORES; i++) {
                Professores professor = new Professores();
                professor.setNome("Professor0" + i);

                switch (professor.getNome()) {
                    case "Professor01", "Professor02", "Professor03", "Professor04", "Professor05", "Professor06", "Professor07", "Professor08", "Professor09", "Professor010" -> {
                        professor.setId(i);
                        professor.setDepartamento(getDepartamentos().get(0));
                        professor.setStatus(true);
                        professor.setConjuntoDisciplina(disciplinasDoProfessor(1, 3));
                    }
                    case "Professor011", "Professor012", "Professor013", "Professor014" -> {
                        professor.setId(i);
                        professor.setDepartamento(getDepartamentos().get(1));
                        professor.setStatus(true);
                        professor.setConjuntoDisciplina(disciplinasDoProfessor(4, 4));
                    }
                    case "Professor015" -> {
                        professor.setId(i);
                        professor.setDepartamento(getDepartamentos().get(2));
                        professor.setStatus(true);
                        professor.setConjuntoDisciplina(disciplinasDoProfessor(8, 3));
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

    /**
     * Metodo que tem como retorno uma List de disciplinas, nesse metodo todos os
     * atributos da classe Disciplinas sao setados atraves de uma estrutura de
     * repetição for e atraves do switch case para setar especificamente cada
     * posição pois em cada posição possui um id, sigla, status e descrição
     * diferente dos demais, logos após adicionamos todos os atributos dentro de uma
     * List e todo esse controle é feito dentro de um tratamento de erro (try
     * catch) @author Murilo
     */
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

    /**Implementação do método da interface iBase do tipo List<Alunos> que recebe como parâmetro numeros para localização de index's.
     * Primeiro é criado uma lista chamada conjuntoAlunos e depois é adicionado todos os elementos do conjunto hashset que faz parte
     * do métoodo criarAlunos, passando como parâmetro o numero de inicio e da quantidade de alunos da sua preferência.
     * Ao final de tudo é realizado um retorno da lista de conjuntoAlunos, usando a função sublist que permite com que seja possivel setar o index inicial e o index final.
     * É realizado uma subtração de inicio-inicio, pois o primeiro aluno faz parte do index 0 da lista e quando coloca no parâmetro de inicio
     * ele imprime o aluno 1, se colocar 2 imprime aluno 2 e assim sucessivamente (foi utilizado try e catch para tratamento de erros) @author Caio @author Murilo*/

    public List<Alunos> getAlunos(int inicio, int qtden) {

        List<Alunos> conjuntoAlunos = new ArrayList<>();

        try {

            conjuntoAlunos.addAll(criarAlunos(inicio, qtden));

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return conjuntoAlunos.subList(inicio - inicio, qtden);
    }


    /**Implementação do método criarAlunos, que tem como principal objetivo criar alunos e setar em um conjunto.
     * Primeiro inicia-se um conjunto HashSet e depois restringe o código utilizando uma estrutura de condição, onde o valor inicial tem que ser obrigatoriamente 1 para os alunos
     * serem criados, além disso a quantidade de alunos tem que ser maior do que 0. Com a ajuda do for, é possivel setar as caracteristicas de cada aluno e adicionar no conjunto Alunos.
     * Caso o usuário coloque um valor que não está de acordo com as condições, será impresso na tela que o numero escolhido é invalido.
     * No final de tudo retorna um conjunto Set e é utilizado try e catch para tratamentos de erros @author Caio */

    private Set<Alunos> criarAlunos(int inicio, int qtden) {
        Set<Alunos> alunos = new HashSet<>();

        try {

            if (inicio >= 1 && qtden > 0) {
                for (int i = inicio; i < inicio + qtden; i++) {
                    Alunos aluno = new Alunos();
                    aluno.setId(i);
                    aluno.setNome("Aluno" + i);
                    aluno.setMatricula(20232000 + i);
                    aluno.setStatus(true);

                    alunos.add(aluno);
                }
            } else {
                System.out.println("Número inválido");
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return alunos;
    }

    /**
     * Metodo que recebe como parametro (inicio e quantidade) que sera definida por
     * quem chamar esse metodo e retorna um conjunto do tipo Set. primeiro o metodo
     * cria um conjunto HashSet, guarda toda a lista de disciplinas que esta no
     * metodo getDisciplinas dentro da List (disciplinasList) para poder acessar
     * cada disciplina dessa List. no if ele faz a seginte condição:
     *
     * - inicio tem que ser maior ou igual a 1
     * - inicio tem que ser menor ou igual a quantidade de disciplinas dentro da
     * List
     * - quantidade tem que ser maior que 0
     * - quantidade tem que ser menor ou igual a quantidade de disciplinas dentro da
     * List
     *
     * no for o i recebe como valor de inicio -1 pois indica o index, o i tem que
     * ser
     * inicio -1 + a quantidade de disciplinas e o i precisa ser menor que a
     * qunatidade de disciplinas que a List possui, esta é a condição para manter a
     * estrutura de repetição e percorrer a List, ele incrementa o i++ e
     * dentro do for adicionamos o List de disciplinas dentro do conjunto Set e logo
     * após a finalização retornamos esse conjunto Set @author Murilo
     */
    private Set<Disciplinas> disciplinasDoProfessor(Integer inicio, Integer quantidade) {

        Set<Disciplinas> disciplinasSet = new HashSet<Disciplinas>();
        List<Disciplinas> disciplinasList = getDisciplinas();

        if (inicio >= 1 && inicio <= disciplinasList.size() && quantidade > 0 && quantidade <= disciplinasList.size()) {
            for (int i = inicio - 1; i < inicio - 1 + quantidade && i < disciplinasList.size(); i++) {
                disciplinasSet.add(disciplinasList.get(i));
            }
        }
        return disciplinasSet;
    }

    /**
     * Metodo que ira receber como parametro o id e de acordo com esse id ele ira
     * retorna atributos atraves do construtor da classe Departamentos, por exemplo:
     * caso o id for 1 ele ira retornar um objeto do tipo Departamento que é setado
     * pelo construtor, caso nao seja nenhuma das opções, ira retornar null @author
     * Murilo
     */
    private Departamentos criarDepartamentos(int id) {
        return switch (id) {
            case 0 -> new Departamentos(1, "Engenharia de Software", "ES");
            case 1 -> new Departamentos(2, "Computação de Alto Nivel", "CA");
            case 2 -> new Departamentos(3, "Computação de Alto Nivel", "CA");
            default -> null;
        };

    }
}