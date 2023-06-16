package PraticandoComVariaveis;

public class ConvertendoTemperatura {
    public static void main(String[] args) {
        /*
         * Sabendo que a conversão de uma temperatura (T) de Celsius para Farenheit é
         * calculada por (TºC x 1,8) + 32 e que a conversão para Kelvin se dá por TºC +
         * 273,15, monte a aplicação Java que converta 20 graus Celsius em Farenheit e
         * Kelvin.
         */
        float celsius = 20, farenheit, kelvin;

        farenheit = celsius * 1.8f + 32;

        kelvin = celsius + 273.45f;

        System.out.println(celsius + "ºC correspondem a " + farenheit + "°F e " + kelvin + "°K.");
    }
}
