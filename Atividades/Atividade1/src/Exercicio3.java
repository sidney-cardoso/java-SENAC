package Atividades.Atividade1.src;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        boolean continuar = true;

        double valorDiaria = 150.00,
                valorTotal,
                totalMeias;

        int quantidadeNomes = 0,
                quantidadeInteiras = 0,
                quantidadeIdades = 0,
                quantidadeMeias = 0,
                quantidadeGratuidades = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Quantos hóspedes serão cadastrados?");
        quantidadeNomes = input.nextInt();

        input.nextLine();

        String[] nomes = new String[quantidadeNomes];

        quantidadeIdades = quantidadeNomes;

        int[] idades = new int[quantidadeIdades];

        int contador = 0;

        while (contador < quantidadeNomes && continuar == true) {

            System.out.println("Digite PARE se quiser encerrar!");
            System.out.println("Digite o nome do " + (contador + 1) + "º hóspede:");
            String nome = input.nextLine();

            nomes[contador] = nome;

            if (nomes[contador].equals("pare") || nomes[contador].equals("Pare") || nomes[contador].equals("PARE")) {
                continuar = false;
                return;
            } else {
                System.out.println("\nDigite a idade do " + (contador + 1) + "º hóspede:");
                idades[contador] = input.nextInt();
                input.nextLine();

                if (idades[contador] < 4) {
                    System.out.println(nomes[contador] + " possui gratuidade!\n");
                    quantidadeGratuidades++;
                } else if (idades[contador] > 80) {
                    System.out.println(nomes[contador] + " paga meia entrada!\n");
                    quantidadeMeias++;
                } else {
                    System.out.print(nomes[contador] + " pagará o valor normal!\n\n");
                    quantidadeInteiras++;
                }
                contador++;
            }
        }
        input.close();

        totalMeias = quantidadeMeias * (valorDiaria / 2);
        valorTotal = totalMeias + (quantidadeInteiras * valorDiaria);

        System.out.println("\nQuantidade de inteiras: " + quantidadeInteiras);
        System.out.println("\nQuantidade de meias: " + quantidadeMeias);
        System.out.println("\nQuantidade de gratuidades: " + quantidadeGratuidades);

        System.out.println("\nTotal de hóspedes: " + nomes.length);
        System.out.println("\nValor total: R$" + valorTotal + "0");
    }
}
