package com.daniel.service.impl;

import com.daniel.dao.CustomerDAO;
import com.daniel.entity.Customer;
import com.daniel.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDAO dao;


    @Override
    public void add(Customer customer) {
        dao.add(customer);
    }

    @Override
    public Integer deleteCustomerById(Long customerId){
        return dao.deleteCustomerById(customerId);
    }

    @Override
    public Integer updateCustomer(Customer customer) {
        return dao.updateCustomer(customer);
    }

    @Override
    public Customer queryById(Long customerId) {
        return dao.queryById(customerId);
    }

    @Override
    public List<Customer> queryAllCustomer() {
        return dao.queryAllCustomer();
    }
}
