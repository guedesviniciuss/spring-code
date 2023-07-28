package com.example.demo.customer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CustomerServiceTest {

    private CustomerService underTest;

    @Autowired
    private CustomerRepository customerRepository;

    @BeforeEach
    void setUp() {
        underTest = new CustomerService(customerRepository);
    }

    @AfterEach
    void tearDown() {
        customerRepository.deleteAll();
    }

    @Test
    void getCustomers() {
        // given
        Customer bambi = new Customer(1L, "bambi", "bambi@gmail.com", "123");
        Customer vini = new Customer(2L, "vini", "vinicius@gmail.com", "123");

        // when
        customerRepository.saveAll(Arrays.asList(bambi, vini));

        // then
        List<Customer> customers = underTest.getCustomers();
        assertEquals(2, customers.size());
    }

    @Test
    void getCustomer() {
        // given
        Customer bambi = new Customer(1L, "bambi", "bambi@gmail.com", "123");
        customerRepository.save(bambi);

        // when
        Customer actual = underTest.getCustomer(1L);

        // then
        assertEquals(1L, actual.getId());
        assertEquals("bambi@gmail.com", actual.getEmail());
        assertEquals("bambi", actual.getName());
        assertEquals("123", actual.getPassword());
    }
}