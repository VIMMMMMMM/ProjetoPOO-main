/**Criação da classe impressão que vai conter a interação do usuario com o sistema e tera um outro metodo que vai chamar todos os metodos para imprimir o resultado  com intuito de otimizar e tonar o codigo mais legivel criando metodos e classes para separar cada elemento @author Murilo*/

package Execução;

import static java.lang.System.exit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import Base_Dados.Base;
import Classes_Modelos.*;
import Requerimentos.ValidarSolicitacao;

public class Impressao extends Reserva {
    /**
     * Metodo imprimir que ira chamar todos os metodos da classe Base atraves de uma
     * variavel do tipo List pois o metodo tambem é uma List e mostrar todo o
     * resultado atraves de um forEach @author Murilo
     */
    public void Imprimir(String laboratorioUser, String professorUser, String disciplinaUser, Date dataUser, Date horaUser, String minutoUser)   {
        Base base = new Base();
        List<Laboratorios> listaLaboratorios = base.getLaboratorios();
        List<Professores> listaProfessores = base.getProfessores();
        List<Disciplinas> listaDisciplinas = base.getDisciplinas();
        List<Alunos> listaAlunos = base.getAlunos(1, 10);
        for (Laboratorios ClasseLab : listaLaboratorios) {
            if (ClasseLab.getDescricao().equals(laboratorioUser)) {
                System.out.println(ClasseLab);
            }
        }
        for (Professores ClassProf : listaProfessores) {
            if (ClassProf.getNome().equals(professorUser)) {
                System.out.println(ClassProf);
            }
        }
        for (Disciplinas ClassDis : listaDisciplinas) {
            if (ClassDis.getDescricao().equals(disciplinaUser)) {
                System.out.println(ClassDis);
            }
        }
        for (Alunos alunos : listaAlunos) {
            System.out.println(alunos);
        }
        Random solicitacao = new Random(10000);
        System.out.println();
    }
    public void impressaoReserva() {

    }
}