package com._r1nCHy.api.repository;

import com._r1nCHy.api.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {}
