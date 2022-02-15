package mediator;

public class EmpresaAlimenticia {
    private static EmpresaAlimenticia instancia = new EmpresaAlimenticia();

    private EmpresaAlimenticia() {}

    public static EmpresaAlimenticia getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "A Empresa vai resolver o pedido da reclamação: " + mensagem;
    }
}
