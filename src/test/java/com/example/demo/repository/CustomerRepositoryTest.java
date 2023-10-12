package com.example.demo.repository;


import com.example.demo.model.Customer;
import com.example.demo.model.CustomerStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class CustomerRepositoryTest {

    @Autowired
    CustomerRepository customerRepository;

    /* 4- tests to verify your ability to create new customers.*/
    @BeforeEach
    public void setUp() {
        Customer customer = new Customer("Manar", CustomerStatus.SILVER, 5461);
        Customer savedCustomer = customerRepository.save(customer);

    }
    /* 6- tests to verify your ability to find customers by name. */
    @Test
    public void findByName(){
        Optional<Customer> customerOptional = customerRepository.findByName("Manar");
        assertTrue(customerOptional.isPresent());
        System.out.println(customerOptional.get());

    }

    /* 7-  tests to verify your ability to find customers by status.*/
    @Test
    public void findByStatus_customerList(){
        // No Enum constat ERROR
        List<Customer> customerList = customerRepository.findByStatus(CustomerStatus.SILVER);
        System.out.println(customerList);
        assertEquals(8, customerList.size());

    }

}

