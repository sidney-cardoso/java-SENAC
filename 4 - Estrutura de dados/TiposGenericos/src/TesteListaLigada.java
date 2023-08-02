import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TesteListaLigada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Float> notas = new LinkedList<Float>();

        notas.add(5.5f);
        notas.add(7f);
        notas.add(9.75f);

        float novaNota = input.nextFloat();
        int indice = 0;

        while (notas.get(indice) < novaNota && indice < notas.size()) {
            indice++;
        }

        if (indice < notas.size()) {
            notas.add(indice, novaNota);
        } else {
            notas.add(novaNota);
        }

        System.out.println("Notas em  ordem: ");
        for (int i = 0; i < notas.size(); i++) {
            System.out.println(notas.get(i));
        }
        input.close();
    }
}
