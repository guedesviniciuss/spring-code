package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfiguration {

    @Value("${app.useFakeRepository:false}")
    private Boolean useFakeRepository;

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            System.out.println("ENTROUUUUUUUU!!!!");
        };
    }

    @Bean
    ICustomerRepository customerRepository() {
        return new CustomerFakeRepository();
    }
}
