public class App {
    public static void main(String[] args) {
        System.out.println("Iniciando aplicação...");

        // Uso direto do Singleton aqui também (opcional)
        ConfiguracaoSistema config = ConfiguracaoSistema.getInstance();
        config.setModoDebug(false);

        System.out.println("Modo Debug em App: " + config.isModoDebug());
    }
}
