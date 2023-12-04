package Requerimentos;

import Base_Dados.Base;
import Classes_Modelos.Disciplinas;
import Classes_Modelos.Professores;
import Execução.Impressao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class SolicitarLaboratorio extends Impressao{
    /**
     * Metodo Usuario que serve para guardar toda a interação do usuario com o
     * sistema dentro de variaveis que ira interagir totalmente com o sistema alem
     * de chamar o metodo imprimir @author Murilo
     */
    static Scanner scan = new Scanner(System.in);
    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public void Usuario() {
        int i = 0;
        while (i != 1) {
            System.out.println("\n<<< SOLICITAÇÃO DE RESERVA >>>");
            System.out.println("1- caso deseja sair do programa.");
            System.out.println("2- caso deseja reservar laboratorio\n");
            i = scan.nextInt();
            switch (i) {
                case 1:
                    break;
                case 2:
                    userInteraction();
                    break;
                default:
                    System.out.println("numero invalido");
                    break;
            }
        }
    }

    /**
     * Método responsável por interagir com o usuário para realizar a solicitação de
     * reserva de laboratório.
     * Ele solicita informações como laboratório desejado, nome do professor, sigla
     * da disciplina, data e hora de início,
     * e a quantidade de minutos desejados para a reserva. Realiza validações e, se
     * tudo estiver correto,
     * imprime a solicitação de reserva utilizando a classe Impressao. @author
     * Kaique & @author Eduardo @author Murilo
     */

    private void userInteraction() {
        Base base = new Base();
        List<Professores> professores = base.getProfessores();
        List<Disciplinas> disciplinas = base.getDisciplinas();
        ValidarSolicitacao validarSolicitacao = new ValidarSolicitacao();

        try {
            System.out.println("===> Preencha tudo o que se pede a seguir: ");
            System.out.print("Informe qual o laboratorio deseja reservar? ");
            String laboratorioUser = scan.next();
            encerraPrograma(laboratorioUser);
            System.out.print("Informe o nome do professor: ");
            String professorUser = scan.next();
            encerraPrograma(professorUser);
            System.out.print("Informe a sigla da disciplina: ");
            String disciplinaUser = scan.next();
            encerraPrograma(disciplinaUser);
            scan.nextLine();
            System.out.print("Informe a data dd/mm/yyyy e inicial a hora HH:mm:ss inicial de uso do laboratorio? ");
            Date dataUser = simpleDateFormat.parse(scan.nextLine());
            encerraPrograma(String.valueOf(dataUser));
            System.out.print("Informe os minutos que deseja usar o laboratorio? ");
            Integer minutoUser = scan.nextInt();
            encerraPrograma(String.valueOf(minutoUser));
            System.out.println("");
            validarSolicitacao.validaReserva(dataUser, disciplinas, professores, disciplinaUser, professorUser);
            Imprimir(laboratorioUser, professorUser, disciplinaUser, dataUser, minutoUser);

        } catch (ParseException p) {
            System.out.println("erro parse " + p.getMessage());
        }

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