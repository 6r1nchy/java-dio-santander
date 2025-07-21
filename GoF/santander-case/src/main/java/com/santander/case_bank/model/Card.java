package com.santander.case_bank.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private CreditCard credit;

    @OneToOne(cascade = CascadeType.ALL)
    private DebitCard debit;

    // Getters, setters, constructors...
    public Card() {}

    public Card(Long id, CreditCard credit, DebitCard debit) {
        this.id = id;
        this.credit = credit;
        this.debit = debit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CreditCard getCredit() {
        return credit;
    }

    public void setCredit(CreditCard credit) {
        this.credit = credit;
    }

    public DebitCard getDebit() {
        return debit;
    }

    public void setDebit(DebitCard debit) {
        this.debit = debit;
    }
}
