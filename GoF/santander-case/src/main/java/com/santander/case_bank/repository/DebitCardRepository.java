package com.santander.case_bank.repository;

import com.santander.case_bank.model.DebitCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DebitCardRepository extends JpaRepository<DebitCard, Long> {
}
