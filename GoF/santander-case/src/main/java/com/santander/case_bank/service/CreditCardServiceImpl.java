package com.santander.case_bank.service;

import com.santander.case_bank.model.CreditCard;
import com.santander.case_bank.repository.CreditCardRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CreditCardServiceImpl implements CreditCardService {

    private final CreditCardRepository creditCardRepository;

    public CreditCardServiceImpl(CreditCardRepository creditCardRepository) {
        this.creditCardRepository = creditCardRepository;
    }

    @Override
    public List<CreditCard> getAllCreditCards() {
        return creditCardRepository.findAll();
    }

    @Override
    public CreditCard getCreditCardById(Long id) {
        return creditCardRepository.findById(id).orElseThrow();
    }

    @Override
    public CreditCard createCreditCard(CreditCard card) {
        return creditCardRepository.save(card);
    }

    @Override
    public void deleteCreditCard(Long id) {
        creditCardRepository.deleteById(id);
    }
}
