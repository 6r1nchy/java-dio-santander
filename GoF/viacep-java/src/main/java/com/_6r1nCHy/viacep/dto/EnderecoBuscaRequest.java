package com._6r1nCHy.viacep.dto;

import jakarta.validation.constraints.NotBlank;

public class EnderecoBuscaRequest {

    @NotBlank(message = "UF é obrigatório")
    private String uf;

    @NotBlank(message = "Cidade é obrigatória")
    private String cidade;

    @NotBlank(message = "Logradouro é obrigatório")
    private String logradouro;

    // Getters e Setters
    public String getUf() { return uf; }
    public void setUf(String uf) { this.uf = uf; }

    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }

    public String getLogradouro() { return logradouro; }
    public void setLogradouro(String logradouro) { this.logradouro = logradouro; }
}
