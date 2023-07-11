package com.example.demo.customer;

import com.example.demo.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final ICustomerRepository customerRepository;

    @Autowired
    public CustomerService(ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    List<Customer> getCustomers() {
        List<Customer> customers = customerRepository.getCustomers();
        return customers;
    }

    Customer getCustomer(Long id) {
        return customerRepository.getCustomers()
                .stream()
                .filter(customer -> customer.getId().equals(id))
                .findFirst().
                orElseThrow(() -> new NotFoundException("customer with id " + id + " not available"));
    }
}
