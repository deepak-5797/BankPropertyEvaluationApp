package com.bankapp.BankPropertyEvaluationApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bankapp.BankPropertyEvaluationApp.Service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // API endpoints (e.g., GET, POST)
}
