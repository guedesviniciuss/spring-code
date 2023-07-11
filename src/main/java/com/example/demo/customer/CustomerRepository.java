package com.example.demo.customer;

import java.util.Collections;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    @Override
    public List<Customer> getCustomers() {
        return Collections.singletonList(new Customer(1L, "JAMES BOND", "james@gmail.com", "1234567"));
    }
}
