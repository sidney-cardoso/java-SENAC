public class Aluno extends Pessoa {
    public String matricula;

    public Aluno() {
    }

    public static void main(String[] args) {
        Aluno Aluno1 = new Aluno();

        Aluno1.nome = "Maria";
        Aluno1.cpf = "000.000.000-00";
        Aluno1.matricula = "123456";

    }
}