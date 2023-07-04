public class Aluno {
    String nome;
    int matricula;
    String cpf;
    int idade;

    public void descrever() {
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Matrícula do aluno: " + matricula);
        System.out.println("CPF do aluno: " + cpf);
        System.out.println("Idade do aluno: " + idade);
        System.out.println("\n");
    }
}