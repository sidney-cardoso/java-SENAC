package MetodoAbstrato;

public class App {
    public static void main(String[] args) {
        RelatorioVenda relVendas = new RelatorioVenda();
        relVendas.vendas = new Venda[] { new Venda(100, "Maria"), new Venda(400, "Silvio"), new Venda(1050, "João") };
        relVendas.nomeEmpresa = "Empresa ABC S.A.";
        relVendas.emiteRelatorio();
    }
}
