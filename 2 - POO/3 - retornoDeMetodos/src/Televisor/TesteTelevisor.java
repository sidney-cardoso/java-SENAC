package Televisor;

import java.util.Scanner;

public class TesteTelevisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String operacao = "";
        byte canal;

        Televisor minhaTV = new Televisor();

        do {
            System.out.println("Digite a operação da TV: " +
                    "[L]igar; " +
                    "[D]esligar; " +
                    "[T]rocar canal; " +
                    "[+]Aumentar volume; " +
                    "[-]Diminuir volume; " +
                    "[X]Sair ");
            operacao = input.nextLine();

            switch (operacao) {
                case "L":
                    minhaTV.ligar();
                    break;
                case "D":
                    minhaTV.desligar();
                    break;
                case "T":
                    System.out.print("Digite o canal desejado (entre 2 e 13): ");
                    canal = input.nextByte();
                    input.nextLine();
                    minhaTV.trocarCanal(canal);
                    break;
                case "+":
                    minhaTV.aumentarVolume();
                    break;
                case "-":
                    minhaTV.diminuirVolume();
                    break;
                case "X":
                    System.out.print("Encerrando o programa!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (!operacao.equals("X"));
        input.close();
    }
}
