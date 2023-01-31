package com.hackerrank;

import java.util.List;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        var min = arr.get(0);
        var max = arr.get(0);
        var sum = 0L;

        for (Integer num : arr) {
            if (min > num) {
                min = num;
            }
            if (num > max) {
                max = num;
            }

            sum += num;
        }

        System.out.println((sum - max) + " " + (sum - min));
    }

    public static void main(String[] args) {
        miniMaxSum(List.of(256741038 ,623958417 ,467905213 ,714532089 ,938071625));
    }
}
