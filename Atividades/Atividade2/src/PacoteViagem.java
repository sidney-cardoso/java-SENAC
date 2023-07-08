public class PacoteViagem {
    private Transporte transporte;
    private Hospedagem hospedagem;
    private String destino;
    private int quantidadeDias;

    public PacoteViagem(String destino, int quantidadeDias) {
        this.destino = destino;
        this.quantidadeDias = quantidadeDias;
    }

    public double totalHospedagem() {
        double valorDiaria = hospedagem.getValorDiaria();

        double total = valorDiaria * quantidadeDias;

        return total;
    }

    public double calcularLucro(int porcentagem) {
        double totalHospedagem = totalHospedagem();

        double porcentagemDec = porcentagem / 100.0;
        double valorLucro = totalHospedagem + (totalHospedagem * porcentagemDec);

        return valorLucro;
    }

    public double calcularTotal() {
        double totalTransporte = transporte.getValor();
        double totalHospedagem = totalHospedagem();

        double valorLucro = calcularLucro(10);

        double totalPacote = totalHospedagem + totalTransporte + valorLucro;
        return totalPacote;
    }

    public String getDestino() {
        return destino;
    }
}