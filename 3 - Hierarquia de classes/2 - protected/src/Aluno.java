public class Aluno extends Pessoa {
    public String matricula;

    public Aluno(String _nome, String _cpf, String _matricula) {
        super(_nome, _cpf);
        this.matricula = _matricula;
    }

    public void mostrarDadosAluno() {
        System.out.println("Aluno: " + nome + " cpf: " + cpf + " matricula: " + matricula);
    }
}
