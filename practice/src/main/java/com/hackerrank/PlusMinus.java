package com.hackerrank;

import java.text.DecimalFormat;
import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        double positiveCount = 0;
        double negativeCount = 0;
        double zeroCount = 0;

        for (Integer num : arr) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        
        DecimalFormat formatter = new DecimalFormat("0.000000");
        System.out.println(formatter.format(positiveCount/arr.size()));
        System.out.println(formatter.format(negativeCount/arr.size()));
        System.out.println(formatter.format(zeroCount/arr.size()));

    }

    public static void main(String[] args) {
        plusMinus(List.of(1, 1, 0, -1, -1));
    }
}
