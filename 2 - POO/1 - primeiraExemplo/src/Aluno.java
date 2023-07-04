public class Aluno {
    String nome;
    String cpf;
    int matricula;

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        aluno1.nome = "Celso Medeiros";
        aluno1.matricula = 1;
        aluno1.cpf = "00134578090";

        aluno2.nome = "Camila Alves";
        aluno2.matricula = 2;

        aluno3.cpf = "0019007890";

        System.out.println("Mostrar Alunos: \n");

        System.out.println("Nome do aluno1: " + aluno1.nome);
        System.out.println("Matrícula do aluno1: " + aluno1.matricula);
        System.out.println("CPF do aluno1: " + aluno1.cpf + "\n");

        System.out.println("Nome do aluno2: " + aluno2.nome);
        System.out.println("Matrícula do aluno2: " + aluno2.matricula + "\n");

        System.out.println("CPF do aluno3: " + aluno3.cpf);
    }
}
