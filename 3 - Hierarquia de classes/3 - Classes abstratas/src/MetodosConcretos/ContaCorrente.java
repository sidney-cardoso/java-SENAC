package MetodosConcretos;

public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("Imprimindo extrato da conta...");
        System.out.println(" - Saldo: " + this.getSaldo());
    }

}
