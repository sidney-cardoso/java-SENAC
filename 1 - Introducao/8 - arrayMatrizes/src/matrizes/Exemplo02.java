package matrizes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {

        /*
         * Crie um programa que efetue a entrada de três notas escolares de quatro
         * alunos de uma sala e apresente os dados fornecidos em seguida.
         */
        float NOTA[][] = new float[4][3];
        byte I, J;

        DecimalFormat df = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);

        for (I = 0; I <= 3; I++) {
            System.out.println("\n\nAluno ---> " + (I + 1) + "\n");
            for (J = 0; J <= 2; J++) {
                System.out.print((J + 1) + "ª nota = ");
                NOTA[I][J] = input.nextFloat();
            }
        }
        System.out.println("\nAluno Nota1 Nota2 Nota3 Nota4");
        System.out.println("-----------------------------");

        for (I = 0; I <= 3; I++) {
            System.out.print((I + 1) + " --> ");
            for (J = 0; J <= 2; J++) {
                System.out.print(df.format(NOTA[I][J]) + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
}
