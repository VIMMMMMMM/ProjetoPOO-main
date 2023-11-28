/** Criação da classe Professor com atributos juntamento com getters, setters e o metodo tooString @author Murilo*/

package Classes_Modelos;
import java.util.Set;

public class Professores extends Pessoa{
	
	private Integer id;
	private String nome;
	private boolean status;
	private Departamentos departamento;
	private Set <Disciplinas> ConjuntoDisciplina;

	
	public Set<Disciplinas> getConjuntoDisciplina() {
		return ConjuntoDisciplina;
	}
	public void setConjuntoDisciplina(Set<Disciplinas> conjuntoDisciplina) {
		ConjuntoDisciplina = conjuntoDisciplina;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Departamentos getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamentos departamento) {
		this.departamento = departamento;
	}
	@Override
	public String toString() {
		return "Professores [id=" + id + ", nome=" + nome + ", status=" + status
				+ ", departamento=" + departamento + ", ConjuntoDisciplina=" + ConjuntoDisciplina + "]";
	}
}