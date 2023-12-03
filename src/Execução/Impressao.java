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
          List<Solicitacao >solicitacaoList=new ArrayList<>();
            Base base = new Base();
            List<Professores> professores = base.getProfessores();
            List<Disciplinas> disciplinas = base.getDisciplinas();
            List<Laboratorios> laboratorios = base.getLaboratorios();
            List<Alunos> alunos =  base.getAlunos(1, 65);
           List<Departamentos>  departamentos =  base.getDepartamentos();

            Random random = new Random(1000);
            Solicitacao solicitacao = new Solicitacao();
            int id = random.nextInt(10000);
            solicitacao.setId(id);
            solicitacao.setData(dataUser);
            solicitacao.setTempoDeUtilizacao(minutoUser);
            Map<Professores, Integer> mapaProfessores = new HashMap<>();
            Map<String, Integer> mapaDisciplina= new HashMap<>();
            Map<String,Integer> mapaLaboratorio=new HashMap<>();

            for (int i = 0; i < professores.size(); i++) {
                if (professorUser == professores.get(i).getNome()){
                    solicitacao.setProfessor(professores.get(i));
                }
            }


            mapaDisciplina.put("BES005",1);
            if (mapaDisciplina.containsKey(disciplinaUser)) {
                solicitacao.setDisciplina(disciplinas.get(mapaDisciplina.get(disciplinaUser)));
            }
            mapaLaboratorio.put("LAB8",2);
            if (mapaLaboratorio.containsKey(laboratorioUser)) {
                solicitacao.setLaboratorio(laboratorios.get(mapaLaboratorio.get(laboratorioUser)));
            }

            switch (laboratorioUser){
                case "LAB2", "LAB3", "LAB4", "LAB5", "LAB6", "LAB7":
                    solicitacao.setAlunos(alunos.subList(0,20));
                    break;
                case "LAB8", "LAB9", "LAB11", "LAB12":
                    solicitacao.setAlunos(alunos.subList(20,35));
                    break;
                case "LAB1", "LAB10":
                    solicitacao.setAlunos(alunos.subList(35,65));
                    break;
                default:
                    break;
            }
            switch (professorUser){
                case "Professor01", "Professor02", "Professor03", "Professor04", "Professor05", "Professor06", "Professor07", "Professor08", "Professor09", "Professor010":
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
        } catch (Exception e) {
           e.printStackTrace();
        }
    }

    public void impressaoReserva() {
        Solicitacao solicitacao=new Solicitacao();
        List<String> reservas=new ArrayList<>();
        reservas.add(solicitacao.toString());
        for (int i = 0; i < reservas.size(); i++) {
            System.out.println(reservas.get(i));
        }


    }
}

