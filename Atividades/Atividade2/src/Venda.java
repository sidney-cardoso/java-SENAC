import java.util.Scanner;

public class Venda {
    Scanner input = new Scanner(System.in);

    private String nomeCliente;
    private String formaDePagamento;

    private PacoteViagem pacoteViagem;

    public Venda(String nomeCLiente, String formaDePagamento) {
        this.nomeCliente = nomeCLiente;
        this.formaDePagamento = formaDePagamento;
    }

    public double converterRealDolar() {
        System.out.println("Digite o valor atual do dólar: ");
        double dolar = input.nextDouble();

        return dolar * pacoteViagem.calcularTotal();
    }

    public void mostrarValorViagem() {
        System.out.println("Valor total da viagem (em U$): U$" + pacoteViagem.calcularTotal());

        System.out.println("Valor total da viagem (em R$): R$" + converterRealDolar());
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public PacoteViagem getPacoteViagem() {
        return pacoteViagem;
    }

}
