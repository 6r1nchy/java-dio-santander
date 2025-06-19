public class EmprestimoFacade {
    private VerificadorSaldo saldo;
    private VerificadorCredito credito;
    private ValidadorDocumentos documentos;

    public EmprestimoFacade() {
        this.saldo = new VerificadorSaldo();
        this.credito = new VerificadorCredito();
        this.documentos = new ValidadorDocumentos();
    }

    public boolean verificarElegibilidade(String cliente) {
        System.out.println("Iniciando verificação para empréstimo...");

        boolean elegivel = saldo.temSaldoSuficiente(cliente) &&
                           credito.temBomHistorico(cliente) &&
                           documentos.documentosValidos(cliente);

        if (elegivel) {
            System.out.println("Cliente elegível para empréstimo.");
        } else {
            System.out.println("Cliente NÃO elegível para empréstimo.");
        }

        return elegivel;
    }
}
