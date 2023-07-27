public class Assalariado extends Funcionario {
    private double salario;

    public Assalariado(String nome,
            String cpf,
            String endereco,
            String telefone,
            String setor,
            double salario) {
        super(nome, cpf, endereco, telefone, setor);
        this.salario = salario;
    }

    @Override
    public double calcularSalario() {
        return salario;
    }

    @Override
    public void aplicarAumento(double percentualAumento) {
        salario += salario * percentualAumento / 100.0;
    }
}
