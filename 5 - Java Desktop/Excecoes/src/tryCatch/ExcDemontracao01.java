package tryCatch;

public class ExcDemontracao01 {
    public static void main(String[] args) {
        int nums[] = new int[4];

        try {
            System.out.println("Antes da exceção ser gerada");

            // Erro proposital
            nums[7] = 10; // Índice não existe, portanto não pode ser preenchido
            System.out.println("Esta mensagem não será exibida!!!");
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Indice do vetor fora do seu escopo!!!");
        }
        System.out.println("Mensagem exibida após o tratamento da exceção!");
    }
}
