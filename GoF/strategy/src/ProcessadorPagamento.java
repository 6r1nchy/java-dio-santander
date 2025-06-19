public class ProcessadorPagamento {
    private PagamentoStrategy estrategia;

    public void setEstrategia(PagamentoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void processarPagamento(double valor) {
        if (estrategia == null) {
            System.out.println("Nenhuma forma de pagamento selecionada.");
        } else {
            estrategia.pagar(valor);
        }
    }
}
