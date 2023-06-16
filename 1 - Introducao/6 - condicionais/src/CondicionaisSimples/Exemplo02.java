package CondicionaisSimples;

import java.util.Scanner;

public class Exemplo02 {
    /*
     * Neste exemplo, será criado um programa para verificar se uma pessoa é maior
     * de idade, usando somente o if, então não haverá resultado caso o usuário seja
     * menor de idade.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;
        String nome;

        System.out.println("Qual o seu nome?");
        nome = input.nextLine();

        System.out.println("Qual a sua idade?");
        idade = input.nextInt();

        input.close();

        if (idade >= 18) {
            System.out.println(nome + ", sua idade é " + idade + " anos e você é maior de idade!");
        }
    }
}
