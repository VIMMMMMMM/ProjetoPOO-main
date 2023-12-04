package Classes_Modelos;

/**Interface que ira ser implementada na classe reserva @author Eduardo @author Kaique @author Gustavo */
import java.util.List;

public interface IReservas {
   public List<?> reservasEfetivadas(List<Solicitacao> solicitacaoList);
}