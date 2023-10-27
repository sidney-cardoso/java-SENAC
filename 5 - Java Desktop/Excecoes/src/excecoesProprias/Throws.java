package excecoesProprias;

public class Throws {
    public static void main(String[] args) {
        Throws obj = new Throws();
        try {
            System.out.println(obj.division(15, 0));
        } catch (ArithmeticException e) {
            System.out.println("Dividir por zero é impossível, não sabia?");
        }
    }

    private int division(int a, int b) throws ArithmeticException {
        int t = a / b;
        return t;
    }
}
