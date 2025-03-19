package factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServicoPagamentoTest {

    @Test
    void deveExecutarPagamento() {
        IServico servico = ServicoFactory.obterServico("Pagamento");
        assertEquals("Pagamento efetuado", servico.executar());
    }

    @Test
    void deveCancelarPagamento() {
        IServico servico = ServicoFactory.obterServico("Pagamento");
        assertEquals("Pagamento cancelado", servico.cancelar());
    }
}
