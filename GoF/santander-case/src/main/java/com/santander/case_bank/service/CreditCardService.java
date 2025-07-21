package com.santander.case_bank.service;

import com.santander.case_bank.model.CreditCard;
import java.util.List;

public interface CreditCardService {
    List<CreditCard> getAllCreditCards();
    CreditCard getCreditCardById(Long id);
    CreditCard createCreditCard(CreditCard card);
    void deleteCreditCard(Long id);
}
