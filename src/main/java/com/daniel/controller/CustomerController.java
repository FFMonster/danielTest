package com.daniel.controller;

import com.daniel.entity.Customer;
import com.daniel.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    private CustomerService service;

    public CustomerService getService() {
        return service;
    }

    public void setService(CustomerService service) {
        this.service = service;
    }

    @RequestMapping("/allCustomer")
    public String list(Model model) {
        List<Customer> customerList = service.queryAllCustomer();
        model.addAttribute("list", customerList);
        return "allCustomer";
    }

    @RequestMapping("/addCustomer")
    public String addCustomer(Customer customer) {
        service.add(customer);
        return "redirect:/customer/allCustomer";
    }


}