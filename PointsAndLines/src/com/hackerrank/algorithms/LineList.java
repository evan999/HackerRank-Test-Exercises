package com.hackerrank.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class LineList implements LineListInterface {
//    Vector<Line> list_of_lines;

    public LineList() {
//        list_of_lines = new Vector<Line>(Arrays.asList());
    }

    @Override
    public Line getLineWithMaxLength() {
        getLinesStartingFromPoint(new Point(5, 1));
    }

    @Override
    public Vector<Line> getLinesStartingFromPoint(Point p) {
        return null;
    }
}
