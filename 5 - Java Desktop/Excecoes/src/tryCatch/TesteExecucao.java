package tryCatch;

public class TesteExecucao {
    static void geraExcecao() {
        int nums[] = new int[4];
        System.out.println("Mensagem antes da excecao ser lançada");
        // Tentando alocar o valor 10 em uma posição do vetor que não existe
        nums[7] = 10;
        System.out.println("Mensagem que nao sera exibida");
    }
}
