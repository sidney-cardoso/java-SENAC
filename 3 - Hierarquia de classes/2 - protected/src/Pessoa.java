public class Pessoa {
    public String nome;
    protected String cpf;

    public Pessoa(String _nome, String _cpf) {
        this.nome = _nome;
        this.cpf = _cpf;
    }

    public void mostrarDados() {
        System.out.println("Pessoa: " + nome + " cpf: " + cpf);
    }
}
