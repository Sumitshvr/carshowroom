package com.bit.carshowroom.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor // Constructor with no arguments
@AllArgsConstructor // Constructor with all arguments
@Data // Ensures the getter and setter methods
@Entity
@Builder
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // This is an autogenerated id for the car, no need for external input
    private long id;

    private String name;
    private String model;
    private double price;
    private String color;

   @Column(unique = true)
    private int  chasee_no;
    private String msg;
}