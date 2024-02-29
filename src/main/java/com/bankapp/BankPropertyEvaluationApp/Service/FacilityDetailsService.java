package com.bankapp.BankPropertyEvaluationApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.BankPropertyEvaluationApp.model.FacilityDetails;
import com.bankapp.BankPropertyEvaluationApp.repository.FacilityDetailsRepository;

@Service
public class FacilityDetailsService {

    @Autowired
    private FacilityDetailsRepository facilityDetailsRepository;

	public FacilityDetails save(FacilityDetails facilityDetails) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'save'");
	}

    public List<FacilityDetails> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    // Service methods (e.g., create, update, find)
}
