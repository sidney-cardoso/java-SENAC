package Carro;

public class Carro {
    String modelo, marca, cor;
    int ano;

    public Carro() {

    }

    public Carro(String modelo, String marca, int ano, String cor) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
    }

    public Carro(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = "Vermelho";
    }

    public void descrever() {
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Marca do carro: " + marca);
        System.out.println("Ano do carro: " + ano);
        System.out.println("Cor do carro: " + cor);
        System.out.println("\n");
    }
}