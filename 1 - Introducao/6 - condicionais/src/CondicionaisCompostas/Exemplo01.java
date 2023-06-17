import java.util.Scanner;

public class Exemplo01 {
    /*
     * Elabore um programa que faça a leitura de dois valores numéricos do tipo
     * inteiro e efetue a adição desses valores. Caso o resultado obtido seja maior
     * que 10, o programa apresentará a mensagem “Resultado ultrapassa o valor
     * dez.”. Caso o resultado do valor somado não seja maior que 10, o programa
     * deverá apresentar a mensagem “Resultado não ultrapassa o valor dez.”.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero1, numero2, resultado;

        System.out.println("Digite o valor do primeiro número: ");
        numero1 = input.nextInt();

        System.out.println("Digite o valor do segundo número: ");
        numero2 = input.nextInt();

        input.close();

        resultado = numero1 + numero2;

        if (resultado > 10) {
            System.out.println("O resultado ultrapassa o valor dez!");
        } else {
            System.out.println("Resultado não ultrapassa o valor dez.");
        }
        System.out.println("Fim da execução!");
    }
}
