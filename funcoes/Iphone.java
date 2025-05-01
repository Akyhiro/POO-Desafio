package funcoes;

public class Iphone implements AparelhoTelefonico,NavegadorInternet,ReprodutorMusical {
    public void atender() {
        System.out.println("Chamada atendida");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    public void ligar(String numero) {
        System.out.println("Chamada para: " + numero);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("Pagina atualizada.");
    }

    public void exibirPagina(String url) {
        System.out.println("Página: " + url);
    }

    public void tocarMusica() {
        System.out.println("Tocando música.");
    }

    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }
}
