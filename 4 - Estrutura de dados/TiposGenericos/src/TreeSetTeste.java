import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<String> livros = new TreeSet<String>();
        String nomeLivro;

        System.out.println("Primeiro incula 7 títulos de livros:");

        for (int i = 0; i < 7; i++) {
            nomeLivro = input.nextLine();
            livros.add(nomeLivro);

            System.out.println("> Atual coleção: ");
            for (String I : livros) {
                System.out.println(I);
            }
        }
        System.out.println("Agora faça buscas. Digite PARE para encerrar!");
        nomeLivro = input.nextLine();
        while (!nomeLivro.equalsIgnoreCase("PARE")) {
            if (livros.contains(nomeLivro)) {
                System.out.println("Valor: \"" + nomeLivro + "\" foi encontrado!");
            } else {
                System.out.println("Valor: \"" + nomeLivro + "\" não foi encontrado!");
            }
            nomeLivro = input.nextLine();
        }
        input.close();
    }
}
