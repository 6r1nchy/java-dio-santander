public class TesteSingleton {
    public static void main(String[] args) {
        ConfiguracaoSistema config1 = ConfiguracaoSistema.getInstance();
        config1.setModoDebug(true);
        config1.setCaminhoBanco("192.168.0.100:5432");

        ConfiguracaoSistema config2 = ConfiguracaoSistema.getInstance();
        System.out.println("Modo Debug em config2: " + config2.isModoDebug());
        System.out.println("Caminho do Banco em config2: " + config2.getCaminhoBanco());

        // Deve imprimir os mesmos valores, confirmando que é a mesma instância
    }
}
