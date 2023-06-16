package PraticandoComEntrada;

import java.util.Scanner;

public class CalculandoArea {
    public static void main(String[] args) {
        // Dado o raio de um círculo, calcule sua área (A=πr²).

        Scanner entrada = new Scanner(System.in);

        final float pi = 3.14159f;
        float raio;

        System.out.println("Digite o raio do circulo: ");
        raio = entrada.nextFloat();

        float area = pi * (raio * raio);

        entrada.close();

        System.out.println("A área do círculo é: " + area + "cm");
    }
}
