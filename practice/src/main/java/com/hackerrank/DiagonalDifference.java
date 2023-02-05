package com.hackerrank;

import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int size = arr.size();
        int leftToRight = 0;
        int rightToLeft = 0;

        for (int i = 0; i < size; i++) {
            leftToRight += arr.get(i).get(i);
            rightToLeft += arr.get(i).get(size - 1 - i);

        }

        System.out.println(leftToRight);
        System.out.println(rightToLeft);

        return Math.abs(leftToRight - rightToLeft);
    }

    public static void main(String[] args) {

    }
}
