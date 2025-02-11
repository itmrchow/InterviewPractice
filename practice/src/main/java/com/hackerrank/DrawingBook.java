package com.hackerrank;

public class DrawingBook {
    public static int pageCount(int n, int p) {
        var totalTurns = n / 2;
        var fromStart = p / 2;
        var fromEnd = totalTurns - fromStart;

        return fromStart > fromEnd ? fromEnd : fromStart;
    }

    public static void main(String[] args) {
        System.out.println(pageCount(7, 6));

    }
}
