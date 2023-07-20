package Associacao;

public class Pessoa {
    private String nome;
    private Pessoa conjuge = null;

    Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void namorar(Pessoa pessoa) {
        if (this.conjuge == null) {
            this.conjuge = pessoa;
            pessoa.namorar(this);
        }
    }

    public Pessoa getConjuge() {
        return this.conjuge;
    }
}
