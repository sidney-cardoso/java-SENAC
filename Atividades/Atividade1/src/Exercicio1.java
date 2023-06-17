package Atividades.Atividade1.src;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int alfa = 150, convidados, cadeirasAdicionais;

        System.out.println("Insira a quantidade de convidados!");
        convidados = input.nextInt();

        if (convidados <= 0 || convidados > 350) {
            System.out.println("Quantidade de convidados inválida!");
        }
        if (convidados <= 220) {
            System.out.println("Use o auditório Alfa!");
            if (convidados > 150) {
                cadeirasAdicionais = convidados - alfa;
                System.out.println("Serão incluídas mais " + cadeirasAdicionais + " cadeiras!");
            }
        }
        if (convidados > 220) {
            System.out.println("Use o auditório Beta!");
        }
        input.close();
    }
}
