public class Exemplo02 {
    public static void main(String[] args) {
        // Crie e inicialize um vetor de string com os dias da semana.

        String[] dias = {
                "Domingo",
                "Segunda",
                "Terça",
                "Quarta",
                "Quinta",
                "Sexta",
                "Sábado",
                "Domingo"
        };
        for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]);
        }
    }
}
