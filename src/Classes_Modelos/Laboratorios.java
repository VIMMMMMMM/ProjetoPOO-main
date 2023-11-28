/**Criação da classe Laboratorio juntamente com seus atributos, getterrs, setters e o toString @author Murilo*/

package Classes_Modelos;

public class Laboratorios {
    private Integer id;
    private String descricao;
    private Integer capacidade;
    private boolean status;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Integer getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Laboratorios [id=" + id + ", descricao=" + descricao + ", capacidade="
                + capacidade + ", status=" + status + "]";
    }
}
