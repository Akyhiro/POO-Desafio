import funcoes.Iphone;

public class Main {
    public static void main (String[] args){
        Iphone iphone1 = new Iphone();

        iphone1.selecionarMusica("Vida loka");
        iphone1.tocarMusica();
        iphone1.pausarMusica();

        iphone1.adicionarNovaAba();
        iphone1.exibirPagina("https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo");
        iphone1.atualizarPagina();

        iphone1.atender();
        iphone1.ligar("9987-8676");
        iphone1.iniciarCorreioVoz();
    }
}

