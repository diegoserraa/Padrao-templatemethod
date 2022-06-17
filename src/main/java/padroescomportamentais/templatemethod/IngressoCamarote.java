package padroescomportamentais.templatemethod;

public class IngressoCamarote extends Ingresso {

    public String verificarPromocao() {
        if (this.calcularValor() >= 50) {
            return "Com Promocao";
        }
        else {
            return "Sem Promocao";
        }
    }
    @Override
    public String getTipo() {
        return "IngressoCamarote";
    }

}
