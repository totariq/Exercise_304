package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Car {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min=2)
    private String year;

    @NotNull
    @Size(min=2)
    private String make;

    @NotNull
    @Size(min=2)
    private String model;

    public Car(@NotNull @Size(min = 2) String year, @NotNull @Size(min = 2) String make, @NotNull @Size(min = 2) String model) {
        this.year = year;
        this.make = make;
        this.model = model;
    }

    public Car() {
    }

    public long getId() {
        return id;
    }

    public String getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
