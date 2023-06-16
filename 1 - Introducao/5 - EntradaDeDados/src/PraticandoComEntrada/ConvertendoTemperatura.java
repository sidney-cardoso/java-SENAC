package PraticandoComEntrada;

import java.util.Scanner;

public class ConvertendoTemperatura {

    public static void main(String[] args) {
        /*
         * Considerando que a conversão de uma temperatura (T) de Celsius para Farenheit
         * é calculada por (TºC x 1,8) + 32 e que a conversão para Kelvin se dá por TºC
         * + 273,15, monte a aplicação Java que converta graus Celsius em Farenheit e
         * Kelvin. O usuário informará a temperatura em Celsius.
         * 
         */
        Scanner entrada = new Scanner(System.in);

        float celsius, farenheit, kelvin;

        System.out.println("Digite a temperatura em Celsius: ");
        celsius = entrada.nextFloat();

        entrada.close();

        farenheit = celsius * 1.8f + 32;
        kelvin = celsius + 273.15f;

        System.out.println(celsius + "ºC correspondem a " + farenheit + "ºF e " + kelvin + "ºK.");
    }
}
