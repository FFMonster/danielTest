package com.daniel.service;

import com.daniel.entity.Customer;

import java.util.List;

public interface CustomerService {
    void add(Customer customer);

    Integer deleteCustomerById(Long customerId);

    Integer updateCustomer(Customer customer);

    Customer queryById(Long customerId);

    List<Customer> queryAllCustomer();
}
