package com.example.demo.repository;


import com.example.demo.model.Flight;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
public class FlightRepositoryTest {

    @Autowired
    FlightRepository flightRepository;
    /*5- tests to verify your ability to create new flights.*/
    @BeforeEach
    public void setUp() {
        Flight flight = new Flight("DL143", "Boeing 747",136,  4573);
        Flight savedFlight = flightRepository.save(flight);

    }

    /* 8- Find Flight by flight number */
    @Test
    public void findFlight(){
        List<Flight> flightList = flightRepository.findFlightByFlightNumber("DL143");
        assertEquals(4, flightList.size());
    }

    /*9- tests to verify your ability to find aircraft with names containing “Boeing”.*/
    @Test
    public void findAircraft(){
        List<Flight> aircraftList = flightRepository.findAircraftByAircraft("Boeing %");
        assertTrue(aircraftList.stream().allMatch(a -> a.getAircraft().contains("Boeing")));
    }


    /*10- tests to verify your ability to find flights with a distance greater than 500 miles.*/
    @Test
    public void findAllByFlightMileageGreaterThan_flights_flightsList(){

        List<Flight> flightList = flightRepository.findAllByFlightMileageGreaterThan(500);
        System.out.println(flightList);
        assertEquals(4, flightList.size());
    }


}






