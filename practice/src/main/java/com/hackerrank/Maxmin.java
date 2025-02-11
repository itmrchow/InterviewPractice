package com.hackerrank;

import java.util.Collections;
import java.util.List;

public class Maxmin {
    public static int maxMin(int k, List<Integer> arr) {
        Collections.sort(arr);
        var length = arr.size();
        var ans = Integer.MAX_VALUE;
        for (int i = 0; i <= length - k; i++) {
            var value = arr.get(i + k - 1) - arr.get(i);
            if (ans > value) {
                ans = value;
            }
        }
        // Write your code here

        return ans;

    }

    public static void main(String[] args) {
        var ans = maxMin(7, List.of(
                3,
                10,
                100,
                300,
                200,
                1000,
                20,
                30));

        System.out.println(ans);
    }
}
