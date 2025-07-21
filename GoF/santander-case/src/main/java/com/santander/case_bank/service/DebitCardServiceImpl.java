package com.santander.case_bank.service;

import com.santander.case_bank.model.DebitCard;
import com.santander.case_bank.repository.DebitCardRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class DebitCardServiceImpl implements DebitCardService {

    private final DebitCardRepository debitCardRepository;

    public DebitCardServiceImpl(DebitCardRepository debitCardRepository) {
        this.debitCardRepository = debitCardRepository;
    }

    @Override
    public List<DebitCard> getAllDebitCards() {
        return debitCardRepository.findAll();
    }

    @Override
    public DebitCard getDebitCardById(Long id) {
        return debitCardRepository.findById(id).orElseThrow();
    }

    @Override
    public DebitCard createDebitCard(DebitCard card) {
        return debitCardRepository.save(card);
    }

    @Override
    public void deleteDebitCard(Long id) {
        debitCardRepository.deleteById(id);
    }
}
