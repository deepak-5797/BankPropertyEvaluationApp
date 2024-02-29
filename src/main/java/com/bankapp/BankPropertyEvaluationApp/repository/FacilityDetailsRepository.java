package com.bankapp.BankPropertyEvaluationApp.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.bankapp.BankPropertyEvaluationApp.model.FacilityDetails;

public interface FacilityDetailsRepository extends JpaRepository<FacilityDetails, Long> {
}