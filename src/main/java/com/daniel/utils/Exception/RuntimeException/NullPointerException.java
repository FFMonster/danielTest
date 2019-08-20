package com.daniel.utils.Exception.RuntimeException;

import com.daniel.entity.Customer;

import javax.annotation.Resource;

public class NullPointerException {
    @Resource
    Customer customer;

    public Customer setCustomer(String name, String pwd) {
        customer.setCustomerName(name);
        customer.setCustomerLoginPwd(pwd);

        return customer;
    }

    public static void main(String[] args) {
        NullPointerException nullPointer = new NullPointerException();
        String name = "Daniel";
        String pwd = "266121";

        Customer customer = nullPointer.setCustomer(name, pwd);
        System.out.printf("CustomerId is %d", customer.getCustomerId());
    }
}
