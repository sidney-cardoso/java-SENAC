package tryCatch;

public class DemoExecucao {
    public static void main(String[] args) {
        try {
            TesteExecucao.geraExcecao();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Indice do vetor fora do seu escopo");
        }
        System.out.println("Mensagem depois do catch");
    }
}
