package com.bankapp.BankPropertyEvaluationApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.BankPropertyEvaluationApp.Service.FacilityDetailsService;
import com.bankapp.BankPropertyEvaluationApp.model.FacilityDetails;

@RestController
@RequestMapping("/api/facilityDetails")
public class FacilityDetailsController {

    @Autowired
    private FacilityDetailsService facilityDetailsService;

    @PostMapping
    public ResponseEntity<FacilityDetails> createFacilityDetails(@RequestBody FacilityDetails facilityDetails) {
        FacilityDetails savedFacilityDetails = facilityDetailsService.save(facilityDetails);
        return ResponseEntity.ok(savedFacilityDetails);
    }

    @GetMapping
    public ResponseEntity<List<FacilityDetails>> getAllFacilityDetails() {
        List<FacilityDetails> facilityDetails = facilityDetailsService.findAll();
        return ResponseEntity.ok(facilityDetails);
    }

    // Additional endpoints as needed
}