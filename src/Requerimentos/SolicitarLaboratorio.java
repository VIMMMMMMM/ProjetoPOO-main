package Requerimentos;

import Execução.Impressao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.System.exit;

public class SolicitarLaboratorio {
    /**
     * Metodo Usuario que serve para guarda toda a interação do usuario com o
     * sistema dentro de variaveis que ira interagir totalmente com o sistema alem
     * de chamar o metodo imprimir @author Murilo
     */
    public void Usuario() throws ParseException {
        Scanner scan = new Scanner(System.in);
        Impressao impressao = new Impressao();
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
        impressao.Imprimir(laboratorioUser, professorUser, disciplinaUser, dataUser, horaUser, minutoUser);
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