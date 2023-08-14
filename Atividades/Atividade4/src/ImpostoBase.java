public abstract class ImpostoBase implements Imposto {
    private String descricao;

    public ImpostoBase(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
