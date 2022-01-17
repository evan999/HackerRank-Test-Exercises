package com.hackerrank.algorithms;

import java.util.List;

public class Main {

    // Connected Groups
    // Relationships between people may be represented in a matrix in a series
    // of binary digits

    // Direct relationships for person 0 with persons 0 through 5 might be shown as 101100

    //
    //
    //

    // Person 0 knows persons 0, 2, and 3, the indices of each of the 1 values.
    // A relationship is transitive:
    // If person 0 knows person 2 and person 2 knows person 3, person 0 knows person 3 through
    //   person 2
    // A group is composed of all of the people who know one another, whether directly or transitively

    // Example:
    //    0 1 2
    //
    //0   1 1 0
    //1   1 1 0
    //2   0 0 1

    // Person 0 and 1 are connected. Person 2 is not
    // 2 groups

    // 1 -> relationship
    // 0 ->

    // Determine number of groups connected in a relationship matrix
    // Param: 2D List of binary digits
    // Returns: an int of number of groups of people

    // related = ['1100', '1110', '0110', '0001']

    // 1100
    // 1110
    // 0110
    // 0001

    //
    // related[row][col]
    // Pattern: (related[1][0], related[0][1], related[2][1], related[1][2])
    // Check adjacent row,col combination in matrix for each person
    // NOTE: [0][0],[1][1],[2][2],...[m][n] are NOT considered connections!

    // Key is to check [0][1], [1][0], [1][2],[2][1],...[number of rows-1][number of cols-1]
    // Check for digit 1 at these indices.
    // Is there a way to check JUST these indices?
    // May need a flag to represent connection
    // Steps:
    // Check [0][1]
    // if digit at [0][1] is '1',
    //    check digit at [1][0]
    //    if digit at [1][0] is also '1'
    //       connected
    //    else not connected
    // else not connected
    // check digit at [1][2]
    // if digit at [1][2] is '1'
    //    check digit at [2][1]
    // else not connected

    // for each row in matrix
    //   for each col
    //

    // 2 groups formed: related[0] and related[1], related[2] and related[3]
    // n = 4 people numbered related[0] through related[3]
    public static int countGroups(List<List<String>> related){
        int totalGroups = 0;
        return totalGroups;
    }

    public static void main(String[] args) {
	// write your code here
    }
}
