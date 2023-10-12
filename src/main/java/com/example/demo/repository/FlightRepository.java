package com.example.demo.repository;

import com.example.demo.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight,Integer> {
    List<Flight> findFlightByFlightNumber(String flightNumber);

    List<Flight> findAircraftByAircraft(String aircraft);

    List<Flight> findAllByFlightMileageGreaterThan(Integer mileage);


}
