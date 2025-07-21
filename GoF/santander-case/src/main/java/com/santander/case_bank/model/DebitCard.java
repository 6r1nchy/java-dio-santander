package com.santander.case_bank.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_debit_card")
public class DebitCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;
    private Double limit;

    // Getters, setters, constructors...
    public DebitCard() {}

    public DebitCard(Long id, String number, Double limit) {
        this.id = id;
        this.number = number;
        this.limit = limit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }
}
