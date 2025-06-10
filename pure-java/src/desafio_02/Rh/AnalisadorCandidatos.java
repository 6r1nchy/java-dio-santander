package desafio_02.Rh;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnalisadorCandidatos {
    private static final int SALARIO_BASE = 2000;
    private static final int MAX_CANDIDATOS_ENTREVISTA = 5;
    private static final int MAX_TENTATIVAS_LIGACAO = 3;

    public static void main(String[] args) {
        List<Candidato> candidatos = new ArrayList<>();
        candidatos.add(new Candidato("Alice", 1800));
        candidatos.add(new Candidato("Bruno", 2200));
        candidatos.add(new Candidato("Carlos", 1900));
        candidatos.add(new Candidato("Daniela", 2000));
        candidatos.add(new Candidato("Eduardo", 2100));
        candidatos.add(new Candidato("Fernanda", 1950));
        candidatos.add(new Candidato("Gabriel", 1750));

        List<Candidato> selecionados = selecionarCandidatos(candidatos);

        System.out.println("\nCandidatos Selecionados:");
        for (Candidato candidato : selecionados) {
            System.out.println(candidato.getNome());
        }

        for (Candidato candidato : selecionados) {
            realizarLigacao(candidato);
        }
    }

    private static List<Candidato> selecionarCandidatos(List<Candidato> candidatos) {
        List<Candidato> selecionados = new ArrayList<>();

        for (Candidato candidato : candidatos) {
            if (candidato.getSalarioPretendido() <= SALARIO_BASE) {
                if (selecionados.size() < MAX_CANDIDATOS_ENTREVISTA) {
                    System.out.println("LIGAR PARA O CANDIDATO: " + candidato.getNome());
                    selecionados.add(candidato);
                } else {
                    System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS: " + candidato.getNome());
                }
            } else {
                System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS: " + candidato.getNome());
            }
        }
        return selecionados;
    }

    private static void realizarLigacao(Candidato candidato) {
        Random random = new Random();
        boolean atendeu = false;

        for (int tentativa = 1; tentativa <= MAX_TENTATIVAS_LIGACAO; tentativa++) {
            int resposta = random.nextInt(2); 

            if (resposta == 1) {
                System.out.println("CONSEGUIMOS CONTATO COM " + candidato.getNome() + " APÓS " + tentativa + " TENTATIVA(S).");
                atendeu = true;
                break;
            } else {
                System.out.println("Tentativa " + tentativa + " para " + candidato.getNome() + ": Sem sucesso.");
            }
        }

        if (!atendeu) {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato.getNome() + ".");
        }
    }
}
