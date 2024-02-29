package com.bankapp.BankPropertyEvaluationApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bankapp.BankPropertyEvaluationApp.Service.PropertyValuationService;
import com.bankapp.BankPropertyEvaluationApp.model.PropertyValuation;

@RestController
@RequestMapping("/api/propertyValuation")
public class PropertyValuationController {

    @Autowired
    private PropertyValuationService service;

    @PostMapping
    public ResponseEntity<PropertyValuation> addValuation(@RequestBody PropertyValuation valuation) {
        PropertyValuation savedValuation = service.save(valuation);
        return ResponseEntity.ok(savedValuation);
    }

    // Additional endpoints as needed
}

