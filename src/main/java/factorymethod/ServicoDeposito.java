package factorymethod;

public class ServicoDeposito implements IServico {

    public String executar() {
        return "Depósito efetuado";
    }

    public String cancelar() {
        return "Depósito cancelado";
    }
}
