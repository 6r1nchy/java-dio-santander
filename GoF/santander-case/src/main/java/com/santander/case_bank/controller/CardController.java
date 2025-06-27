package com.santander.case_bank.controller;

import com.santander.case_bank.model.Card;
import com.santander.case_bank.service.CardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cards")
public class CardController {

    private final CardService service;

    public CardController(CardService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Card>> getAll() {
        return ResponseEntity.ok(service.getAllCards());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Card> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getCardById(id));
    }

    @PostMapping
    public ResponseEntity<Card> create(@RequestBody Card card) {
        return ResponseEntity.ok(service.createCard(card));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteCard(id);
        return ResponseEntity.noContent().build();
    }
}
