package com.bankapp.BankPropertyEvaluationApp.Service;


import com.bankapp.BankPropertyEvaluationApp.model.User;
import com.bankapp.BankPropertyEvaluationApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Service methods (e.g., CRUD operations)
}