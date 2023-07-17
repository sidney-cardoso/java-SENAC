public class Hospedagem {
    private String descricao;
    private double valorDiaria;

    public Hospedagem(String descricao, double valorDiaria) {
        this.descricao = descricao;
        this.valorDiaria = valorDiaria;
    }

    public double calcularTotal(int quantidadeDias) {
        return valorDiaria * quantidadeDias;
    }

    public String getDescricao() {
        return descricao;
    }
}