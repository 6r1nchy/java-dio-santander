import model.iPhone;

public class App {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone("iPhone X", "iOS 15", 128);

        meuIphone.exibirInformacoes();
        meuIphone.tocar();
        meuIphone.selecionarMusica("Bohemian Rhapsody");
        meuIphone.ligar("9999-8888");
        meuIphone.exibirPagina("www.dio.me");
    }
}
