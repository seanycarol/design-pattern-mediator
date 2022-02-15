package mediator;

public class CentralReclamacao {
    private static CentralReclamacao instancia = new CentralReclamacao();

    private CentralReclamacao() {}

    public static CentralReclamacao getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "A central de reclamação agradece seu contato.\n"+
                "A Empresa respondeu sua reclamação conforme mensagem a seguir.\n" +
                ">>" + EmpresaAlimenticia.getInstancia().receberReclamacao(mensagem);
    }
}
