package com.bankapp.BankPropertyEvaluationApp.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.BankPropertyEvaluationApp.model.Borrower;
import com.bankapp.BankPropertyEvaluationApp.repository.BorrowerRepository;

@Service
public class BorrowerService {

    @Autowired
    private BorrowerRepository borrowerRepository;

	public Borrower save(Borrower borrower) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'save'");
	}

    public List<Borrower> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    // Service methods (e.g., create, update, find)
}