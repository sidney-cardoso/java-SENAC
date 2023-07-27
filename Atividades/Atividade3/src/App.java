import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();
        int contador = 0;
        boolean continuar = true;

        while (continuar && contador < 10) {
            System.out.print("Nome: ");
            String nome = input.nextLine();

            System.out.print("CPF: ");
            String cpf = input.nextLine();

            System.out.print("Endereço: ");
            String endereco = input.nextLine();

            System.out.print("Telefone: ");
            String telefone = input.nextLine();

            System.out.print("Setor: ");
            String setor = input.nextLine();

            System.out.print("Assalariado (S/N)? ");
            String tipo = input.nextLine();

            if (tipo.equalsIgnoreCase("S")) {
                System.out.print("Salário: ");
                double salario = input.nextDouble();

                input.nextLine();
                funcionarios.add(new Assalariado(nome, cpf, endereco, telefone, setor, salario));
            } else {
                System.out.print("Horas trabalhadas: ");
                double horasTrabalhadas = input.nextDouble();

                System.out.print("Valor da hora: ");
                double valorHora = input.nextDouble();

                input.nextLine();
                funcionarios
                        .add(new Horista(nome, cpf, endereco, telefone, setor, horasTrabalhadas, valorHora));
            }

            System.out.println("Deseja inserir mais um funcionário? \n1 - Sim; \n2 - Não");
            int opcao = input.nextInt();

            input.nextLine();

            if (opcao == 2) {
                continuar = false;
            } else {
                continuar = true;
            }
            contador++;
        }

        System.out.println("\nDados dos funcionários:");
        for (Funcionario funcionario : funcionarios) {
            funcionario.mostrarDados();
            System.out.println("Pagamento: R$" + funcionario.calcularSalario());
            System.out.println("----------------------------");
        }

        System.out.print("Informe o aumento geral (em %): ");
        double aumentoGeral = input.nextDouble();
        for (Funcionario funcionario : funcionarios) {
            funcionario.aplicarAumento(aumentoGeral);
        }

        System.out.println("\nDados dos funcionários após o aumento:");
        for (Funcionario funcionario : funcionarios) {
            funcionario.mostrarDados();
            System.out.println("Pagamento atualizado: R$" + funcionario.calcularSalario());
            System.out.println("----------------------------");
        }
        input.close();
    }
}
