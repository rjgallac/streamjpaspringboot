package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test3")
public class TestController3 {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping
    public Iterable<Customer> getTest() {

        return customerRepository.findAll();
    }
}
