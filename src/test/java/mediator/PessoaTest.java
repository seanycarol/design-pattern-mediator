package mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    @Test
    void deveReclamarEmpresaAlimenticia() {
        Pessoa pessoa = new Pessoa();
        assertEquals("A central de reclamação agradece seu contato.\nA Empresa respondeu sua reclamação conforme mensagem a seguir.\n" +
                        ">>A Empresa vai resolver o pedido da reclamação: Alimento estragado",
                pessoa.reclamar("Alimento estragado"));
    }
}