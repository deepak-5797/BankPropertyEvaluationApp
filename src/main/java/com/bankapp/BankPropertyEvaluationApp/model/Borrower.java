package com.bankapp.BankPropertyEvaluationApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
public @Data class Borrower {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerNumber;
    private String customerName;
    private String contactNumber;
    private String email;
    private String address;

    // Constructors, Getters, and Setters
}