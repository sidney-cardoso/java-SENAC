package CondicionalSeletivo;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        /*
         * Crie um programa que solicite a entrada de um valor numérico inteiro entre 1
         * e 7 e apresente o nome do dia da semana por extenso.
         */
        int dia;
        Scanner input = new Scanner(System.in);
        System.out.print("Entre um valor referente a um dia da semana: ");
        dia = input.nextInt();

        input.close();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
    }

}