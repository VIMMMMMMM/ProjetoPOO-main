/*Criação da classe Solicitação, com seus metodos getters e setters somados ao toString. @author Caio*/

package Classes_Modelos;

import java.util.Date;
import java.util.Set;


public class Solicitacao {
    private Integer id;
    private Laboratorios laboratorio;
    private Professores professor;
    private Disciplinas disciplina;
    private Set <Alunos> alunos;
    private Date data;
    private Integer tempoDeUtilizacao;

    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Laboratorios getLaboratorio() {
		return laboratorio;
	}
	public void setLaboratorio(Laboratorios laboratorio) {
		this.laboratorio = laboratorio;
	}
	public Professores getProfessor() {
		return professor;
	}
	public void setProfessor(Professores professor) {
		this.professor = professor;
	}
	public Disciplinas getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplinas disciplina) {
		this.disciplina = disciplina;
	}
	public Set<Alunos> getAlunos() {
		return alunos;
	}
	public void setAlunos(Set<Alunos> alunos) {
		this.alunos = alunos;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Integer getTempoDeUtilizacao() {
		return tempoDeUtilizacao;
	}
	public void setTempoDeUtilizacao(Integer tempoDeUtilizacao) {
		this.tempoDeUtilizacao = tempoDeUtilizacao;
	}
	
	@Override
	public String toString() {
		return "Solicitacao [id=" + id + ", laboratorio=" + laboratorio + ", professor=" + professor + ", disciplina="
				+ disciplina + ", alunos=" + alunos + ", data=" + data + ", tempoDeUtilizacao=" + tempoDeUtilizacao
				+ "]";
	} 

}