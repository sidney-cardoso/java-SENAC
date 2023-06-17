import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número para saber se ele é impar ou par: ");
        int valor = input.nextInt();

        input.close();

        String resultado = (valor % 2 == 0) ? "Par" : "Impar";
        System.out.println(resultado);
    }
}
