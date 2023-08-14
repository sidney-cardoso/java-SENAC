import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome da empresa: ");
        String nomeEmpresa = input.nextLine();

        Pagamentos pagamentos = new Pagamentos(nomeEmpresa);

        while (true) {
            System.out.print("Digite o tipo de imposto (PIS/IPI) ou 'pare' para encerrar: ");
            String tipoImposto = input.nextLine();

            if (tipoImposto.equalsIgnoreCase("pare")) {
                break;
            }

            if (tipoImposto.equalsIgnoreCase("PIS")) {
                System.out.print("Digite o valor de débito: ");
                double debito = input.nextDouble();
                System.out.print("Digite o valor de crédito: ");
                double credito = input.nextDouble();
                input.nextLine();

                pagamentos.adicionarImposto(new PIS(debito, credito));
            } else if (tipoImposto.equalsIgnoreCase("IPI")) {
                System.out.print("Digite o valor do produto: ");
                double valorProduto = input.nextDouble();
                System.out.print("Digite o valor do frete: ");
                double frete = input.nextDouble();
                System.out.print("Digite o valor do seguro: ");
                double seguro = input.nextDouble();
                System.out.print("Digite o valor de outras despesas: ");
                double outrasDespesas = input.nextDouble();
                System.out.print("Digite a alíquota: ");
                double aliquota = input.nextDouble();
                input.nextLine();

                pagamentos.adicionarImposto(new IPI(valorProduto, frete, seguro, outrasDespesas, aliquota));
            }
        }
        pagamentos.calcularImpostos();
        input.close();
    }
}
