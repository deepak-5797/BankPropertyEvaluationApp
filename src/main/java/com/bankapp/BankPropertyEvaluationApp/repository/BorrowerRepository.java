package com.bankapp.BankPropertyEvaluationApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankapp.BankPropertyEvaluationApp.model.Borrower;

public interface BorrowerRepository extends JpaRepository<Borrower, Long> {
}
