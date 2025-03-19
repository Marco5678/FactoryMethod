package factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServicoTransferenciaTest {

    @Test
    void deveExecutarTransferencia() {
        IServico servico = ServicoFactory.obterServico("Transferencia");
        assertEquals("Transferência realizada", servico.executar());
    }

    @Test
    void deveCancelarTransferencia() {
        IServico servico = ServicoFactory.obterServico("Transferencia");
        assertEquals("Transferência cancelada", servico.cancelar());
    }
}
