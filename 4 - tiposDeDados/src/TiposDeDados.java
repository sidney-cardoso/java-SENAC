public class TiposDeDados {
    public static void main(String[] args) {
        /*
         * Seu valor padrão é 0.0f. Ao expressar um valor float, é necessário sempre
         * incluir um algarismo “f” à frente; caso contrário, o Java interpretará como
         * sendo double. Exemplo:
         */
        float variavelFloat = 1.5f;
        System.out.println(variavelFloat);
        
        // "\n" é usado para realizar uma quebra de linha
        System.out.println("\nTipos de dados em Java: \n"
                + "\nMenor Byte: " + Byte.MIN_VALUE + "\nMaior Byte: " + Byte.MAX_VALUE
                + "\nMenor Short Int: " + Short.MIN_VALUE + "\nMaior Short Int: " + Short.MAX_VALUE
                + "\nMenor Int: " + Integer.MIN_VALUE + "\nMaior Int: " + Integer.MAX_VALUE
                + "\nMenor Long: " + Long.MIN_VALUE + "\nMaior Long: " + Long.MAX_VALUE
                + "\nMenor Float: " + Float.MIN_VALUE + "\nMaior Float: " + Float.MAX_VALUE
                + "\nMenor Double: " + Double.MIN_VALUE + "\nMaior Double: " + Double.MAX_VALUE);
    }
}
