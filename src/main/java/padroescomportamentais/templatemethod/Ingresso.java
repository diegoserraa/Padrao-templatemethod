package padroescomportamentais.templatemethod;

public abstract class Ingresso {

    private int id;
    private String nome;
    private String descricao;
    private float valor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float calcularValor() {
        return this.valor * 2;
    }

    public abstract String verificarPromocao();

    public String getTipo() {
        return "Ingresso";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "id=" + this.id +
                ", nome='" + this.nome + '\'' +
                ", descricao='" + this.descricao + '\'' +
                ", valor=" + this.verificarPromocao() +
                '}';
    }
}
