package padroescomportamentais.templatemethod;

public class IngressoPistaPremium extends Ingresso {

    public String verificarPromocao() {
        if (this.calcularValor() <= 30) {
            return "Com promocao";
        }
        else {
            return "Sem Promocao";
        }
    }


    @Override
    public String getTipo() {
        return "IngressoPistaPremium";
    }
}
