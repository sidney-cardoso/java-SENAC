package Atividades.Atividade1.src;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome e a idade do primeiro cliente:");
        String nomeClienteA = input.nextLine();
        int idadeClienteA = input.nextInt();
        input.nextLine();

        System.out.println("Digite o nome e a idade do segundo cliente:");
        String nomeClienteB = input.nextLine();
        int idadeClienteB = input.nextInt();
        input.close();

        if (idadeClienteB < idadeClienteA) {
            String tempNome = nomeClienteA;
            int tempIdade = idadeClienteA;
            nomeClienteA = nomeClienteB;
            idadeClienteA = idadeClienteB;
            nomeClienteB = tempNome;
            idadeClienteB = tempIdade;
        } else if (idadeClienteB > idadeClienteA) {
            if (idadeClienteB >= 60) {
                double desconto = 0.4 * 100;
                System.out.println("Quarto A: " + nomeClienteB + " com desconto de " + desconto + "%");
            } else {
                System.out.println("Quarto A: " + nomeClienteB);
            }
            System.out.println("Quarto B: " + nomeClienteA);
            return;
        }

        System.out.println("Quarto A: " + nomeClienteA);
        System.out.println("Quarto B: " + nomeClienteB);
    }

}