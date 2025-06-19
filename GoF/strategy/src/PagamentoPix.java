public class PagamentoPix implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.printf("Transferindo R$ %.2f via Pix.%n", valor);
    }
}
