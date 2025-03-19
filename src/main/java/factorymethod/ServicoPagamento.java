package factorymethod;

public class ServicoPagamento implements IServico {

    public String executar() {
        return "Pagamento efetuado";
    }

    public String cancelar() {
        return "Pagamento cancelado";
    }
}
