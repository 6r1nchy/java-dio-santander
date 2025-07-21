package com.santander.case_bank.service;

import com.santander.case_bank.model.DebitCard;
import java.util.List;

public interface DebitCardService {
    List<DebitCard> getAllDebitCards();
    DebitCard getDebitCardById(Long id);
    DebitCard createDebitCard(DebitCard card);
    void deleteDebitCard(Long id);
}
