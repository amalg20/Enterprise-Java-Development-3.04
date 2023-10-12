package com.example.demo.model;


import jakarta.persistence.*;

@Entity
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "flight_number")

    private String flightNumber;
    private String aircraft;
    @Column(name = "flight_mileage")
    private Integer flightMileage;
    @Column(name="total_aircraft_seats")
    private Integer totalAircraftSeats;

    public Flight() {
    }

    public Flight(String flightNumber, String aircraft, Integer flightMileage, Integer totalAircraftSeats) {
        this.flightNumber = flightNumber;
        this.aircraft = aircraft;
        this.flightMileage = flightMileage;
        this.totalAircraftSeats = totalAircraftSeats;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public Integer getFlightMileage() {
        return flightMileage;
    }

    public void setFlightMileage(Integer flightMileage) {
        this.flightMileage = flightMileage;
    }

    public Integer getTotalAircraftSeats() {
        return totalAircraftSeats;
    }

    public void setTotalAircraftSeats(Integer totalAircraftSeats) {
        this.totalAircraftSeats = totalAircraftSeats;
    }
}



