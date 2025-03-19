package factorymethod;

public class ServicoTransferencia implements IServico {

    public String executar() {
        return "Transferência realizada";
    }

    public String cancelar() {
        return "Transferência cancelada";
    }
}
