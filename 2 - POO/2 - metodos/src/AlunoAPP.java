public class AlunoAPP {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        aluno1.nome = "Celso Medeiros";
        aluno1.matricula = 1;
        aluno1.cpf = "00134578090";
        aluno1.idade = 23;

        aluno2.nome = "Camila Alves";
        aluno2.matricula = 2;
        aluno2.cpf = "00534578119";
        aluno2.idade = 32;

        aluno3.nome = "Joana Carneiro";
        aluno3.matricula = 3;
        aluno3.cpf = "0019007890";
        aluno3.idade = 17;

        System.out.println("Mostrar Alunos:\n");
        aluno1.descrever();

        aluno2.descrever();
        aluno3.descrever();
    }

}