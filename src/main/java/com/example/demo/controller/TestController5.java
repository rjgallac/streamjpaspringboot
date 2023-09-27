package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Stream;

@RestController
@RequestMapping("test5")
public class TestController5 {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping
    @Transactional
    public Stream<Customer> getTest() {

        return customerRepository.findByFirstName("test");
    }
}
