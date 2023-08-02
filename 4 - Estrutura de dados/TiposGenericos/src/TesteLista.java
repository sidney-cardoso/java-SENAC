import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteLista {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome, operacao = "I";
        int indice;

        List<String> clientes = new ArrayList<String>();

        while (!operacao.equals("S")) {
            System.out.println("Digite a operação [I]ncluir, [E]xcluir, [S]air");
            operacao = input.nextLine();

            switch (operacao) {
                case "I":
                    System.out.println("Digite o nome:");
                    nome = input.nextLine();
                    clientes.add(nome);
                    break;
                case "E":
                    System.out.println("Digite o indice:");
                    indice = input.nextInt();
                    if (indice >= 0 && indice < clientes.size()) {
                        clientes.remove(indice);
                    }
                    break;
                case "S":
                    System.out.println("Encerradno o programa!");
                    break;
            }
            System.out.println("A lista está da seguinte maneira: ");
            for (int i = 0; i < clientes.size(); i++) {
                System.out.println(clientes.get(i));
            }
        }
        input.close();
    }
}
