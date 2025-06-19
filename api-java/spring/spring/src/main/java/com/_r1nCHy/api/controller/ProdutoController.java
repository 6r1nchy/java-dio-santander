package com._r1nCHy.api.controller;

import com._r1nCHy.api.model.Produto;
import com._r1nCHy.api.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repo;

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        return repo.save(produto);
    }

    @GetMapping
    public List<Produto> listar() {
        return repo.findAll();
    }
}