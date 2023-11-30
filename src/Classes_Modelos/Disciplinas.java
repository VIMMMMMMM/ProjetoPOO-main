/**Criação da classe "Disciplina" junto com seus atributos, métodos getters e setters somados ao toString @author Caio*/

package Classes_Modelos;

public class Disciplinas {
	private Integer id;
	private String sigla;
	private String descricao;
	private boolean status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Disciplinas [id=" + id + ", sigla=" + sigla + ", descricao=" + descricao + ", status=" + status + "]";
	}
}