package Composicao;

public class Janela {
    private boolean estaAberta = false;

    Janela() {
    }

    public void abrir() {
        this.estaAberta = true;
    }

    public void fechar() {
        this.estaAberta = false;
    }

    public void mostrarSituacao() {
        String situacao = this.estaAberta ? "aberta" : "fechada";
        System.out.println("A janela está " + situacao);
    }
}
