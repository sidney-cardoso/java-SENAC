package Empresa;

public class Funcionario {
    public String nome;
    public float salario;

    public void aplicaAumento(float valor) {
        salario += valor;
    }
}
