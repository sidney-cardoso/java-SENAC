package excecoesProprias;

public class FinallyDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            UseFinally.geraExcecao(i);
            System.out.println();
        }
    }
}

class UseFinally {
    public static void geraExcecao(int escolha) {
        int nums[] = new int[2];
        System.out.println("Recebendo: " + escolha);
        int t;
        try {
            switch (escolha) {
                case 0:
                    t = 10 / escolha;
                    System.out.println(t);
                    break;
                case 1:
                    nums[4] = 4;
                    break;
                case 2:
                    return;
            }
        } catch (ArithmeticException exc) {
            System.out.println("Divisão por zero!");
            return;
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Erro de índice fora do escopo!");
        } finally {
            System.out.println("Saindo do bloco try!");
        }
    }
}
