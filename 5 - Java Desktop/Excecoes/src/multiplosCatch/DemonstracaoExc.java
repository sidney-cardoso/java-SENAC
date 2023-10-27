package multiplosCatch;

public class DemonstracaoExc {
    public static void main(String[] args) {
        int numeral[] = { 4, 8, 16, 16, 32, 64, 128, 256, 512 };
        int denominador[] = { 2, 0, 4, 4, 0, 8 };

        for (int i = 0; i < numeral.length; i++) {
            try {
                System.out.println(
                        numeral[i] + " / " +
                                denominador[i] + " é " +
                                numeral[i] / denominador[i]);
            } catch (ArithmeticException exc) {
                System.out.println("Divisao por zero nao e possivel");
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Indice do vetor fora do seu escopo");
            }
        }
    }
}
