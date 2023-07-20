package Composicao;

public class Casa {
    private Janela janelaQuarto = null;
    private Janela janelaCozinha = null;
    private Janela janelaBanheiro = null;
    private Janela janelaSala = null;

    public Casa() {
        this.janelaQuarto = new Janela();
        this.janelaCozinha = new Janela();
        this.janelaBanheiro = new Janela();
        this.janelaSala = new Janela();
    }
}
