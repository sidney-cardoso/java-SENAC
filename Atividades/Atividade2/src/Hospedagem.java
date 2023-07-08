import java.util.Scanner;

public class Hospedagem {
    Scanner input = new Scanner(System.in);

    private String descricao;
    private double valorDiaria;

    public Hospedagem(String descricao, double valorDiaria) {

        this.descricao = descricao;
        this.valorDiaria = valorDiaria;
        

    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

}
