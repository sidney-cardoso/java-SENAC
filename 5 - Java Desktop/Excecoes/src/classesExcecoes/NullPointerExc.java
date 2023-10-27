package classesExcecoes;

public class NullPointerExc {
    public static void main(String[] args) {
        Integer numero = null;

        if (numero > 0) {
            System.out.println("Número é positivo!");
        }
    }
}
