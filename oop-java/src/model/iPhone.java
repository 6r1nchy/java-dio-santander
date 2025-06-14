package model;

import interfaces.PlayerMusical;
import interfaces.TelefoneFuncoes;
import interfaces.WebBrowser;

public class iPhone implements PlayerMusical, TelefoneFuncoes, WebBrowser {
    private String modelo;
    private String versaoSO;
    private int armazenamento;

    public iPhone(String modelo, String versaoSO, int armazenamento) {
        this.modelo = modelo;
        this.versaoSO = versaoSO;
        this.armazenamento = armazenamento;
    }

    @Override
    public void tocar() { System.out.println("Tocando música..."); }
    @Override
    public void pausar() { System.out.println("Música pausada."); }
    @Override
    public void selecionarMusica(String musica) { System.out.println("Música selecionada: " + musica); }
    @Override
    public void selecionarMusicaAnterior() { System.out.println("Selecionando música anterior..."); }
    @Override
    public void selecionarMusicaPosterior() { System.out.println("Selecionando próxima música..."); }

    @Override
    public void ligar(String numero) { System.out.println("Ligando para " + numero + "..."); }
    @Override
    public void atender() { System.out.println("Atendendo chamada..."); }
    @Override
    public void finalizarLigacao() { System.out.println("Ligação finalizada."); }
    @Override
    public void iniciarCorreioVoz() { System.out.println("Iniciando correio de voz..."); }
    @Override
    public void acessarCorreioVoz() { System.out.println("Acessando correio de voz..."); }

    @Override
    public void exibirPagina(String url) { System.out.println("Exibindo página: " + url); }
    @Override
    public void adicionarNovaAba() { System.out.println("Nova aba adicionada."); }
    @Override
    public void fecharAba() { System.out.println("Aba fechada."); }
    @Override
    public void atualizarPagina() { System.out.println("Página atualizada."); }
    @Override
    public void fecharPagina() { System.out.println("Página fechada."); }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo + " | SO: " + versaoSO + " | Armazenamento: " + armazenamento + "GB");
    }
}
