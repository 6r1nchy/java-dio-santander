package desafio_02.Rh;

public class Candidato {
    private String nome;
    private int salarioPretendido;

    public Candidato(String nome, int salarioPretendido) {
        this.nome = nome;
        this.salarioPretendido = salarioPretendido;
    }

    public String getNome() {
        return nome;
    }

    public int getSalarioPretendido() {
        return salarioPretendido;
    }
}
