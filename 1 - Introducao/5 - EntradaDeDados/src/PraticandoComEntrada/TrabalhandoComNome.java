package PraticandoComEntrada;

import java.util.Scanner;

public class TrabalhandoComNome {
    public static void main(String[] args) {
        /*
         * A partir do nome de uma pessoa informado pelo usuário, verifique o tamanho do
         * nome completo e extraia o primeiro nome, ignorando os sobrenomes.
         */
        Scanner entrada = new Scanner(System.in, "latin1");
        String nome, primeiroNome;
        int fimNome, tamanhoNome;

        System.out.print("Informe nome e sobrenome: ");
        nome = entrada.nextLine();

        tamanhoNome = nome.length();
        fimNome = nome.indexOf(" ");
        primeiroNome = nome.substring(0, fimNome);

        entrada.close();
        System.out.println("Tamanho total: " + tamanhoNome + " caracteres;\nPrimeiro nome: " + primeiroNome);
    }
}
