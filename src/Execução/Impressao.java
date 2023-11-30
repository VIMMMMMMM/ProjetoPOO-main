/**Criação da classe impressão que vai conter a interação do usuario com o sistema e tera um outro metodo que vai chamar todos os metodos para imprimir o resultado  com intuito de otimizar e tonar o codigo mais legivel criando metodos e classes para separar cada elemento @author Murilo*/

package Execução;

import static java.lang.System.exit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import Base_Dados.Base;
import Classes_Modelos.Alunos;
import Classes_Modelos.Disciplinas;
import Classes_Modelos.Laboratorios;
import Classes_Modelos.Professores;
import Requerimentos.ValidarSolicitacao;

public class Impressao {
    /**
     * Metodo Usuario que serve para guarda toda a interação do usuario com o
     * sistema dentro de variaveis que ira interagir totalmente com o sistema alem
     * de chamar o metodo imprimir @author Murilo
     */
    public void Usuario() throws ParseException {
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("HH:mm");

        System.out.println("<<< SOLICITAÇÃO DE RESERVA >>>");
        System.out.println("Digite 1 caso deseja sair do programa.\n ");

        System.out.println("===> Preencha tudo o que se pede a seguir: ");
        System.out.print("Informe qual o laboratorio deseja reservar? ");
        String laboratorioUser = scan.nextLine();
        encerraPrograma(laboratorioUser);


        System.out.print("Informe o nome do professor: ");
        String professorUser = scan.nextLine();
        encerraPrograma(professorUser);

        System.out.print("Informe a sigla da disciplina: ");
        String disciplinaUser = scan.nextLine();
        encerraPrograma(disciplinaUser);

        System.out.print("Informe a data dd/mm/yyyy inicial de uso do laboratorio? ");
        Date dataUser = simpleDateFormat.parse(scan.nextLine());
        encerraPrograma(String.valueOf(dataUser));

        System.out.print("Informe a hora HH:mm inicial de uso do laboratorio? ");
        Date horaUser = simpleDateFormat1.parse(scan.nextLine());
        encerraPrograma(String.valueOf(horaUser));

        System.out.print("Informe os minutos que deseja usar o laboratorio? ");
        String minutoUser = scan.nextLine();
        System.out.println("");
        encerraPrograma(minutoUser);

        Imprimir(laboratorioUser, professorUser, disciplinaUser, dataUser, horaUser, minutoUser);

    }

    /**
     * Metodo imprimir que ira chamar todos os metodos da classe Base atraves de uma
     * variavel do tipo List pois o metodo tambem é uma List e mostrar todo o
     * resultado atraves de um forEach @author Murilo
     */
    public void Imprimir(String laboratorioUser, String professorUser, String disciplinaUser, Date dataUser, Date horaUser, String minutoUser) {
    Date date = new Date();
        Base base = new Base();


        List<Laboratorios> listaLaboratorios = base.getLaboratorios();
        List<Professores> listaProfessores = base.getProfessores();
        List<Disciplinas> listaDisciplinas = base.getDisciplinas();
        List<Alunos> listaAlunos = base.getAlunos(1, 10);

        ValidarSolicitacao validarSolicitacao = new ValidarSolicitacao();


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
        validarSolicitacao.validaDiaReserva(dataUser,date);

    }

    /**
     * Metodo para a verificação do que o usuario digitou, se o usuario digitar 1 a
     * qualquer momento o programa ira encerrar. @author Murilo
     */
    public void encerraPrograma(String respostaUsuario) {
        if ("1".equals(respostaUsuario)) {
            System.out.println("Programa encerrado");
            exit(0);
        }
    }

}