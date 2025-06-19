public class PagamentoBoleto implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.printf("Gerando boleto no valor de R$ %.2f.%n", valor);
    }
}
