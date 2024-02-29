package com.bankapp.BankPropertyEvaluationApp.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class PropertyValuation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fosReference;
    private String evaluationType; // New or Existing
    private Date applicationDate;

    // Constructors, Getters, and Setters
}
