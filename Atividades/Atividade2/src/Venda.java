public class Venda {
    private String nomeCliente;
    private String formaPagamento;
    private PacoteViagem pacoteViagem;

    public Venda(String nomeCliente, String formaPagamento, PacoteViagem pacoteViagem) {
        this.nomeCliente = nomeCliente;
        this.formaPagamento = formaPagamento;
        this.pacoteViagem = pacoteViagem;
    }

    public double converterParaReais(double valorEmDolar, double cotacao) {
        return valorEmDolar * cotacao;
    }

    public void exibirInformacoes(double cotacao) {
        System.out.println("----- Informações da Venda -----");
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Forma de Pagamento: " + formaPagamento);
        System.out.println("Destino: " + pacoteViagem.getDestino());
        System.out.println("Valor Total (Dólar): " + pacoteViagem.calcularTotal(0, 0));
        System.out.println("Valor Total (Reais): " + converterParaReais(pacoteViagem.calcularTotal(0, 0), cotacao));
    }
}
