package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Stream;

@RestController
@RequestMapping("test6")
public class TestController6 {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping
    @Transactional()
    public String getTest() {
        customerRepository
                .findByFirstName("test")
                .forEach(r -> writeToFile(r));
        return "hi";
    }

    private void writeToFile(Customer customer){
        try {
            Thread.sleep(100L);
            System.out.println("test");
            String str = customer.getFirstName() + ","
                    +customer.getTestString1()  + ","
                    +customer.getTestString2()  + ","
                    +customer.getTestString3()  + ","
                    +customer.getTestString4()  + ","
                    +customer.getTestString5()  + ","
                    + "\r\n";
            BufferedWriter writer = new BufferedWriter(new FileWriter("testfile.txt", true));
            writer.write(str);

            writer.close();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
