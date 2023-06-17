import java.util.Scanner;

public class CalculandoIdade {
    // Dada uma idade, calcule o número de meses que a pessoa viveu.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int meses, idade;

        System.out.println("Digite a sua idade:");
        idade = entrada.nextInt();

        entrada.close();

        meses = idade * 12;

        System.out.println("Você tem " + meses + " meses de idade!");
    }
}
