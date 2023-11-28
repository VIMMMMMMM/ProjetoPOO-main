/**Criação da classe Departamentos com seus atributos, metodos getters e setters e o toString @author Caio*/

package Classes_Modelos;

public class Departamentos {
	private Integer id;
    private String sigla;
    private String descricao;
    
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
	
	
	@Override
	public String toString() {
		return "Departamentos [id=" + id + ", sigla=" + sigla + ", descricao=" + descricao + "]";
	}
}