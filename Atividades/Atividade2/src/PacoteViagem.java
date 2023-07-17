public class PacoteViagem {
    private Transporte transporte;
    private Hospedagem hospedagem;
    private String destino;
    private int quantidadeDias;

    public PacoteViagem(Transporte transporte, Hospedagem hospedagem, String destino, int quantidadeDias) {
        this.transporte = transporte;
        this.hospedagem = hospedagem;
        this.destino = destino;
        this.quantidadeDias = quantidadeDias;
    }

    public double calcularTotal(double margemLucro, double taxasAdicionais) {
        double totalTransporte = transporte.getValor();
        double totalHospedagem = hospedagem.calcularTotal(quantidadeDias);
        double lucro = (totalTransporte + totalHospedagem + taxasAdicionais) * (margemLucro / 100);
        return totalTransporte + totalHospedagem + taxasAdicionais + lucro;
    }

    public String getDestino() {
        return destino;
    }
}