import java.util.Scanner;

public class Exemplo02 {
    /*
     * Crie um programa Java que recebe o nome de uma forma geométrica (retângulo,
     * triangulo ou círculo) e, de acordo com a forma, solicita dados para cálculo
     * da área e realiza esse cálculo.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "latin1");// permite acentos

        String forma;
        float raio, base, altura, area;

        System.out.println("Digite a forma da qual quer calcular área (retangulo, triangulo ou circulo):");
        forma = entrada.nextLine();

        switch (forma) {
            case "retângulo":
            case "retangulo":
                System.out.println("Digite primeiro a base depois a altura:");
                base = entrada.nextFloat();
                altura = entrada.nextFloat();
                area = base * altura;
                entrada.close();
                System.out.println("Área do retângulo: " + area);
                break;

            case "triângulo":
            case "triangulo":
                System.out.println("Digite primeiro a base depois a altura:");
                base = entrada.nextFloat();
                altura = entrada.nextFloat();
                area = base * altura / 2;
                entrada.close();
                System.out.println("Área do triângulo: " + area);
                break;

            case "círculo":
            case "circulo":
                System.out.println("Digite o raio:");
                raio = entrada.nextFloat();
                area = 3.1416f * raio * raio;
                entrada.close();
                System.out.println("Área do círculo: " + area);
                break;

            default:
                System.out.println("forma não reconhecida");
                break;
        }
    }
}
