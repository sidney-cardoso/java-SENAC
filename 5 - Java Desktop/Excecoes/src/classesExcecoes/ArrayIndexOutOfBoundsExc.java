package classesExcecoes;

import java.util.ArrayList;
import java.util.List;

public class ArrayIndexOutOfBoundsExc {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("João");
        names.add("Maria");

        names.get(5);
    }
}
