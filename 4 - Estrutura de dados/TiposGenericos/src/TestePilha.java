import java.util.Scanner;
import java.util.Stack;

public class TestePilha {
    public static void main(String[] args) {
        /*
         * Nesta aplicação, será solicitado o nome de cada carro e
         * depois deverá ser apresentada a ordem em que eles sairão do caminhão.
         * Para simplificar, considere apenas um dos andares do veículo de transporte.
         */
        Scanner input = new Scanner(System.in);
        String carro, continuar = "";

        Stack<String> cegonha = new Stack<String>();

        while (!continuar.equals("N")) {
            System.out.println("Digite o nome do próximo carro a entrar no caminhão cegonha: ");
            carro = input.nextLine();

            cegonha.push(carro);

            System.out.println("Continuar informando dados? S/N");
            continuar = input.nextLine();
        }
        System.out.println("Retirar os carros nesta ordem: ");
        while (!cegonha.empty()) {
            carro = cegonha.pop();
            System.out.println(carro);
        }
        input.close();
    }
}
