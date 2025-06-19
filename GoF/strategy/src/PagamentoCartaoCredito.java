public class PagamentoCartaoCredito implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.printf("Pagando R$ %.2f com Cartão de Crédito.%n", valor);
    }
}
