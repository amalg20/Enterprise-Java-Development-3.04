package com.example.demo.repository;


import com.example.demo.model.Customer;
import com.example.demo.model.CustomerStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    Optional<Customer> findByName(String name);
    List<Customer> findByStatus(CustomerStatus status);
}
