package while_DoWhile;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        /*
         * Crie um programa Java que valida a entrada do usuário. Ele deve informar uma
         * idade válida, que deve estar entre 0 e 150.
         */
        Scanner input = new Scanner(System.in);
        int idade;

        do {
            System.out.println("Informe uma idade válida entre 0 e 150 anos!");
            idade = input.nextInt();
        } while (idade < 0 || idade > 150);
        input.close();

        System.out.println("Fim do programa!");

    }
}
