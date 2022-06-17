package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IngressoPistaPremiumTest {


    @Test
    void deveRetonarComPromocao() {
        IngressoPistaPremium ingresso = new IngressoPistaPremium();
        ingresso.setValor(29);

        assertEquals("Sem Promocao", ingresso.verificarPromocao());
    }

    @Test
    void deveRetonarSemPromocao() {
        IngressoPistaPremium ingresso = new IngressoPistaPremium();
        ingresso.setValor(34);
        assertEquals("Sem Promocao", ingresso.verificarPromocao());
    }

    @Test
    void deveRetornarInformacoes() {
        IngressoPistaPremium ingresso = new IngressoPistaPremium();
        ingresso.setValor(29);
        ingresso.setDescricao("ingresso dia 21/02/2022");
        ingresso.setNome("Diego");
        ingresso.setId(2);
        assertEquals("IngressoPistaPremium{id=2, nome='Diego', descricao='ingresso dia 21/02/2022', valor=Sem Promocao}", ingresso.getInfo());
    }
}