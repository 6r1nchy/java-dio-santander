package com._6r1nCHy.viacep.service;

import com._6r1nCHy.viacep.model.Endereco;
import com._6r1nCHy.viacep.repository.EnderecoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EnderecoService {

    private final EnderecoRepository repository;

    public EnderecoService(EnderecoRepository repository) {
        this.repository = repository;
    }

    public Optional<Endereco> buscarPorCep(String cep) {
        return repository.findById(cep);
    }

    public Endereco salvar(Endereco endereco) {
        return repository.save(endereco);
    }
}
