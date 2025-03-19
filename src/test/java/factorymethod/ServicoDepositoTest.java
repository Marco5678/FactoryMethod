package factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServicoDepositoTest {

    @Test
    void deveExecutarDeposito() {
        IServico servico = ServicoFactory.obterServico("Deposito");
        assertEquals("Depósito efetuado", servico.executar());
    }

    @Test
    void deveCancelarDeposito() {
        IServico servico = ServicoFactory.obterServico("Deposito");
        assertEquals("Depósito cancelado", servico.cancelar());
    }
}

