package Estatico;

public class CalculadoraAPP {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();

        System.out.println(c.somar(1, 2));

        System.out.println(c.somar(1, 2, 3));
    }
}
