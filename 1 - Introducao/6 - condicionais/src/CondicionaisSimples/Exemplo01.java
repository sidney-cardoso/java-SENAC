package CondicionaisSimples;

import java.util.Scanner;

public class Exemplo01 {
    // Elabore um programa que leia dois valores numéricos inteiros, some esses
    // valores e apresente o resultado, caso o valor somado seja maior que 10.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, resultado;

        System.out.println("Digite o valor de A:");
        a = input.nextInt();

        System.out.println("Digite o valor de B:");
        b = input.nextInt();

        input.close();

        resultado = a + b;

        if (resultado > 10) {
            System.out.println(resultado + " é maior que 10.");
        }
        System.out.println("Fim da execução!");
    }
}
