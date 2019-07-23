package com.daniel.entity;

public class Customer {
    private Integer CustomerId;
    private String CustomerName;
    private String CustomerLoginPwd;
    private Integer IsAuth;

    public Integer getCustomerId() {
        return CustomerId;
    }
    public void setCustomerId(Integer customerId) {
        CustomerId = customerId;
    }

    public String getCustomerName() {
        return CustomerName;
    }
    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerLoginPwd() {
        return CustomerLoginPwd;
    }
    public void setCustomerLoginPwd(String customerLoginPwd) {
        CustomerLoginPwd = customerLoginPwd;
    }

    public Integer getIsAuth() {
        return IsAuth;
    }
    public void setIsAuth(Integer isAuth) {
        IsAuth = isAuth;
    }
}
