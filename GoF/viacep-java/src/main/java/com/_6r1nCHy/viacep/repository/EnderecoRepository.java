package com._6r1nCHy.viacep.repository;

import com._6r1nCHy.viacep.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, String> {}
