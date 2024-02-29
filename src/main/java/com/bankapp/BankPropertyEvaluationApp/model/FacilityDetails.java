package com.bankapp.BankPropertyEvaluationApp.model;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.*;
@Entity
public @Data class FacilityDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private FacilityType facilityType; // Revolving or Non-revolving

    private String category; // e.g., 25000 - Apartment
    private String purpose; // e.g., 1 - Reparation
    private int termInMonths;
    private String currency; // e.g., MUR, EUR
    private double amount;

    // Constructors, Getters, and Setters
}