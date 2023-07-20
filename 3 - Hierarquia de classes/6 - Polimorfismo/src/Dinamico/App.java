package Dinamico;

public class App {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal pato = new Pato();
        Animal gato = new Gato();

        cachorro.falar();
        pato.falar();
        gato.falar();
    }
}
