package Superclasse.Streaming;

public class Filme extends Video {
    public String genero, produtora;

    public Filme(String _titulo, String _direcao, int _ano, float _duracao) {
        super(_titulo, _direcao, _ano, _duracao);
    }
}
