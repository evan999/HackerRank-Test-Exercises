package com.hackerrank.algorithms;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public interface LineListInterface {
    Vector<Line> list_of_lines = new Vector<Line>(Arrays.asList());

    // returns the longest line from list of lines
    Line getLineWithMaxLength();
    Vector<Line> getLinesStartingFromPoint(Point p);

}
