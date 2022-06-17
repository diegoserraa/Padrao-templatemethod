package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IngressoCamaroteTest {

    @Test
    void deveRetonarComPromocao() {
        IngressoCamarote ingresso = new IngressoCamarote();
        ingresso.setValor(49);

        assertEquals("Com Promocao", ingresso.verificarPromocao());
    }

    @Test
    void deveRetonarSemPromocao() {
        IngressoCamarote ingresso = new IngressoCamarote();
        ingresso.setValor(90);
        assertEquals("Com Promocao", ingresso.verificarPromocao());
    }

    @Test
    void deveRetornarInformacoes() {
        IngressoCamarote ingresso = new IngressoCamarote();
        ingresso.setValor(30);
        ingresso.setDescricao("ingresso dia 20/02/2022");
        ingresso.setNome("Marcelo");
        ingresso.setId(2);
        assertEquals("IngressoCamarote{id=2, nome='Marcelo', descricao='ingresso dia 20/02/2022', valor=Com Promocao}", ingresso.getInfo());
    }
}