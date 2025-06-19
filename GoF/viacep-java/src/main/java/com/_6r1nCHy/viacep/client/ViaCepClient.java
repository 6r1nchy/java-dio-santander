package com._6r1nCHy.viacep.client;

import com._6r1nCHy.viacep.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepClient {

    @GetMapping("/{cep}/json")
    Endereco consultarCep(@PathVariable("cep") String cep);

    @GetMapping("/{uf}/{cidade}/{logradouro}/json")
    List<Endereco> buscarPorEndereco(@PathVariable("uf") String uf,
                                 @PathVariable("cidade") String cidade,
                                 @PathVariable("logradouro") String logradouro);

}
