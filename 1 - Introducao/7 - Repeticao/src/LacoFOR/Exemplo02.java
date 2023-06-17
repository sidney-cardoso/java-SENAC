package LacoFOR;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        /*
         * Crie um programa Java que recebe um número e mostra na tela a tabuada desse
         * número.
         */
        Scanner input = new Scanner(System.in);

        int numero, resultado;

        System.out.println("Digite um número para ver sua tabuada:");
        numero = input.nextInt();

        input.close();

        for (int i = 1; i <= 10; i++) {
            resultado = numero * i;
            System.out.println(numero + " X " + i + " = " + resultado);
        }
    }

}
