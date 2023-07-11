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

    //INICIALIZA O BEAN COM O NOME DA VARIAVEL NO SERVICO
    @Bean
    ICustomerRepository customerRepository() {
        System.out.println("useFakeRepository = " + useFakeRepository);
        return useFakeRepository ? new CustomerFakeRepository() : new CustomerRepository();
    }
}
