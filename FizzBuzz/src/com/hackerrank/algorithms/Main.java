package com.hackerrank.algorithms;

public class Main {

    // Given a number n for each integer i in the range
    //  1 to n inclusive, print one value per line:
    // -if i is a multiple of both 3 and 5, print FizzBuzz
    // -if i is a multiple of 3 but not 5, print Fizz
    // -if i is a multiple of 5 but not 3, print Buzz
    // -else print value of i

    // Params: int n -> upper limit of values to test(inclusive)
    // Does not return anything -> void return type
    // Print the value of result

    // Order is important for our logic to get the correct result!

    // Use % operator to determine if number is divisible by 3, 5 and both
    // Loop through integers in range from 1 to n inclusive
    // For each integer up through integer value n
    //   if current value is divisible by 3 and 5, print FizzBuzz
    //   else if current value is divisible by 3 but not 5, print Fizz
    //   else if current value is divisible by 5 but not 3, print Buzz
    //   else print current value
    //


    public static void fizzBuzz(int n) {
        for (int num = 0; num <= n; num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (num % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (num % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
        fizzBuzz(100);
    }
}
