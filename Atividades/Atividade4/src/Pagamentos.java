import java.util.ArrayList;
import java.util.List;

public class Pagamentos {
    private String nomeEmpresa;
    private List<Imposto> impostos;

    public Pagamentos(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.impostos = new ArrayList<>();
    }

    public void adicionarImposto(Imposto imposto) {
        impostos.add(imposto);
    }

    public void calcularImpostos() {
        System.out.println("Valor de impostos da empresa: " + nomeEmpresa);
        for (Imposto imposto : impostos) {
            double valorImposto = imposto.calcularImposto();
            System.out.println("Imposto: " + imposto.getDescricao());
            System.out.println("Valor calculado: R$" + valorImposto);
        }
    }
}
