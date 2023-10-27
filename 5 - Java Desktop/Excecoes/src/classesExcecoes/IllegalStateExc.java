package classesExcecoes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IllegalStateExc {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Gumball");
        nomes.add("Darwin");

        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()) {
            iterator.remove();
        }
    }
}
