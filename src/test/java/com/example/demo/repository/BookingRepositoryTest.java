package com.example.demo.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class BookingRepositoryTest {
    @Autowired
    BookingRepository bookingRepository;
}
