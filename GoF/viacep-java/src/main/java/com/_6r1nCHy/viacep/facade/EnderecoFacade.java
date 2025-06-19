package com._6r1nCHy.viacep.facade;

import com._6r1nCHy.viacep.client.ViaCepClient;
import com._6r1nCHy.viacep.model.Endereco;
import com._6r1nCHy.viacep.service.EnderecoService;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

import java.util.List;

@Component
public class EnderecoFacade {

    private final EnderecoService service;
    private final ViaCepClient viaCepClient;

    public EnderecoFacade(EnderecoService service, ViaCepClient viaCepClient) {
        this.service = service;
        this.viaCepClient = viaCepClient;
    }

    public Endereco consultarPorCep(String cep) {
        return service.buscarPorCep(cep)
                .orElseGet(() -> {
                    Endereco novo = viaCepClient.consultarCep(cep);
                    if (novo.getCep() == null) {
                        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CEP não encontrado na base ViaCEP");
                    }
                    
                    return service.salvar(novo);
                });
    }

    public List<Endereco> consultarPorEndereco(String uf, String cidade, String logradouro) {
        List<Endereco> resultados = viaCepClient.buscarPorEndereco(uf, cidade, logradouro);
        resultados.forEach(service::salvar); // salva todos no H2
        return resultados;
    }
}
