import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("----- Cadastro de Pacote de Viagem -----");

        System.out.print("Tipo de Transporte: ");
        String tipoTransporte = input.nextLine();

        System.out.print("Valor do Transporte (em dólar): ");
        double valorTransporte = input.nextDouble();

        input.nextLine();

        System.out.print("Descrição da Hospedagem: ");
        String descricaoHospedagem = input.nextLine();

        System.out.print("Valor da Diária (em dólar): ");
        double valorDiariaHospedagem = input.nextDouble();

        input.nextLine();

        System.out.print("Destino: ");
        String destino = input.nextLine();

        System.out.print("Quantidade de Dias: ");
        int quantidadeDias = input.nextInt();

        System.out.println("----- Cadastro de Venda -----");

        System.out.print("Nome do Cliente: ");
        String nomeCliente = input.next();

        System.out.print("Forma de Pagamento: ");
        String formaPagamento = input.next();

        System.out.print("Cotação do Dólar: ");
        double cotacaoDolar = input.nextDouble();

        Transporte transporte = new Transporte(tipoTransporte, valorTransporte);
        Hospedagem hospedagem = new Hospedagem(descricaoHospedagem, valorDiariaHospedagem);
        PacoteViagem pacoteViagem = new PacoteViagem(transporte, hospedagem, destino, quantidadeDias);
        Venda venda = new Venda(nomeCliente, formaPagamento, pacoteViagem);

        System.out.println("\n----- Informações do Pacote de Viagem -----");
        System.out.println("Destino: " + pacoteViagem.getDestino());
        System.out.println("Valor Total (Dólar): " + pacoteViagem.calcularTotal(0, 0));

        System.out.print("Margem de Lucro (%): ");
        double margemLucro = input.nextDouble();

        double valorTotalDolar = pacoteViagem.calcularTotal(margemLucro, 0);
        venda.converterParaReais(valorTotalDolar, cotacaoDolar);

        venda.exibirInformacoes(cotacaoDolar);

        input.close();
    }
}
