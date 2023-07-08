public class Agencia {
    public static void main(String[] args) {
        String destino = "", nomeCLiente = "", formaDePagamento = "", descricao = "", tipoTransporte = "";
        int quantidadeDias = 0;
        double valorDiaria = 0, valorTransporte = 0;

        PacoteViagem pacoteViagem = new PacoteViagem(destino, quantidadeDias);
        Venda venda = new Venda(nomeCLiente, formaDePagamento);
        Hospedagem hospedagem = new Hospedagem(descricao, valorDiaria);
        Transporte transporte = new Transporte(tipoTransporte, valorTransporte);

    }
}