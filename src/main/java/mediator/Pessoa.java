package mediator;

public class Pessoa {
    public String reclamar(String mensagem) {
        return CentralReclamacao.getInstancia().receberReclamacao(mensagem);
    }
}
