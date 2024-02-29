package com.bankapp.BankPropertyEvaluationApp.repository;


import com.bankapp.BankPropertyEvaluationApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Query methods if needed
}