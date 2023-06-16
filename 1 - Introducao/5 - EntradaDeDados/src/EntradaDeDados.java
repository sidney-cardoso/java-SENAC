import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        String nome;
        int idade;
        float altura;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        nome = entrada.nextLine();

        System.out.println("Digite a sua idade:");
        idade = entrada.nextInt();

        System.out.println("Digite a sia altura: (Forneça a mesma usando o separador .)");
        altura = entrada.nextFloat();

        entrada.close();

        System.out.println("\n--MOSTRANDO OS DADOS--");
        System.out.println("Seu nome: " + nome);
        System.out.println("Sua idade: " + idade);
        System.out.println("Sua Altura: " + altura);
    }
}
