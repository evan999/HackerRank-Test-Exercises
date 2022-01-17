package com.hackerrank.algorithms;

import java.util.Scanner;



public class Main {

    // WagonR: Not sedan, has 4 seats
    // HondaCity: Sedan, 4 seats
    // InnovaCrysta: Not sedan, 6 seats

    // Create classes named WagonR, HondaCity, and InnovaCrysta that
    // inherit from Car class
    // Each class must have constructor with an integer argument representing
    // mileage of the car
    // Each class must implement the getMileage() method which returns a string:
    // "<mileage> kmpl" where <mileage> is the value provided in the constructor


    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int number = Integer.parseInt(input);
        System.out.println(number);
//        switch(input)
    }
}
