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
