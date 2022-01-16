package com.hackerrank.algorithms;

public class Main {

    // Digits 0, 4, 6, and 9 each have 1 closed path
    // Digit 8 has 2 closed paths
    // Every other number digit has 0 closed paths

    // Given a number, determine total number of closed paths in all digits combined

    // number = 649578
    // 6 -> 1 closed path
    // 4 -> 1 closed path
    // 9 -> 1 path
    // 5 -> 0
    // 7 -> 0
    // 8 -> 2 paths
    // 1 + 1 + 1 + 2 = 5 total closed paths

    // number = 630
    // 6 -> 1
    // 3 -> 0
    // 0 -> 1
    // 1 + 1 = 2

    // number = 1288
    // 1 -> 0
    // 2 -> 0
    // 8 -> 2
    // 8 -> 2
    // 2 + 2 = 4 total closed paths

    // Param: int number
    // Return: int value of total closed paths

    // 649578

    // Declare int totalClosedPaths variable to store sum of total closed paths
    // Initialize totalClosedPaths to 0
    // Convert number to string
    // Loop through each digit in number
    //   if digit at index (check char at index in string) is equal to 0, 4, 6, or 9
    //      add 1 to totalClosedPaths
    //   else if digit at index is equal to 8
    //      add 2 to totalClosedPaths
    //   else continue, no additions
    // return totalClosedPaths
    public static int closedPaths(int number) {
        int totalClosedPaths = 0;
        String digits = Integer.toString(number);
        for (int index = 0; index < digits.length(); index++) {
            if (digits.charAt(index) == '0' || digits.charAt(index) == '4' || digits.charAt(index) == '6' ||
                    digits.charAt(index) == '9') {
                totalClosedPaths++;
            }
            else if (digits.charAt(index) == '8') {
                totalClosedPaths += 2;
            }
        }
        return totalClosedPaths;

    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(closedPaths(1000000000));
    }
}
