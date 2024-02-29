package com.bankapp.BankPropertyEvaluationApp;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan("com.bankapp.BankPropertyEvaluationApp.repository")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class BankPropertyEvaluationAppApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(BankPropertyEvaluationAppApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		//SpringApplication.run(BankPropertyEvaluationAppApplication.class, args);
	}
}
