package com.hackerrank.algorithms;

public class WagonR extends Car {
    public int mileage;

    public WagonR(int mileage) {
        this.mileage = mileage;
    }

    public Boolean getIsSedan() {
        return false;
    }

    public String getMileage() {
        return " ";
    }
}
