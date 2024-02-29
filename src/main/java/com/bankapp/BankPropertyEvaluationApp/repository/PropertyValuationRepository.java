package com.bankapp.BankPropertyEvaluationApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bankapp.BankPropertyEvaluationApp.model.PropertyValuation;

public interface PropertyValuationRepository extends JpaRepository<PropertyValuation, Long> {


}

