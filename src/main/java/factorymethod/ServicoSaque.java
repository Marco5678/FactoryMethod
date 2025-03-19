package factorymethod;

public class ServicoSaque implements IServico {

    public String executar() {
        return "Saque realizado";
    }

    public String cancelar() {
        return "Saque cancelado";
    }
}
