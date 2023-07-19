package Superclasse;

public class Carro extends Veiculo {
    private int consumo = 1;

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Consumo: " + consumo);
    }
}
