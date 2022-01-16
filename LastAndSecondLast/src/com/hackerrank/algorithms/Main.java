package com.hackerrank.algorithms;

public class Main {

    // Given a string create a new string made up of the last two letters,
    // reversed and separated by a space

    // 'bat'
    // return 't a'

    // Params: string word
    // Returns: string of two space-separated chars

    // word: 'APPLE'
    // return 'E L'
    // return a string containing:
    // -the char at last index
    // -a space in between
    // -the char at second-last index (arr size - 1 index)
    // extract the chars from the last and second last indices.


    public static String lastLetters(String word) {
        // Need to create a string
        // NOTE: Strings in java are immutable and can't be changed once declared!!
        // So we can build a string using a StringBuilder object
        // Build new string using StringBuilder from string word
        // StringBuilder has methods: reverse(), concatenate(), join(), toString() etc.

        // One approach:
        // Declare two char variables last and secondLast.
        // Extract the char at the last index and store in last char variable.
        // Extract the secondLast char at second last index and store in second last char variable
        // Declare new StringBuilder object, initialize to string word
        // Reverse string with StringBuilder reverse() method call
        // Invoke append() method call on stringBuilder instance to concatenate the
        //   second last, a space character, and last character of the string together into one new string
        // Convert the stringbuilder object to a new string using toString() method call.
        // Store in new string instance
        // Return new string
        StringBuilder resultString = new StringBuilder();
        resultString.append(word.charAt(word.length()-1))
                    .append(" ")
                    .append(word.charAt(word.length()-2));
        String newString = resultString.toString();

        return newString;

    }

    public static void main(String[] args) {
        System.out.println(lastLetters("supercalifragilisticexpialidocious"));
        // return 's u'
    }
}
