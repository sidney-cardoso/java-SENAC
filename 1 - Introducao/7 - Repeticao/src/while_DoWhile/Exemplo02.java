package while_DoWhile;

public class Exemplo02 {
    public static void main(String[] args) {

        /*
         * Crie um programa que realizará uma contagem de 1 até 10, conforme critério do
         * laço do-while.
         */
        int contador = 1;
        do {
            System.out.println("Número: " + contador);
            contador++;
        } while (contador <= 10);
    }
}
