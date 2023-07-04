public class Aluno {
    String nome;
    double nota1;
    double nota2;
    double media;

    public void descrever() {
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("\n");
    }

    public double calcularMedia(double num1, double num2) {
        return (num1 + num2) / 2;
    }

    public double mostrarMaior() {
        if (nota1 >= nota2) {
            return nota1;
        } else {
            return nota2;
        }
    }

    public void mostrarResultado() {
        if (media >= 7) {
            System.out.println("O aluno foi aprovado.\n");
        } else {
            System.out.println("O aluno foi reprovado.\n");
        }
    }
}


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
