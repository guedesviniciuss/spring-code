package com.example.demo.customer;

import java.util.Arrays;
import java.util.List;

public class CustomerFakeRepository implements ICustomerRepository{
    @Override
    public List<Customer> findAll() {
        return Arrays.asList(
                new Customer(1l, "VINI", "viniciusguedes@gmail.com", "password123"),
                new Customer(2L, "BAMBI", "bambi@gmail.com", "123password")
        );
    }
}
