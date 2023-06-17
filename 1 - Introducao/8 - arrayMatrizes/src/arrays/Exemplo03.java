import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        /*
         * Crie um programa Java para ler notas de uma turma, calcular a média e
         * determinar quantas e quais notas ficaram acima da média.
         */
        Scanner input = new Scanner(System.in);
        int qtdAlunos, qtdAcimaMedia = 0;
        float soma = 0, media;

        System.out.println("Quantos alunos serão informados?");
        qtdAlunos = input.nextInt();

        float[] notas = new float[qtdAlunos];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i++) + ": ");
            notas[i] = input.nextFloat();
            soma += notas[i];
        }

        media = soma / qtdAlunos;
        System.out.println("Média: " + media);

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.println("Nota " + notas[i] + " acima da média.");
                qtdAcimaMedia++;
            }
        }
        input.close();
        System.out.println("Foram no total " + qtdAcimaMedia + " notas acima da média");
    }
}
