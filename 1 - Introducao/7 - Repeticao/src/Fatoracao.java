import java.util.Scanner;

public class Fatoracao {
    public static void main(String[] args) {
        /*
         * Para executar esse programa, terá um limite do tamanho do número que será
         * possível inserir, já que a linguagem Java tem um tamanho máximo do número que
         * pode armazenar
         */

        Scanner input = new Scanner(System.in);
        long numero, contador, numeroInicial;

        System.out.println("Escreva um número para ver o seu fatorial:");
        numero = input.nextInt();

        numeroInicial = numero;
        contador = numero;

        input.close();

        while (contador > 2) {
            contador--;
            numero *= contador;
        }
        System.out.println("O fatorial de " + numeroInicial + " é " + numero);
    }
}
