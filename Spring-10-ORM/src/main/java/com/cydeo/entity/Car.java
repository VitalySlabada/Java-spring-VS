package com.cydeo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="cars")
@Data
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
}