package com.bankapp.BankPropertyEvaluationApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.BankPropertyEvaluationApp.Service.BorrowerService;
import com.bankapp.BankPropertyEvaluationApp.model.Borrower;

@RestController
@RequestMapping("/api/borrowers")
public class BorrowerController {

    @Autowired
    private BorrowerService borrowerService;

    @PostMapping
    public ResponseEntity<Borrower> addBorrower(@RequestBody Borrower borrower) {
        Borrower newBorrower = borrowerService.save(borrower);
        return ResponseEntity.ok(newBorrower);
    }

    @GetMapping
    public ResponseEntity<List<Borrower>> getAllBorrowers() {
        List<Borrower> borrowers = borrowerService.findAll();
        return ResponseEntity.ok(borrowers);
    }

    // Additional endpoints as needed
}
