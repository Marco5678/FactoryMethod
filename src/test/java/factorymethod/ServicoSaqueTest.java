package factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServicoSaqueTest {

    @Test
    void deveExecutarSaque() {
        IServico servico = ServicoFactory.obterServico("Saque");
        assertEquals("Saque realizado", servico.executar());
    }

    @Test
    void deveCancelarSaque() {
        IServico servico = ServicoFactory.obterServico("Saque");
        assertEquals("Saque cancelado", servico.cancelar());
    }
}
