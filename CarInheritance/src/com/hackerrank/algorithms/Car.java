package com.hackerrank.algorithms;

public abstract class Car {
    public Boolean isSedan;
    public String seats;

    public Boolean getIsSedan() {
        return isSedan;
    }
    public String getSeats() {
        return seats;
    }
    public abstract String getMileage();
}
