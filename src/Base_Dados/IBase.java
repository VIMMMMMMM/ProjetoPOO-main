/**Interface criada para implementar na classe Base os metodos. @author Caio*/

package Base_Dados;
import Classes_Modelos.*;

import java.util.List;

public interface IBase {
    
	List<Laboratorios> getLaboratorios();
    List<Departamentos> getDepartamentos();
    List<Professores> getProfessores();
    List<Disciplinas> getDisciplinas();
    List <Alunos> getAlunos(int qtden, int inicio);

}