package Superclasse.Streaming;

public class App {

    public static void main(String[] args) {
        Video v = new Video("Video generico", "Francisco da silva", 2022, 30);

        Filme f = new Filme("Aventuras nos Alpes", "Joana da silva", 2000, 120);
        f.genero = "Aventura";
        f.produtora = "Sun Films";

        Episodio e = new Episodio("Tecnologias perigosas", "Joaquim da silva", 2021, 45, 5, 1);

        v.tocar();
        f.tocar();
        e.tocar();

        Video referencia1 = f;
        referencia1.tocar();

        Video referencia2 = new Episodio("Série clássica", "João da silva", 1980, 30, 2, 2);
        referencia2.tocar();

        Video[] playlist = new Video[5];
        playlist[0] = v; // um vídeo genérico
        playlist[1] = f; // um filme
        playlist[2] = e; // um episódio
        playlist[3] = referencia2; // outro episódio
        playlist[4] = new Filme("Filme clássico", "José da silva", 1970, 130);

        System.out.println("Tocando playlist: ");
        for (int i = 0; i < playlist.length; i++) {
            // não importa se é vídeo, filme ou episódio, dê o play!
            playlist[i].tocar();
        }

    }
}
