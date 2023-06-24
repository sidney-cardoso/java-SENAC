package Atividades.Atividade1.src;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[15];
        String nomePesquisa;
        int contador = 0, quantidadeHospedes = 0, opcao;
        boolean continuar = true, nomeEncontrado = false;

        System.out.println("----------BEM VINDO----------");

        while (continuar) {
            System.out.println("Selecione uma opção:");
            System.out.println("1- cadastrar; 2- pesquisar; 3- sair");
            opcao = input.nextInt();

            input.nextLine();

            if (opcao == 1) {
                if (quantidadeHospedes == 15) {
                    System.out.println("Limite de hóspedes atingido!\n");
                } else {
                    System.out.println("Digite o nome do hóspede:");
                    nomes[contador] = input.nextLine();
                    quantidadeHospedes++;
                    contador++;
                }
            } else if (opcao == 2) {
                System.out.println("Digite o nome que deseja encontrar:");
                nomePesquisa = input.nextLine();

                for (int i = 0; i < quantidadeHospedes; i++) {
                    if (nomes[i].equals(nomePesquisa)) {
                        System.out.println(nomes[i] + " encontrado no quarto: " + (i + 1) + "\n");
                        nomeEncontrado = true;
                        break;
                    }
                }
                if (!nomeEncontrado) {
                    System.out.println("Nome não encontrado!" + "\n");
                }

            } else if (opcao == 3) {
                System.out.println("Finalizando execução!");
                continuar = false;
            } else {
                System.out.println("Selecione uma opção válida");
            }
        }
        input.close();
    }
}
