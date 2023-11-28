package Classes_Modelos;

import java.util.Date;
import java.util.TreeSet;

public interface IReservas {

    public void validaReserva();
    public void validaDiaReserva(Date diaReserva, Date diaReservado);
    public void validaReservaLaboratorio(Integer capacidadeLaboratorio, Boolean statusLaboratorio , TreeSet<Alunos> grupoAlunos);
    public void validaDisciplina(Boolean statusDisciplina);
    public void validaProfessor(Boolean statusProfessor);
    public void validaAlunos(Boolean statusAlunos, TreeSet<Alunos> grupoAlunos);

}