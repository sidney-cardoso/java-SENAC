package Atividades.Atividade1.src;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean[][] quartos = new boolean[4][3];
        boolean continuar = true;
        int quarto, andar;
        String resposta;

        while (continuar) {
            System.out.println("Digite o andar que deseja (1 a 4):");
            andar = input.nextInt();

            System.out.println("Digite o quarto que desja ocupar (1 a 3):");
            quarto = input.nextInt();

            quartos[andar - 1][quarto - 1] = true;

            input.nextLine();

            System.out.print("Deseja informar outra ocupação? (S/N): ");
            resposta = input.nextLine();

            if (resposta.equals("N")) {
                continuar = false;
            }
        }
        input.close();

        System.out.println("\nOcupação do hotel:");

        for (int i = 0; i < 4; i++) {
            System.out.println("\n" + (i + 1) + "º andar:");

            for (int j = 0; j < 3; j++) {
                System.out.print("- Quarto " + (j + 1) + " ");

                if (quartos[i][j]) {
                    System.out.println("ocupado");
                } else {
                    System.out.println("desocupado");
                }
            }

        }

    }
}