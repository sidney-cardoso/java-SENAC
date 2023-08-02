import java.util.PriorityQueue;
import java.util.Queue;

public class TesteFila {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<String>();

        fila.add("João");
        fila.add("Maria");
        fila.add("Caio");
        fila.add("Joana");

        int ordem = 1;

        while (!fila.isEmpty()) {
            String nome = fila.remove();
            System.out.println(ordem + "º a ser atendido(a): " + nome);
            ordem++;
        }
    }
}