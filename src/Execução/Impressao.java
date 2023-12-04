/**Criação da classe impressão que vai conter a interação do usuario com o sistema e tera um outro metodo que vai chamar todos os metodos para imprimir o resultado  com intuito de otimizar e tonar o codigo mais legivel criando metodos e classes para separar cada elemento @author Murilo*/

package Execução;

import java.util.*;

import Base_Dados.Base;
import Classes_Modelos.*;
import Requerimentos.ValidarSolicitacao;

public abstract class Impressao {

    /**
     * Imprime uma solicitação de reserva para laboratório com base nos parâmetros
     * fornecidos.
     * Este método gera uma solicitação de reserva para laboratório, considerando
     * informações como o professor,
     * disciplina, laboratório, data, tempo de utilização e alunos envolvidos.
     * Também realiza validações
     * através da classe ValidarSolicitacao e, se a reserva for válida, a efetiva
     * utilizando a classe Reserva
     * String laboratorioUser O nome do laboratório desejado para a reserva.
     * String professorUser O nome do professor responsável pela reserva.
     * String disciplinaUser A sigla da disciplina associada à reserva.
     * Date dataUser A data para a qual a reserva é solicitada.
     * Integer minutoUser O tempo de utilização do laboratório em minutos. @author
     * Kaique & @author Eduardo
     */

    public void Imprimir(String laboratorioUser, String professorUser, String disciplinaUser, Date dataUser,
            Integer minutoUser) {
        try {
            List<Solicitacao> solicitacaoList = new ArrayList<>();
            Solicitacao solicitacao = new Solicitacao();
            Base base = new Base();
            ValidarSolicitacao validarSolicitacao = new ValidarSolicitacao();
            Reserva reserva = new Reserva();
            List<Professores> professores = base.getProfessores();
            List<Disciplinas> disciplinas = base.getDisciplinas();
            List<Laboratorios> laboratorios = base.getLaboratorios();
            List<Alunos> alunos = base.getAlunos(1, 65);
            List<Departamentos> departamentos = base.getDepartamentos();

            Random random = new Random();
            int id = random.nextInt(10000);

            solicitacao.setId(id);
            solicitacao.setData(dataUser);
            solicitacao.setTempoDeUtilizacao(minutoUser);
            Map<String, Integer> mapaProfessores = new HashMap<>();
            Map<String, Integer> mapaDisciplina = new HashMap<>();
            Map<String, Integer> mapaLaboratorio = new HashMap<>();
            Map<Alunos, Integer> mapaAluno = new HashMap<>();
            for (int i = 0; i < professores.size(); i++) {
                mapaProfessores.put(professores.get(i).getNome(), i);
            }
            for (int i = 0; i < disciplinas.size(); i++) {
                mapaDisciplina.put(disciplinas.get(i).getSigla(), i);
            }
            for (int i = 0; i < laboratorios.size(); i++) {
                mapaLaboratorio.put(laboratorios.get(i).getDescricao(), i);
            }
            for (int i = 0; i < alunos.size(); i++) {
                mapaAluno.put(alunos.get(i), i);
            }

            if (mapaProfessores.containsKey(professorUser)) {
                solicitacao.setProfessor(professores.get(mapaProfessores.get(professorUser)));
            } else {
                System.out.println("erro professor");
            }
            if (mapaDisciplina.containsKey(disciplinaUser)) {
                solicitacao.setDisciplina(disciplinas.get(mapaDisciplina.get(disciplinaUser)));
            } else {
                System.out.println("erro disciplina");
            }

            if (mapaLaboratorio.containsKey(laboratorioUser)) {
                solicitacao.setLaboratorio(laboratorios.get(mapaLaboratorio.get(laboratorioUser)));
            } else {
                System.out.println("erro laboratorio");
            }

            switch (laboratorioUser) {
                case "LAB2", "LAB3", "LAB4", "LAB5", "LAB6", "LAB7":
                    solicitacao.setAlunos(alunos.subList(0, 20));
                    break;
                case "LAB8", "LAB9", "LAB11", "LAB12":
                    solicitacao.setAlunos(alunos.subList(20, 35));
                    break;
                case "LAB1", "LAB10":
                    solicitacao.setAlunos(alunos.subList(35, 65));
                    break;
                default:
                    break;
            }
            switch (professorUser) {
                case "Professor01", "Professor02", "Professor03", "Professor04", "Professor05", "Professor06",
                        "Professor07", "Professor08", "Professor09", "Professor010":
                    solicitacao.setDepartamentos(departamentos.get(0));
                    break;
                case "Professor011", "Professor012", "Professor013", "Professor014":
                    solicitacao.setDepartamentos(departamentos.get(1));
                    break;
                case "Professor015":
                    solicitacao.setDepartamentos(departamentos.get(2));
                    break;
                default:
                    break;
            }
            solicitacaoList.add(solicitacao);
            System.out.println(solicitacaoList);
            System.out.println("--------------------------------------------------------------");
            if (validarSolicitacao.validaReserva(dataUser, disciplinas, professores, disciplinaUser,
                    professorUser) == true) {
                reserva.reservasEfetivadas(solicitacaoList);
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public abstract void encerraPrograma(String respostaUsuario);

}
