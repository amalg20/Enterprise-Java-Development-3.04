package com.example.demo.model;


import jakarta.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "customer_name")
    private String name;
    @Column(name = "customer_status")
    @Enumerated(EnumType.STRING) // This tell JPA to store custom_stat as string in db
    private CustomerStatus status;

    @Column(name = "total_customer_mileage")
    private Integer totalMileage; //> in db it will be translate to total_mileage

    public Customer() {
    }

    public Customer(String name, CustomerStatus status, Integer totalMileage) {
        this.name = name;
        this.status = status;
        this.totalMileage = totalMileage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerStatus getStatus() {
        return status;
    }

    public void setStatus(CustomerStatus status) {
        this.status = status;
    }

    public Integer getTotalMileage() {
        return totalMileage;
    }

    public void setTotalMileage(Integer totalMileage) {
        this.totalMileage = totalMileage;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", totalMileage=" + totalMileage +
                '}';
    }
}


