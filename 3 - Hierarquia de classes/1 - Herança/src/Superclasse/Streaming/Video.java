package Superclasse.Streaming;

public class Video {
    public String titulo, direcao;
    public int ano;
    public float duracao;

    public Video(String _titulo, String _direcao, int _ano, float _duracao) {
        this.titulo = _titulo;
        this.direcao = _direcao;
        this.ano = _ano;
        this.duracao = _duracao;
    }

    public void tocar() {
        System.out.println("Executando o vídeo \"" + titulo + "\" dirigido por " + direcao);
    }
}
