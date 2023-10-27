package excecoesProprias;

public class ThrowDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Antes do lançamento da exceção!");
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("Lançamento da exceção!");
        }
        System.out.println("Fora do try/catch!");
    }
}
