package com.example.demo.customer;

import com.example.demo.infoapp.InfoApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class CustomerConfiguration {

    @Value("${app.useFakeRepository:false}")
    private Boolean useFakeRepository;

    @Value("${info.company.name}")
    private String companyName;

    @Autowired
    private Environment env;

    @Bean
    CommandLineRunner commandLineRunner(InfoApp infoApp) {
        return args -> {
            System.out.println("ENTROUUUUUUUU!!!!" + companyName);
            System.out.println(env.getProperty("info.company.name"));
            System.out.println(infoApp.toString());
        };
    }

    @Bean
    ICustomerRepository customerRepository() {
        return new CustomerFakeRepository();
    }
}
