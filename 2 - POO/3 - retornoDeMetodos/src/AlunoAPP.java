public class AlunoAPP {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno1.nome = "Celso Medeiros";
        aluno1.nota1 = 9.7;
        aluno1.nota2 = 6.5;

        aluno2.nome = "Camila Alves";
        aluno2.nota1 = 4.2;
        aluno2.nota2 = 6.5;

        System.out.println("Mostrar Alunos:\n");

        aluno1.descrever();
        System.out.println("A média do aluno é: " + aluno1.calcularMedia());

        System.out.println("A maior nota do aluno é: " + aluno1.mostrarMaior());
        aluno1.mostrarResultado();

        aluno2.descrever();
        System.out.println("A média do aluno é: " + aluno2.calcularMedia());

        System.out.println("A maior nota do aluno é: " + aluno2.mostrarMaior());
        aluno2.mostrarResultado();
    }
}
