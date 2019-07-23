package com.daniel.dao;

import com.daniel.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    void add(Customer customer);

    /**
     * 根据CustomerId删除用户数据
     * @param customerId    customer表Id号
     * @return Integer
     * @date 2019/5/27 10:19
    */
    Integer deleteCustomerById(Long customerId);

    /**
     *  更新用户表信息
     * @param customer	用户信息
     * @return java.lang.Integer
     * @date 2019/5/27 10:21
    */
    Integer updateCustomer(Customer customer);


    Customer queryById(Long customerId);

    List<Customer> queryAllCustomer();
}
