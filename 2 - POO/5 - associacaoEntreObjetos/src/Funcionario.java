import java.time.LocalDate;

public class Funcionario {
    String nome;
    String cargo;
    LocalDate nascimento;
    double salario;

    public Funcionario(String nome, String cargo, LocalDate nascimento, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.nascimento = nascimento;
        this.salario = salario;
    }

}