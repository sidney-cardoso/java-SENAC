public class TrabalhandoComNome {
    public static void main(String[] args) {
        /*
         * A partir do nome de uma pessoa, verifique o tamanho do nome completo e
         * extraia o primeiro nome, ignorando os sobrenomes.
         */
        String nome = "Mariana Santos Lima", primeiroNome;
        int fimNome, tamanhoNome;

        // tamanho do nome completo
        tamanhoNome = nome.length();
        // encontra o índice no qual ocorre o primeiro caractere de espaço
        fimNome = nome.indexOf(" ");
        // extrai o primeiro nome
        primeiroNome = nome.substring(0, fimNome);

        // mostra na tela o resultado
        System.out.println("Tamanho total: " + tamanhoNome + " caracteres;\nPrimeiro nome: " + primeiroNome);
    }
}
