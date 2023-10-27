package classesExcecoes;

public class ClassCastExc {
    public static void main(String[] args) {
        Long numero = 2023L;
        String texto = (String) numero;
    }
}
