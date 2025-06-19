public class App {
    public static void main(String[] args) {
        ProcessadorPagamento processador = new ProcessadorPagamento();

        processador.setEstrategia(new PagamentoCartaoCredito());
        processador.processarPagamento(150.00);

        processador.setEstrategia(new PagamentoPix());
        processador.processarPagamento(75.50);

        processador.setEstrategia(new PagamentoBoleto());
        processador.processarPagamento(300.00);
    }
}
