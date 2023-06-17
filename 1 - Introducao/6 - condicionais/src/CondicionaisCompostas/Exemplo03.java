import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float nota1, nota2, media;

        System.out.println("Digite a primeira nota:");
        nota1 = input.nextFloat();

        System.out.println("Digite a segunda nota:");
        nota2 = input.nextFloat();

        input.close();

        media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else {
            if (media >= 5 || media < 7) {
                System.out.println("Aluno ficou de recuperação");
            } else {
                System.out.println("Aluno reprovado!");
            }
        }
        System.out.println("FIm da execução!");

    }
}
