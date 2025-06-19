package com._6r1nCHy.viacep.controller;

import com._6r1nCHy.viacep.dto.EnderecoBuscaRequest;
import com._6r1nCHy.viacep.dto.EnderecoResponse;
import com._6r1nCHy.viacep.facade.EnderecoFacade;
import com._6r1nCHy.viacep.model.Endereco;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/enderecos")
public class EnderecoController {

    private final EnderecoFacade facade;

    public EnderecoController(EnderecoFacade facade) {
        this.facade = facade;
    }

    @GetMapping("/{cep}")
    public ResponseEntity<Endereco> buscarEndereco(@PathVariable String cep) {
        Endereco endereco = facade.consultarPorCep(cep);
        return ResponseEntity.ok(endereco);
    }

    @PostMapping("/buscar")
    public ResponseEntity<List<EnderecoResponse>> buscarEnderecoPorDados(
            @RequestBody @Valid EnderecoBuscaRequest req) {

        List<Endereco> lista = facade.consultarPorEndereco(
                req.getUf(), req.getCidade(), req.getLogradouro());

        List<EnderecoResponse> resposta = lista.stream().map(e ->
                new EnderecoResponse(
                        e.getCep(),
                        e.getLogradouro(),
                        e.getBairro(),
                        e.getLocalidade(),
                        e.getUf()
                )).collect(Collectors.toList());

        return ResponseEntity.ok(resposta);
    }
}
