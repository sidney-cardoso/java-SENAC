package while_DoWhile;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        /*
         * Crie um programa Java para ler os tempos de volta de um velocista e calcular
         * qual foi o menor tempo.
         */
        Scanner entrada = new Scanner(System.in);

        float tempoVolta, menorTempo;
        String continuar = "S";

        menorTempo = Float.MAX_VALUE;

        while (continuar.equals("S")) {
            System.out.print("Informe o tempo (s) da volta do velocista:");
            tempoVolta = entrada.nextFloat();

            entrada.nextLine();

            if (menorTempo > tempoVolta) {
                menorTempo = tempoVolta;
            }

            System.out.print("Deseja informar novo tempo? S/N ");
            continuar = entrada.nextLine();
        }
        entrada.close();

        System.out.println("A menor volta do velocista foi de " + menorTempo + " segundos.");
    }
}
