package com.santander.case_bank.repository;

import com.santander.case_bank.model.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {
}
