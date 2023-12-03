/**Criação da classe impressão que vai conter a interação do usuario com o sistema e tera um outro metodo que vai chamar todos os metodos para imprimir o resultado  com intuito de otimizar e tonar o codigo mais legivel criando metodos e classes para separar cada elemento @author Murilo*/

package Execução;

import java.util.*;

import Base_Dados.Base;
import Classes_Modelos.*;

public class Impressao extends Reserva {
    /**
     * Metodo imprimir que ira chamar todos os metodos da classe Base atraves de uma
     * variavel do tipo List pois o metodo tambem é uma List e mostrar todo o
     * resultado atraves de um forEach @author Murilo
     */
    public void Imprimir(String laboratorioUser, String professorUser, String disciplinaUser, Date dataUser, Date horaUser, Integer minutoUser) {
        try {
            Map<Integer, Solicitacao> solicitacaoMap = new HashMap<>(); // Alteração para Map
            Base base = new Base();
            List<Professores> professores = base.getProfessores();
            List<Disciplinas> disciplinas = base.getDisciplinas();
            List<Laboratorios> laboratorios = base.getLaboratorios();
            List<Alunos> alunos =  base.getAlunos(1, 10);
           List<Departamentos>  departamentos =  base.getDepartamentos();

            Random random = new Random(1000);
            Solicitacao solicitacao = new Solicitacao();
            int id = random.nextInt(10000);
            solicitacao.setId(id);
            solicitacao.setData(dataUser);
            solicitacao.setTempoDeUtilizacao(minutoUser);
            // Chamando métodos da própria classe Impressao
            configurarProfessor(professores, solicitacao);
            configurarDisciplina(disciplinas, solicitacao);
            configurarLaboratorio(laboratorios, solicitacao);
            configurarAlunos(alunos, solicitacao);
            configurarDepartamentos(departamentos, solicitacao);



            solicitacaoMap.put(id, solicitacao); // Adicionando ao Map

            System.out.println(solicitacaoMap);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Métodos adicionais para configurar os atributos
    private void configurarProfessor(List<Professores> professores, Solicitacao solicitacao) {
        // Lógica para configurar o professor
        solicitacao.setProfessor(professores.get(0));
    }

    private void configurarDisciplina(List<Disciplinas> disciplinas, Solicitacao solicitacao) {
        // Lógica para configurar a disciplina
        solicitacao.setDisciplina(disciplinas.get(0));
    }

    private void configurarLaboratorio(List<Laboratorios> laboratorios, Solicitacao solicitacao) {
        // Lógica para configurar o laboratório
        solicitacao.setLaboratorio(laboratorios.get(0));
    }

    private void configurarAlunos(List<Alunos> alunos, Solicitacao solicitacao) {
        // Lógica para configurar os alunos
        solicitacao.setAlunos(alunos);
    }

    private void configurarDepartamentos(List<Departamentos> departamentos, Solicitacao solicitacao) {
        // Lógica para configurar os departamentos
        solicitacao.setDepartamentos(departamentos.get(0));

    }
    public void impressaoReserva() {

    }
}

