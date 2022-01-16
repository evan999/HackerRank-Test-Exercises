package com.hackerrank.algorithms;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // Valid HackerRank emails are of the form user@hackerrank.com and the characteristics
    // of user are:
    // -Starts with 1 to 6 lowercase English letters denoted by char class [a-z]
    // -The lowercase letters are followed by an optional underscore,
    //    ie zero or one occurrence of underscore '_' character
    // -Optional underscore is followed by 0 to 4 optional digits denoted by the char class [0-9]
    // -Domain is hackerrank.com

    // Replace the blank with a regular expression that matches a valid email address
    // according to the criteria above

    // Example: abcdef_1234@hackerrank.com
    // Valid as it starts with a lowercase character a-z
    // and is followed by an optional underscore
    // Which is then followed by 4 digits

    // a1_1@baddomain.com
    // Not valid
    // Digits cannot precede the underscore.
    // Domain must be hackerrank.com

    // julia@hackerrank.com

    // Build a regular expression that filters email by the criteria
    // Takes in input from stdin:
    //   -first line is an integer, query -> total number of target strings to match against regex
    //   -Each line i of the subsequent lines of query contains a string of email address
    //   to validate at index of i
    public static boolean validateEmailAddress(List<String> emailAddresses) {

        for(String email : emailAddresses) {

        }

        // Use class Pattern
        // Call compile on regex
        // Regex:
        // "[a-z]_"

        // Build regular expression to validate email of the criteria:
        // -Starts with 1 to 6 lowercase English letters denoted by char class [a-z]
        // -The lowercase letters are followed by an optional underscore,
        //    ie zero or one occurrence of underscore '_' character
        // -Optional underscore is followed by 0 to 4 optional digits denoted by the char class [0-9]
        // -Domain is hackerrank.com

        return true;
    }


    public static void main(String[] args) {
	// write your code here
        // Test Case 1:
        // Query = 5
        List<String> emailAddresses = new ArrayList<>();
        emailAddresses.add("julia@hackerrank.com");
        emailAddresses.add("julia_@hackerrank.com");
        emailAddresses.add("julia_0@hackerrank.com");
        emailAddresses.add("julia0_@hackerrank.com");
        emailAddresses.add("julia@gmail.com");
        validateEmailAddress(emailAddresses);
    }
}
