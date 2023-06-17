import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        /*
         * Crie um programa que realiza uma autenticação de um usuário, permitindo
         * acesso caso a senha seja o mês de aniversário ou a idade dele.
         */
        Scanner input = new Scanner(System.in);
        int idade, senha, mes;
        String nome;

        System.out.println("Qual o seu nome?");
        nome = input.nextLine();

        System.out.println("Qual a sua idade?");
        idade = input.nextInt();

        System.out.println("Em que mês você nasceu? (Use o padrão 00)");
        mes = input.nextInt();

        System.out.println("----- ACESSANDO O SISTEMA -----");
        System.out.println("Digite a sua senha:");
        senha = input.nextInt();

        input.close();

        if (senha == mes || senha == idade) {
            System.out.println("ACESSO LIBERADO!");
            System.out.println("Seja bem-vindo(a) " + nome);
        } else {
            System.out.println("ACESSO NEGADO!");
        }
        System.out.println("Fim do programa!");

    }
}
