package com.santander.case_bank.service;

import com.santander.case_bank.model.Card;
import java.util.List;

public interface CardService {
    List<Card> getAllCards();
    Card getCardById(Long id);
    Card createCard(Card card);
    void deleteCard(Long id);
}
