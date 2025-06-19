public class ConfiguracaoSistema {
    private static ConfiguracaoSistema instancia;
    private boolean modoDebug;
    private String caminhoBanco;

    private ConfiguracaoSistema() {
        this.modoDebug = false;
        this.caminhoBanco = "localhost:3306";
    }

    public static ConfiguracaoSistema getInstance() {
        if (instancia == null) {
            instancia = new ConfiguracaoSistema();
        }
        return instancia;
    }

    public boolean isModoDebug() {
        return modoDebug;
    }

    public void setModoDebug(boolean modoDebug) {
        this.modoDebug = modoDebug;
    }

    public String getCaminhoBanco() {
        return caminhoBanco;
    }

    public void setCaminhoBanco(String caminhoBanco) {
        this.caminhoBanco = caminhoBanco;
    }
}
